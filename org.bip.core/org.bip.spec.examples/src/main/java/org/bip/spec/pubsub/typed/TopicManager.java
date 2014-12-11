package org.bip.spec.pubsub.typed;

import java.util.HashMap;

import org.bip.annotations.ComponentType;
import org.bip.annotations.Data;
import org.bip.annotations.Port;
import org.bip.annotations.Ports;
import org.bip.annotations.Transition;
import org.bip.api.PortType;

@Ports({ @Port(name = "executeCommand", type = PortType.spontaneous) })
@ComponentType(initial = "0", name = "org.bip.spec.pubsub.typed.TopicManager")
public class TopicManager implements TopicManagerInterface {
	

	private static final HashMap<String, Topic> topics = new HashMap<String, Topic>();;

    public TopicManager() {
		topics.put("epfl", new Topic("epfl"));
		topics.put("concurrence", new Topic("concurrence"));
    }
    
	@Transition(name = "executeCommand", source = "0", target = "0")
	public void executeCommand(@Data(name = "value") Command command) {
		System.out.println("command " + command.getId() + " to execute for client " + command.getClient());
        switch(command.getId()){
        case SUBSCRIBE:
			System.out.println("Executing subscribe");
            subscribe(command.getClient(),command.getTopic());
            break;
        case UNSUBSCRIBE:
			System.out.println("Executing unsubscribe");
            unsubscribe(command.getClient(),command.getTopic());
            break;
        case PUBLISH:
			System.out.println("Executing publish");
            publish(command.getClient(), command.getTopic(),command.getMessage());
            break;
        default:
            break;
        }
        
    }

	private void subscribe(ClientProxy client, String topicName) {
    	
        Topic topic = topics.get(topicName);
		System.err.println("client: " + client + " topicName: " + topicName);
		topic.addClient(client);

        
    }
    
	private void unsubscribe(ClientProxy client, String topicName) {

        Topic topic = topics.get(topicName);
		System.err.println("client: " + client + " topicName: " + topicName);
		topic.removeClient(client);

    }
         
	private void publish(ClientProxy client, String topicName, String message) {

        Topic topic = topics.get(topicName);
		System.err.println("client: " + client + " topicName: " + topicName + "message " + message);
        topic.publish(client, message);


    }


}
