package org.bip.performance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Route;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.spi.RoutePolicy;
import org.bip.api.BIPActor;
import org.bip.api.BIPEngine;
import org.bip.api.BIPGlue;
import org.bip.engine.factory.EngineFactory;
import org.bip.exceptions.BIPException;
import org.bip.glue.TwoSynchronGlueBuilder;
import org.bip.spec.MonitorNoDataManyRoutes;
import org.bip.spec.SwitchableRoute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import akka.actor.ActorSystem;

public class Routes64to99Tests {

	ActorSystem system;
	EngineFactory engineFactory;

	@Before
	public void initialize() {

		system = ActorSystem.create("MySystem");
		engineFactory = new EngineFactory(system);

	}

	@After
	public void cleanup() {
		
		system.shutdown();
		
	}
	
	@Test
	public void bipSwMultiTest64() throws BIPException, InterruptedException {

		BIPGlue bipGlue = new TwoSynchronGlueBuilder() {
			@Override
			public void configure() {

				synchron(SwitchableRoute.class, "on").to(
						MonitorNoDataManyRoutes.class, "add");
				synchron(SwitchableRoute.class, "finished").to(
						MonitorNoDataManyRoutes.class, "rm");
				port(SwitchableRoute.class, "off")
						.acceptsNothing();
				port(SwitchableRoute.class, "off")
						.requiresNothing();

			}

		}.build();
		BIPEngine engine = engineFactory.create("myEngine", bipGlue);

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.setAutoStartup(false);

		MonitorNoDataManyRoutes monitorNoDataManyRoutes = new MonitorNoDataManyRoutes(32);
		final BIPActor executorM = engine.register(monitorNoDataManyRoutes, "monitor", true);
		
		SwitchableRoute route1 = new SwitchableRoute("1", camelContext);
		SwitchableRoute route2 = new SwitchableRoute("2", camelContext);
		SwitchableRoute route3 = new SwitchableRoute("3", camelContext);
		SwitchableRoute route4 = new SwitchableRoute("4", camelContext);
		SwitchableRoute route5 = new SwitchableRoute("5", camelContext);
		SwitchableRoute route6 = new SwitchableRoute("6", camelContext);
		SwitchableRoute route7 = new SwitchableRoute("7", camelContext);
		SwitchableRoute route8 = new SwitchableRoute("8", camelContext);
		SwitchableRoute route9 = new SwitchableRoute("9", camelContext);
		SwitchableRoute route10 = new SwitchableRoute("10", camelContext);
		SwitchableRoute route11 = new SwitchableRoute("11", camelContext);
		SwitchableRoute route12 = new SwitchableRoute("12", camelContext);
		SwitchableRoute route13 = new SwitchableRoute("13", camelContext);
		SwitchableRoute route14 = new SwitchableRoute("14", camelContext);
		SwitchableRoute route15 = new SwitchableRoute("15", camelContext);
		SwitchableRoute route16 = new SwitchableRoute("16", camelContext);
		SwitchableRoute route17 = new SwitchableRoute("17", camelContext);
		SwitchableRoute route18 = new SwitchableRoute("18", camelContext);
		SwitchableRoute route19 = new SwitchableRoute("19", camelContext);
		SwitchableRoute route20 = new SwitchableRoute("20", camelContext);
		SwitchableRoute route21 = new SwitchableRoute("21", camelContext);
		SwitchableRoute route22 = new SwitchableRoute("22", camelContext);
		SwitchableRoute route23 = new SwitchableRoute("23", camelContext);
		SwitchableRoute route24 = new SwitchableRoute("24", camelContext);
		SwitchableRoute route25 = new SwitchableRoute("25", camelContext);
		SwitchableRoute route26 = new SwitchableRoute("26", camelContext);
		SwitchableRoute route27 = new SwitchableRoute("27", camelContext);
		SwitchableRoute route28 = new SwitchableRoute("28", camelContext);
		SwitchableRoute route29 = new SwitchableRoute("29", camelContext);
		SwitchableRoute route30 = new SwitchableRoute("30", camelContext);
		SwitchableRoute route31 = new SwitchableRoute("31", camelContext);
		SwitchableRoute route32 = new SwitchableRoute("32", camelContext);
		SwitchableRoute route33 = new SwitchableRoute("33", camelContext);
		SwitchableRoute route34 = new SwitchableRoute("34", camelContext);
		SwitchableRoute route35 = new SwitchableRoute("35", camelContext);
		SwitchableRoute route36 = new SwitchableRoute("36", camelContext);
		SwitchableRoute route37 = new SwitchableRoute("37", camelContext);
		SwitchableRoute route38 = new SwitchableRoute("38", camelContext);
		SwitchableRoute route39 = new SwitchableRoute("39", camelContext);
		SwitchableRoute route40 = new SwitchableRoute("40", camelContext);
		SwitchableRoute route41 = new SwitchableRoute("41", camelContext);
		SwitchableRoute route42 = new SwitchableRoute("42", camelContext);
		SwitchableRoute route43 = new SwitchableRoute("43", camelContext);
		SwitchableRoute route44 = new SwitchableRoute("44", camelContext);
		SwitchableRoute route45 = new SwitchableRoute("45", camelContext);
		SwitchableRoute route46 = new SwitchableRoute("46", camelContext);
		SwitchableRoute route47 = new SwitchableRoute("47", camelContext);
		SwitchableRoute route48 = new SwitchableRoute("48", camelContext);
		SwitchableRoute route49 = new SwitchableRoute("49", camelContext);
		SwitchableRoute route50 = new SwitchableRoute("50", camelContext);
		SwitchableRoute route51 = new SwitchableRoute("51", camelContext);
		SwitchableRoute route52 = new SwitchableRoute("52", camelContext);
		SwitchableRoute route53 = new SwitchableRoute("53", camelContext);
		SwitchableRoute route54 = new SwitchableRoute("54", camelContext);
		SwitchableRoute route55 = new SwitchableRoute("55", camelContext);
		SwitchableRoute route56 = new SwitchableRoute("56", camelContext);
		SwitchableRoute route57 = new SwitchableRoute("57", camelContext);
		SwitchableRoute route58 = new SwitchableRoute("58", camelContext);
		SwitchableRoute route59 = new SwitchableRoute("59", camelContext);
		SwitchableRoute route60 = new SwitchableRoute("60", camelContext);
		SwitchableRoute route61 = new SwitchableRoute("61", camelContext);
		SwitchableRoute route62 = new SwitchableRoute("62", camelContext);
		SwitchableRoute route63 = new SwitchableRoute("63", camelContext);
		SwitchableRoute route64 = new SwitchableRoute("64", camelContext);

		final BIPActor executor1 = engine.register(route1,"1", true);
		final BIPActor executor2 = engine.register(route2,"2", true);
		final BIPActor executor3 = engine.register(route3,"3", true);
		final BIPActor executor4 = engine.register(route4,"4", true);
		final BIPActor executor5 = engine.register(route5,"5", true);
		final BIPActor executor6 = engine.register(route6,"6", true);
		final BIPActor executor7 = engine.register(route7,"7", true);
		final BIPActor executor8 = engine.register(route8,"8", true);
		final BIPActor executor9 = engine.register(route9,"9", true);
		final BIPActor executor10 = engine.register(route10,"10", true);
		final BIPActor executor11 = engine.register(route11,"11", true);
		final BIPActor executor12 = engine.register(route12,"12", true);
		final BIPActor executor13 = engine.register(route13,"13", true);
		final BIPActor executor14 = engine.register(route14,"14", true);
		final BIPActor executor15 = engine.register(route15,"15", true);
		final BIPActor executor16 = engine.register(route16,"16", true);
		final BIPActor executor17 = engine.register(route17,"17", true);
		final BIPActor executor18 = engine.register(route18,"18", true);
		final BIPActor executor19 = engine.register(route19,"19", true);
		final BIPActor executor20 = engine.register(route20,"20", true);
		final BIPActor executor21 = engine.register(route21,"21", true);
		final BIPActor executor22 = engine.register(route22,"22", true);
		final BIPActor executor23 = engine.register(route23,"23", true);
		final BIPActor executor24 = engine.register(route24,"24", true);
		final BIPActor executor25 = engine.register(route25,"25", true);
		final BIPActor executor26 = engine.register(route26,"26", true);
		final BIPActor executor27 = engine.register(route27,"27", true);
		final BIPActor executor28 = engine.register(route28,"28", true);
		final BIPActor executor29 = engine.register(route29,"29", true);
		final BIPActor executor30 = engine.register(route30,"30", true);
		final BIPActor executor31 = engine.register(route31,"31", true);
		final BIPActor executor32 = engine.register(route32,"32", true);
		final BIPActor executor33 = engine.register(route33,"33", true);
		final BIPActor executor34 = engine.register(route34,"34", true);
		final BIPActor executor35 = engine.register(route35,"35", true);
		final BIPActor executor36 = engine.register(route36,"36", true);
		final BIPActor executor37 = engine.register(route37,"37", true);
		final BIPActor executor38 = engine.register(route38,"38", true);
		final BIPActor executor39 = engine.register(route39,"39", true);
		final BIPActor executor40 = engine.register(route40,"40", true);
		final BIPActor executor41 = engine.register(route41,"41", true);
		final BIPActor executor42 = engine.register(route42,"42", true);
		final BIPActor executor43 = engine.register(route43,"43", true);
		final BIPActor executor44 = engine.register(route44,"44", true);
		final BIPActor executor45 = engine.register(route45,"45", true);
		final BIPActor executor46 = engine.register(route46,"46", true);
		final BIPActor executor47 = engine.register(route47,"47", true);
		final BIPActor executor48 = engine.register(route48,"48", true);
		final BIPActor executor49 = engine.register(route49,"49", true);
		final BIPActor executor50 = engine.register(route50,"50", true);
		final BIPActor executor51 = engine.register(route51,"51", true);
		final BIPActor executor52 = engine.register(route52,"52", true);
		final BIPActor executor53 = engine.register(route53,"53", true);
		final BIPActor executor54 = engine.register(route54,"54", true);
		final BIPActor executor55 = engine.register(route55,"55", true);
		final BIPActor executor56 = engine.register(route56,"56", true);
		final BIPActor executor57 = engine.register(route57,"57", true);
		final BIPActor executor58 = engine.register(route58,"58", true);
		final BIPActor executor59 = engine.register(route59,"59", true);
		final BIPActor executor60 = engine.register(route60,"60", true);
		final BIPActor executor61 = engine.register(route61,"61", true);
		final BIPActor executor62 = engine.register(route62,"62", true);
		final BIPActor executor63 = engine.register(route63,"63", true);
		final BIPActor executor64 = engine.register(route64,"64", true);

		final RoutePolicy routePolicy1 = createRoutePolicy(executor1);
		final RoutePolicy routePolicy2 = createRoutePolicy(executor2);
		final RoutePolicy routePolicy3 = createRoutePolicy(executor3);
		final RoutePolicy routePolicy4 = createRoutePolicy(executor4);
		final RoutePolicy routePolicy5 = createRoutePolicy(executor5);
		final RoutePolicy routePolicy6 = createRoutePolicy(executor6);
		final RoutePolicy routePolicy7 = createRoutePolicy(executor7);
		final RoutePolicy routePolicy8 = createRoutePolicy(executor8);
		final RoutePolicy routePolicy9 = createRoutePolicy(executor9);
		final RoutePolicy routePolicy10 = createRoutePolicy(executor10);
		final RoutePolicy routePolicy11 = createRoutePolicy(executor11);
		final RoutePolicy routePolicy12 = createRoutePolicy(executor12);
		final RoutePolicy routePolicy13 = createRoutePolicy(executor13);
		final RoutePolicy routePolicy14 = createRoutePolicy(executor14);
		final RoutePolicy routePolicy15 = createRoutePolicy(executor15);
		final RoutePolicy routePolicy16 = createRoutePolicy(executor16);
		final RoutePolicy routePolicy17 = createRoutePolicy(executor17);
		final RoutePolicy routePolicy18 = createRoutePolicy(executor18);
		final RoutePolicy routePolicy19 = createRoutePolicy(executor19);
		final RoutePolicy routePolicy20 = createRoutePolicy(executor20);
		final RoutePolicy routePolicy21 = createRoutePolicy(executor21);
		final RoutePolicy routePolicy22 = createRoutePolicy(executor22);
		final RoutePolicy routePolicy23 = createRoutePolicy(executor23);
		final RoutePolicy routePolicy24 = createRoutePolicy(executor24);
		final RoutePolicy routePolicy25 = createRoutePolicy(executor25);
		final RoutePolicy routePolicy26 = createRoutePolicy(executor26);
		final RoutePolicy routePolicy27 = createRoutePolicy(executor27);
		final RoutePolicy routePolicy28 = createRoutePolicy(executor28);
		final RoutePolicy routePolicy29 = createRoutePolicy(executor29);
		final RoutePolicy routePolicy30 = createRoutePolicy(executor30);
		final RoutePolicy routePolicy31 = createRoutePolicy(executor31);
		final RoutePolicy routePolicy32 = createRoutePolicy(executor32);
		final RoutePolicy routePolicy33 = createRoutePolicy(executor33);
		final RoutePolicy routePolicy34 = createRoutePolicy(executor34);
		final RoutePolicy routePolicy35 = createRoutePolicy(executor35);
		final RoutePolicy routePolicy36 = createRoutePolicy(executor36);
		final RoutePolicy routePolicy37 = createRoutePolicy(executor37);
		final RoutePolicy routePolicy38 = createRoutePolicy(executor38);
		final RoutePolicy routePolicy39 = createRoutePolicy(executor39);
		final RoutePolicy routePolicy40 = createRoutePolicy(executor40);
		final RoutePolicy routePolicy41 = createRoutePolicy(executor41);
		final RoutePolicy routePolicy42 = createRoutePolicy(executor42);
		final RoutePolicy routePolicy43 = createRoutePolicy(executor43);
		final RoutePolicy routePolicy44 = createRoutePolicy(executor44);
		final RoutePolicy routePolicy45 = createRoutePolicy(executor45);
		final RoutePolicy routePolicy46 = createRoutePolicy(executor46);
		final RoutePolicy routePolicy47 = createRoutePolicy(executor47);
		final RoutePolicy routePolicy48 = createRoutePolicy(executor48);
		final RoutePolicy routePolicy49 = createRoutePolicy(executor49);
		final RoutePolicy routePolicy50 = createRoutePolicy(executor50);
		final RoutePolicy routePolicy51 = createRoutePolicy(executor51);
		final RoutePolicy routePolicy52 = createRoutePolicy(executor52);
		final RoutePolicy routePolicy53 = createRoutePolicy(executor53);
		final RoutePolicy routePolicy54 = createRoutePolicy(executor54);
		final RoutePolicy routePolicy55 = createRoutePolicy(executor55);
		final RoutePolicy routePolicy56 = createRoutePolicy(executor56);
		final RoutePolicy routePolicy57 = createRoutePolicy(executor57);
		final RoutePolicy routePolicy58 = createRoutePolicy(executor58);
		final RoutePolicy routePolicy59 = createRoutePolicy(executor59);
		final RoutePolicy routePolicy60 = createRoutePolicy(executor60);
		final RoutePolicy routePolicy61 = createRoutePolicy(executor61);
		final RoutePolicy routePolicy62 = createRoutePolicy(executor62);
		final RoutePolicy routePolicy63 = createRoutePolicy(executor63);
		final RoutePolicy routePolicy64 = createRoutePolicy(executor64);
		
		RouteBuilder builder = new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:inputfolder1?delete=true").routeId("1")
						.routePolicy(routePolicy1).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder1");

				from("file:inputfolder2?delete=true").routeId("2")
						.routePolicy(routePolicy2).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder2");

				from("file:inputfolder3?delete=true").routeId("3")
						.routePolicy(routePolicy3).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder3");

				from("file:inputfolder4?delete=true").routeId("4")
						.routePolicy(routePolicy4).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder4");

				from("file:inputfolder5?delete=true").routeId("5")
						.routePolicy(routePolicy5).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder5");

				from("file:inputfolder6?delete=true").routeId("6")
						.routePolicy(routePolicy6).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder6");

				from("file:inputfolder7?delete=true").routeId("7")
						.routePolicy(routePolicy7).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder7");

				from("file:inputfolder8?delete=true").routeId("8")
						.routePolicy(routePolicy8).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder8");

				from("file:inputfolder9?delete=true").routeId("9")
						.routePolicy(routePolicy9).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder9");

				from("file:inputfolder10?delete=true").routeId("10")
						.routePolicy(routePolicy10).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder10");

				from("file:inputfolder11?delete=true").routeId("11")
						.routePolicy(routePolicy11).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder11");

				from("file:inputfolder12?delete=true").routeId("12")
						.routePolicy(routePolicy12).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder12");

				from("file:inputfolder13?delete=true").routeId("13")
						.routePolicy(routePolicy13).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder13");

				from("file:inputfolder14?delete=true").routeId("14")
						.routePolicy(routePolicy14).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder14");

				from("file:inputfolder15?delete=true").routeId("15")
						.routePolicy(routePolicy15).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder15");

				from("file:inputfolder16?delete=true").routeId("16")
						.routePolicy(routePolicy16).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder16");

				from("file:inputfolder17?delete=true").routeId("17")
						.routePolicy(routePolicy17).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder17");

				from("file:inputfolder18?delete=true").routeId("18")
						.routePolicy(routePolicy18).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder18");

				from("file:inputfolder19?delete=true").routeId("19")
						.routePolicy(routePolicy19).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder19");

				from("file:inputfolder20?delete=true").routeId("20")
						.routePolicy(routePolicy20).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder20");

				from("file:inputfolder21?delete=true").routeId("21")
						.routePolicy(routePolicy21).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder21");

				from("file:inputfolder22?delete=true").routeId("22")
						.routePolicy(routePolicy22).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder22");

				from("file:inputfolder23?delete=true").routeId("23")
						.routePolicy(routePolicy23).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder23");

				from("file:inputfolder24?delete=true").routeId("24")
						.routePolicy(routePolicy24).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder24");

				from("file:inputfolder25?delete=true").routeId("25")
						.routePolicy(routePolicy25).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder25");

				from("file:inputfolder26?delete=true").routeId("26")
						.routePolicy(routePolicy26).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder26");

				from("file:inputfolder27?delete=true").routeId("27")
						.routePolicy(routePolicy27).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder27");

				from("file:inputfolder28?delete=true").routeId("28")
						.routePolicy(routePolicy28).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder28");

				from("file:inputfolder29?delete=true").routeId("29")
						.routePolicy(routePolicy29).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder29");

				from("file:inputfolder30?delete=true").routeId("30")
						.routePolicy(routePolicy30).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder30");

				from("file:inputfolder31?delete=true").routeId("31")
						.routePolicy(routePolicy31).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder31");

				from("file:inputfolder32?delete=true").routeId("32")
						.routePolicy(routePolicy32).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder32");

				from("file:inputfolder33?delete=true").routeId("33")
						.routePolicy(routePolicy33).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder33");

				from("file:inputfolder34?delete=true").routeId("34")
						.routePolicy(routePolicy34).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder34");

				from("file:inputfolder35?delete=true").routeId("35")
						.routePolicy(routePolicy35).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder35");

				from("file:inputfolder36?delete=true").routeId("36")
						.routePolicy(routePolicy36).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder36");

				from("file:inputfolder37?delete=true").routeId("37")
						.routePolicy(routePolicy37).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder37");

				from("file:inputfolder38?delete=true").routeId("38")
						.routePolicy(routePolicy38).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder38");

				from("file:inputfolder39?delete=true").routeId("39")
						.routePolicy(routePolicy39).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder39");

				from("file:inputfolder40?delete=true").routeId("40")
						.routePolicy(routePolicy40).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder40");

				from("file:inputfolder41?delete=true").routeId("41")
						.routePolicy(routePolicy41).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder41");

				from("file:inputfolder42?delete=true").routeId("42")
						.routePolicy(routePolicy42).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder42");

				from("file:inputfolder43?delete=true").routeId("43")
						.routePolicy(routePolicy43).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder43");

				from("file:inputfolder44?delete=true").routeId("44")
						.routePolicy(routePolicy44).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder44");

				from("file:inputfolder45?delete=true").routeId("45")
						.routePolicy(routePolicy45).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder45");

				from("file:inputfolder46?delete=true").routeId("46")
						.routePolicy(routePolicy46).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder46");

				from("file:inputfolder47?delete=true").routeId("47")
						.routePolicy(routePolicy47).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder47");

				from("file:inputfolder48?delete=true").routeId("48")
						.routePolicy(routePolicy48).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder48");

				from("file:inputfolder49?delete=true").routeId("49")
						.routePolicy(routePolicy49).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder49");

				from("file:inputfolder50?delete=true").routeId("50")
						.routePolicy(routePolicy50).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder50");

				from("file:inputfolder51?delete=true").routeId("51")
						.routePolicy(routePolicy51).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder51");

				from("file:inputfolder52?delete=true").routeId("52")
						.routePolicy(routePolicy52).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder52");

				from("file:inputfolder53?delete=true").routeId("53")
						.routePolicy(routePolicy53).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder53");

				from("file:inputfolder54?delete=true").routeId("54")
						.routePolicy(routePolicy54).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder54");

				from("file:inputfolder55?delete=true").routeId("55")
						.routePolicy(routePolicy55).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder55");

				from("file:inputfolder56?delete=true").routeId("56")
						.routePolicy(routePolicy56).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder56");

				from("file:inputfolder57?delete=true").routeId("57")
						.routePolicy(routePolicy57).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder57");

				from("file:inputfolder58?delete=true").routeId("58")
						.routePolicy(routePolicy58).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder58");

				from("file:inputfolder59?delete=true").routeId("59")
						.routePolicy(routePolicy59).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder59");

				from("file:inputfolder60?delete=true").routeId("60")
						.routePolicy(routePolicy60).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder60");

				from("file:inputfolder61?delete=true").routeId("61")
						.routePolicy(routePolicy61).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder61");

				from("file:inputfolder62?delete=true").routeId("62")
						.routePolicy(routePolicy62).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder62");

				from("file:inputfolder63?delete=true").routeId("63")
						.routePolicy(routePolicy63).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder63");

				from("file:inputfolder64?delete=true").routeId("64")
						.routePolicy(routePolicy64).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder64");

			}
		};
		try {
			camelContext.addRoutes(builder);
			camelContext.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		route1.setCamelContext(camelContext);
		route2.setCamelContext(camelContext);
		route3.setCamelContext(camelContext);
		route4.setCamelContext(camelContext);
		route5.setCamelContext(camelContext);
		route6.setCamelContext(camelContext);
		route7.setCamelContext(camelContext);
		route8.setCamelContext(camelContext);
		route9.setCamelContext(camelContext);
		route10.setCamelContext(camelContext);
		route11.setCamelContext(camelContext);
		route12.setCamelContext(camelContext);
		route13.setCamelContext(camelContext);
		route14.setCamelContext(camelContext);
		route15.setCamelContext(camelContext);
		route16.setCamelContext(camelContext);
		route17.setCamelContext(camelContext);
		route18.setCamelContext(camelContext);
		route19.setCamelContext(camelContext);
		route20.setCamelContext(camelContext);
		route21.setCamelContext(camelContext);
		route22.setCamelContext(camelContext);
		route23.setCamelContext(camelContext);
		route24.setCamelContext(camelContext);
		route25.setCamelContext(camelContext);
		route26.setCamelContext(camelContext);
		route27.setCamelContext(camelContext);
		route28.setCamelContext(camelContext);
		route29.setCamelContext(camelContext);
		route30.setCamelContext(camelContext);
		route31.setCamelContext(camelContext);
		route32.setCamelContext(camelContext);
		route33.setCamelContext(camelContext);
		route34.setCamelContext(camelContext);
		route35.setCamelContext(camelContext);
		route36.setCamelContext(camelContext);
		route37.setCamelContext(camelContext);
		route38.setCamelContext(camelContext);
		route39.setCamelContext(camelContext);
		route40.setCamelContext(camelContext);
		route41.setCamelContext(camelContext);
		route42.setCamelContext(camelContext);
		route43.setCamelContext(camelContext);
		route44.setCamelContext(camelContext);
		route45.setCamelContext(camelContext);
		route46.setCamelContext(camelContext);
		route47.setCamelContext(camelContext);
		route48.setCamelContext(camelContext);
		route49.setCamelContext(camelContext);
		route50.setCamelContext(camelContext);
		route51.setCamelContext(camelContext);
		route52.setCamelContext(camelContext);
		route53.setCamelContext(camelContext);
		route54.setCamelContext(camelContext);
		route55.setCamelContext(camelContext);
		route56.setCamelContext(camelContext);
		route57.setCamelContext(camelContext);
		route58.setCamelContext(camelContext);
		route59.setCamelContext(camelContext);
		route60.setCamelContext(camelContext);
		route61.setCamelContext(camelContext);
		route62.setCamelContext(camelContext);
		route63.setCamelContext(camelContext);
		route64.setCamelContext(camelContext);
		engine.specifyGlue(bipGlue);
		engine.start();
		engine.execute();
		Thread.sleep(80000);
	}

	@Test
	public void bipSwMultiTest69() throws BIPException, InterruptedException {

		BIPGlue bipGlue = new TwoSynchronGlueBuilder() {
			@Override
			public void configure() {

				synchron(SwitchableRoute.class, "on").to(
						MonitorNoDataManyRoutes.class, "add");
				synchron(SwitchableRoute.class, "finished").to(
						MonitorNoDataManyRoutes.class, "rm");
				port(SwitchableRoute.class, "off")
						.acceptsNothing();
				port(SwitchableRoute.class, "off")
						.requiresNothing();

			}

		}.build();
		BIPEngine engine = engineFactory.create("myEngine", bipGlue);

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.setAutoStartup(false);

		MonitorNoDataManyRoutes monitorNoDataManyRoutes = new MonitorNoDataManyRoutes(34);
		final BIPActor executorM = engine.register(monitorNoDataManyRoutes, "monitor", true);
		
		SwitchableRoute route1 = new SwitchableRoute("1", camelContext);
		SwitchableRoute route2 = new SwitchableRoute("2", camelContext);
		SwitchableRoute route3 = new SwitchableRoute("3", camelContext);
		SwitchableRoute route4 = new SwitchableRoute("4", camelContext);
		SwitchableRoute route5 = new SwitchableRoute("5", camelContext);
		SwitchableRoute route6 = new SwitchableRoute("6", camelContext);
		SwitchableRoute route7 = new SwitchableRoute("7", camelContext);
		SwitchableRoute route8 = new SwitchableRoute("8", camelContext);
		SwitchableRoute route9 = new SwitchableRoute("9", camelContext);
		SwitchableRoute route10 = new SwitchableRoute("10", camelContext);
		SwitchableRoute route11 = new SwitchableRoute("11", camelContext);
		SwitchableRoute route12 = new SwitchableRoute("12", camelContext);
		SwitchableRoute route13 = new SwitchableRoute("13", camelContext);
		SwitchableRoute route14 = new SwitchableRoute("14", camelContext);
		SwitchableRoute route15 = new SwitchableRoute("15", camelContext);
		SwitchableRoute route16 = new SwitchableRoute("16", camelContext);
		SwitchableRoute route17 = new SwitchableRoute("17", camelContext);
		SwitchableRoute route18 = new SwitchableRoute("18", camelContext);
		SwitchableRoute route19 = new SwitchableRoute("19", camelContext);
		SwitchableRoute route20 = new SwitchableRoute("20", camelContext);
		SwitchableRoute route21 = new SwitchableRoute("21", camelContext);
		SwitchableRoute route22 = new SwitchableRoute("22", camelContext);
		SwitchableRoute route23 = new SwitchableRoute("23", camelContext);
		SwitchableRoute route24 = new SwitchableRoute("24", camelContext);
		SwitchableRoute route25 = new SwitchableRoute("25", camelContext);
		SwitchableRoute route26 = new SwitchableRoute("26", camelContext);
		SwitchableRoute route27 = new SwitchableRoute("27", camelContext);
		SwitchableRoute route28 = new SwitchableRoute("28", camelContext);
		SwitchableRoute route29 = new SwitchableRoute("29", camelContext);
		SwitchableRoute route30 = new SwitchableRoute("30", camelContext);
		SwitchableRoute route31 = new SwitchableRoute("31", camelContext);
		SwitchableRoute route32 = new SwitchableRoute("32", camelContext);
		SwitchableRoute route33 = new SwitchableRoute("33", camelContext);
		SwitchableRoute route34 = new SwitchableRoute("34", camelContext);
		SwitchableRoute route35 = new SwitchableRoute("35", camelContext);
		SwitchableRoute route36 = new SwitchableRoute("36", camelContext);
		SwitchableRoute route37 = new SwitchableRoute("37", camelContext);
		SwitchableRoute route38 = new SwitchableRoute("38", camelContext);
		SwitchableRoute route39 = new SwitchableRoute("39", camelContext);
		SwitchableRoute route40 = new SwitchableRoute("40", camelContext);
		SwitchableRoute route41 = new SwitchableRoute("41", camelContext);
		SwitchableRoute route42 = new SwitchableRoute("42", camelContext);
		SwitchableRoute route43 = new SwitchableRoute("43", camelContext);
		SwitchableRoute route44 = new SwitchableRoute("44", camelContext);
		SwitchableRoute route45 = new SwitchableRoute("45", camelContext);
		SwitchableRoute route46 = new SwitchableRoute("46", camelContext);
		SwitchableRoute route47 = new SwitchableRoute("47", camelContext);
		SwitchableRoute route48 = new SwitchableRoute("48", camelContext);
		SwitchableRoute route49 = new SwitchableRoute("49", camelContext);
		SwitchableRoute route50 = new SwitchableRoute("50", camelContext);
		SwitchableRoute route51 = new SwitchableRoute("51", camelContext);
		SwitchableRoute route52 = new SwitchableRoute("52", camelContext);
		SwitchableRoute route53 = new SwitchableRoute("53", camelContext);
		SwitchableRoute route54 = new SwitchableRoute("54", camelContext);
		SwitchableRoute route55 = new SwitchableRoute("55", camelContext);
		SwitchableRoute route56 = new SwitchableRoute("56", camelContext);
		SwitchableRoute route57 = new SwitchableRoute("57", camelContext);
		SwitchableRoute route58 = new SwitchableRoute("58", camelContext);
		SwitchableRoute route59 = new SwitchableRoute("59", camelContext);
		SwitchableRoute route60 = new SwitchableRoute("60", camelContext);
		SwitchableRoute route61 = new SwitchableRoute("61", camelContext);
		SwitchableRoute route62 = new SwitchableRoute("62", camelContext);
		SwitchableRoute route63 = new SwitchableRoute("63", camelContext);
		SwitchableRoute route64 = new SwitchableRoute("64", camelContext);
		SwitchableRoute route65 = new SwitchableRoute("65", camelContext);
		SwitchableRoute route66 = new SwitchableRoute("66", camelContext);
		SwitchableRoute route67 = new SwitchableRoute("67", camelContext);
		SwitchableRoute route68 = new SwitchableRoute("68", camelContext);
		SwitchableRoute route69 = new SwitchableRoute("69", camelContext);

		final BIPActor executor1 = engine.register(route1,"1", true);
		final BIPActor executor2 = engine.register(route2,"2", true);
		final BIPActor executor3 = engine.register(route3,"3", true);
		final BIPActor executor4 = engine.register(route4,"4", true);
		final BIPActor executor5 = engine.register(route5,"5", true);
		final BIPActor executor6 = engine.register(route6,"6", true);
		final BIPActor executor7 = engine.register(route7,"7", true);
		final BIPActor executor8 = engine.register(route8,"8", true);
		final BIPActor executor9 = engine.register(route9,"9", true);
		final BIPActor executor10 = engine.register(route10,"10", true);
		final BIPActor executor11 = engine.register(route11,"11", true);
		final BIPActor executor12 = engine.register(route12,"12", true);
		final BIPActor executor13 = engine.register(route13,"13", true);
		final BIPActor executor14 = engine.register(route14,"14", true);
		final BIPActor executor15 = engine.register(route15,"15", true);
		final BIPActor executor16 = engine.register(route16,"16", true);
		final BIPActor executor17 = engine.register(route17,"17", true);
		final BIPActor executor18 = engine.register(route18,"18", true);
		final BIPActor executor19 = engine.register(route19,"19", true);
		final BIPActor executor20 = engine.register(route20,"20", true);
		final BIPActor executor21 = engine.register(route21,"21", true);
		final BIPActor executor22 = engine.register(route22,"22", true);
		final BIPActor executor23 = engine.register(route23,"23", true);
		final BIPActor executor24 = engine.register(route24,"24", true);
		final BIPActor executor25 = engine.register(route25,"25", true);
		final BIPActor executor26 = engine.register(route26,"26", true);
		final BIPActor executor27 = engine.register(route27,"27", true);
		final BIPActor executor28 = engine.register(route28,"28", true);
		final BIPActor executor29 = engine.register(route29,"29", true);
		final BIPActor executor30 = engine.register(route30,"30", true);
		final BIPActor executor31 = engine.register(route31,"31", true);
		final BIPActor executor32 = engine.register(route32,"32", true);
		final BIPActor executor33 = engine.register(route33,"33", true);
		final BIPActor executor34 = engine.register(route34,"34", true);
		final BIPActor executor35 = engine.register(route35,"35", true);
		final BIPActor executor36 = engine.register(route36,"36", true);
		final BIPActor executor37 = engine.register(route37,"37", true);
		final BIPActor executor38 = engine.register(route38,"38", true);
		final BIPActor executor39 = engine.register(route39,"39", true);
		final BIPActor executor40 = engine.register(route40,"40", true);
		final BIPActor executor41 = engine.register(route41,"41", true);
		final BIPActor executor42 = engine.register(route42,"42", true);
		final BIPActor executor43 = engine.register(route43,"43", true);
		final BIPActor executor44 = engine.register(route44,"44", true);
		final BIPActor executor45 = engine.register(route45,"45", true);
		final BIPActor executor46 = engine.register(route46,"46", true);
		final BIPActor executor47 = engine.register(route47,"47", true);
		final BIPActor executor48 = engine.register(route48,"48", true);
		final BIPActor executor49 = engine.register(route49,"49", true);
		final BIPActor executor50 = engine.register(route50,"50", true);
		final BIPActor executor51 = engine.register(route51,"51", true);
		final BIPActor executor52 = engine.register(route52,"52", true);
		final BIPActor executor53 = engine.register(route53,"53", true);
		final BIPActor executor54 = engine.register(route54,"54", true);
		final BIPActor executor55 = engine.register(route55,"55", true);
		final BIPActor executor56 = engine.register(route56,"56", true);
		final BIPActor executor57 = engine.register(route57,"57", true);
		final BIPActor executor58 = engine.register(route58,"58", true);
		final BIPActor executor59 = engine.register(route59,"59", true);
		final BIPActor executor60 = engine.register(route60,"60", true);
		final BIPActor executor61 = engine.register(route61,"61", true);
		final BIPActor executor62 = engine.register(route62,"62", true);
		final BIPActor executor63 = engine.register(route63,"63", true);
		final BIPActor executor64 = engine.register(route64,"64", true);
		final BIPActor executor65 = engine.register(route65,"65", true);
		final BIPActor executor66 = engine.register(route66,"66", true);
		final BIPActor executor67 = engine.register(route67,"67", true);
		final BIPActor executor68 = engine.register(route68,"68", true);
		final BIPActor executor69 = engine.register(route69,"69", true);

		final RoutePolicy routePolicy1 = createRoutePolicy(executor1);
		final RoutePolicy routePolicy2 = createRoutePolicy(executor2);
		final RoutePolicy routePolicy3 = createRoutePolicy(executor3);
		final RoutePolicy routePolicy4 = createRoutePolicy(executor4);
		final RoutePolicy routePolicy5 = createRoutePolicy(executor5);
		final RoutePolicy routePolicy6 = createRoutePolicy(executor6);
		final RoutePolicy routePolicy7 = createRoutePolicy(executor7);
		final RoutePolicy routePolicy8 = createRoutePolicy(executor8);
		final RoutePolicy routePolicy9 = createRoutePolicy(executor9);
		final RoutePolicy routePolicy10 = createRoutePolicy(executor10);
		final RoutePolicy routePolicy11 = createRoutePolicy(executor11);
		final RoutePolicy routePolicy12 = createRoutePolicy(executor12);
		final RoutePolicy routePolicy13 = createRoutePolicy(executor13);
		final RoutePolicy routePolicy14 = createRoutePolicy(executor14);
		final RoutePolicy routePolicy15 = createRoutePolicy(executor15);
		final RoutePolicy routePolicy16 = createRoutePolicy(executor16);
		final RoutePolicy routePolicy17 = createRoutePolicy(executor17);
		final RoutePolicy routePolicy18 = createRoutePolicy(executor18);
		final RoutePolicy routePolicy19 = createRoutePolicy(executor19);
		final RoutePolicy routePolicy20 = createRoutePolicy(executor20);
		final RoutePolicy routePolicy21 = createRoutePolicy(executor21);
		final RoutePolicy routePolicy22 = createRoutePolicy(executor22);
		final RoutePolicy routePolicy23 = createRoutePolicy(executor23);
		final RoutePolicy routePolicy24 = createRoutePolicy(executor24);
		final RoutePolicy routePolicy25 = createRoutePolicy(executor25);
		final RoutePolicy routePolicy26 = createRoutePolicy(executor26);
		final RoutePolicy routePolicy27 = createRoutePolicy(executor27);
		final RoutePolicy routePolicy28 = createRoutePolicy(executor28);
		final RoutePolicy routePolicy29 = createRoutePolicy(executor29);
		final RoutePolicy routePolicy30 = createRoutePolicy(executor30);
		final RoutePolicy routePolicy31 = createRoutePolicy(executor31);
		final RoutePolicy routePolicy32 = createRoutePolicy(executor32);
		final RoutePolicy routePolicy33 = createRoutePolicy(executor33);
		final RoutePolicy routePolicy34 = createRoutePolicy(executor34);
		final RoutePolicy routePolicy35 = createRoutePolicy(executor35);
		final RoutePolicy routePolicy36 = createRoutePolicy(executor36);
		final RoutePolicy routePolicy37 = createRoutePolicy(executor37);
		final RoutePolicy routePolicy38 = createRoutePolicy(executor38);
		final RoutePolicy routePolicy39 = createRoutePolicy(executor39);
		final RoutePolicy routePolicy40 = createRoutePolicy(executor40);
		final RoutePolicy routePolicy41 = createRoutePolicy(executor41);
		final RoutePolicy routePolicy42 = createRoutePolicy(executor42);
		final RoutePolicy routePolicy43 = createRoutePolicy(executor43);
		final RoutePolicy routePolicy44 = createRoutePolicy(executor44);
		final RoutePolicy routePolicy45 = createRoutePolicy(executor45);
		final RoutePolicy routePolicy46 = createRoutePolicy(executor46);
		final RoutePolicy routePolicy47 = createRoutePolicy(executor47);
		final RoutePolicy routePolicy48 = createRoutePolicy(executor48);
		final RoutePolicy routePolicy49 = createRoutePolicy(executor49);
		final RoutePolicy routePolicy50 = createRoutePolicy(executor50);
		final RoutePolicy routePolicy51 = createRoutePolicy(executor51);
		final RoutePolicy routePolicy52 = createRoutePolicy(executor52);
		final RoutePolicy routePolicy53 = createRoutePolicy(executor53);
		final RoutePolicy routePolicy54 = createRoutePolicy(executor54);
		final RoutePolicy routePolicy55 = createRoutePolicy(executor55);
		final RoutePolicy routePolicy56 = createRoutePolicy(executor56);
		final RoutePolicy routePolicy57 = createRoutePolicy(executor57);
		final RoutePolicy routePolicy58 = createRoutePolicy(executor58);
		final RoutePolicy routePolicy59 = createRoutePolicy(executor59);
		final RoutePolicy routePolicy60 = createRoutePolicy(executor60);
		final RoutePolicy routePolicy61 = createRoutePolicy(executor61);
		final RoutePolicy routePolicy62 = createRoutePolicy(executor62);
		final RoutePolicy routePolicy63 = createRoutePolicy(executor63);
		final RoutePolicy routePolicy64 = createRoutePolicy(executor64);
		final RoutePolicy routePolicy65 = createRoutePolicy(executor65);
		final RoutePolicy routePolicy66 = createRoutePolicy(executor66);
		final RoutePolicy routePolicy67 = createRoutePolicy(executor67);
		final RoutePolicy routePolicy68 = createRoutePolicy(executor68);
		final RoutePolicy routePolicy69 = createRoutePolicy(executor69);
		
		RouteBuilder builder = new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:inputfolder1?delete=true").routeId("1")
						.routePolicy(routePolicy1).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder1");

				from("file:inputfolder2?delete=true").routeId("2")
						.routePolicy(routePolicy2).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder2");

				from("file:inputfolder3?delete=true").routeId("3")
						.routePolicy(routePolicy3).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder3");

				from("file:inputfolder4?delete=true").routeId("4")
						.routePolicy(routePolicy4).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder4");

				from("file:inputfolder5?delete=true").routeId("5")
						.routePolicy(routePolicy5).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder5");

				from("file:inputfolder6?delete=true").routeId("6")
						.routePolicy(routePolicy6).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder6");

				from("file:inputfolder7?delete=true").routeId("7")
						.routePolicy(routePolicy7).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder7");

				from("file:inputfolder8?delete=true").routeId("8")
						.routePolicy(routePolicy8).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder8");

				from("file:inputfolder9?delete=true").routeId("9")
						.routePolicy(routePolicy9).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder9");

				from("file:inputfolder10?delete=true").routeId("10")
						.routePolicy(routePolicy10).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder10");

				from("file:inputfolder11?delete=true").routeId("11")
						.routePolicy(routePolicy11).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder11");

				from("file:inputfolder12?delete=true").routeId("12")
						.routePolicy(routePolicy12).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder12");

				from("file:inputfolder13?delete=true").routeId("13")
						.routePolicy(routePolicy13).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder13");

				from("file:inputfolder14?delete=true").routeId("14")
						.routePolicy(routePolicy14).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder14");

				from("file:inputfolder15?delete=true").routeId("15")
						.routePolicy(routePolicy15).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder15");

				from("file:inputfolder16?delete=true").routeId("16")
						.routePolicy(routePolicy16).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder16");

				from("file:inputfolder17?delete=true").routeId("17")
						.routePolicy(routePolicy17).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder17");

				from("file:inputfolder18?delete=true").routeId("18")
						.routePolicy(routePolicy18).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder18");

				from("file:inputfolder19?delete=true").routeId("19")
						.routePolicy(routePolicy19).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder19");

				from("file:inputfolder20?delete=true").routeId("20")
						.routePolicy(routePolicy20).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder20");

				from("file:inputfolder21?delete=true").routeId("21")
						.routePolicy(routePolicy21).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder21");

				from("file:inputfolder22?delete=true").routeId("22")
						.routePolicy(routePolicy22).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder22");

				from("file:inputfolder23?delete=true").routeId("23")
						.routePolicy(routePolicy23).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder23");

				from("file:inputfolder24?delete=true").routeId("24")
						.routePolicy(routePolicy24).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder24");

				from("file:inputfolder25?delete=true").routeId("25")
						.routePolicy(routePolicy25).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder25");

				from("file:inputfolder26?delete=true").routeId("26")
						.routePolicy(routePolicy26).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder26");

				from("file:inputfolder27?delete=true").routeId("27")
						.routePolicy(routePolicy27).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder27");

				from("file:inputfolder28?delete=true").routeId("28")
						.routePolicy(routePolicy28).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder28");

				from("file:inputfolder29?delete=true").routeId("29")
						.routePolicy(routePolicy29).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder29");

				from("file:inputfolder30?delete=true").routeId("30")
						.routePolicy(routePolicy30).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder30");

				from("file:inputfolder31?delete=true").routeId("31")
						.routePolicy(routePolicy31).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder31");

				from("file:inputfolder32?delete=true").routeId("32")
						.routePolicy(routePolicy32).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder32");

				from("file:inputfolder33?delete=true").routeId("33")
						.routePolicy(routePolicy33).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder33");

				from("file:inputfolder34?delete=true").routeId("34")
						.routePolicy(routePolicy34).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder34");

				from("file:inputfolder35?delete=true").routeId("35")
						.routePolicy(routePolicy35).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder35");

				from("file:inputfolder36?delete=true").routeId("36")
						.routePolicy(routePolicy36).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder36");

				from("file:inputfolder37?delete=true").routeId("37")
						.routePolicy(routePolicy37).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder37");

				from("file:inputfolder38?delete=true").routeId("38")
						.routePolicy(routePolicy38).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder38");

				from("file:inputfolder39?delete=true").routeId("39")
						.routePolicy(routePolicy39).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder39");

				from("file:inputfolder40?delete=true").routeId("40")
						.routePolicy(routePolicy40).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder40");

				from("file:inputfolder41?delete=true").routeId("41")
						.routePolicy(routePolicy41).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder41");

				from("file:inputfolder42?delete=true").routeId("42")
						.routePolicy(routePolicy42).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder42");

				from("file:inputfolder43?delete=true").routeId("43")
						.routePolicy(routePolicy43).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder43");

				from("file:inputfolder44?delete=true").routeId("44")
						.routePolicy(routePolicy44).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder44");

				from("file:inputfolder45?delete=true").routeId("45")
						.routePolicy(routePolicy45).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder45");

				from("file:inputfolder46?delete=true").routeId("46")
						.routePolicy(routePolicy46).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder46");

				from("file:inputfolder47?delete=true").routeId("47")
						.routePolicy(routePolicy47).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder47");

				from("file:inputfolder48?delete=true").routeId("48")
						.routePolicy(routePolicy48).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder48");

				from("file:inputfolder49?delete=true").routeId("49")
						.routePolicy(routePolicy49).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder49");

				from("file:inputfolder50?delete=true").routeId("50")
						.routePolicy(routePolicy50).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder50");

				from("file:inputfolder51?delete=true").routeId("51")
						.routePolicy(routePolicy51).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder51");

				from("file:inputfolder52?delete=true").routeId("52")
						.routePolicy(routePolicy52).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder52");

				from("file:inputfolder53?delete=true").routeId("53")
						.routePolicy(routePolicy53).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder53");

				from("file:inputfolder54?delete=true").routeId("54")
						.routePolicy(routePolicy54).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder54");

				from("file:inputfolder55?delete=true").routeId("55")
						.routePolicy(routePolicy55).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder55");

				from("file:inputfolder56?delete=true").routeId("56")
						.routePolicy(routePolicy56).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder56");

				from("file:inputfolder57?delete=true").routeId("57")
						.routePolicy(routePolicy57).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder57");

				from("file:inputfolder58?delete=true").routeId("58")
						.routePolicy(routePolicy58).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder58");

				from("file:inputfolder59?delete=true").routeId("59")
						.routePolicy(routePolicy59).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder59");

				from("file:inputfolder60?delete=true").routeId("60")
						.routePolicy(routePolicy60).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder60");

				from("file:inputfolder61?delete=true").routeId("61")
						.routePolicy(routePolicy61).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder61");

				from("file:inputfolder62?delete=true").routeId("62")
						.routePolicy(routePolicy62).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder62");

				from("file:inputfolder63?delete=true").routeId("63")
						.routePolicy(routePolicy63).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder63");

				from("file:inputfolder64?delete=true").routeId("64")
						.routePolicy(routePolicy64).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder64");

				from("file:inputfolder65?delete=true").routeId("65")
						.routePolicy(routePolicy65).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder65");

				from("file:inputfolder66?delete=true").routeId("66")
						.routePolicy(routePolicy66).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder66");

				from("file:inputfolder67?delete=true").routeId("67")
						.routePolicy(routePolicy67).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder67");

				from("file:inputfolder68?delete=true").routeId("68")
						.routePolicy(routePolicy68).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder68");

				from("file:inputfolder69?delete=true").routeId("69")
						.routePolicy(routePolicy69).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder69");

			}
		};
		try {
			camelContext.addRoutes(builder);
			camelContext.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		route1.setCamelContext(camelContext);
		route2.setCamelContext(camelContext);
		route3.setCamelContext(camelContext);
		route4.setCamelContext(camelContext);
		route5.setCamelContext(camelContext);
		route6.setCamelContext(camelContext);
		route7.setCamelContext(camelContext);
		route8.setCamelContext(camelContext);
		route9.setCamelContext(camelContext);
		route10.setCamelContext(camelContext);
		route11.setCamelContext(camelContext);
		route12.setCamelContext(camelContext);
		route13.setCamelContext(camelContext);
		route14.setCamelContext(camelContext);
		route15.setCamelContext(camelContext);
		route16.setCamelContext(camelContext);
		route17.setCamelContext(camelContext);
		route18.setCamelContext(camelContext);
		route19.setCamelContext(camelContext);
		route20.setCamelContext(camelContext);
		route21.setCamelContext(camelContext);
		route22.setCamelContext(camelContext);
		route23.setCamelContext(camelContext);
		route24.setCamelContext(camelContext);
		route25.setCamelContext(camelContext);
		route26.setCamelContext(camelContext);
		route27.setCamelContext(camelContext);
		route28.setCamelContext(camelContext);
		route29.setCamelContext(camelContext);
		route30.setCamelContext(camelContext);
		route31.setCamelContext(camelContext);
		route32.setCamelContext(camelContext);
		route33.setCamelContext(camelContext);
		route34.setCamelContext(camelContext);
		route35.setCamelContext(camelContext);
		route36.setCamelContext(camelContext);
		route37.setCamelContext(camelContext);
		route38.setCamelContext(camelContext);
		route39.setCamelContext(camelContext);
		route40.setCamelContext(camelContext);
		route41.setCamelContext(camelContext);
		route42.setCamelContext(camelContext);
		route43.setCamelContext(camelContext);
		route44.setCamelContext(camelContext);
		route45.setCamelContext(camelContext);
		route46.setCamelContext(camelContext);
		route47.setCamelContext(camelContext);
		route48.setCamelContext(camelContext);
		route49.setCamelContext(camelContext);
		route50.setCamelContext(camelContext);
		route51.setCamelContext(camelContext);
		route52.setCamelContext(camelContext);
		route53.setCamelContext(camelContext);
		route54.setCamelContext(camelContext);
		route55.setCamelContext(camelContext);
		route56.setCamelContext(camelContext);
		route57.setCamelContext(camelContext);
		route58.setCamelContext(camelContext);
		route59.setCamelContext(camelContext);
		route60.setCamelContext(camelContext);
		route61.setCamelContext(camelContext);
		route62.setCamelContext(camelContext);
		route63.setCamelContext(camelContext);
		route64.setCamelContext(camelContext);
		route65.setCamelContext(camelContext);
		route66.setCamelContext(camelContext);
		route67.setCamelContext(camelContext);
		route68.setCamelContext(camelContext);
		route69.setCamelContext(camelContext);
		engine.specifyGlue(bipGlue);
		engine.start();
		engine.execute();
		Thread.sleep(80000);
	}

	@Test
	public void bipSwMultiTest74() throws BIPException, InterruptedException {

		BIPGlue bipGlue = new TwoSynchronGlueBuilder() {
			@Override
			public void configure() {

				synchron(SwitchableRoute.class, "on").to(
						MonitorNoDataManyRoutes.class, "add");
				synchron(SwitchableRoute.class, "finished").to(
						MonitorNoDataManyRoutes.class, "rm");
				port(SwitchableRoute.class, "off")
						.acceptsNothing();
				port(SwitchableRoute.class, "off")
						.requiresNothing();

			}

		}.build();
		BIPEngine engine = engineFactory.create("myEngine", bipGlue);

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.setAutoStartup(false);

		MonitorNoDataManyRoutes monitorNoDataManyRoutes = new MonitorNoDataManyRoutes(37);
		final BIPActor executorM = engine.register(monitorNoDataManyRoutes, "monitor", true);
		
		SwitchableRoute route1 = new SwitchableRoute("1", camelContext);
		SwitchableRoute route2 = new SwitchableRoute("2", camelContext);
		SwitchableRoute route3 = new SwitchableRoute("3", camelContext);
		SwitchableRoute route4 = new SwitchableRoute("4", camelContext);
		SwitchableRoute route5 = new SwitchableRoute("5", camelContext);
		SwitchableRoute route6 = new SwitchableRoute("6", camelContext);
		SwitchableRoute route7 = new SwitchableRoute("7", camelContext);
		SwitchableRoute route8 = new SwitchableRoute("8", camelContext);
		SwitchableRoute route9 = new SwitchableRoute("9", camelContext);
		SwitchableRoute route10 = new SwitchableRoute("10", camelContext);
		SwitchableRoute route11 = new SwitchableRoute("11", camelContext);
		SwitchableRoute route12 = new SwitchableRoute("12", camelContext);
		SwitchableRoute route13 = new SwitchableRoute("13", camelContext);
		SwitchableRoute route14 = new SwitchableRoute("14", camelContext);
		SwitchableRoute route15 = new SwitchableRoute("15", camelContext);
		SwitchableRoute route16 = new SwitchableRoute("16", camelContext);
		SwitchableRoute route17 = new SwitchableRoute("17", camelContext);
		SwitchableRoute route18 = new SwitchableRoute("18", camelContext);
		SwitchableRoute route19 = new SwitchableRoute("19", camelContext);
		SwitchableRoute route20 = new SwitchableRoute("20", camelContext);
		SwitchableRoute route21 = new SwitchableRoute("21", camelContext);
		SwitchableRoute route22 = new SwitchableRoute("22", camelContext);
		SwitchableRoute route23 = new SwitchableRoute("23", camelContext);
		SwitchableRoute route24 = new SwitchableRoute("24", camelContext);
		SwitchableRoute route25 = new SwitchableRoute("25", camelContext);
		SwitchableRoute route26 = new SwitchableRoute("26", camelContext);
		SwitchableRoute route27 = new SwitchableRoute("27", camelContext);
		SwitchableRoute route28 = new SwitchableRoute("28", camelContext);
		SwitchableRoute route29 = new SwitchableRoute("29", camelContext);
		SwitchableRoute route30 = new SwitchableRoute("30", camelContext);
		SwitchableRoute route31 = new SwitchableRoute("31", camelContext);
		SwitchableRoute route32 = new SwitchableRoute("32", camelContext);
		SwitchableRoute route33 = new SwitchableRoute("33", camelContext);
		SwitchableRoute route34 = new SwitchableRoute("34", camelContext);
		SwitchableRoute route35 = new SwitchableRoute("35", camelContext);
		SwitchableRoute route36 = new SwitchableRoute("36", camelContext);
		SwitchableRoute route37 = new SwitchableRoute("37", camelContext);
		SwitchableRoute route38 = new SwitchableRoute("38", camelContext);
		SwitchableRoute route39 = new SwitchableRoute("39", camelContext);
		SwitchableRoute route40 = new SwitchableRoute("40", camelContext);
		SwitchableRoute route41 = new SwitchableRoute("41", camelContext);
		SwitchableRoute route42 = new SwitchableRoute("42", camelContext);
		SwitchableRoute route43 = new SwitchableRoute("43", camelContext);
		SwitchableRoute route44 = new SwitchableRoute("44", camelContext);
		SwitchableRoute route45 = new SwitchableRoute("45", camelContext);
		SwitchableRoute route46 = new SwitchableRoute("46", camelContext);
		SwitchableRoute route47 = new SwitchableRoute("47", camelContext);
		SwitchableRoute route48 = new SwitchableRoute("48", camelContext);
		SwitchableRoute route49 = new SwitchableRoute("49", camelContext);
		SwitchableRoute route50 = new SwitchableRoute("50", camelContext);
		SwitchableRoute route51 = new SwitchableRoute("51", camelContext);
		SwitchableRoute route52 = new SwitchableRoute("52", camelContext);
		SwitchableRoute route53 = new SwitchableRoute("53", camelContext);
		SwitchableRoute route54 = new SwitchableRoute("54", camelContext);
		SwitchableRoute route55 = new SwitchableRoute("55", camelContext);
		SwitchableRoute route56 = new SwitchableRoute("56", camelContext);
		SwitchableRoute route57 = new SwitchableRoute("57", camelContext);
		SwitchableRoute route58 = new SwitchableRoute("58", camelContext);
		SwitchableRoute route59 = new SwitchableRoute("59", camelContext);
		SwitchableRoute route60 = new SwitchableRoute("60", camelContext);
		SwitchableRoute route61 = new SwitchableRoute("61", camelContext);
		SwitchableRoute route62 = new SwitchableRoute("62", camelContext);
		SwitchableRoute route63 = new SwitchableRoute("63", camelContext);
		SwitchableRoute route64 = new SwitchableRoute("64", camelContext);
		SwitchableRoute route65 = new SwitchableRoute("65", camelContext);
		SwitchableRoute route66 = new SwitchableRoute("66", camelContext);
		SwitchableRoute route67 = new SwitchableRoute("67", camelContext);
		SwitchableRoute route68 = new SwitchableRoute("68", camelContext);
		SwitchableRoute route69 = new SwitchableRoute("69", camelContext);
		SwitchableRoute route70 = new SwitchableRoute("70", camelContext);
		SwitchableRoute route71 = new SwitchableRoute("71", camelContext);
		SwitchableRoute route72 = new SwitchableRoute("72", camelContext);
		SwitchableRoute route73 = new SwitchableRoute("73", camelContext);
		SwitchableRoute route74 = new SwitchableRoute("74", camelContext);

		final BIPActor executor1 = engine.register(route1,"1", true);
		final BIPActor executor2 = engine.register(route2,"2", true);
		final BIPActor executor3 = engine.register(route3,"3", true);
		final BIPActor executor4 = engine.register(route4,"4", true);
		final BIPActor executor5 = engine.register(route5,"5", true);
		final BIPActor executor6 = engine.register(route6,"6", true);
		final BIPActor executor7 = engine.register(route7,"7", true);
		final BIPActor executor8 = engine.register(route8,"8", true);
		final BIPActor executor9 = engine.register(route9,"9", true);
		final BIPActor executor10 = engine.register(route10,"10", true);
		final BIPActor executor11 = engine.register(route11,"11", true);
		final BIPActor executor12 = engine.register(route12,"12", true);
		final BIPActor executor13 = engine.register(route13,"13", true);
		final BIPActor executor14 = engine.register(route14,"14", true);
		final BIPActor executor15 = engine.register(route15,"15", true);
		final BIPActor executor16 = engine.register(route16,"16", true);
		final BIPActor executor17 = engine.register(route17,"17", true);
		final BIPActor executor18 = engine.register(route18,"18", true);
		final BIPActor executor19 = engine.register(route19,"19", true);
		final BIPActor executor20 = engine.register(route20,"20", true);
		final BIPActor executor21 = engine.register(route21,"21", true);
		final BIPActor executor22 = engine.register(route22,"22", true);
		final BIPActor executor23 = engine.register(route23,"23", true);
		final BIPActor executor24 = engine.register(route24,"24", true);
		final BIPActor executor25 = engine.register(route25,"25", true);
		final BIPActor executor26 = engine.register(route26,"26", true);
		final BIPActor executor27 = engine.register(route27,"27", true);
		final BIPActor executor28 = engine.register(route28,"28", true);
		final BIPActor executor29 = engine.register(route29,"29", true);
		final BIPActor executor30 = engine.register(route30,"30", true);
		final BIPActor executor31 = engine.register(route31,"31", true);
		final BIPActor executor32 = engine.register(route32,"32", true);
		final BIPActor executor33 = engine.register(route33,"33", true);
		final BIPActor executor34 = engine.register(route34,"34", true);
		final BIPActor executor35 = engine.register(route35,"35", true);
		final BIPActor executor36 = engine.register(route36,"36", true);
		final BIPActor executor37 = engine.register(route37,"37", true);
		final BIPActor executor38 = engine.register(route38,"38", true);
		final BIPActor executor39 = engine.register(route39,"39", true);
		final BIPActor executor40 = engine.register(route40,"40", true);
		final BIPActor executor41 = engine.register(route41,"41", true);
		final BIPActor executor42 = engine.register(route42,"42", true);
		final BIPActor executor43 = engine.register(route43,"43", true);
		final BIPActor executor44 = engine.register(route44,"44", true);
		final BIPActor executor45 = engine.register(route45,"45", true);
		final BIPActor executor46 = engine.register(route46,"46", true);
		final BIPActor executor47 = engine.register(route47,"47", true);
		final BIPActor executor48 = engine.register(route48,"48", true);
		final BIPActor executor49 = engine.register(route49,"49", true);
		final BIPActor executor50 = engine.register(route50,"50", true);
		final BIPActor executor51 = engine.register(route51,"51", true);
		final BIPActor executor52 = engine.register(route52,"52", true);
		final BIPActor executor53 = engine.register(route53,"53", true);
		final BIPActor executor54 = engine.register(route54,"54", true);
		final BIPActor executor55 = engine.register(route55,"55", true);
		final BIPActor executor56 = engine.register(route56,"56", true);
		final BIPActor executor57 = engine.register(route57,"57", true);
		final BIPActor executor58 = engine.register(route58,"58", true);
		final BIPActor executor59 = engine.register(route59,"59", true);
		final BIPActor executor60 = engine.register(route60,"60", true);
		final BIPActor executor61 = engine.register(route61,"61", true);
		final BIPActor executor62 = engine.register(route62,"62", true);
		final BIPActor executor63 = engine.register(route63,"63", true);
		final BIPActor executor64 = engine.register(route64,"64", true);
		final BIPActor executor65 = engine.register(route65,"65", true);
		final BIPActor executor66 = engine.register(route66,"66", true);
		final BIPActor executor67 = engine.register(route67,"67", true);
		final BIPActor executor68 = engine.register(route68,"68", true);
		final BIPActor executor69 = engine.register(route69,"69", true);
		final BIPActor executor70 = engine.register(route70,"70", true);
		final BIPActor executor71 = engine.register(route71,"71", true);
		final BIPActor executor72 = engine.register(route72,"72", true);
		final BIPActor executor73 = engine.register(route73,"73", true);
		final BIPActor executor74 = engine.register(route74,"74", true);

		final RoutePolicy routePolicy1 = createRoutePolicy(executor1);
		final RoutePolicy routePolicy2 = createRoutePolicy(executor2);
		final RoutePolicy routePolicy3 = createRoutePolicy(executor3);
		final RoutePolicy routePolicy4 = createRoutePolicy(executor4);
		final RoutePolicy routePolicy5 = createRoutePolicy(executor5);
		final RoutePolicy routePolicy6 = createRoutePolicy(executor6);
		final RoutePolicy routePolicy7 = createRoutePolicy(executor7);
		final RoutePolicy routePolicy8 = createRoutePolicy(executor8);
		final RoutePolicy routePolicy9 = createRoutePolicy(executor9);
		final RoutePolicy routePolicy10 = createRoutePolicy(executor10);
		final RoutePolicy routePolicy11 = createRoutePolicy(executor11);
		final RoutePolicy routePolicy12 = createRoutePolicy(executor12);
		final RoutePolicy routePolicy13 = createRoutePolicy(executor13);
		final RoutePolicy routePolicy14 = createRoutePolicy(executor14);
		final RoutePolicy routePolicy15 = createRoutePolicy(executor15);
		final RoutePolicy routePolicy16 = createRoutePolicy(executor16);
		final RoutePolicy routePolicy17 = createRoutePolicy(executor17);
		final RoutePolicy routePolicy18 = createRoutePolicy(executor18);
		final RoutePolicy routePolicy19 = createRoutePolicy(executor19);
		final RoutePolicy routePolicy20 = createRoutePolicy(executor20);
		final RoutePolicy routePolicy21 = createRoutePolicy(executor21);
		final RoutePolicy routePolicy22 = createRoutePolicy(executor22);
		final RoutePolicy routePolicy23 = createRoutePolicy(executor23);
		final RoutePolicy routePolicy24 = createRoutePolicy(executor24);
		final RoutePolicy routePolicy25 = createRoutePolicy(executor25);
		final RoutePolicy routePolicy26 = createRoutePolicy(executor26);
		final RoutePolicy routePolicy27 = createRoutePolicy(executor27);
		final RoutePolicy routePolicy28 = createRoutePolicy(executor28);
		final RoutePolicy routePolicy29 = createRoutePolicy(executor29);
		final RoutePolicy routePolicy30 = createRoutePolicy(executor30);
		final RoutePolicy routePolicy31 = createRoutePolicy(executor31);
		final RoutePolicy routePolicy32 = createRoutePolicy(executor32);
		final RoutePolicy routePolicy33 = createRoutePolicy(executor33);
		final RoutePolicy routePolicy34 = createRoutePolicy(executor34);
		final RoutePolicy routePolicy35 = createRoutePolicy(executor35);
		final RoutePolicy routePolicy36 = createRoutePolicy(executor36);
		final RoutePolicy routePolicy37 = createRoutePolicy(executor37);
		final RoutePolicy routePolicy38 = createRoutePolicy(executor38);
		final RoutePolicy routePolicy39 = createRoutePolicy(executor39);
		final RoutePolicy routePolicy40 = createRoutePolicy(executor40);
		final RoutePolicy routePolicy41 = createRoutePolicy(executor41);
		final RoutePolicy routePolicy42 = createRoutePolicy(executor42);
		final RoutePolicy routePolicy43 = createRoutePolicy(executor43);
		final RoutePolicy routePolicy44 = createRoutePolicy(executor44);
		final RoutePolicy routePolicy45 = createRoutePolicy(executor45);
		final RoutePolicy routePolicy46 = createRoutePolicy(executor46);
		final RoutePolicy routePolicy47 = createRoutePolicy(executor47);
		final RoutePolicy routePolicy48 = createRoutePolicy(executor48);
		final RoutePolicy routePolicy49 = createRoutePolicy(executor49);
		final RoutePolicy routePolicy50 = createRoutePolicy(executor50);
		final RoutePolicy routePolicy51 = createRoutePolicy(executor51);
		final RoutePolicy routePolicy52 = createRoutePolicy(executor52);
		final RoutePolicy routePolicy53 = createRoutePolicy(executor53);
		final RoutePolicy routePolicy54 = createRoutePolicy(executor54);
		final RoutePolicy routePolicy55 = createRoutePolicy(executor55);
		final RoutePolicy routePolicy56 = createRoutePolicy(executor56);
		final RoutePolicy routePolicy57 = createRoutePolicy(executor57);
		final RoutePolicy routePolicy58 = createRoutePolicy(executor58);
		final RoutePolicy routePolicy59 = createRoutePolicy(executor59);
		final RoutePolicy routePolicy60 = createRoutePolicy(executor60);
		final RoutePolicy routePolicy61 = createRoutePolicy(executor61);
		final RoutePolicy routePolicy62 = createRoutePolicy(executor62);
		final RoutePolicy routePolicy63 = createRoutePolicy(executor63);
		final RoutePolicy routePolicy64 = createRoutePolicy(executor64);
		final RoutePolicy routePolicy65 = createRoutePolicy(executor65);
		final RoutePolicy routePolicy66 = createRoutePolicy(executor66);
		final RoutePolicy routePolicy67 = createRoutePolicy(executor67);
		final RoutePolicy routePolicy68 = createRoutePolicy(executor68);
		final RoutePolicy routePolicy69 = createRoutePolicy(executor69);
		final RoutePolicy routePolicy70 = createRoutePolicy(executor70);
		final RoutePolicy routePolicy71 = createRoutePolicy(executor71);
		final RoutePolicy routePolicy72 = createRoutePolicy(executor72);
		final RoutePolicy routePolicy73 = createRoutePolicy(executor73);
		final RoutePolicy routePolicy74 = createRoutePolicy(executor74);
		
		RouteBuilder builder = new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:inputfolder1?delete=true").routeId("1")
						.routePolicy(routePolicy1).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder1");

				from("file:inputfolder2?delete=true").routeId("2")
						.routePolicy(routePolicy2).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder2");

				from("file:inputfolder3?delete=true").routeId("3")
						.routePolicy(routePolicy3).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder3");

				from("file:inputfolder4?delete=true").routeId("4")
						.routePolicy(routePolicy4).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder4");

				from("file:inputfolder5?delete=true").routeId("5")
						.routePolicy(routePolicy5).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder5");

				from("file:inputfolder6?delete=true").routeId("6")
						.routePolicy(routePolicy6).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder6");

				from("file:inputfolder7?delete=true").routeId("7")
						.routePolicy(routePolicy7).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder7");

				from("file:inputfolder8?delete=true").routeId("8")
						.routePolicy(routePolicy8).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder8");

				from("file:inputfolder9?delete=true").routeId("9")
						.routePolicy(routePolicy9).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder9");

				from("file:inputfolder10?delete=true").routeId("10")
						.routePolicy(routePolicy10).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder10");

				from("file:inputfolder11?delete=true").routeId("11")
						.routePolicy(routePolicy11).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder11");

				from("file:inputfolder12?delete=true").routeId("12")
						.routePolicy(routePolicy12).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder12");

				from("file:inputfolder13?delete=true").routeId("13")
						.routePolicy(routePolicy13).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder13");

				from("file:inputfolder14?delete=true").routeId("14")
						.routePolicy(routePolicy14).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder14");

				from("file:inputfolder15?delete=true").routeId("15")
						.routePolicy(routePolicy15).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder15");

				from("file:inputfolder16?delete=true").routeId("16")
						.routePolicy(routePolicy16).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder16");

				from("file:inputfolder17?delete=true").routeId("17")
						.routePolicy(routePolicy17).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder17");

				from("file:inputfolder18?delete=true").routeId("18")
						.routePolicy(routePolicy18).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder18");

				from("file:inputfolder19?delete=true").routeId("19")
						.routePolicy(routePolicy19).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder19");

				from("file:inputfolder20?delete=true").routeId("20")
						.routePolicy(routePolicy20).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder20");

				from("file:inputfolder21?delete=true").routeId("21")
						.routePolicy(routePolicy21).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder21");

				from("file:inputfolder22?delete=true").routeId("22")
						.routePolicy(routePolicy22).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder22");

				from("file:inputfolder23?delete=true").routeId("23")
						.routePolicy(routePolicy23).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder23");

				from("file:inputfolder24?delete=true").routeId("24")
						.routePolicy(routePolicy24).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder24");

				from("file:inputfolder25?delete=true").routeId("25")
						.routePolicy(routePolicy25).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder25");

				from("file:inputfolder26?delete=true").routeId("26")
						.routePolicy(routePolicy26).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder26");

				from("file:inputfolder27?delete=true").routeId("27")
						.routePolicy(routePolicy27).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder27");

				from("file:inputfolder28?delete=true").routeId("28")
						.routePolicy(routePolicy28).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder28");

				from("file:inputfolder29?delete=true").routeId("29")
						.routePolicy(routePolicy29).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder29");

				from("file:inputfolder30?delete=true").routeId("30")
						.routePolicy(routePolicy30).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder30");

				from("file:inputfolder31?delete=true").routeId("31")
						.routePolicy(routePolicy31).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder31");

				from("file:inputfolder32?delete=true").routeId("32")
						.routePolicy(routePolicy32).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder32");

				from("file:inputfolder33?delete=true").routeId("33")
						.routePolicy(routePolicy33).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder33");

				from("file:inputfolder34?delete=true").routeId("34")
						.routePolicy(routePolicy34).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder34");

				from("file:inputfolder35?delete=true").routeId("35")
						.routePolicy(routePolicy35).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder35");

				from("file:inputfolder36?delete=true").routeId("36")
						.routePolicy(routePolicy36).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder36");

				from("file:inputfolder37?delete=true").routeId("37")
						.routePolicy(routePolicy37).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder37");

				from("file:inputfolder38?delete=true").routeId("38")
						.routePolicy(routePolicy38).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder38");

				from("file:inputfolder39?delete=true").routeId("39")
						.routePolicy(routePolicy39).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder39");

				from("file:inputfolder40?delete=true").routeId("40")
						.routePolicy(routePolicy40).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder40");

				from("file:inputfolder41?delete=true").routeId("41")
						.routePolicy(routePolicy41).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder41");

				from("file:inputfolder42?delete=true").routeId("42")
						.routePolicy(routePolicy42).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder42");

				from("file:inputfolder43?delete=true").routeId("43")
						.routePolicy(routePolicy43).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder43");

				from("file:inputfolder44?delete=true").routeId("44")
						.routePolicy(routePolicy44).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder44");

				from("file:inputfolder45?delete=true").routeId("45")
						.routePolicy(routePolicy45).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder45");

				from("file:inputfolder46?delete=true").routeId("46")
						.routePolicy(routePolicy46).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder46");

				from("file:inputfolder47?delete=true").routeId("47")
						.routePolicy(routePolicy47).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder47");

				from("file:inputfolder48?delete=true").routeId("48")
						.routePolicy(routePolicy48).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder48");

				from("file:inputfolder49?delete=true").routeId("49")
						.routePolicy(routePolicy49).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder49");

				from("file:inputfolder50?delete=true").routeId("50")
						.routePolicy(routePolicy50).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder50");

				from("file:inputfolder51?delete=true").routeId("51")
						.routePolicy(routePolicy51).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder51");

				from("file:inputfolder52?delete=true").routeId("52")
						.routePolicy(routePolicy52).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder52");

				from("file:inputfolder53?delete=true").routeId("53")
						.routePolicy(routePolicy53).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder53");

				from("file:inputfolder54?delete=true").routeId("54")
						.routePolicy(routePolicy54).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder54");

				from("file:inputfolder55?delete=true").routeId("55")
						.routePolicy(routePolicy55).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder55");

				from("file:inputfolder56?delete=true").routeId("56")
						.routePolicy(routePolicy56).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder56");

				from("file:inputfolder57?delete=true").routeId("57")
						.routePolicy(routePolicy57).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder57");

				from("file:inputfolder58?delete=true").routeId("58")
						.routePolicy(routePolicy58).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder58");

				from("file:inputfolder59?delete=true").routeId("59")
						.routePolicy(routePolicy59).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder59");

				from("file:inputfolder60?delete=true").routeId("60")
						.routePolicy(routePolicy60).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder60");

				from("file:inputfolder61?delete=true").routeId("61")
						.routePolicy(routePolicy61).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder61");

				from("file:inputfolder62?delete=true").routeId("62")
						.routePolicy(routePolicy62).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder62");

				from("file:inputfolder63?delete=true").routeId("63")
						.routePolicy(routePolicy63).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder63");

				from("file:inputfolder64?delete=true").routeId("64")
						.routePolicy(routePolicy64).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder64");

				from("file:inputfolder65?delete=true").routeId("65")
						.routePolicy(routePolicy65).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder65");

				from("file:inputfolder66?delete=true").routeId("66")
						.routePolicy(routePolicy66).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder66");

				from("file:inputfolder67?delete=true").routeId("67")
						.routePolicy(routePolicy67).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder67");

				from("file:inputfolder68?delete=true").routeId("68")
						.routePolicy(routePolicy68).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder68");

				from("file:inputfolder69?delete=true").routeId("69")
						.routePolicy(routePolicy69).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder69");

				from("file:inputfolder70?delete=true").routeId("70")
						.routePolicy(routePolicy70).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder70");

				from("file:inputfolder71?delete=true").routeId("71")
						.routePolicy(routePolicy71).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder71");

				from("file:inputfolder72?delete=true").routeId("72")
						.routePolicy(routePolicy72).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder72");

				from("file:inputfolder73?delete=true").routeId("73")
						.routePolicy(routePolicy73).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder73");

				from("file:inputfolder74?delete=true").routeId("74")
						.routePolicy(routePolicy74).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder74");

			}
		};
		try {
			camelContext.addRoutes(builder);
			camelContext.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		route1.setCamelContext(camelContext);
		route2.setCamelContext(camelContext);
		route3.setCamelContext(camelContext);
		route4.setCamelContext(camelContext);
		route5.setCamelContext(camelContext);
		route6.setCamelContext(camelContext);
		route7.setCamelContext(camelContext);
		route8.setCamelContext(camelContext);
		route9.setCamelContext(camelContext);
		route10.setCamelContext(camelContext);
		route11.setCamelContext(camelContext);
		route12.setCamelContext(camelContext);
		route13.setCamelContext(camelContext);
		route14.setCamelContext(camelContext);
		route15.setCamelContext(camelContext);
		route16.setCamelContext(camelContext);
		route17.setCamelContext(camelContext);
		route18.setCamelContext(camelContext);
		route19.setCamelContext(camelContext);
		route20.setCamelContext(camelContext);
		route21.setCamelContext(camelContext);
		route22.setCamelContext(camelContext);
		route23.setCamelContext(camelContext);
		route24.setCamelContext(camelContext);
		route25.setCamelContext(camelContext);
		route26.setCamelContext(camelContext);
		route27.setCamelContext(camelContext);
		route28.setCamelContext(camelContext);
		route29.setCamelContext(camelContext);
		route30.setCamelContext(camelContext);
		route31.setCamelContext(camelContext);
		route32.setCamelContext(camelContext);
		route33.setCamelContext(camelContext);
		route34.setCamelContext(camelContext);
		route35.setCamelContext(camelContext);
		route36.setCamelContext(camelContext);
		route37.setCamelContext(camelContext);
		route38.setCamelContext(camelContext);
		route39.setCamelContext(camelContext);
		route40.setCamelContext(camelContext);
		route41.setCamelContext(camelContext);
		route42.setCamelContext(camelContext);
		route43.setCamelContext(camelContext);
		route44.setCamelContext(camelContext);
		route45.setCamelContext(camelContext);
		route46.setCamelContext(camelContext);
		route47.setCamelContext(camelContext);
		route48.setCamelContext(camelContext);
		route49.setCamelContext(camelContext);
		route50.setCamelContext(camelContext);
		route51.setCamelContext(camelContext);
		route52.setCamelContext(camelContext);
		route53.setCamelContext(camelContext);
		route54.setCamelContext(camelContext);
		route55.setCamelContext(camelContext);
		route56.setCamelContext(camelContext);
		route57.setCamelContext(camelContext);
		route58.setCamelContext(camelContext);
		route59.setCamelContext(camelContext);
		route60.setCamelContext(camelContext);
		route61.setCamelContext(camelContext);
		route62.setCamelContext(camelContext);
		route63.setCamelContext(camelContext);
		route64.setCamelContext(camelContext);
		route65.setCamelContext(camelContext);
		route66.setCamelContext(camelContext);
		route67.setCamelContext(camelContext);
		route68.setCamelContext(camelContext);
		route69.setCamelContext(camelContext);
		route70.setCamelContext(camelContext);
		route71.setCamelContext(camelContext);
		route72.setCamelContext(camelContext);
		route73.setCamelContext(camelContext);
		route74.setCamelContext(camelContext);
		engine.specifyGlue(bipGlue);
		engine.start();
		engine.execute();
		Thread.sleep(80000);
	}

	@Test
	public void bipSwMultiTest79() throws BIPException, InterruptedException {

		BIPGlue bipGlue = new TwoSynchronGlueBuilder() {
			@Override
			public void configure() {

				synchron(SwitchableRoute.class, "on").to(
						MonitorNoDataManyRoutes.class, "add");
				synchron(SwitchableRoute.class, "finished").to(
						MonitorNoDataManyRoutes.class, "rm");
				port(SwitchableRoute.class, "off")
						.acceptsNothing();
				port(SwitchableRoute.class, "off")
						.requiresNothing();

			}

		}.build();
		BIPEngine engine = engineFactory.create("myEngine", bipGlue);

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.setAutoStartup(false);

		MonitorNoDataManyRoutes monitorNoDataManyRoutes = new MonitorNoDataManyRoutes(39);
		final BIPActor executorM = engine.register(monitorNoDataManyRoutes, "monitor", true);
		
		SwitchableRoute route1 = new SwitchableRoute("1", camelContext);
		SwitchableRoute route2 = new SwitchableRoute("2", camelContext);
		SwitchableRoute route3 = new SwitchableRoute("3", camelContext);
		SwitchableRoute route4 = new SwitchableRoute("4", camelContext);
		SwitchableRoute route5 = new SwitchableRoute("5", camelContext);
		SwitchableRoute route6 = new SwitchableRoute("6", camelContext);
		SwitchableRoute route7 = new SwitchableRoute("7", camelContext);
		SwitchableRoute route8 = new SwitchableRoute("8", camelContext);
		SwitchableRoute route9 = new SwitchableRoute("9", camelContext);
		SwitchableRoute route10 = new SwitchableRoute("10", camelContext);
		SwitchableRoute route11 = new SwitchableRoute("11", camelContext);
		SwitchableRoute route12 = new SwitchableRoute("12", camelContext);
		SwitchableRoute route13 = new SwitchableRoute("13", camelContext);
		SwitchableRoute route14 = new SwitchableRoute("14", camelContext);
		SwitchableRoute route15 = new SwitchableRoute("15", camelContext);
		SwitchableRoute route16 = new SwitchableRoute("16", camelContext);
		SwitchableRoute route17 = new SwitchableRoute("17", camelContext);
		SwitchableRoute route18 = new SwitchableRoute("18", camelContext);
		SwitchableRoute route19 = new SwitchableRoute("19", camelContext);
		SwitchableRoute route20 = new SwitchableRoute("20", camelContext);
		SwitchableRoute route21 = new SwitchableRoute("21", camelContext);
		SwitchableRoute route22 = new SwitchableRoute("22", camelContext);
		SwitchableRoute route23 = new SwitchableRoute("23", camelContext);
		SwitchableRoute route24 = new SwitchableRoute("24", camelContext);
		SwitchableRoute route25 = new SwitchableRoute("25", camelContext);
		SwitchableRoute route26 = new SwitchableRoute("26", camelContext);
		SwitchableRoute route27 = new SwitchableRoute("27", camelContext);
		SwitchableRoute route28 = new SwitchableRoute("28", camelContext);
		SwitchableRoute route29 = new SwitchableRoute("29", camelContext);
		SwitchableRoute route30 = new SwitchableRoute("30", camelContext);
		SwitchableRoute route31 = new SwitchableRoute("31", camelContext);
		SwitchableRoute route32 = new SwitchableRoute("32", camelContext);
		SwitchableRoute route33 = new SwitchableRoute("33", camelContext);
		SwitchableRoute route34 = new SwitchableRoute("34", camelContext);
		SwitchableRoute route35 = new SwitchableRoute("35", camelContext);
		SwitchableRoute route36 = new SwitchableRoute("36", camelContext);
		SwitchableRoute route37 = new SwitchableRoute("37", camelContext);
		SwitchableRoute route38 = new SwitchableRoute("38", camelContext);
		SwitchableRoute route39 = new SwitchableRoute("39", camelContext);
		SwitchableRoute route40 = new SwitchableRoute("40", camelContext);
		SwitchableRoute route41 = new SwitchableRoute("41", camelContext);
		SwitchableRoute route42 = new SwitchableRoute("42", camelContext);
		SwitchableRoute route43 = new SwitchableRoute("43", camelContext);
		SwitchableRoute route44 = new SwitchableRoute("44", camelContext);
		SwitchableRoute route45 = new SwitchableRoute("45", camelContext);
		SwitchableRoute route46 = new SwitchableRoute("46", camelContext);
		SwitchableRoute route47 = new SwitchableRoute("47", camelContext);
		SwitchableRoute route48 = new SwitchableRoute("48", camelContext);
		SwitchableRoute route49 = new SwitchableRoute("49", camelContext);
		SwitchableRoute route50 = new SwitchableRoute("50", camelContext);
		SwitchableRoute route51 = new SwitchableRoute("51", camelContext);
		SwitchableRoute route52 = new SwitchableRoute("52", camelContext);
		SwitchableRoute route53 = new SwitchableRoute("53", camelContext);
		SwitchableRoute route54 = new SwitchableRoute("54", camelContext);
		SwitchableRoute route55 = new SwitchableRoute("55", camelContext);
		SwitchableRoute route56 = new SwitchableRoute("56", camelContext);
		SwitchableRoute route57 = new SwitchableRoute("57", camelContext);
		SwitchableRoute route58 = new SwitchableRoute("58", camelContext);
		SwitchableRoute route59 = new SwitchableRoute("59", camelContext);
		SwitchableRoute route60 = new SwitchableRoute("60", camelContext);
		SwitchableRoute route61 = new SwitchableRoute("61", camelContext);
		SwitchableRoute route62 = new SwitchableRoute("62", camelContext);
		SwitchableRoute route63 = new SwitchableRoute("63", camelContext);
		SwitchableRoute route64 = new SwitchableRoute("64", camelContext);
		SwitchableRoute route65 = new SwitchableRoute("65", camelContext);
		SwitchableRoute route66 = new SwitchableRoute("66", camelContext);
		SwitchableRoute route67 = new SwitchableRoute("67", camelContext);
		SwitchableRoute route68 = new SwitchableRoute("68", camelContext);
		SwitchableRoute route69 = new SwitchableRoute("69", camelContext);
		SwitchableRoute route70 = new SwitchableRoute("70", camelContext);
		SwitchableRoute route71 = new SwitchableRoute("71", camelContext);
		SwitchableRoute route72 = new SwitchableRoute("72", camelContext);
		SwitchableRoute route73 = new SwitchableRoute("73", camelContext);
		SwitchableRoute route74 = new SwitchableRoute("74", camelContext);
		SwitchableRoute route75 = new SwitchableRoute("75", camelContext);
		SwitchableRoute route76 = new SwitchableRoute("76", camelContext);
		SwitchableRoute route77 = new SwitchableRoute("77", camelContext);
		SwitchableRoute route78 = new SwitchableRoute("78", camelContext);
		SwitchableRoute route79 = new SwitchableRoute("79", camelContext);
		SwitchableRoute route80 = new SwitchableRoute("80", camelContext);
		SwitchableRoute route81 = new SwitchableRoute("81", camelContext);
		SwitchableRoute route82 = new SwitchableRoute("82", camelContext);
		SwitchableRoute route83 = new SwitchableRoute("83", camelContext);
		SwitchableRoute route84 = new SwitchableRoute("84", camelContext);

		final BIPActor executor1 = engine.register(route1,"1", true);
		final BIPActor executor2 = engine.register(route2,"2", true);
		final BIPActor executor3 = engine.register(route3,"3", true);
		final BIPActor executor4 = engine.register(route4,"4", true);
		final BIPActor executor5 = engine.register(route5,"5", true);
		final BIPActor executor6 = engine.register(route6,"6", true);
		final BIPActor executor7 = engine.register(route7,"7", true);
		final BIPActor executor8 = engine.register(route8,"8", true);
		final BIPActor executor9 = engine.register(route9,"9", true);
		final BIPActor executor10 = engine.register(route10,"10", true);
		final BIPActor executor11 = engine.register(route11,"11", true);
		final BIPActor executor12 = engine.register(route12,"12", true);
		final BIPActor executor13 = engine.register(route13,"13", true);
		final BIPActor executor14 = engine.register(route14,"14", true);
		final BIPActor executor15 = engine.register(route15,"15", true);
		final BIPActor executor16 = engine.register(route16,"16", true);
		final BIPActor executor17 = engine.register(route17,"17", true);
		final BIPActor executor18 = engine.register(route18,"18", true);
		final BIPActor executor19 = engine.register(route19,"19", true);
		final BIPActor executor20 = engine.register(route20,"20", true);
		final BIPActor executor21 = engine.register(route21,"21", true);
		final BIPActor executor22 = engine.register(route22,"22", true);
		final BIPActor executor23 = engine.register(route23,"23", true);
		final BIPActor executor24 = engine.register(route24,"24", true);
		final BIPActor executor25 = engine.register(route25,"25", true);
		final BIPActor executor26 = engine.register(route26,"26", true);
		final BIPActor executor27 = engine.register(route27,"27", true);
		final BIPActor executor28 = engine.register(route28,"28", true);
		final BIPActor executor29 = engine.register(route29,"29", true);
		final BIPActor executor30 = engine.register(route30,"30", true);
		final BIPActor executor31 = engine.register(route31,"31", true);
		final BIPActor executor32 = engine.register(route32,"32", true);
		final BIPActor executor33 = engine.register(route33,"33", true);
		final BIPActor executor34 = engine.register(route34,"34", true);
		final BIPActor executor35 = engine.register(route35,"35", true);
		final BIPActor executor36 = engine.register(route36,"36", true);
		final BIPActor executor37 = engine.register(route37,"37", true);
		final BIPActor executor38 = engine.register(route38,"38", true);
		final BIPActor executor39 = engine.register(route39,"39", true);
		final BIPActor executor40 = engine.register(route40,"40", true);
		final BIPActor executor41 = engine.register(route41,"41", true);
		final BIPActor executor42 = engine.register(route42,"42", true);
		final BIPActor executor43 = engine.register(route43,"43", true);
		final BIPActor executor44 = engine.register(route44,"44", true);
		final BIPActor executor45 = engine.register(route45,"45", true);
		final BIPActor executor46 = engine.register(route46,"46", true);
		final BIPActor executor47 = engine.register(route47,"47", true);
		final BIPActor executor48 = engine.register(route48,"48", true);
		final BIPActor executor49 = engine.register(route49,"49", true);
		final BIPActor executor50 = engine.register(route50,"50", true);
		final BIPActor executor51 = engine.register(route51,"51", true);
		final BIPActor executor52 = engine.register(route52,"52", true);
		final BIPActor executor53 = engine.register(route53,"53", true);
		final BIPActor executor54 = engine.register(route54,"54", true);
		final BIPActor executor55 = engine.register(route55,"55", true);
		final BIPActor executor56 = engine.register(route56,"56", true);
		final BIPActor executor57 = engine.register(route57,"57", true);
		final BIPActor executor58 = engine.register(route58,"58", true);
		final BIPActor executor59 = engine.register(route59,"59", true);
		final BIPActor executor60 = engine.register(route60,"60", true);
		final BIPActor executor61 = engine.register(route61,"61", true);
		final BIPActor executor62 = engine.register(route62,"62", true);
		final BIPActor executor63 = engine.register(route63,"63", true);
		final BIPActor executor64 = engine.register(route64,"64", true);
		final BIPActor executor65 = engine.register(route65,"65", true);
		final BIPActor executor66 = engine.register(route66,"66", true);
		final BIPActor executor67 = engine.register(route67,"67", true);
		final BIPActor executor68 = engine.register(route68,"68", true);
		final BIPActor executor69 = engine.register(route69,"69", true);
		final BIPActor executor70 = engine.register(route70,"70", true);
		final BIPActor executor71 = engine.register(route71,"71", true);
		final BIPActor executor72 = engine.register(route72,"72", true);
		final BIPActor executor73 = engine.register(route73,"73", true);
		final BIPActor executor74 = engine.register(route74,"74", true);
		final BIPActor executor75 = engine.register(route75,"75", true);
		final BIPActor executor76 = engine.register(route76,"76", true);
		final BIPActor executor77 = engine.register(route77,"77", true);
		final BIPActor executor78 = engine.register(route78,"78", true);
		final BIPActor executor79 = engine.register(route79,"79", true);
		final BIPActor executor80 = engine.register(route80,"80", true);
		final BIPActor executor81 = engine.register(route81,"81", true);
		final BIPActor executor82 = engine.register(route82,"82", true);
		final BIPActor executor83 = engine.register(route83,"83", true);
		final BIPActor executor84 = engine.register(route84,"84", true);

		final RoutePolicy routePolicy1 = createRoutePolicy(executor1);
		final RoutePolicy routePolicy2 = createRoutePolicy(executor2);
		final RoutePolicy routePolicy3 = createRoutePolicy(executor3);
		final RoutePolicy routePolicy4 = createRoutePolicy(executor4);
		final RoutePolicy routePolicy5 = createRoutePolicy(executor5);
		final RoutePolicy routePolicy6 = createRoutePolicy(executor6);
		final RoutePolicy routePolicy7 = createRoutePolicy(executor7);
		final RoutePolicy routePolicy8 = createRoutePolicy(executor8);
		final RoutePolicy routePolicy9 = createRoutePolicy(executor9);
		final RoutePolicy routePolicy10 = createRoutePolicy(executor10);
		final RoutePolicy routePolicy11 = createRoutePolicy(executor11);
		final RoutePolicy routePolicy12 = createRoutePolicy(executor12);
		final RoutePolicy routePolicy13 = createRoutePolicy(executor13);
		final RoutePolicy routePolicy14 = createRoutePolicy(executor14);
		final RoutePolicy routePolicy15 = createRoutePolicy(executor15);
		final RoutePolicy routePolicy16 = createRoutePolicy(executor16);
		final RoutePolicy routePolicy17 = createRoutePolicy(executor17);
		final RoutePolicy routePolicy18 = createRoutePolicy(executor18);
		final RoutePolicy routePolicy19 = createRoutePolicy(executor19);
		final RoutePolicy routePolicy20 = createRoutePolicy(executor20);
		final RoutePolicy routePolicy21 = createRoutePolicy(executor21);
		final RoutePolicy routePolicy22 = createRoutePolicy(executor22);
		final RoutePolicy routePolicy23 = createRoutePolicy(executor23);
		final RoutePolicy routePolicy24 = createRoutePolicy(executor24);
		final RoutePolicy routePolicy25 = createRoutePolicy(executor25);
		final RoutePolicy routePolicy26 = createRoutePolicy(executor26);
		final RoutePolicy routePolicy27 = createRoutePolicy(executor27);
		final RoutePolicy routePolicy28 = createRoutePolicy(executor28);
		final RoutePolicy routePolicy29 = createRoutePolicy(executor29);
		final RoutePolicy routePolicy30 = createRoutePolicy(executor30);
		final RoutePolicy routePolicy31 = createRoutePolicy(executor31);
		final RoutePolicy routePolicy32 = createRoutePolicy(executor32);
		final RoutePolicy routePolicy33 = createRoutePolicy(executor33);
		final RoutePolicy routePolicy34 = createRoutePolicy(executor34);
		final RoutePolicy routePolicy35 = createRoutePolicy(executor35);
		final RoutePolicy routePolicy36 = createRoutePolicy(executor36);
		final RoutePolicy routePolicy37 = createRoutePolicy(executor37);
		final RoutePolicy routePolicy38 = createRoutePolicy(executor38);
		final RoutePolicy routePolicy39 = createRoutePolicy(executor39);
		final RoutePolicy routePolicy40 = createRoutePolicy(executor40);
		final RoutePolicy routePolicy41 = createRoutePolicy(executor41);
		final RoutePolicy routePolicy42 = createRoutePolicy(executor42);
		final RoutePolicy routePolicy43 = createRoutePolicy(executor43);
		final RoutePolicy routePolicy44 = createRoutePolicy(executor44);
		final RoutePolicy routePolicy45 = createRoutePolicy(executor45);
		final RoutePolicy routePolicy46 = createRoutePolicy(executor46);
		final RoutePolicy routePolicy47 = createRoutePolicy(executor47);
		final RoutePolicy routePolicy48 = createRoutePolicy(executor48);
		final RoutePolicy routePolicy49 = createRoutePolicy(executor49);
		final RoutePolicy routePolicy50 = createRoutePolicy(executor50);
		final RoutePolicy routePolicy51 = createRoutePolicy(executor51);
		final RoutePolicy routePolicy52 = createRoutePolicy(executor52);
		final RoutePolicy routePolicy53 = createRoutePolicy(executor53);
		final RoutePolicy routePolicy54 = createRoutePolicy(executor54);
		final RoutePolicy routePolicy55 = createRoutePolicy(executor55);
		final RoutePolicy routePolicy56 = createRoutePolicy(executor56);
		final RoutePolicy routePolicy57 = createRoutePolicy(executor57);
		final RoutePolicy routePolicy58 = createRoutePolicy(executor58);
		final RoutePolicy routePolicy59 = createRoutePolicy(executor59);
		final RoutePolicy routePolicy60 = createRoutePolicy(executor60);
		final RoutePolicy routePolicy61 = createRoutePolicy(executor61);
		final RoutePolicy routePolicy62 = createRoutePolicy(executor62);
		final RoutePolicy routePolicy63 = createRoutePolicy(executor63);
		final RoutePolicy routePolicy64 = createRoutePolicy(executor64);
		final RoutePolicy routePolicy65 = createRoutePolicy(executor65);
		final RoutePolicy routePolicy66 = createRoutePolicy(executor66);
		final RoutePolicy routePolicy67 = createRoutePolicy(executor67);
		final RoutePolicy routePolicy68 = createRoutePolicy(executor68);
		final RoutePolicy routePolicy69 = createRoutePolicy(executor69);
		final RoutePolicy routePolicy70 = createRoutePolicy(executor70);
		final RoutePolicy routePolicy71 = createRoutePolicy(executor71);
		final RoutePolicy routePolicy72 = createRoutePolicy(executor72);
		final RoutePolicy routePolicy73 = createRoutePolicy(executor73);
		final RoutePolicy routePolicy74 = createRoutePolicy(executor74);
		final RoutePolicy routePolicy75 = createRoutePolicy(executor75);
		final RoutePolicy routePolicy76 = createRoutePolicy(executor76);
		final RoutePolicy routePolicy77 = createRoutePolicy(executor77);
		final RoutePolicy routePolicy78 = createRoutePolicy(executor78);
		final RoutePolicy routePolicy79 = createRoutePolicy(executor79);
		final RoutePolicy routePolicy80 = createRoutePolicy(executor80);
		final RoutePolicy routePolicy81 = createRoutePolicy(executor81);
		final RoutePolicy routePolicy82 = createRoutePolicy(executor82);
		final RoutePolicy routePolicy83 = createRoutePolicy(executor83);
		final RoutePolicy routePolicy84 = createRoutePolicy(executor84);
		
		RouteBuilder builder = new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:inputfolder1?delete=true").routeId("1")
						.routePolicy(routePolicy1).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder1");

				from("file:inputfolder2?delete=true").routeId("2")
						.routePolicy(routePolicy2).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder2");

				from("file:inputfolder3?delete=true").routeId("3")
						.routePolicy(routePolicy3).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder3");

				from("file:inputfolder4?delete=true").routeId("4")
						.routePolicy(routePolicy4).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder4");

				from("file:inputfolder5?delete=true").routeId("5")
						.routePolicy(routePolicy5).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder5");

				from("file:inputfolder6?delete=true").routeId("6")
						.routePolicy(routePolicy6).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder6");

				from("file:inputfolder7?delete=true").routeId("7")
						.routePolicy(routePolicy7).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder7");

				from("file:inputfolder8?delete=true").routeId("8")
						.routePolicy(routePolicy8).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder8");

				from("file:inputfolder9?delete=true").routeId("9")
						.routePolicy(routePolicy9).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder9");

				from("file:inputfolder10?delete=true").routeId("10")
						.routePolicy(routePolicy10).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder10");

				from("file:inputfolder11?delete=true").routeId("11")
						.routePolicy(routePolicy11).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder11");

				from("file:inputfolder12?delete=true").routeId("12")
						.routePolicy(routePolicy12).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder12");

				from("file:inputfolder13?delete=true").routeId("13")
						.routePolicy(routePolicy13).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder13");

				from("file:inputfolder14?delete=true").routeId("14")
						.routePolicy(routePolicy14).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder14");

				from("file:inputfolder15?delete=true").routeId("15")
						.routePolicy(routePolicy15).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder15");

				from("file:inputfolder16?delete=true").routeId("16")
						.routePolicy(routePolicy16).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder16");

				from("file:inputfolder17?delete=true").routeId("17")
						.routePolicy(routePolicy17).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder17");

				from("file:inputfolder18?delete=true").routeId("18")
						.routePolicy(routePolicy18).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder18");

				from("file:inputfolder19?delete=true").routeId("19")
						.routePolicy(routePolicy19).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder19");

				from("file:inputfolder20?delete=true").routeId("20")
						.routePolicy(routePolicy20).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder20");

				from("file:inputfolder21?delete=true").routeId("21")
						.routePolicy(routePolicy21).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder21");

				from("file:inputfolder22?delete=true").routeId("22")
						.routePolicy(routePolicy22).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder22");

				from("file:inputfolder23?delete=true").routeId("23")
						.routePolicy(routePolicy23).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder23");

				from("file:inputfolder24?delete=true").routeId("24")
						.routePolicy(routePolicy24).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder24");

				from("file:inputfolder25?delete=true").routeId("25")
						.routePolicy(routePolicy25).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder25");

				from("file:inputfolder26?delete=true").routeId("26")
						.routePolicy(routePolicy26).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder26");

				from("file:inputfolder27?delete=true").routeId("27")
						.routePolicy(routePolicy27).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder27");

				from("file:inputfolder28?delete=true").routeId("28")
						.routePolicy(routePolicy28).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder28");

				from("file:inputfolder29?delete=true").routeId("29")
						.routePolicy(routePolicy29).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder29");

				from("file:inputfolder30?delete=true").routeId("30")
						.routePolicy(routePolicy30).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder30");

				from("file:inputfolder31?delete=true").routeId("31")
						.routePolicy(routePolicy31).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder31");

				from("file:inputfolder32?delete=true").routeId("32")
						.routePolicy(routePolicy32).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder32");

				from("file:inputfolder33?delete=true").routeId("33")
						.routePolicy(routePolicy33).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder33");

				from("file:inputfolder34?delete=true").routeId("34")
						.routePolicy(routePolicy34).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder34");

				from("file:inputfolder35?delete=true").routeId("35")
						.routePolicy(routePolicy35).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder35");

				from("file:inputfolder36?delete=true").routeId("36")
						.routePolicy(routePolicy36).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder36");

				from("file:inputfolder37?delete=true").routeId("37")
						.routePolicy(routePolicy37).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder37");

				from("file:inputfolder38?delete=true").routeId("38")
						.routePolicy(routePolicy38).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder38");

				from("file:inputfolder39?delete=true").routeId("39")
						.routePolicy(routePolicy39).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder39");

				from("file:inputfolder40?delete=true").routeId("40")
						.routePolicy(routePolicy40).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder40");

				from("file:inputfolder41?delete=true").routeId("41")
						.routePolicy(routePolicy41).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder41");

				from("file:inputfolder42?delete=true").routeId("42")
						.routePolicy(routePolicy42).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder42");

				from("file:inputfolder43?delete=true").routeId("43")
						.routePolicy(routePolicy43).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder43");

				from("file:inputfolder44?delete=true").routeId("44")
						.routePolicy(routePolicy44).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder44");

				from("file:inputfolder45?delete=true").routeId("45")
						.routePolicy(routePolicy45).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder45");

				from("file:inputfolder46?delete=true").routeId("46")
						.routePolicy(routePolicy46).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder46");

				from("file:inputfolder47?delete=true").routeId("47")
						.routePolicy(routePolicy47).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder47");

				from("file:inputfolder48?delete=true").routeId("48")
						.routePolicy(routePolicy48).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder48");

				from("file:inputfolder49?delete=true").routeId("49")
						.routePolicy(routePolicy49).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder49");

				from("file:inputfolder50?delete=true").routeId("50")
						.routePolicy(routePolicy50).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder50");

				from("file:inputfolder51?delete=true").routeId("51")
						.routePolicy(routePolicy51).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder51");

				from("file:inputfolder52?delete=true").routeId("52")
						.routePolicy(routePolicy52).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder52");

				from("file:inputfolder53?delete=true").routeId("53")
						.routePolicy(routePolicy53).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder53");

				from("file:inputfolder54?delete=true").routeId("54")
						.routePolicy(routePolicy54).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder54");

				from("file:inputfolder55?delete=true").routeId("55")
						.routePolicy(routePolicy55).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder55");

				from("file:inputfolder56?delete=true").routeId("56")
						.routePolicy(routePolicy56).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder56");

				from("file:inputfolder57?delete=true").routeId("57")
						.routePolicy(routePolicy57).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder57");

				from("file:inputfolder58?delete=true").routeId("58")
						.routePolicy(routePolicy58).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder58");

				from("file:inputfolder59?delete=true").routeId("59")
						.routePolicy(routePolicy59).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder59");

				from("file:inputfolder60?delete=true").routeId("60")
						.routePolicy(routePolicy60).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder60");

				from("file:inputfolder61?delete=true").routeId("61")
						.routePolicy(routePolicy61).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder61");

				from("file:inputfolder62?delete=true").routeId("62")
						.routePolicy(routePolicy62).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder62");

				from("file:inputfolder63?delete=true").routeId("63")
						.routePolicy(routePolicy63).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder63");

				from("file:inputfolder64?delete=true").routeId("64")
						.routePolicy(routePolicy64).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder64");

				from("file:inputfolder65?delete=true").routeId("65")
						.routePolicy(routePolicy65).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder65");

				from("file:inputfolder66?delete=true").routeId("66")
						.routePolicy(routePolicy66).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder66");

				from("file:inputfolder67?delete=true").routeId("67")
						.routePolicy(routePolicy67).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder67");

				from("file:inputfolder68?delete=true").routeId("68")
						.routePolicy(routePolicy68).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder68");

				from("file:inputfolder69?delete=true").routeId("69")
						.routePolicy(routePolicy69).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder69");

				from("file:inputfolder70?delete=true").routeId("70")
						.routePolicy(routePolicy70).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder70");

				from("file:inputfolder71?delete=true").routeId("71")
						.routePolicy(routePolicy71).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder71");

				from("file:inputfolder72?delete=true").routeId("72")
						.routePolicy(routePolicy72).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder72");

				from("file:inputfolder73?delete=true").routeId("73")
						.routePolicy(routePolicy73).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder73");

				from("file:inputfolder74?delete=true").routeId("74")
						.routePolicy(routePolicy74).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder74");

				from("file:inputfolder75?delete=true").routeId("75")
						.routePolicy(routePolicy75).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder75");

				from("file:inputfolder76?delete=true").routeId("76")
						.routePolicy(routePolicy76).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder76");

				from("file:inputfolder77?delete=true").routeId("77")
						.routePolicy(routePolicy77).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder77");

				from("file:inputfolder78?delete=true").routeId("78")
						.routePolicy(routePolicy78).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder78");

				from("file:inputfolder79?delete=true").routeId("79")
						.routePolicy(routePolicy79).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder79");

			}
		};
		try {
			camelContext.addRoutes(builder);
			camelContext.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		route1.setCamelContext(camelContext);
		route2.setCamelContext(camelContext);
		route3.setCamelContext(camelContext);
		route4.setCamelContext(camelContext);
		route5.setCamelContext(camelContext);
		route6.setCamelContext(camelContext);
		route7.setCamelContext(camelContext);
		route8.setCamelContext(camelContext);
		route9.setCamelContext(camelContext);
		route10.setCamelContext(camelContext);
		route11.setCamelContext(camelContext);
		route12.setCamelContext(camelContext);
		route13.setCamelContext(camelContext);
		route14.setCamelContext(camelContext);
		route15.setCamelContext(camelContext);
		route16.setCamelContext(camelContext);
		route17.setCamelContext(camelContext);
		route18.setCamelContext(camelContext);
		route19.setCamelContext(camelContext);
		route20.setCamelContext(camelContext);
		route21.setCamelContext(camelContext);
		route22.setCamelContext(camelContext);
		route23.setCamelContext(camelContext);
		route24.setCamelContext(camelContext);
		route25.setCamelContext(camelContext);
		route26.setCamelContext(camelContext);
		route27.setCamelContext(camelContext);
		route28.setCamelContext(camelContext);
		route29.setCamelContext(camelContext);
		route30.setCamelContext(camelContext);
		route31.setCamelContext(camelContext);
		route32.setCamelContext(camelContext);
		route33.setCamelContext(camelContext);
		route34.setCamelContext(camelContext);
		route35.setCamelContext(camelContext);
		route36.setCamelContext(camelContext);
		route37.setCamelContext(camelContext);
		route38.setCamelContext(camelContext);
		route39.setCamelContext(camelContext);
		route40.setCamelContext(camelContext);
		route41.setCamelContext(camelContext);
		route42.setCamelContext(camelContext);
		route43.setCamelContext(camelContext);
		route44.setCamelContext(camelContext);
		route45.setCamelContext(camelContext);
		route46.setCamelContext(camelContext);
		route47.setCamelContext(camelContext);
		route48.setCamelContext(camelContext);
		route49.setCamelContext(camelContext);
		route50.setCamelContext(camelContext);
		route51.setCamelContext(camelContext);
		route52.setCamelContext(camelContext);
		route53.setCamelContext(camelContext);
		route54.setCamelContext(camelContext);
		route55.setCamelContext(camelContext);
		route56.setCamelContext(camelContext);
		route57.setCamelContext(camelContext);
		route58.setCamelContext(camelContext);
		route59.setCamelContext(camelContext);
		route60.setCamelContext(camelContext);
		route61.setCamelContext(camelContext);
		route62.setCamelContext(camelContext);
		route63.setCamelContext(camelContext);
		route64.setCamelContext(camelContext);
		route65.setCamelContext(camelContext);
		route66.setCamelContext(camelContext);
		route67.setCamelContext(camelContext);
		route68.setCamelContext(camelContext);
		route69.setCamelContext(camelContext);
		route70.setCamelContext(camelContext);
		route71.setCamelContext(camelContext);
		route72.setCamelContext(camelContext);
		route73.setCamelContext(camelContext);
		route74.setCamelContext(camelContext);
		route75.setCamelContext(camelContext);
		route76.setCamelContext(camelContext);
		route77.setCamelContext(camelContext);
		route78.setCamelContext(camelContext);
		route79.setCamelContext(camelContext);
		engine.specifyGlue(bipGlue);
		engine.start();
		engine.execute();
		Thread.sleep(80000);
	}

	@Test
	public void bipSwMultiTest84() throws BIPException, InterruptedException {

		BIPGlue bipGlue = new TwoSynchronGlueBuilder() {
			@Override
			public void configure() {

				synchron(SwitchableRoute.class, "on").to(
						MonitorNoDataManyRoutes.class, "add");
				synchron(SwitchableRoute.class, "finished").to(
						MonitorNoDataManyRoutes.class, "rm");
				port(SwitchableRoute.class, "off")
						.acceptsNothing();
				port(SwitchableRoute.class, "off")
						.requiresNothing();

			}

		}.build();
		BIPEngine engine = engineFactory.create("myEngine", bipGlue);

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.setAutoStartup(false);

		MonitorNoDataManyRoutes monitorNoDataManyRoutes = new MonitorNoDataManyRoutes(42);
		final BIPActor executorM = engine.register(monitorNoDataManyRoutes, "monitor", true);
		
		SwitchableRoute route1 = new SwitchableRoute("1", camelContext);
		SwitchableRoute route2 = new SwitchableRoute("2", camelContext);
		SwitchableRoute route3 = new SwitchableRoute("3", camelContext);
		SwitchableRoute route4 = new SwitchableRoute("4", camelContext);
		SwitchableRoute route5 = new SwitchableRoute("5", camelContext);
		SwitchableRoute route6 = new SwitchableRoute("6", camelContext);
		SwitchableRoute route7 = new SwitchableRoute("7", camelContext);
		SwitchableRoute route8 = new SwitchableRoute("8", camelContext);
		SwitchableRoute route9 = new SwitchableRoute("9", camelContext);
		SwitchableRoute route10 = new SwitchableRoute("10", camelContext);
		SwitchableRoute route11 = new SwitchableRoute("11", camelContext);
		SwitchableRoute route12 = new SwitchableRoute("12", camelContext);
		SwitchableRoute route13 = new SwitchableRoute("13", camelContext);
		SwitchableRoute route14 = new SwitchableRoute("14", camelContext);
		SwitchableRoute route15 = new SwitchableRoute("15", camelContext);
		SwitchableRoute route16 = new SwitchableRoute("16", camelContext);
		SwitchableRoute route17 = new SwitchableRoute("17", camelContext);
		SwitchableRoute route18 = new SwitchableRoute("18", camelContext);
		SwitchableRoute route19 = new SwitchableRoute("19", camelContext);
		SwitchableRoute route20 = new SwitchableRoute("20", camelContext);
		SwitchableRoute route21 = new SwitchableRoute("21", camelContext);
		SwitchableRoute route22 = new SwitchableRoute("22", camelContext);
		SwitchableRoute route23 = new SwitchableRoute("23", camelContext);
		SwitchableRoute route24 = new SwitchableRoute("24", camelContext);
		SwitchableRoute route25 = new SwitchableRoute("25", camelContext);
		SwitchableRoute route26 = new SwitchableRoute("26", camelContext);
		SwitchableRoute route27 = new SwitchableRoute("27", camelContext);
		SwitchableRoute route28 = new SwitchableRoute("28", camelContext);
		SwitchableRoute route29 = new SwitchableRoute("29", camelContext);
		SwitchableRoute route30 = new SwitchableRoute("30", camelContext);
		SwitchableRoute route31 = new SwitchableRoute("31", camelContext);
		SwitchableRoute route32 = new SwitchableRoute("32", camelContext);
		SwitchableRoute route33 = new SwitchableRoute("33", camelContext);
		SwitchableRoute route34 = new SwitchableRoute("34", camelContext);
		SwitchableRoute route35 = new SwitchableRoute("35", camelContext);
		SwitchableRoute route36 = new SwitchableRoute("36", camelContext);
		SwitchableRoute route37 = new SwitchableRoute("37", camelContext);
		SwitchableRoute route38 = new SwitchableRoute("38", camelContext);
		SwitchableRoute route39 = new SwitchableRoute("39", camelContext);
		SwitchableRoute route40 = new SwitchableRoute("40", camelContext);
		SwitchableRoute route41 = new SwitchableRoute("41", camelContext);
		SwitchableRoute route42 = new SwitchableRoute("42", camelContext);
		SwitchableRoute route43 = new SwitchableRoute("43", camelContext);
		SwitchableRoute route44 = new SwitchableRoute("44", camelContext);
		SwitchableRoute route45 = new SwitchableRoute("45", camelContext);
		SwitchableRoute route46 = new SwitchableRoute("46", camelContext);
		SwitchableRoute route47 = new SwitchableRoute("47", camelContext);
		SwitchableRoute route48 = new SwitchableRoute("48", camelContext);
		SwitchableRoute route49 = new SwitchableRoute("49", camelContext);
		SwitchableRoute route50 = new SwitchableRoute("50", camelContext);
		SwitchableRoute route51 = new SwitchableRoute("51", camelContext);
		SwitchableRoute route52 = new SwitchableRoute("52", camelContext);
		SwitchableRoute route53 = new SwitchableRoute("53", camelContext);
		SwitchableRoute route54 = new SwitchableRoute("54", camelContext);
		SwitchableRoute route55 = new SwitchableRoute("55", camelContext);
		SwitchableRoute route56 = new SwitchableRoute("56", camelContext);
		SwitchableRoute route57 = new SwitchableRoute("57", camelContext);
		SwitchableRoute route58 = new SwitchableRoute("58", camelContext);
		SwitchableRoute route59 = new SwitchableRoute("59", camelContext);
		SwitchableRoute route60 = new SwitchableRoute("60", camelContext);
		SwitchableRoute route61 = new SwitchableRoute("61", camelContext);
		SwitchableRoute route62 = new SwitchableRoute("62", camelContext);
		SwitchableRoute route63 = new SwitchableRoute("63", camelContext);
		SwitchableRoute route64 = new SwitchableRoute("64", camelContext);
		SwitchableRoute route65 = new SwitchableRoute("65", camelContext);
		SwitchableRoute route66 = new SwitchableRoute("66", camelContext);
		SwitchableRoute route67 = new SwitchableRoute("67", camelContext);
		SwitchableRoute route68 = new SwitchableRoute("68", camelContext);
		SwitchableRoute route69 = new SwitchableRoute("69", camelContext);
		SwitchableRoute route70 = new SwitchableRoute("70", camelContext);
		SwitchableRoute route71 = new SwitchableRoute("71", camelContext);
		SwitchableRoute route72 = new SwitchableRoute("72", camelContext);
		SwitchableRoute route73 = new SwitchableRoute("73", camelContext);
		SwitchableRoute route74 = new SwitchableRoute("74", camelContext);
		SwitchableRoute route75 = new SwitchableRoute("75", camelContext);
		SwitchableRoute route76 = new SwitchableRoute("76", camelContext);
		SwitchableRoute route77 = new SwitchableRoute("77", camelContext);
		SwitchableRoute route78 = new SwitchableRoute("78", camelContext);
		SwitchableRoute route79 = new SwitchableRoute("79", camelContext);
		SwitchableRoute route80 = new SwitchableRoute("80", camelContext);
		SwitchableRoute route81 = new SwitchableRoute("81", camelContext);
		SwitchableRoute route82 = new SwitchableRoute("82", camelContext);
		SwitchableRoute route83 = new SwitchableRoute("83", camelContext);
		SwitchableRoute route84 = new SwitchableRoute("84", camelContext);

		final BIPActor executor1 = engine.register(route1,"1", true);
		final BIPActor executor2 = engine.register(route2,"2", true);
		final BIPActor executor3 = engine.register(route3,"3", true);
		final BIPActor executor4 = engine.register(route4,"4", true);
		final BIPActor executor5 = engine.register(route5,"5", true);
		final BIPActor executor6 = engine.register(route6,"6", true);
		final BIPActor executor7 = engine.register(route7,"7", true);
		final BIPActor executor8 = engine.register(route8,"8", true);
		final BIPActor executor9 = engine.register(route9,"9", true);
		final BIPActor executor10 = engine.register(route10,"10", true);
		final BIPActor executor11 = engine.register(route11,"11", true);
		final BIPActor executor12 = engine.register(route12,"12", true);
		final BIPActor executor13 = engine.register(route13,"13", true);
		final BIPActor executor14 = engine.register(route14,"14", true);
		final BIPActor executor15 = engine.register(route15,"15", true);
		final BIPActor executor16 = engine.register(route16,"16", true);
		final BIPActor executor17 = engine.register(route17,"17", true);
		final BIPActor executor18 = engine.register(route18,"18", true);
		final BIPActor executor19 = engine.register(route19,"19", true);
		final BIPActor executor20 = engine.register(route20,"20", true);
		final BIPActor executor21 = engine.register(route21,"21", true);
		final BIPActor executor22 = engine.register(route22,"22", true);
		final BIPActor executor23 = engine.register(route23,"23", true);
		final BIPActor executor24 = engine.register(route24,"24", true);
		final BIPActor executor25 = engine.register(route25,"25", true);
		final BIPActor executor26 = engine.register(route26,"26", true);
		final BIPActor executor27 = engine.register(route27,"27", true);
		final BIPActor executor28 = engine.register(route28,"28", true);
		final BIPActor executor29 = engine.register(route29,"29", true);
		final BIPActor executor30 = engine.register(route30,"30", true);
		final BIPActor executor31 = engine.register(route31,"31", true);
		final BIPActor executor32 = engine.register(route32,"32", true);
		final BIPActor executor33 = engine.register(route33,"33", true);
		final BIPActor executor34 = engine.register(route34,"34", true);
		final BIPActor executor35 = engine.register(route35,"35", true);
		final BIPActor executor36 = engine.register(route36,"36", true);
		final BIPActor executor37 = engine.register(route37,"37", true);
		final BIPActor executor38 = engine.register(route38,"38", true);
		final BIPActor executor39 = engine.register(route39,"39", true);
		final BIPActor executor40 = engine.register(route40,"40", true);
		final BIPActor executor41 = engine.register(route41,"41", true);
		final BIPActor executor42 = engine.register(route42,"42", true);
		final BIPActor executor43 = engine.register(route43,"43", true);
		final BIPActor executor44 = engine.register(route44,"44", true);
		final BIPActor executor45 = engine.register(route45,"45", true);
		final BIPActor executor46 = engine.register(route46,"46", true);
		final BIPActor executor47 = engine.register(route47,"47", true);
		final BIPActor executor48 = engine.register(route48,"48", true);
		final BIPActor executor49 = engine.register(route49,"49", true);
		final BIPActor executor50 = engine.register(route50,"50", true);
		final BIPActor executor51 = engine.register(route51,"51", true);
		final BIPActor executor52 = engine.register(route52,"52", true);
		final BIPActor executor53 = engine.register(route53,"53", true);
		final BIPActor executor54 = engine.register(route54,"54", true);
		final BIPActor executor55 = engine.register(route55,"55", true);
		final BIPActor executor56 = engine.register(route56,"56", true);
		final BIPActor executor57 = engine.register(route57,"57", true);
		final BIPActor executor58 = engine.register(route58,"58", true);
		final BIPActor executor59 = engine.register(route59,"59", true);
		final BIPActor executor60 = engine.register(route60,"60", true);
		final BIPActor executor61 = engine.register(route61,"61", true);
		final BIPActor executor62 = engine.register(route62,"62", true);
		final BIPActor executor63 = engine.register(route63,"63", true);
		final BIPActor executor64 = engine.register(route64,"64", true);
		final BIPActor executor65 = engine.register(route65,"65", true);
		final BIPActor executor66 = engine.register(route66,"66", true);
		final BIPActor executor67 = engine.register(route67,"67", true);
		final BIPActor executor68 = engine.register(route68,"68", true);
		final BIPActor executor69 = engine.register(route69,"69", true);
		final BIPActor executor70 = engine.register(route70,"70", true);
		final BIPActor executor71 = engine.register(route71,"71", true);
		final BIPActor executor72 = engine.register(route72,"72", true);
		final BIPActor executor73 = engine.register(route73,"73", true);
		final BIPActor executor74 = engine.register(route74,"74", true);
		final BIPActor executor75 = engine.register(route75,"75", true);
		final BIPActor executor76 = engine.register(route76,"76", true);
		final BIPActor executor77 = engine.register(route77,"77", true);
		final BIPActor executor78 = engine.register(route78,"78", true);
		final BIPActor executor79 = engine.register(route79,"79", true);
		final BIPActor executor80 = engine.register(route80,"80", true);
		final BIPActor executor81 = engine.register(route81,"81", true);
		final BIPActor executor82 = engine.register(route82,"82", true);
		final BIPActor executor83 = engine.register(route83,"83", true);
		final BIPActor executor84 = engine.register(route84,"84", true);

		final RoutePolicy routePolicy1 = createRoutePolicy(executor1);
		final RoutePolicy routePolicy2 = createRoutePolicy(executor2);
		final RoutePolicy routePolicy3 = createRoutePolicy(executor3);
		final RoutePolicy routePolicy4 = createRoutePolicy(executor4);
		final RoutePolicy routePolicy5 = createRoutePolicy(executor5);
		final RoutePolicy routePolicy6 = createRoutePolicy(executor6);
		final RoutePolicy routePolicy7 = createRoutePolicy(executor7);
		final RoutePolicy routePolicy8 = createRoutePolicy(executor8);
		final RoutePolicy routePolicy9 = createRoutePolicy(executor9);
		final RoutePolicy routePolicy10 = createRoutePolicy(executor10);
		final RoutePolicy routePolicy11 = createRoutePolicy(executor11);
		final RoutePolicy routePolicy12 = createRoutePolicy(executor12);
		final RoutePolicy routePolicy13 = createRoutePolicy(executor13);
		final RoutePolicy routePolicy14 = createRoutePolicy(executor14);
		final RoutePolicy routePolicy15 = createRoutePolicy(executor15);
		final RoutePolicy routePolicy16 = createRoutePolicy(executor16);
		final RoutePolicy routePolicy17 = createRoutePolicy(executor17);
		final RoutePolicy routePolicy18 = createRoutePolicy(executor18);
		final RoutePolicy routePolicy19 = createRoutePolicy(executor19);
		final RoutePolicy routePolicy20 = createRoutePolicy(executor20);
		final RoutePolicy routePolicy21 = createRoutePolicy(executor21);
		final RoutePolicy routePolicy22 = createRoutePolicy(executor22);
		final RoutePolicy routePolicy23 = createRoutePolicy(executor23);
		final RoutePolicy routePolicy24 = createRoutePolicy(executor24);
		final RoutePolicy routePolicy25 = createRoutePolicy(executor25);
		final RoutePolicy routePolicy26 = createRoutePolicy(executor26);
		final RoutePolicy routePolicy27 = createRoutePolicy(executor27);
		final RoutePolicy routePolicy28 = createRoutePolicy(executor28);
		final RoutePolicy routePolicy29 = createRoutePolicy(executor29);
		final RoutePolicy routePolicy30 = createRoutePolicy(executor30);
		final RoutePolicy routePolicy31 = createRoutePolicy(executor31);
		final RoutePolicy routePolicy32 = createRoutePolicy(executor32);
		final RoutePolicy routePolicy33 = createRoutePolicy(executor33);
		final RoutePolicy routePolicy34 = createRoutePolicy(executor34);
		final RoutePolicy routePolicy35 = createRoutePolicy(executor35);
		final RoutePolicy routePolicy36 = createRoutePolicy(executor36);
		final RoutePolicy routePolicy37 = createRoutePolicy(executor37);
		final RoutePolicy routePolicy38 = createRoutePolicy(executor38);
		final RoutePolicy routePolicy39 = createRoutePolicy(executor39);
		final RoutePolicy routePolicy40 = createRoutePolicy(executor40);
		final RoutePolicy routePolicy41 = createRoutePolicy(executor41);
		final RoutePolicy routePolicy42 = createRoutePolicy(executor42);
		final RoutePolicy routePolicy43 = createRoutePolicy(executor43);
		final RoutePolicy routePolicy44 = createRoutePolicy(executor44);
		final RoutePolicy routePolicy45 = createRoutePolicy(executor45);
		final RoutePolicy routePolicy46 = createRoutePolicy(executor46);
		final RoutePolicy routePolicy47 = createRoutePolicy(executor47);
		final RoutePolicy routePolicy48 = createRoutePolicy(executor48);
		final RoutePolicy routePolicy49 = createRoutePolicy(executor49);
		final RoutePolicy routePolicy50 = createRoutePolicy(executor50);
		final RoutePolicy routePolicy51 = createRoutePolicy(executor51);
		final RoutePolicy routePolicy52 = createRoutePolicy(executor52);
		final RoutePolicy routePolicy53 = createRoutePolicy(executor53);
		final RoutePolicy routePolicy54 = createRoutePolicy(executor54);
		final RoutePolicy routePolicy55 = createRoutePolicy(executor55);
		final RoutePolicy routePolicy56 = createRoutePolicy(executor56);
		final RoutePolicy routePolicy57 = createRoutePolicy(executor57);
		final RoutePolicy routePolicy58 = createRoutePolicy(executor58);
		final RoutePolicy routePolicy59 = createRoutePolicy(executor59);
		final RoutePolicy routePolicy60 = createRoutePolicy(executor60);
		final RoutePolicy routePolicy61 = createRoutePolicy(executor61);
		final RoutePolicy routePolicy62 = createRoutePolicy(executor62);
		final RoutePolicy routePolicy63 = createRoutePolicy(executor63);
		final RoutePolicy routePolicy64 = createRoutePolicy(executor64);
		final RoutePolicy routePolicy65 = createRoutePolicy(executor65);
		final RoutePolicy routePolicy66 = createRoutePolicy(executor66);
		final RoutePolicy routePolicy67 = createRoutePolicy(executor67);
		final RoutePolicy routePolicy68 = createRoutePolicy(executor68);
		final RoutePolicy routePolicy69 = createRoutePolicy(executor69);
		final RoutePolicy routePolicy70 = createRoutePolicy(executor70);
		final RoutePolicy routePolicy71 = createRoutePolicy(executor71);
		final RoutePolicy routePolicy72 = createRoutePolicy(executor72);
		final RoutePolicy routePolicy73 = createRoutePolicy(executor73);
		final RoutePolicy routePolicy74 = createRoutePolicy(executor74);
		final RoutePolicy routePolicy75 = createRoutePolicy(executor75);
		final RoutePolicy routePolicy76 = createRoutePolicy(executor76);
		final RoutePolicy routePolicy77 = createRoutePolicy(executor77);
		final RoutePolicy routePolicy78 = createRoutePolicy(executor78);
		final RoutePolicy routePolicy79 = createRoutePolicy(executor79);
		final RoutePolicy routePolicy80 = createRoutePolicy(executor80);
		final RoutePolicy routePolicy81 = createRoutePolicy(executor81);
		final RoutePolicy routePolicy82 = createRoutePolicy(executor82);
		final RoutePolicy routePolicy83 = createRoutePolicy(executor83);
		final RoutePolicy routePolicy84 = createRoutePolicy(executor84);
		
		RouteBuilder builder = new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:inputfolder1?delete=true").routeId("1")
						.routePolicy(routePolicy1).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder1");

				from("file:inputfolder2?delete=true").routeId("2")
						.routePolicy(routePolicy2).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder2");

				from("file:inputfolder3?delete=true").routeId("3")
						.routePolicy(routePolicy3).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder3");

				from("file:inputfolder4?delete=true").routeId("4")
						.routePolicy(routePolicy4).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder4");

				from("file:inputfolder5?delete=true").routeId("5")
						.routePolicy(routePolicy5).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder5");

				from("file:inputfolder6?delete=true").routeId("6")
						.routePolicy(routePolicy6).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder6");

				from("file:inputfolder7?delete=true").routeId("7")
						.routePolicy(routePolicy7).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder7");

				from("file:inputfolder8?delete=true").routeId("8")
						.routePolicy(routePolicy8).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder8");

				from("file:inputfolder9?delete=true").routeId("9")
						.routePolicy(routePolicy9).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder9");

				from("file:inputfolder10?delete=true").routeId("10")
						.routePolicy(routePolicy10).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder10");

				from("file:inputfolder11?delete=true").routeId("11")
						.routePolicy(routePolicy11).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder11");

				from("file:inputfolder12?delete=true").routeId("12")
						.routePolicy(routePolicy12).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder12");

				from("file:inputfolder13?delete=true").routeId("13")
						.routePolicy(routePolicy13).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder13");

				from("file:inputfolder14?delete=true").routeId("14")
						.routePolicy(routePolicy14).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder14");

				from("file:inputfolder15?delete=true").routeId("15")
						.routePolicy(routePolicy15).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder15");

				from("file:inputfolder16?delete=true").routeId("16")
						.routePolicy(routePolicy16).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder16");

				from("file:inputfolder17?delete=true").routeId("17")
						.routePolicy(routePolicy17).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder17");

				from("file:inputfolder18?delete=true").routeId("18")
						.routePolicy(routePolicy18).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder18");

				from("file:inputfolder19?delete=true").routeId("19")
						.routePolicy(routePolicy19).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder19");

				from("file:inputfolder20?delete=true").routeId("20")
						.routePolicy(routePolicy20).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder20");

				from("file:inputfolder21?delete=true").routeId("21")
						.routePolicy(routePolicy21).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder21");

				from("file:inputfolder22?delete=true").routeId("22")
						.routePolicy(routePolicy22).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder22");

				from("file:inputfolder23?delete=true").routeId("23")
						.routePolicy(routePolicy23).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder23");

				from("file:inputfolder24?delete=true").routeId("24")
						.routePolicy(routePolicy24).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder24");

				from("file:inputfolder25?delete=true").routeId("25")
						.routePolicy(routePolicy25).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder25");

				from("file:inputfolder26?delete=true").routeId("26")
						.routePolicy(routePolicy26).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder26");

				from("file:inputfolder27?delete=true").routeId("27")
						.routePolicy(routePolicy27).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder27");

				from("file:inputfolder28?delete=true").routeId("28")
						.routePolicy(routePolicy28).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder28");

				from("file:inputfolder29?delete=true").routeId("29")
						.routePolicy(routePolicy29).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder29");

				from("file:inputfolder30?delete=true").routeId("30")
						.routePolicy(routePolicy30).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder30");

				from("file:inputfolder31?delete=true").routeId("31")
						.routePolicy(routePolicy31).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder31");

				from("file:inputfolder32?delete=true").routeId("32")
						.routePolicy(routePolicy32).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder32");

				from("file:inputfolder33?delete=true").routeId("33")
						.routePolicy(routePolicy33).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder33");

				from("file:inputfolder34?delete=true").routeId("34")
						.routePolicy(routePolicy34).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder34");

				from("file:inputfolder35?delete=true").routeId("35")
						.routePolicy(routePolicy35).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder35");

				from("file:inputfolder36?delete=true").routeId("36")
						.routePolicy(routePolicy36).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder36");

				from("file:inputfolder37?delete=true").routeId("37")
						.routePolicy(routePolicy37).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder37");

				from("file:inputfolder38?delete=true").routeId("38")
						.routePolicy(routePolicy38).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder38");

				from("file:inputfolder39?delete=true").routeId("39")
						.routePolicy(routePolicy39).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder39");

				from("file:inputfolder40?delete=true").routeId("40")
						.routePolicy(routePolicy40).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder40");

				from("file:inputfolder41?delete=true").routeId("41")
						.routePolicy(routePolicy41).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder41");

				from("file:inputfolder42?delete=true").routeId("42")
						.routePolicy(routePolicy42).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder42");

				from("file:inputfolder43?delete=true").routeId("43")
						.routePolicy(routePolicy43).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder43");

				from("file:inputfolder44?delete=true").routeId("44")
						.routePolicy(routePolicy44).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder44");

				from("file:inputfolder45?delete=true").routeId("45")
						.routePolicy(routePolicy45).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder45");

				from("file:inputfolder46?delete=true").routeId("46")
						.routePolicy(routePolicy46).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder46");

				from("file:inputfolder47?delete=true").routeId("47")
						.routePolicy(routePolicy47).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder47");

				from("file:inputfolder48?delete=true").routeId("48")
						.routePolicy(routePolicy48).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder48");

				from("file:inputfolder49?delete=true").routeId("49")
						.routePolicy(routePolicy49).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder49");

				from("file:inputfolder50?delete=true").routeId("50")
						.routePolicy(routePolicy50).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder50");

				from("file:inputfolder51?delete=true").routeId("51")
						.routePolicy(routePolicy51).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder51");

				from("file:inputfolder52?delete=true").routeId("52")
						.routePolicy(routePolicy52).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder52");

				from("file:inputfolder53?delete=true").routeId("53")
						.routePolicy(routePolicy53).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder53");

				from("file:inputfolder54?delete=true").routeId("54")
						.routePolicy(routePolicy54).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder54");

				from("file:inputfolder55?delete=true").routeId("55")
						.routePolicy(routePolicy55).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder55");

				from("file:inputfolder56?delete=true").routeId("56")
						.routePolicy(routePolicy56).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder56");

				from("file:inputfolder57?delete=true").routeId("57")
						.routePolicy(routePolicy57).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder57");

				from("file:inputfolder58?delete=true").routeId("58")
						.routePolicy(routePolicy58).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder58");

				from("file:inputfolder59?delete=true").routeId("59")
						.routePolicy(routePolicy59).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder59");

				from("file:inputfolder60?delete=true").routeId("60")
						.routePolicy(routePolicy60).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder60");

				from("file:inputfolder61?delete=true").routeId("61")
						.routePolicy(routePolicy61).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder61");

				from("file:inputfolder62?delete=true").routeId("62")
						.routePolicy(routePolicy62).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder62");

				from("file:inputfolder63?delete=true").routeId("63")
						.routePolicy(routePolicy63).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder63");

				from("file:inputfolder64?delete=true").routeId("64")
						.routePolicy(routePolicy64).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder64");

				from("file:inputfolder65?delete=true").routeId("65")
						.routePolicy(routePolicy65).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder65");

				from("file:inputfolder66?delete=true").routeId("66")
						.routePolicy(routePolicy66).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder66");

				from("file:inputfolder67?delete=true").routeId("67")
						.routePolicy(routePolicy67).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder67");

				from("file:inputfolder68?delete=true").routeId("68")
						.routePolicy(routePolicy68).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder68");

				from("file:inputfolder69?delete=true").routeId("69")
						.routePolicy(routePolicy69).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder69");

				from("file:inputfolder70?delete=true").routeId("70")
						.routePolicy(routePolicy70).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder70");

				from("file:inputfolder71?delete=true").routeId("71")
						.routePolicy(routePolicy71).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder71");

				from("file:inputfolder72?delete=true").routeId("72")
						.routePolicy(routePolicy72).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder72");

				from("file:inputfolder73?delete=true").routeId("73")
						.routePolicy(routePolicy73).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder73");

				from("file:inputfolder74?delete=true").routeId("74")
						.routePolicy(routePolicy74).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder74");

				from("file:inputfolder75?delete=true").routeId("75")
						.routePolicy(routePolicy75).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder75");

				from("file:inputfolder76?delete=true").routeId("76")
						.routePolicy(routePolicy76).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder76");

				from("file:inputfolder77?delete=true").routeId("77")
						.routePolicy(routePolicy77).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder77");

				from("file:inputfolder78?delete=true").routeId("78")
						.routePolicy(routePolicy78).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder78");

				from("file:inputfolder79?delete=true").routeId("79")
						.routePolicy(routePolicy79).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder79");

				from("file:inputfolder80?delete=true").routeId("80")
						.routePolicy(routePolicy80).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder80");

				from("file:inputfolder81?delete=true").routeId("81")
						.routePolicy(routePolicy81).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder81");

				from("file:inputfolder82?delete=true").routeId("82")
						.routePolicy(routePolicy82).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder82");

				from("file:inputfolder83?delete=true").routeId("83")
						.routePolicy(routePolicy83).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder83");

				from("file:inputfolder84?delete=true").routeId("84")
						.routePolicy(routePolicy84).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder84");

			}
		};
		try {
			camelContext.addRoutes(builder);
			camelContext.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		route1.setCamelContext(camelContext);
		route2.setCamelContext(camelContext);
		route3.setCamelContext(camelContext);
		route4.setCamelContext(camelContext);
		route5.setCamelContext(camelContext);
		route6.setCamelContext(camelContext);
		route7.setCamelContext(camelContext);
		route8.setCamelContext(camelContext);
		route9.setCamelContext(camelContext);
		route10.setCamelContext(camelContext);
		route11.setCamelContext(camelContext);
		route12.setCamelContext(camelContext);
		route13.setCamelContext(camelContext);
		route14.setCamelContext(camelContext);
		route15.setCamelContext(camelContext);
		route16.setCamelContext(camelContext);
		route17.setCamelContext(camelContext);
		route18.setCamelContext(camelContext);
		route19.setCamelContext(camelContext);
		route20.setCamelContext(camelContext);
		route21.setCamelContext(camelContext);
		route22.setCamelContext(camelContext);
		route23.setCamelContext(camelContext);
		route24.setCamelContext(camelContext);
		route25.setCamelContext(camelContext);
		route26.setCamelContext(camelContext);
		route27.setCamelContext(camelContext);
		route28.setCamelContext(camelContext);
		route29.setCamelContext(camelContext);
		route30.setCamelContext(camelContext);
		route31.setCamelContext(camelContext);
		route32.setCamelContext(camelContext);
		route33.setCamelContext(camelContext);
		route34.setCamelContext(camelContext);
		route35.setCamelContext(camelContext);
		route36.setCamelContext(camelContext);
		route37.setCamelContext(camelContext);
		route38.setCamelContext(camelContext);
		route39.setCamelContext(camelContext);
		route40.setCamelContext(camelContext);
		route41.setCamelContext(camelContext);
		route42.setCamelContext(camelContext);
		route43.setCamelContext(camelContext);
		route44.setCamelContext(camelContext);
		route45.setCamelContext(camelContext);
		route46.setCamelContext(camelContext);
		route47.setCamelContext(camelContext);
		route48.setCamelContext(camelContext);
		route49.setCamelContext(camelContext);
		route50.setCamelContext(camelContext);
		route51.setCamelContext(camelContext);
		route52.setCamelContext(camelContext);
		route53.setCamelContext(camelContext);
		route54.setCamelContext(camelContext);
		route55.setCamelContext(camelContext);
		route56.setCamelContext(camelContext);
		route57.setCamelContext(camelContext);
		route58.setCamelContext(camelContext);
		route59.setCamelContext(camelContext);
		route60.setCamelContext(camelContext);
		route61.setCamelContext(camelContext);
		route62.setCamelContext(camelContext);
		route63.setCamelContext(camelContext);
		route64.setCamelContext(camelContext);
		route65.setCamelContext(camelContext);
		route66.setCamelContext(camelContext);
		route67.setCamelContext(camelContext);
		route68.setCamelContext(camelContext);
		route69.setCamelContext(camelContext);
		route70.setCamelContext(camelContext);
		route71.setCamelContext(camelContext);
		route72.setCamelContext(camelContext);
		route73.setCamelContext(camelContext);
		route74.setCamelContext(camelContext);
		route75.setCamelContext(camelContext);
		route76.setCamelContext(camelContext);
		route77.setCamelContext(camelContext);
		route78.setCamelContext(camelContext);
		route79.setCamelContext(camelContext);
		route80.setCamelContext(camelContext);
		route81.setCamelContext(camelContext);
		route82.setCamelContext(camelContext);
		route83.setCamelContext(camelContext);
		route84.setCamelContext(camelContext);
		engine.specifyGlue(bipGlue);
		engine.start();
		engine.execute();
		Thread.sleep(80000);
	}

	@Test
	public void bipSwMultiTest89() throws BIPException, InterruptedException {

		BIPGlue bipGlue = new TwoSynchronGlueBuilder() {
			@Override
			public void configure() {

				synchron(SwitchableRoute.class, "on").to(
						MonitorNoDataManyRoutes.class, "add");
				synchron(SwitchableRoute.class, "finished").to(
						MonitorNoDataManyRoutes.class, "rm");
				port(SwitchableRoute.class, "off")
						.acceptsNothing();
				port(SwitchableRoute.class, "off")
						.requiresNothing();

			}

		}.build();
		BIPEngine engine = engineFactory.create("myEngine", bipGlue);

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.setAutoStartup(false);

		MonitorNoDataManyRoutes monitorNoDataManyRoutes = new MonitorNoDataManyRoutes(45);
		final BIPActor executorM = engine.register(monitorNoDataManyRoutes, "monitor", true);
		
		SwitchableRoute route1 = new SwitchableRoute("1", camelContext);
		SwitchableRoute route2 = new SwitchableRoute("2", camelContext);
		SwitchableRoute route3 = new SwitchableRoute("3", camelContext);
		SwitchableRoute route4 = new SwitchableRoute("4", camelContext);
		SwitchableRoute route5 = new SwitchableRoute("5", camelContext);
		SwitchableRoute route6 = new SwitchableRoute("6", camelContext);
		SwitchableRoute route7 = new SwitchableRoute("7", camelContext);
		SwitchableRoute route8 = new SwitchableRoute("8", camelContext);
		SwitchableRoute route9 = new SwitchableRoute("9", camelContext);
		SwitchableRoute route10 = new SwitchableRoute("10", camelContext);
		SwitchableRoute route11 = new SwitchableRoute("11", camelContext);
		SwitchableRoute route12 = new SwitchableRoute("12", camelContext);
		SwitchableRoute route13 = new SwitchableRoute("13", camelContext);
		SwitchableRoute route14 = new SwitchableRoute("14", camelContext);
		SwitchableRoute route15 = new SwitchableRoute("15", camelContext);
		SwitchableRoute route16 = new SwitchableRoute("16", camelContext);
		SwitchableRoute route17 = new SwitchableRoute("17", camelContext);
		SwitchableRoute route18 = new SwitchableRoute("18", camelContext);
		SwitchableRoute route19 = new SwitchableRoute("19", camelContext);
		SwitchableRoute route20 = new SwitchableRoute("20", camelContext);
		SwitchableRoute route21 = new SwitchableRoute("21", camelContext);
		SwitchableRoute route22 = new SwitchableRoute("22", camelContext);
		SwitchableRoute route23 = new SwitchableRoute("23", camelContext);
		SwitchableRoute route24 = new SwitchableRoute("24", camelContext);
		SwitchableRoute route25 = new SwitchableRoute("25", camelContext);
		SwitchableRoute route26 = new SwitchableRoute("26", camelContext);
		SwitchableRoute route27 = new SwitchableRoute("27", camelContext);
		SwitchableRoute route28 = new SwitchableRoute("28", camelContext);
		SwitchableRoute route29 = new SwitchableRoute("29", camelContext);
		SwitchableRoute route30 = new SwitchableRoute("30", camelContext);
		SwitchableRoute route31 = new SwitchableRoute("31", camelContext);
		SwitchableRoute route32 = new SwitchableRoute("32", camelContext);
		SwitchableRoute route33 = new SwitchableRoute("33", camelContext);
		SwitchableRoute route34 = new SwitchableRoute("34", camelContext);
		SwitchableRoute route35 = new SwitchableRoute("35", camelContext);
		SwitchableRoute route36 = new SwitchableRoute("36", camelContext);
		SwitchableRoute route37 = new SwitchableRoute("37", camelContext);
		SwitchableRoute route38 = new SwitchableRoute("38", camelContext);
		SwitchableRoute route39 = new SwitchableRoute("39", camelContext);
		SwitchableRoute route40 = new SwitchableRoute("40", camelContext);
		SwitchableRoute route41 = new SwitchableRoute("41", camelContext);
		SwitchableRoute route42 = new SwitchableRoute("42", camelContext);
		SwitchableRoute route43 = new SwitchableRoute("43", camelContext);
		SwitchableRoute route44 = new SwitchableRoute("44", camelContext);
		SwitchableRoute route45 = new SwitchableRoute("45", camelContext);
		SwitchableRoute route46 = new SwitchableRoute("46", camelContext);
		SwitchableRoute route47 = new SwitchableRoute("47", camelContext);
		SwitchableRoute route48 = new SwitchableRoute("48", camelContext);
		SwitchableRoute route49 = new SwitchableRoute("49", camelContext);
		SwitchableRoute route50 = new SwitchableRoute("50", camelContext);
		SwitchableRoute route51 = new SwitchableRoute("51", camelContext);
		SwitchableRoute route52 = new SwitchableRoute("52", camelContext);
		SwitchableRoute route53 = new SwitchableRoute("53", camelContext);
		SwitchableRoute route54 = new SwitchableRoute("54", camelContext);
		SwitchableRoute route55 = new SwitchableRoute("55", camelContext);
		SwitchableRoute route56 = new SwitchableRoute("56", camelContext);
		SwitchableRoute route57 = new SwitchableRoute("57", camelContext);
		SwitchableRoute route58 = new SwitchableRoute("58", camelContext);
		SwitchableRoute route59 = new SwitchableRoute("59", camelContext);
		SwitchableRoute route60 = new SwitchableRoute("60", camelContext);
		SwitchableRoute route61 = new SwitchableRoute("61", camelContext);
		SwitchableRoute route62 = new SwitchableRoute("62", camelContext);
		SwitchableRoute route63 = new SwitchableRoute("63", camelContext);
		SwitchableRoute route64 = new SwitchableRoute("64", camelContext);
		SwitchableRoute route65 = new SwitchableRoute("65", camelContext);
		SwitchableRoute route66 = new SwitchableRoute("66", camelContext);
		SwitchableRoute route67 = new SwitchableRoute("67", camelContext);
		SwitchableRoute route68 = new SwitchableRoute("68", camelContext);
		SwitchableRoute route69 = new SwitchableRoute("69", camelContext);
		SwitchableRoute route70 = new SwitchableRoute("70", camelContext);
		SwitchableRoute route71 = new SwitchableRoute("71", camelContext);
		SwitchableRoute route72 = new SwitchableRoute("72", camelContext);
		SwitchableRoute route73 = new SwitchableRoute("73", camelContext);
		SwitchableRoute route74 = new SwitchableRoute("74", camelContext);
		SwitchableRoute route75 = new SwitchableRoute("75", camelContext);
		SwitchableRoute route76 = new SwitchableRoute("76", camelContext);
		SwitchableRoute route77 = new SwitchableRoute("77", camelContext);
		SwitchableRoute route78 = new SwitchableRoute("78", camelContext);
		SwitchableRoute route79 = new SwitchableRoute("79", camelContext);
		SwitchableRoute route80 = new SwitchableRoute("80", camelContext);
		SwitchableRoute route81 = new SwitchableRoute("81", camelContext);
		SwitchableRoute route82 = new SwitchableRoute("82", camelContext);
		SwitchableRoute route83 = new SwitchableRoute("83", camelContext);
		SwitchableRoute route84 = new SwitchableRoute("84", camelContext);
		SwitchableRoute route85 = new SwitchableRoute("85", camelContext);
		SwitchableRoute route86 = new SwitchableRoute("86", camelContext);
		SwitchableRoute route87 = new SwitchableRoute("87", camelContext);
		SwitchableRoute route88 = new SwitchableRoute("88", camelContext);
		SwitchableRoute route89 = new SwitchableRoute("89", camelContext);

		final BIPActor executor1 = engine.register(route1,"1", true);
		final BIPActor executor2 = engine.register(route2,"2", true);
		final BIPActor executor3 = engine.register(route3,"3", true);
		final BIPActor executor4 = engine.register(route4,"4", true);
		final BIPActor executor5 = engine.register(route5,"5", true);
		final BIPActor executor6 = engine.register(route6,"6", true);
		final BIPActor executor7 = engine.register(route7,"7", true);
		final BIPActor executor8 = engine.register(route8,"8", true);
		final BIPActor executor9 = engine.register(route9,"9", true);
		final BIPActor executor10 = engine.register(route10,"10", true);
		final BIPActor executor11 = engine.register(route11,"11", true);
		final BIPActor executor12 = engine.register(route12,"12", true);
		final BIPActor executor13 = engine.register(route13,"13", true);
		final BIPActor executor14 = engine.register(route14,"14", true);
		final BIPActor executor15 = engine.register(route15,"15", true);
		final BIPActor executor16 = engine.register(route16,"16", true);
		final BIPActor executor17 = engine.register(route17,"17", true);
		final BIPActor executor18 = engine.register(route18,"18", true);
		final BIPActor executor19 = engine.register(route19,"19", true);
		final BIPActor executor20 = engine.register(route20,"20", true);
		final BIPActor executor21 = engine.register(route21,"21", true);
		final BIPActor executor22 = engine.register(route22,"22", true);
		final BIPActor executor23 = engine.register(route23,"23", true);
		final BIPActor executor24 = engine.register(route24,"24", true);
		final BIPActor executor25 = engine.register(route25,"25", true);
		final BIPActor executor26 = engine.register(route26,"26", true);
		final BIPActor executor27 = engine.register(route27,"27", true);
		final BIPActor executor28 = engine.register(route28,"28", true);
		final BIPActor executor29 = engine.register(route29,"29", true);
		final BIPActor executor30 = engine.register(route30,"30", true);
		final BIPActor executor31 = engine.register(route31,"31", true);
		final BIPActor executor32 = engine.register(route32,"32", true);
		final BIPActor executor33 = engine.register(route33,"33", true);
		final BIPActor executor34 = engine.register(route34,"34", true);
		final BIPActor executor35 = engine.register(route35,"35", true);
		final BIPActor executor36 = engine.register(route36,"36", true);
		final BIPActor executor37 = engine.register(route37,"37", true);
		final BIPActor executor38 = engine.register(route38,"38", true);
		final BIPActor executor39 = engine.register(route39,"39", true);
		final BIPActor executor40 = engine.register(route40,"40", true);
		final BIPActor executor41 = engine.register(route41,"41", true);
		final BIPActor executor42 = engine.register(route42,"42", true);
		final BIPActor executor43 = engine.register(route43,"43", true);
		final BIPActor executor44 = engine.register(route44,"44", true);
		final BIPActor executor45 = engine.register(route45,"45", true);
		final BIPActor executor46 = engine.register(route46,"46", true);
		final BIPActor executor47 = engine.register(route47,"47", true);
		final BIPActor executor48 = engine.register(route48,"48", true);
		final BIPActor executor49 = engine.register(route49,"49", true);
		final BIPActor executor50 = engine.register(route50,"50", true);
		final BIPActor executor51 = engine.register(route51,"51", true);
		final BIPActor executor52 = engine.register(route52,"52", true);
		final BIPActor executor53 = engine.register(route53,"53", true);
		final BIPActor executor54 = engine.register(route54,"54", true);
		final BIPActor executor55 = engine.register(route55,"55", true);
		final BIPActor executor56 = engine.register(route56,"56", true);
		final BIPActor executor57 = engine.register(route57,"57", true);
		final BIPActor executor58 = engine.register(route58,"58", true);
		final BIPActor executor59 = engine.register(route59,"59", true);
		final BIPActor executor60 = engine.register(route60,"60", true);
		final BIPActor executor61 = engine.register(route61,"61", true);
		final BIPActor executor62 = engine.register(route62,"62", true);
		final BIPActor executor63 = engine.register(route63,"63", true);
		final BIPActor executor64 = engine.register(route64,"64", true);
		final BIPActor executor65 = engine.register(route65,"65", true);
		final BIPActor executor66 = engine.register(route66,"66", true);
		final BIPActor executor67 = engine.register(route67,"67", true);
		final BIPActor executor68 = engine.register(route68,"68", true);
		final BIPActor executor69 = engine.register(route69,"69", true);
		final BIPActor executor70 = engine.register(route70,"70", true);
		final BIPActor executor71 = engine.register(route71,"71", true);
		final BIPActor executor72 = engine.register(route72,"72", true);
		final BIPActor executor73 = engine.register(route73,"73", true);
		final BIPActor executor74 = engine.register(route74,"74", true);
		final BIPActor executor75 = engine.register(route75,"75", true);
		final BIPActor executor76 = engine.register(route76,"76", true);
		final BIPActor executor77 = engine.register(route77,"77", true);
		final BIPActor executor78 = engine.register(route78,"78", true);
		final BIPActor executor79 = engine.register(route79,"79", true);
		final BIPActor executor80 = engine.register(route80,"80", true);
		final BIPActor executor81 = engine.register(route81,"81", true);
		final BIPActor executor82 = engine.register(route82,"82", true);
		final BIPActor executor83 = engine.register(route83,"83", true);
		final BIPActor executor84 = engine.register(route84,"84", true);
		final BIPActor executor85 = engine.register(route85,"85", true);
		final BIPActor executor86 = engine.register(route86,"86", true);
		final BIPActor executor87 = engine.register(route87,"87", true);
		final BIPActor executor88 = engine.register(route88,"88", true);
		final BIPActor executor89 = engine.register(route89,"89", true);

		final RoutePolicy routePolicy1 = createRoutePolicy(executor1);
		final RoutePolicy routePolicy2 = createRoutePolicy(executor2);
		final RoutePolicy routePolicy3 = createRoutePolicy(executor3);
		final RoutePolicy routePolicy4 = createRoutePolicy(executor4);
		final RoutePolicy routePolicy5 = createRoutePolicy(executor5);
		final RoutePolicy routePolicy6 = createRoutePolicy(executor6);
		final RoutePolicy routePolicy7 = createRoutePolicy(executor7);
		final RoutePolicy routePolicy8 = createRoutePolicy(executor8);
		final RoutePolicy routePolicy9 = createRoutePolicy(executor9);
		final RoutePolicy routePolicy10 = createRoutePolicy(executor10);
		final RoutePolicy routePolicy11 = createRoutePolicy(executor11);
		final RoutePolicy routePolicy12 = createRoutePolicy(executor12);
		final RoutePolicy routePolicy13 = createRoutePolicy(executor13);
		final RoutePolicy routePolicy14 = createRoutePolicy(executor14);
		final RoutePolicy routePolicy15 = createRoutePolicy(executor15);
		final RoutePolicy routePolicy16 = createRoutePolicy(executor16);
		final RoutePolicy routePolicy17 = createRoutePolicy(executor17);
		final RoutePolicy routePolicy18 = createRoutePolicy(executor18);
		final RoutePolicy routePolicy19 = createRoutePolicy(executor19);
		final RoutePolicy routePolicy20 = createRoutePolicy(executor20);
		final RoutePolicy routePolicy21 = createRoutePolicy(executor21);
		final RoutePolicy routePolicy22 = createRoutePolicy(executor22);
		final RoutePolicy routePolicy23 = createRoutePolicy(executor23);
		final RoutePolicy routePolicy24 = createRoutePolicy(executor24);
		final RoutePolicy routePolicy25 = createRoutePolicy(executor25);
		final RoutePolicy routePolicy26 = createRoutePolicy(executor26);
		final RoutePolicy routePolicy27 = createRoutePolicy(executor27);
		final RoutePolicy routePolicy28 = createRoutePolicy(executor28);
		final RoutePolicy routePolicy29 = createRoutePolicy(executor29);
		final RoutePolicy routePolicy30 = createRoutePolicy(executor30);
		final RoutePolicy routePolicy31 = createRoutePolicy(executor31);
		final RoutePolicy routePolicy32 = createRoutePolicy(executor32);
		final RoutePolicy routePolicy33 = createRoutePolicy(executor33);
		final RoutePolicy routePolicy34 = createRoutePolicy(executor34);
		final RoutePolicy routePolicy35 = createRoutePolicy(executor35);
		final RoutePolicy routePolicy36 = createRoutePolicy(executor36);
		final RoutePolicy routePolicy37 = createRoutePolicy(executor37);
		final RoutePolicy routePolicy38 = createRoutePolicy(executor38);
		final RoutePolicy routePolicy39 = createRoutePolicy(executor39);
		final RoutePolicy routePolicy40 = createRoutePolicy(executor40);
		final RoutePolicy routePolicy41 = createRoutePolicy(executor41);
		final RoutePolicy routePolicy42 = createRoutePolicy(executor42);
		final RoutePolicy routePolicy43 = createRoutePolicy(executor43);
		final RoutePolicy routePolicy44 = createRoutePolicy(executor44);
		final RoutePolicy routePolicy45 = createRoutePolicy(executor45);
		final RoutePolicy routePolicy46 = createRoutePolicy(executor46);
		final RoutePolicy routePolicy47 = createRoutePolicy(executor47);
		final RoutePolicy routePolicy48 = createRoutePolicy(executor48);
		final RoutePolicy routePolicy49 = createRoutePolicy(executor49);
		final RoutePolicy routePolicy50 = createRoutePolicy(executor50);
		final RoutePolicy routePolicy51 = createRoutePolicy(executor51);
		final RoutePolicy routePolicy52 = createRoutePolicy(executor52);
		final RoutePolicy routePolicy53 = createRoutePolicy(executor53);
		final RoutePolicy routePolicy54 = createRoutePolicy(executor54);
		final RoutePolicy routePolicy55 = createRoutePolicy(executor55);
		final RoutePolicy routePolicy56 = createRoutePolicy(executor56);
		final RoutePolicy routePolicy57 = createRoutePolicy(executor57);
		final RoutePolicy routePolicy58 = createRoutePolicy(executor58);
		final RoutePolicy routePolicy59 = createRoutePolicy(executor59);
		final RoutePolicy routePolicy60 = createRoutePolicy(executor60);
		final RoutePolicy routePolicy61 = createRoutePolicy(executor61);
		final RoutePolicy routePolicy62 = createRoutePolicy(executor62);
		final RoutePolicy routePolicy63 = createRoutePolicy(executor63);
		final RoutePolicy routePolicy64 = createRoutePolicy(executor64);
		final RoutePolicy routePolicy65 = createRoutePolicy(executor65);
		final RoutePolicy routePolicy66 = createRoutePolicy(executor66);
		final RoutePolicy routePolicy67 = createRoutePolicy(executor67);
		final RoutePolicy routePolicy68 = createRoutePolicy(executor68);
		final RoutePolicy routePolicy69 = createRoutePolicy(executor69);
		final RoutePolicy routePolicy70 = createRoutePolicy(executor70);
		final RoutePolicy routePolicy71 = createRoutePolicy(executor71);
		final RoutePolicy routePolicy72 = createRoutePolicy(executor72);
		final RoutePolicy routePolicy73 = createRoutePolicy(executor73);
		final RoutePolicy routePolicy74 = createRoutePolicy(executor74);
		final RoutePolicy routePolicy75 = createRoutePolicy(executor75);
		final RoutePolicy routePolicy76 = createRoutePolicy(executor76);
		final RoutePolicy routePolicy77 = createRoutePolicy(executor77);
		final RoutePolicy routePolicy78 = createRoutePolicy(executor78);
		final RoutePolicy routePolicy79 = createRoutePolicy(executor79);
		final RoutePolicy routePolicy80 = createRoutePolicy(executor80);
		final RoutePolicy routePolicy81 = createRoutePolicy(executor81);
		final RoutePolicy routePolicy82 = createRoutePolicy(executor82);
		final RoutePolicy routePolicy83 = createRoutePolicy(executor83);
		final RoutePolicy routePolicy84 = createRoutePolicy(executor84);
		final RoutePolicy routePolicy85 = createRoutePolicy(executor85);
		final RoutePolicy routePolicy86 = createRoutePolicy(executor86);
		final RoutePolicy routePolicy87 = createRoutePolicy(executor87);
		final RoutePolicy routePolicy88 = createRoutePolicy(executor88);
		final RoutePolicy routePolicy89 = createRoutePolicy(executor89);
		
		RouteBuilder builder = new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:inputfolder1?delete=true").routeId("1")
						.routePolicy(routePolicy1).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder1");

				from("file:inputfolder2?delete=true").routeId("2")
						.routePolicy(routePolicy2).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder2");

				from("file:inputfolder3?delete=true").routeId("3")
						.routePolicy(routePolicy3).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder3");

				from("file:inputfolder4?delete=true").routeId("4")
						.routePolicy(routePolicy4).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder4");

				from("file:inputfolder5?delete=true").routeId("5")
						.routePolicy(routePolicy5).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder5");

				from("file:inputfolder6?delete=true").routeId("6")
						.routePolicy(routePolicy6).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder6");

				from("file:inputfolder7?delete=true").routeId("7")
						.routePolicy(routePolicy7).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder7");

				from("file:inputfolder8?delete=true").routeId("8")
						.routePolicy(routePolicy8).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder8");

				from("file:inputfolder9?delete=true").routeId("9")
						.routePolicy(routePolicy9).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder9");

				from("file:inputfolder10?delete=true").routeId("10")
						.routePolicy(routePolicy10).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder10");

				from("file:inputfolder11?delete=true").routeId("11")
						.routePolicy(routePolicy11).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder11");

				from("file:inputfolder12?delete=true").routeId("12")
						.routePolicy(routePolicy12).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder12");

				from("file:inputfolder13?delete=true").routeId("13")
						.routePolicy(routePolicy13).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder13");

				from("file:inputfolder14?delete=true").routeId("14")
						.routePolicy(routePolicy14).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder14");

				from("file:inputfolder15?delete=true").routeId("15")
						.routePolicy(routePolicy15).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder15");

				from("file:inputfolder16?delete=true").routeId("16")
						.routePolicy(routePolicy16).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder16");

				from("file:inputfolder17?delete=true").routeId("17")
						.routePolicy(routePolicy17).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder17");

				from("file:inputfolder18?delete=true").routeId("18")
						.routePolicy(routePolicy18).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder18");

				from("file:inputfolder19?delete=true").routeId("19")
						.routePolicy(routePolicy19).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder19");

				from("file:inputfolder20?delete=true").routeId("20")
						.routePolicy(routePolicy20).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder20");

				from("file:inputfolder21?delete=true").routeId("21")
						.routePolicy(routePolicy21).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder21");

				from("file:inputfolder22?delete=true").routeId("22")
						.routePolicy(routePolicy22).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder22");

				from("file:inputfolder23?delete=true").routeId("23")
						.routePolicy(routePolicy23).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder23");

				from("file:inputfolder24?delete=true").routeId("24")
						.routePolicy(routePolicy24).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder24");

				from("file:inputfolder25?delete=true").routeId("25")
						.routePolicy(routePolicy25).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder25");

				from("file:inputfolder26?delete=true").routeId("26")
						.routePolicy(routePolicy26).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder26");

				from("file:inputfolder27?delete=true").routeId("27")
						.routePolicy(routePolicy27).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder27");

				from("file:inputfolder28?delete=true").routeId("28")
						.routePolicy(routePolicy28).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder28");

				from("file:inputfolder29?delete=true").routeId("29")
						.routePolicy(routePolicy29).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder29");

				from("file:inputfolder30?delete=true").routeId("30")
						.routePolicy(routePolicy30).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder30");

				from("file:inputfolder31?delete=true").routeId("31")
						.routePolicy(routePolicy31).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder31");

				from("file:inputfolder32?delete=true").routeId("32")
						.routePolicy(routePolicy32).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder32");

				from("file:inputfolder33?delete=true").routeId("33")
						.routePolicy(routePolicy33).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder33");

				from("file:inputfolder34?delete=true").routeId("34")
						.routePolicy(routePolicy34).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder34");

				from("file:inputfolder35?delete=true").routeId("35")
						.routePolicy(routePolicy35).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder35");

				from("file:inputfolder36?delete=true").routeId("36")
						.routePolicy(routePolicy36).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder36");

				from("file:inputfolder37?delete=true").routeId("37")
						.routePolicy(routePolicy37).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder37");

				from("file:inputfolder38?delete=true").routeId("38")
						.routePolicy(routePolicy38).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder38");

				from("file:inputfolder39?delete=true").routeId("39")
						.routePolicy(routePolicy39).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder39");

				from("file:inputfolder40?delete=true").routeId("40")
						.routePolicy(routePolicy40).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder40");

				from("file:inputfolder41?delete=true").routeId("41")
						.routePolicy(routePolicy41).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder41");

				from("file:inputfolder42?delete=true").routeId("42")
						.routePolicy(routePolicy42).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder42");

				from("file:inputfolder43?delete=true").routeId("43")
						.routePolicy(routePolicy43).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder43");

				from("file:inputfolder44?delete=true").routeId("44")
						.routePolicy(routePolicy44).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder44");

				from("file:inputfolder45?delete=true").routeId("45")
						.routePolicy(routePolicy45).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder45");

				from("file:inputfolder46?delete=true").routeId("46")
						.routePolicy(routePolicy46).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder46");

				from("file:inputfolder47?delete=true").routeId("47")
						.routePolicy(routePolicy47).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder47");

				from("file:inputfolder48?delete=true").routeId("48")
						.routePolicy(routePolicy48).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder48");

				from("file:inputfolder49?delete=true").routeId("49")
						.routePolicy(routePolicy49).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder49");

				from("file:inputfolder50?delete=true").routeId("50")
						.routePolicy(routePolicy50).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder50");

				from("file:inputfolder51?delete=true").routeId("51")
						.routePolicy(routePolicy51).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder51");

				from("file:inputfolder52?delete=true").routeId("52")
						.routePolicy(routePolicy52).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder52");

				from("file:inputfolder53?delete=true").routeId("53")
						.routePolicy(routePolicy53).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder53");

				from("file:inputfolder54?delete=true").routeId("54")
						.routePolicy(routePolicy54).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder54");

				from("file:inputfolder55?delete=true").routeId("55")
						.routePolicy(routePolicy55).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder55");

				from("file:inputfolder56?delete=true").routeId("56")
						.routePolicy(routePolicy56).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder56");

				from("file:inputfolder57?delete=true").routeId("57")
						.routePolicy(routePolicy57).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder57");

				from("file:inputfolder58?delete=true").routeId("58")
						.routePolicy(routePolicy58).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder58");

				from("file:inputfolder59?delete=true").routeId("59")
						.routePolicy(routePolicy59).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder59");

				from("file:inputfolder60?delete=true").routeId("60")
						.routePolicy(routePolicy60).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder60");

				from("file:inputfolder61?delete=true").routeId("61")
						.routePolicy(routePolicy61).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder61");

				from("file:inputfolder62?delete=true").routeId("62")
						.routePolicy(routePolicy62).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder62");

				from("file:inputfolder63?delete=true").routeId("63")
						.routePolicy(routePolicy63).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder63");

				from("file:inputfolder64?delete=true").routeId("64")
						.routePolicy(routePolicy64).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder64");

				from("file:inputfolder65?delete=true").routeId("65")
						.routePolicy(routePolicy65).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder65");

				from("file:inputfolder66?delete=true").routeId("66")
						.routePolicy(routePolicy66).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder66");

				from("file:inputfolder67?delete=true").routeId("67")
						.routePolicy(routePolicy67).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder67");

				from("file:inputfolder68?delete=true").routeId("68")
						.routePolicy(routePolicy68).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder68");

				from("file:inputfolder69?delete=true").routeId("69")
						.routePolicy(routePolicy69).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder69");

				from("file:inputfolder70?delete=true").routeId("70")
						.routePolicy(routePolicy70).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder70");

				from("file:inputfolder71?delete=true").routeId("71")
						.routePolicy(routePolicy71).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder71");

				from("file:inputfolder72?delete=true").routeId("72")
						.routePolicy(routePolicy72).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder72");

				from("file:inputfolder73?delete=true").routeId("73")
						.routePolicy(routePolicy73).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder73");

				from("file:inputfolder74?delete=true").routeId("74")
						.routePolicy(routePolicy74).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder74");

				from("file:inputfolder75?delete=true").routeId("75")
						.routePolicy(routePolicy75).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder75");

				from("file:inputfolder76?delete=true").routeId("76")
						.routePolicy(routePolicy76).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder76");

				from("file:inputfolder77?delete=true").routeId("77")
						.routePolicy(routePolicy77).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder77");

				from("file:inputfolder78?delete=true").routeId("78")
						.routePolicy(routePolicy78).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder78");

				from("file:inputfolder79?delete=true").routeId("79")
						.routePolicy(routePolicy79).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder79");

				from("file:inputfolder80?delete=true").routeId("80")
						.routePolicy(routePolicy80).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder80");

				from("file:inputfolder81?delete=true").routeId("81")
						.routePolicy(routePolicy81).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder81");

				from("file:inputfolder82?delete=true").routeId("82")
						.routePolicy(routePolicy82).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder82");

				from("file:inputfolder83?delete=true").routeId("83")
						.routePolicy(routePolicy83).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder83");

				from("file:inputfolder84?delete=true").routeId("84")
						.routePolicy(routePolicy84).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder84");

				from("file:inputfolder85?delete=true").routeId("85")
						.routePolicy(routePolicy85).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder85");

				from("file:inputfolder86?delete=true").routeId("86")
						.routePolicy(routePolicy86).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder86");

				from("file:inputfolder87?delete=true").routeId("87")
						.routePolicy(routePolicy87).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder87");

				from("file:inputfolder88?delete=true").routeId("88")
						.routePolicy(routePolicy88).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder88");

				from("file:inputfolder89?delete=true").routeId("89")
						.routePolicy(routePolicy89).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder89");

			}
		};
		try {
			camelContext.addRoutes(builder);
			camelContext.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		route1.setCamelContext(camelContext);
		route2.setCamelContext(camelContext);
		route3.setCamelContext(camelContext);
		route4.setCamelContext(camelContext);
		route5.setCamelContext(camelContext);
		route6.setCamelContext(camelContext);
		route7.setCamelContext(camelContext);
		route8.setCamelContext(camelContext);
		route9.setCamelContext(camelContext);
		route10.setCamelContext(camelContext);
		route11.setCamelContext(camelContext);
		route12.setCamelContext(camelContext);
		route13.setCamelContext(camelContext);
		route14.setCamelContext(camelContext);
		route15.setCamelContext(camelContext);
		route16.setCamelContext(camelContext);
		route17.setCamelContext(camelContext);
		route18.setCamelContext(camelContext);
		route19.setCamelContext(camelContext);
		route20.setCamelContext(camelContext);
		route21.setCamelContext(camelContext);
		route22.setCamelContext(camelContext);
		route23.setCamelContext(camelContext);
		route24.setCamelContext(camelContext);
		route25.setCamelContext(camelContext);
		route26.setCamelContext(camelContext);
		route27.setCamelContext(camelContext);
		route28.setCamelContext(camelContext);
		route29.setCamelContext(camelContext);
		route30.setCamelContext(camelContext);
		route31.setCamelContext(camelContext);
		route32.setCamelContext(camelContext);
		route33.setCamelContext(camelContext);
		route34.setCamelContext(camelContext);
		route35.setCamelContext(camelContext);
		route36.setCamelContext(camelContext);
		route37.setCamelContext(camelContext);
		route38.setCamelContext(camelContext);
		route39.setCamelContext(camelContext);
		route40.setCamelContext(camelContext);
		route41.setCamelContext(camelContext);
		route42.setCamelContext(camelContext);
		route43.setCamelContext(camelContext);
		route44.setCamelContext(camelContext);
		route45.setCamelContext(camelContext);
		route46.setCamelContext(camelContext);
		route47.setCamelContext(camelContext);
		route48.setCamelContext(camelContext);
		route49.setCamelContext(camelContext);
		route50.setCamelContext(camelContext);
		route51.setCamelContext(camelContext);
		route52.setCamelContext(camelContext);
		route53.setCamelContext(camelContext);
		route54.setCamelContext(camelContext);
		route55.setCamelContext(camelContext);
		route56.setCamelContext(camelContext);
		route57.setCamelContext(camelContext);
		route58.setCamelContext(camelContext);
		route59.setCamelContext(camelContext);
		route60.setCamelContext(camelContext);
		route61.setCamelContext(camelContext);
		route62.setCamelContext(camelContext);
		route63.setCamelContext(camelContext);
		route64.setCamelContext(camelContext);
		route65.setCamelContext(camelContext);
		route66.setCamelContext(camelContext);
		route67.setCamelContext(camelContext);
		route68.setCamelContext(camelContext);
		route69.setCamelContext(camelContext);
		route70.setCamelContext(camelContext);
		route71.setCamelContext(camelContext);
		route72.setCamelContext(camelContext);
		route73.setCamelContext(camelContext);
		route74.setCamelContext(camelContext);
		route75.setCamelContext(camelContext);
		route76.setCamelContext(camelContext);
		route77.setCamelContext(camelContext);
		route78.setCamelContext(camelContext);
		route79.setCamelContext(camelContext);
		route80.setCamelContext(camelContext);
		route81.setCamelContext(camelContext);
		route82.setCamelContext(camelContext);
		route83.setCamelContext(camelContext);
		route84.setCamelContext(camelContext);
		route85.setCamelContext(camelContext);
		route86.setCamelContext(camelContext);
		route87.setCamelContext(camelContext);
		route88.setCamelContext(camelContext);
		route89.setCamelContext(camelContext);
		engine.specifyGlue(bipGlue);
		engine.start();
		engine.execute();
		Thread.sleep(80000);
	}

	@Test
	public void bipSwMultiTest94() throws BIPException, InterruptedException {

		BIPGlue bipGlue = new TwoSynchronGlueBuilder() {
			@Override
			public void configure() {

				synchron(SwitchableRoute.class, "on").to(
						MonitorNoDataManyRoutes.class, "add");
				synchron(SwitchableRoute.class, "finished").to(
						MonitorNoDataManyRoutes.class, "rm");
				port(SwitchableRoute.class, "off")
						.acceptsNothing();
				port(SwitchableRoute.class, "off")
						.requiresNothing();

			}

		}.build();
		BIPEngine engine = engineFactory.create("myEngine", bipGlue);

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.setAutoStartup(false);

		MonitorNoDataManyRoutes monitorNoDataManyRoutes = new MonitorNoDataManyRoutes(47);
		final BIPActor executorM = engine.register(monitorNoDataManyRoutes, "monitor", true);
		
		SwitchableRoute route1 = new SwitchableRoute("1", camelContext);
		SwitchableRoute route2 = new SwitchableRoute("2", camelContext);
		SwitchableRoute route3 = new SwitchableRoute("3", camelContext);
		SwitchableRoute route4 = new SwitchableRoute("4", camelContext);
		SwitchableRoute route5 = new SwitchableRoute("5", camelContext);
		SwitchableRoute route6 = new SwitchableRoute("6", camelContext);
		SwitchableRoute route7 = new SwitchableRoute("7", camelContext);
		SwitchableRoute route8 = new SwitchableRoute("8", camelContext);
		SwitchableRoute route9 = new SwitchableRoute("9", camelContext);
		SwitchableRoute route10 = new SwitchableRoute("10", camelContext);
		SwitchableRoute route11 = new SwitchableRoute("11", camelContext);
		SwitchableRoute route12 = new SwitchableRoute("12", camelContext);
		SwitchableRoute route13 = new SwitchableRoute("13", camelContext);
		SwitchableRoute route14 = new SwitchableRoute("14", camelContext);
		SwitchableRoute route15 = new SwitchableRoute("15", camelContext);
		SwitchableRoute route16 = new SwitchableRoute("16", camelContext);
		SwitchableRoute route17 = new SwitchableRoute("17", camelContext);
		SwitchableRoute route18 = new SwitchableRoute("18", camelContext);
		SwitchableRoute route19 = new SwitchableRoute("19", camelContext);
		SwitchableRoute route20 = new SwitchableRoute("20", camelContext);
		SwitchableRoute route21 = new SwitchableRoute("21", camelContext);
		SwitchableRoute route22 = new SwitchableRoute("22", camelContext);
		SwitchableRoute route23 = new SwitchableRoute("23", camelContext);
		SwitchableRoute route24 = new SwitchableRoute("24", camelContext);
		SwitchableRoute route25 = new SwitchableRoute("25", camelContext);
		SwitchableRoute route26 = new SwitchableRoute("26", camelContext);
		SwitchableRoute route27 = new SwitchableRoute("27", camelContext);
		SwitchableRoute route28 = new SwitchableRoute("28", camelContext);
		SwitchableRoute route29 = new SwitchableRoute("29", camelContext);
		SwitchableRoute route30 = new SwitchableRoute("30", camelContext);
		SwitchableRoute route31 = new SwitchableRoute("31", camelContext);
		SwitchableRoute route32 = new SwitchableRoute("32", camelContext);
		SwitchableRoute route33 = new SwitchableRoute("33", camelContext);
		SwitchableRoute route34 = new SwitchableRoute("34", camelContext);
		SwitchableRoute route35 = new SwitchableRoute("35", camelContext);
		SwitchableRoute route36 = new SwitchableRoute("36", camelContext);
		SwitchableRoute route37 = new SwitchableRoute("37", camelContext);
		SwitchableRoute route38 = new SwitchableRoute("38", camelContext);
		SwitchableRoute route39 = new SwitchableRoute("39", camelContext);
		SwitchableRoute route40 = new SwitchableRoute("40", camelContext);
		SwitchableRoute route41 = new SwitchableRoute("41", camelContext);
		SwitchableRoute route42 = new SwitchableRoute("42", camelContext);
		SwitchableRoute route43 = new SwitchableRoute("43", camelContext);
		SwitchableRoute route44 = new SwitchableRoute("44", camelContext);
		SwitchableRoute route45 = new SwitchableRoute("45", camelContext);
		SwitchableRoute route46 = new SwitchableRoute("46", camelContext);
		SwitchableRoute route47 = new SwitchableRoute("47", camelContext);
		SwitchableRoute route48 = new SwitchableRoute("48", camelContext);
		SwitchableRoute route49 = new SwitchableRoute("49", camelContext);
		SwitchableRoute route50 = new SwitchableRoute("50", camelContext);
		SwitchableRoute route51 = new SwitchableRoute("51", camelContext);
		SwitchableRoute route52 = new SwitchableRoute("52", camelContext);
		SwitchableRoute route53 = new SwitchableRoute("53", camelContext);
		SwitchableRoute route54 = new SwitchableRoute("54", camelContext);
		SwitchableRoute route55 = new SwitchableRoute("55", camelContext);
		SwitchableRoute route56 = new SwitchableRoute("56", camelContext);
		SwitchableRoute route57 = new SwitchableRoute("57", camelContext);
		SwitchableRoute route58 = new SwitchableRoute("58", camelContext);
		SwitchableRoute route59 = new SwitchableRoute("59", camelContext);
		SwitchableRoute route60 = new SwitchableRoute("60", camelContext);
		SwitchableRoute route61 = new SwitchableRoute("61", camelContext);
		SwitchableRoute route62 = new SwitchableRoute("62", camelContext);
		SwitchableRoute route63 = new SwitchableRoute("63", camelContext);
		SwitchableRoute route64 = new SwitchableRoute("64", camelContext);
		SwitchableRoute route65 = new SwitchableRoute("65", camelContext);
		SwitchableRoute route66 = new SwitchableRoute("66", camelContext);
		SwitchableRoute route67 = new SwitchableRoute("67", camelContext);
		SwitchableRoute route68 = new SwitchableRoute("68", camelContext);
		SwitchableRoute route69 = new SwitchableRoute("69", camelContext);
		SwitchableRoute route70 = new SwitchableRoute("70", camelContext);
		SwitchableRoute route71 = new SwitchableRoute("71", camelContext);
		SwitchableRoute route72 = new SwitchableRoute("72", camelContext);
		SwitchableRoute route73 = new SwitchableRoute("73", camelContext);
		SwitchableRoute route74 = new SwitchableRoute("74", camelContext);
		SwitchableRoute route75 = new SwitchableRoute("75", camelContext);
		SwitchableRoute route76 = new SwitchableRoute("76", camelContext);
		SwitchableRoute route77 = new SwitchableRoute("77", camelContext);
		SwitchableRoute route78 = new SwitchableRoute("78", camelContext);
		SwitchableRoute route79 = new SwitchableRoute("79", camelContext);
		SwitchableRoute route80 = new SwitchableRoute("80", camelContext);
		SwitchableRoute route81 = new SwitchableRoute("81", camelContext);
		SwitchableRoute route82 = new SwitchableRoute("82", camelContext);
		SwitchableRoute route83 = new SwitchableRoute("83", camelContext);
		SwitchableRoute route84 = new SwitchableRoute("84", camelContext);
		SwitchableRoute route85 = new SwitchableRoute("85", camelContext);
		SwitchableRoute route86 = new SwitchableRoute("86", camelContext);
		SwitchableRoute route87 = new SwitchableRoute("87", camelContext);
		SwitchableRoute route88 = new SwitchableRoute("88", camelContext);
		SwitchableRoute route89 = new SwitchableRoute("89", camelContext);
		SwitchableRoute route90 = new SwitchableRoute("90", camelContext);
		SwitchableRoute route91 = new SwitchableRoute("91", camelContext);
		SwitchableRoute route92 = new SwitchableRoute("92", camelContext);
		SwitchableRoute route93 = new SwitchableRoute("93", camelContext);
		SwitchableRoute route94 = new SwitchableRoute("94", camelContext);

		final BIPActor executor1 = engine.register(route1,"1", true);
		final BIPActor executor2 = engine.register(route2,"2", true);
		final BIPActor executor3 = engine.register(route3,"3", true);
		final BIPActor executor4 = engine.register(route4,"4", true);
		final BIPActor executor5 = engine.register(route5,"5", true);
		final BIPActor executor6 = engine.register(route6,"6", true);
		final BIPActor executor7 = engine.register(route7,"7", true);
		final BIPActor executor8 = engine.register(route8,"8", true);
		final BIPActor executor9 = engine.register(route9,"9", true);
		final BIPActor executor10 = engine.register(route10,"10", true);
		final BIPActor executor11 = engine.register(route11,"11", true);
		final BIPActor executor12 = engine.register(route12,"12", true);
		final BIPActor executor13 = engine.register(route13,"13", true);
		final BIPActor executor14 = engine.register(route14,"14", true);
		final BIPActor executor15 = engine.register(route15,"15", true);
		final BIPActor executor16 = engine.register(route16,"16", true);
		final BIPActor executor17 = engine.register(route17,"17", true);
		final BIPActor executor18 = engine.register(route18,"18", true);
		final BIPActor executor19 = engine.register(route19,"19", true);
		final BIPActor executor20 = engine.register(route20,"20", true);
		final BIPActor executor21 = engine.register(route21,"21", true);
		final BIPActor executor22 = engine.register(route22,"22", true);
		final BIPActor executor23 = engine.register(route23,"23", true);
		final BIPActor executor24 = engine.register(route24,"24", true);
		final BIPActor executor25 = engine.register(route25,"25", true);
		final BIPActor executor26 = engine.register(route26,"26", true);
		final BIPActor executor27 = engine.register(route27,"27", true);
		final BIPActor executor28 = engine.register(route28,"28", true);
		final BIPActor executor29 = engine.register(route29,"29", true);
		final BIPActor executor30 = engine.register(route30,"30", true);
		final BIPActor executor31 = engine.register(route31,"31", true);
		final BIPActor executor32 = engine.register(route32,"32", true);
		final BIPActor executor33 = engine.register(route33,"33", true);
		final BIPActor executor34 = engine.register(route34,"34", true);
		final BIPActor executor35 = engine.register(route35,"35", true);
		final BIPActor executor36 = engine.register(route36,"36", true);
		final BIPActor executor37 = engine.register(route37,"37", true);
		final BIPActor executor38 = engine.register(route38,"38", true);
		final BIPActor executor39 = engine.register(route39,"39", true);
		final BIPActor executor40 = engine.register(route40,"40", true);
		final BIPActor executor41 = engine.register(route41,"41", true);
		final BIPActor executor42 = engine.register(route42,"42", true);
		final BIPActor executor43 = engine.register(route43,"43", true);
		final BIPActor executor44 = engine.register(route44,"44", true);
		final BIPActor executor45 = engine.register(route45,"45", true);
		final BIPActor executor46 = engine.register(route46,"46", true);
		final BIPActor executor47 = engine.register(route47,"47", true);
		final BIPActor executor48 = engine.register(route48,"48", true);
		final BIPActor executor49 = engine.register(route49,"49", true);
		final BIPActor executor50 = engine.register(route50,"50", true);
		final BIPActor executor51 = engine.register(route51,"51", true);
		final BIPActor executor52 = engine.register(route52,"52", true);
		final BIPActor executor53 = engine.register(route53,"53", true);
		final BIPActor executor54 = engine.register(route54,"54", true);
		final BIPActor executor55 = engine.register(route55,"55", true);
		final BIPActor executor56 = engine.register(route56,"56", true);
		final BIPActor executor57 = engine.register(route57,"57", true);
		final BIPActor executor58 = engine.register(route58,"58", true);
		final BIPActor executor59 = engine.register(route59,"59", true);
		final BIPActor executor60 = engine.register(route60,"60", true);
		final BIPActor executor61 = engine.register(route61,"61", true);
		final BIPActor executor62 = engine.register(route62,"62", true);
		final BIPActor executor63 = engine.register(route63,"63", true);
		final BIPActor executor64 = engine.register(route64,"64", true);
		final BIPActor executor65 = engine.register(route65,"65", true);
		final BIPActor executor66 = engine.register(route66,"66", true);
		final BIPActor executor67 = engine.register(route67,"67", true);
		final BIPActor executor68 = engine.register(route68,"68", true);
		final BIPActor executor69 = engine.register(route69,"69", true);
		final BIPActor executor70 = engine.register(route70,"70", true);
		final BIPActor executor71 = engine.register(route71,"71", true);
		final BIPActor executor72 = engine.register(route72,"72", true);
		final BIPActor executor73 = engine.register(route73,"73", true);
		final BIPActor executor74 = engine.register(route74,"74", true);
		final BIPActor executor75 = engine.register(route75,"75", true);
		final BIPActor executor76 = engine.register(route76,"76", true);
		final BIPActor executor77 = engine.register(route77,"77", true);
		final BIPActor executor78 = engine.register(route78,"78", true);
		final BIPActor executor79 = engine.register(route79,"79", true);
		final BIPActor executor80 = engine.register(route80,"80", true);
		final BIPActor executor81 = engine.register(route81,"81", true);
		final BIPActor executor82 = engine.register(route82,"82", true);
		final BIPActor executor83 = engine.register(route83,"83", true);
		final BIPActor executor84 = engine.register(route84,"84", true);
		final BIPActor executor85 = engine.register(route85,"85", true);
		final BIPActor executor86 = engine.register(route86,"86", true);
		final BIPActor executor87 = engine.register(route87,"87", true);
		final BIPActor executor88 = engine.register(route88,"88", true);
		final BIPActor executor89 = engine.register(route89,"89", true);
		final BIPActor executor90 = engine.register(route90,"90", true);
		final BIPActor executor91 = engine.register(route91,"91", true);
		final BIPActor executor92 = engine.register(route92,"92", true);
		final BIPActor executor93 = engine.register(route93,"93", true);
		final BIPActor executor94 = engine.register(route94,"94", true);

		final RoutePolicy routePolicy1 = createRoutePolicy(executor1);
		final RoutePolicy routePolicy2 = createRoutePolicy(executor2);
		final RoutePolicy routePolicy3 = createRoutePolicy(executor3);
		final RoutePolicy routePolicy4 = createRoutePolicy(executor4);
		final RoutePolicy routePolicy5 = createRoutePolicy(executor5);
		final RoutePolicy routePolicy6 = createRoutePolicy(executor6);
		final RoutePolicy routePolicy7 = createRoutePolicy(executor7);
		final RoutePolicy routePolicy8 = createRoutePolicy(executor8);
		final RoutePolicy routePolicy9 = createRoutePolicy(executor9);
		final RoutePolicy routePolicy10 = createRoutePolicy(executor10);
		final RoutePolicy routePolicy11 = createRoutePolicy(executor11);
		final RoutePolicy routePolicy12 = createRoutePolicy(executor12);
		final RoutePolicy routePolicy13 = createRoutePolicy(executor13);
		final RoutePolicy routePolicy14 = createRoutePolicy(executor14);
		final RoutePolicy routePolicy15 = createRoutePolicy(executor15);
		final RoutePolicy routePolicy16 = createRoutePolicy(executor16);
		final RoutePolicy routePolicy17 = createRoutePolicy(executor17);
		final RoutePolicy routePolicy18 = createRoutePolicy(executor18);
		final RoutePolicy routePolicy19 = createRoutePolicy(executor19);
		final RoutePolicy routePolicy20 = createRoutePolicy(executor20);
		final RoutePolicy routePolicy21 = createRoutePolicy(executor21);
		final RoutePolicy routePolicy22 = createRoutePolicy(executor22);
		final RoutePolicy routePolicy23 = createRoutePolicy(executor23);
		final RoutePolicy routePolicy24 = createRoutePolicy(executor24);
		final RoutePolicy routePolicy25 = createRoutePolicy(executor25);
		final RoutePolicy routePolicy26 = createRoutePolicy(executor26);
		final RoutePolicy routePolicy27 = createRoutePolicy(executor27);
		final RoutePolicy routePolicy28 = createRoutePolicy(executor28);
		final RoutePolicy routePolicy29 = createRoutePolicy(executor29);
		final RoutePolicy routePolicy30 = createRoutePolicy(executor30);
		final RoutePolicy routePolicy31 = createRoutePolicy(executor31);
		final RoutePolicy routePolicy32 = createRoutePolicy(executor32);
		final RoutePolicy routePolicy33 = createRoutePolicy(executor33);
		final RoutePolicy routePolicy34 = createRoutePolicy(executor34);
		final RoutePolicy routePolicy35 = createRoutePolicy(executor35);
		final RoutePolicy routePolicy36 = createRoutePolicy(executor36);
		final RoutePolicy routePolicy37 = createRoutePolicy(executor37);
		final RoutePolicy routePolicy38 = createRoutePolicy(executor38);
		final RoutePolicy routePolicy39 = createRoutePolicy(executor39);
		final RoutePolicy routePolicy40 = createRoutePolicy(executor40);
		final RoutePolicy routePolicy41 = createRoutePolicy(executor41);
		final RoutePolicy routePolicy42 = createRoutePolicy(executor42);
		final RoutePolicy routePolicy43 = createRoutePolicy(executor43);
		final RoutePolicy routePolicy44 = createRoutePolicy(executor44);
		final RoutePolicy routePolicy45 = createRoutePolicy(executor45);
		final RoutePolicy routePolicy46 = createRoutePolicy(executor46);
		final RoutePolicy routePolicy47 = createRoutePolicy(executor47);
		final RoutePolicy routePolicy48 = createRoutePolicy(executor48);
		final RoutePolicy routePolicy49 = createRoutePolicy(executor49);
		final RoutePolicy routePolicy50 = createRoutePolicy(executor50);
		final RoutePolicy routePolicy51 = createRoutePolicy(executor51);
		final RoutePolicy routePolicy52 = createRoutePolicy(executor52);
		final RoutePolicy routePolicy53 = createRoutePolicy(executor53);
		final RoutePolicy routePolicy54 = createRoutePolicy(executor54);
		final RoutePolicy routePolicy55 = createRoutePolicy(executor55);
		final RoutePolicy routePolicy56 = createRoutePolicy(executor56);
		final RoutePolicy routePolicy57 = createRoutePolicy(executor57);
		final RoutePolicy routePolicy58 = createRoutePolicy(executor58);
		final RoutePolicy routePolicy59 = createRoutePolicy(executor59);
		final RoutePolicy routePolicy60 = createRoutePolicy(executor60);
		final RoutePolicy routePolicy61 = createRoutePolicy(executor61);
		final RoutePolicy routePolicy62 = createRoutePolicy(executor62);
		final RoutePolicy routePolicy63 = createRoutePolicy(executor63);
		final RoutePolicy routePolicy64 = createRoutePolicy(executor64);
		final RoutePolicy routePolicy65 = createRoutePolicy(executor65);
		final RoutePolicy routePolicy66 = createRoutePolicy(executor66);
		final RoutePolicy routePolicy67 = createRoutePolicy(executor67);
		final RoutePolicy routePolicy68 = createRoutePolicy(executor68);
		final RoutePolicy routePolicy69 = createRoutePolicy(executor69);
		final RoutePolicy routePolicy70 = createRoutePolicy(executor70);
		final RoutePolicy routePolicy71 = createRoutePolicy(executor71);
		final RoutePolicy routePolicy72 = createRoutePolicy(executor72);
		final RoutePolicy routePolicy73 = createRoutePolicy(executor73);
		final RoutePolicy routePolicy74 = createRoutePolicy(executor74);
		final RoutePolicy routePolicy75 = createRoutePolicy(executor75);
		final RoutePolicy routePolicy76 = createRoutePolicy(executor76);
		final RoutePolicy routePolicy77 = createRoutePolicy(executor77);
		final RoutePolicy routePolicy78 = createRoutePolicy(executor78);
		final RoutePolicy routePolicy79 = createRoutePolicy(executor79);
		final RoutePolicy routePolicy80 = createRoutePolicy(executor80);
		final RoutePolicy routePolicy81 = createRoutePolicy(executor81);
		final RoutePolicy routePolicy82 = createRoutePolicy(executor82);
		final RoutePolicy routePolicy83 = createRoutePolicy(executor83);
		final RoutePolicy routePolicy84 = createRoutePolicy(executor84);
		final RoutePolicy routePolicy85 = createRoutePolicy(executor85);
		final RoutePolicy routePolicy86 = createRoutePolicy(executor86);
		final RoutePolicy routePolicy87 = createRoutePolicy(executor87);
		final RoutePolicy routePolicy88 = createRoutePolicy(executor88);
		final RoutePolicy routePolicy89 = createRoutePolicy(executor89);
		final RoutePolicy routePolicy90 = createRoutePolicy(executor90);
		final RoutePolicy routePolicy91 = createRoutePolicy(executor91);
		final RoutePolicy routePolicy92 = createRoutePolicy(executor92);
		final RoutePolicy routePolicy93 = createRoutePolicy(executor93);
		final RoutePolicy routePolicy94 = createRoutePolicy(executor94);
		
		RouteBuilder builder = new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:inputfolder1?delete=true").routeId("1")
						.routePolicy(routePolicy1).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder1");

				from("file:inputfolder2?delete=true").routeId("2")
						.routePolicy(routePolicy2).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder2");

				from("file:inputfolder3?delete=true").routeId("3")
						.routePolicy(routePolicy3).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder3");

				from("file:inputfolder4?delete=true").routeId("4")
						.routePolicy(routePolicy4).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder4");

				from("file:inputfolder5?delete=true").routeId("5")
						.routePolicy(routePolicy5).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder5");

				from("file:inputfolder6?delete=true").routeId("6")
						.routePolicy(routePolicy6).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder6");

				from("file:inputfolder7?delete=true").routeId("7")
						.routePolicy(routePolicy7).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder7");

				from("file:inputfolder8?delete=true").routeId("8")
						.routePolicy(routePolicy8).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder8");

				from("file:inputfolder9?delete=true").routeId("9")
						.routePolicy(routePolicy9).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder9");

				from("file:inputfolder10?delete=true").routeId("10")
						.routePolicy(routePolicy10).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder10");

				from("file:inputfolder11?delete=true").routeId("11")
						.routePolicy(routePolicy11).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder11");

				from("file:inputfolder12?delete=true").routeId("12")
						.routePolicy(routePolicy12).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder12");

				from("file:inputfolder13?delete=true").routeId("13")
						.routePolicy(routePolicy13).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder13");

				from("file:inputfolder14?delete=true").routeId("14")
						.routePolicy(routePolicy14).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder14");

				from("file:inputfolder15?delete=true").routeId("15")
						.routePolicy(routePolicy15).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder15");

				from("file:inputfolder16?delete=true").routeId("16")
						.routePolicy(routePolicy16).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder16");

				from("file:inputfolder17?delete=true").routeId("17")
						.routePolicy(routePolicy17).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder17");

				from("file:inputfolder18?delete=true").routeId("18")
						.routePolicy(routePolicy18).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder18");

				from("file:inputfolder19?delete=true").routeId("19")
						.routePolicy(routePolicy19).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder19");

				from("file:inputfolder20?delete=true").routeId("20")
						.routePolicy(routePolicy20).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder20");

				from("file:inputfolder21?delete=true").routeId("21")
						.routePolicy(routePolicy21).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder21");

				from("file:inputfolder22?delete=true").routeId("22")
						.routePolicy(routePolicy22).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder22");

				from("file:inputfolder23?delete=true").routeId("23")
						.routePolicy(routePolicy23).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder23");

				from("file:inputfolder24?delete=true").routeId("24")
						.routePolicy(routePolicy24).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder24");

				from("file:inputfolder25?delete=true").routeId("25")
						.routePolicy(routePolicy25).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder25");

				from("file:inputfolder26?delete=true").routeId("26")
						.routePolicy(routePolicy26).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder26");

				from("file:inputfolder27?delete=true").routeId("27")
						.routePolicy(routePolicy27).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder27");

				from("file:inputfolder28?delete=true").routeId("28")
						.routePolicy(routePolicy28).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder28");

				from("file:inputfolder29?delete=true").routeId("29")
						.routePolicy(routePolicy29).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder29");

				from("file:inputfolder30?delete=true").routeId("30")
						.routePolicy(routePolicy30).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder30");

				from("file:inputfolder31?delete=true").routeId("31")
						.routePolicy(routePolicy31).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder31");

				from("file:inputfolder32?delete=true").routeId("32")
						.routePolicy(routePolicy32).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder32");

				from("file:inputfolder33?delete=true").routeId("33")
						.routePolicy(routePolicy33).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder33");

				from("file:inputfolder34?delete=true").routeId("34")
						.routePolicy(routePolicy34).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder34");

				from("file:inputfolder35?delete=true").routeId("35")
						.routePolicy(routePolicy35).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder35");

				from("file:inputfolder36?delete=true").routeId("36")
						.routePolicy(routePolicy36).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder36");

				from("file:inputfolder37?delete=true").routeId("37")
						.routePolicy(routePolicy37).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder37");

				from("file:inputfolder38?delete=true").routeId("38")
						.routePolicy(routePolicy38).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder38");

				from("file:inputfolder39?delete=true").routeId("39")
						.routePolicy(routePolicy39).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder39");

				from("file:inputfolder40?delete=true").routeId("40")
						.routePolicy(routePolicy40).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder40");

				from("file:inputfolder41?delete=true").routeId("41")
						.routePolicy(routePolicy41).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder41");

				from("file:inputfolder42?delete=true").routeId("42")
						.routePolicy(routePolicy42).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder42");

				from("file:inputfolder43?delete=true").routeId("43")
						.routePolicy(routePolicy43).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder43");

				from("file:inputfolder44?delete=true").routeId("44")
						.routePolicy(routePolicy44).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder44");

				from("file:inputfolder45?delete=true").routeId("45")
						.routePolicy(routePolicy45).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder45");

				from("file:inputfolder46?delete=true").routeId("46")
						.routePolicy(routePolicy46).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder46");

				from("file:inputfolder47?delete=true").routeId("47")
						.routePolicy(routePolicy47).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder47");

				from("file:inputfolder48?delete=true").routeId("48")
						.routePolicy(routePolicy48).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder48");

				from("file:inputfolder49?delete=true").routeId("49")
						.routePolicy(routePolicy49).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder49");

				from("file:inputfolder50?delete=true").routeId("50")
						.routePolicy(routePolicy50).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder50");

				from("file:inputfolder51?delete=true").routeId("51")
						.routePolicy(routePolicy51).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder51");

				from("file:inputfolder52?delete=true").routeId("52")
						.routePolicy(routePolicy52).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder52");

				from("file:inputfolder53?delete=true").routeId("53")
						.routePolicy(routePolicy53).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder53");

				from("file:inputfolder54?delete=true").routeId("54")
						.routePolicy(routePolicy54).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder54");

				from("file:inputfolder55?delete=true").routeId("55")
						.routePolicy(routePolicy55).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder55");

				from("file:inputfolder56?delete=true").routeId("56")
						.routePolicy(routePolicy56).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder56");

				from("file:inputfolder57?delete=true").routeId("57")
						.routePolicy(routePolicy57).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder57");

				from("file:inputfolder58?delete=true").routeId("58")
						.routePolicy(routePolicy58).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder58");

				from("file:inputfolder59?delete=true").routeId("59")
						.routePolicy(routePolicy59).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder59");

				from("file:inputfolder60?delete=true").routeId("60")
						.routePolicy(routePolicy60).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder60");

				from("file:inputfolder61?delete=true").routeId("61")
						.routePolicy(routePolicy61).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder61");

				from("file:inputfolder62?delete=true").routeId("62")
						.routePolicy(routePolicy62).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder62");

				from("file:inputfolder63?delete=true").routeId("63")
						.routePolicy(routePolicy63).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder63");

				from("file:inputfolder64?delete=true").routeId("64")
						.routePolicy(routePolicy64).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder64");

				from("file:inputfolder65?delete=true").routeId("65")
						.routePolicy(routePolicy65).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder65");

				from("file:inputfolder66?delete=true").routeId("66")
						.routePolicy(routePolicy66).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder66");

				from("file:inputfolder67?delete=true").routeId("67")
						.routePolicy(routePolicy67).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder67");

				from("file:inputfolder68?delete=true").routeId("68")
						.routePolicy(routePolicy68).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder68");

				from("file:inputfolder69?delete=true").routeId("69")
						.routePolicy(routePolicy69).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder69");

				from("file:inputfolder70?delete=true").routeId("70")
						.routePolicy(routePolicy70).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder70");

				from("file:inputfolder71?delete=true").routeId("71")
						.routePolicy(routePolicy71).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder71");

				from("file:inputfolder72?delete=true").routeId("72")
						.routePolicy(routePolicy72).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder72");

				from("file:inputfolder73?delete=true").routeId("73")
						.routePolicy(routePolicy73).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder73");

				from("file:inputfolder74?delete=true").routeId("74")
						.routePolicy(routePolicy74).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder74");

				from("file:inputfolder75?delete=true").routeId("75")
						.routePolicy(routePolicy75).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder75");

				from("file:inputfolder76?delete=true").routeId("76")
						.routePolicy(routePolicy76).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder76");

				from("file:inputfolder77?delete=true").routeId("77")
						.routePolicy(routePolicy77).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder77");

				from("file:inputfolder78?delete=true").routeId("78")
						.routePolicy(routePolicy78).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder78");

				from("file:inputfolder79?delete=true").routeId("79")
						.routePolicy(routePolicy79).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder79");

				from("file:inputfolder80?delete=true").routeId("80")
						.routePolicy(routePolicy80).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder80");

				from("file:inputfolder81?delete=true").routeId("81")
						.routePolicy(routePolicy81).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder81");

				from("file:inputfolder82?delete=true").routeId("82")
						.routePolicy(routePolicy82).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder82");

				from("file:inputfolder83?delete=true").routeId("83")
						.routePolicy(routePolicy83).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder83");

				from("file:inputfolder84?delete=true").routeId("84")
						.routePolicy(routePolicy84).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder84");

				from("file:inputfolder85?delete=true").routeId("85")
						.routePolicy(routePolicy85).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder85");

				from("file:inputfolder86?delete=true").routeId("86")
						.routePolicy(routePolicy86).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder86");

				from("file:inputfolder87?delete=true").routeId("87")
						.routePolicy(routePolicy87).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder87");

				from("file:inputfolder88?delete=true").routeId("88")
						.routePolicy(routePolicy88).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder88");

				from("file:inputfolder89?delete=true").routeId("89")
						.routePolicy(routePolicy89).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder89");

				from("file:inputfolder90?delete=true").routeId("90")
						.routePolicy(routePolicy90).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder90");

				from("file:inputfolder91?delete=true").routeId("91")
						.routePolicy(routePolicy91).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder91");

				from("file:inputfolder92?delete=true").routeId("92")
						.routePolicy(routePolicy92).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder92");

				from("file:inputfolder93?delete=true").routeId("93")
						.routePolicy(routePolicy93).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder93");

				from("file:inputfolder94?delete=true").routeId("94")
						.routePolicy(routePolicy94).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder94");

			}
		};
		try {
			camelContext.addRoutes(builder);
			camelContext.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		route1.setCamelContext(camelContext);
		route2.setCamelContext(camelContext);
		route3.setCamelContext(camelContext);
		route4.setCamelContext(camelContext);
		route5.setCamelContext(camelContext);
		route6.setCamelContext(camelContext);
		route7.setCamelContext(camelContext);
		route8.setCamelContext(camelContext);
		route9.setCamelContext(camelContext);
		route10.setCamelContext(camelContext);
		route11.setCamelContext(camelContext);
		route12.setCamelContext(camelContext);
		route13.setCamelContext(camelContext);
		route14.setCamelContext(camelContext);
		route15.setCamelContext(camelContext);
		route16.setCamelContext(camelContext);
		route17.setCamelContext(camelContext);
		route18.setCamelContext(camelContext);
		route19.setCamelContext(camelContext);
		route20.setCamelContext(camelContext);
		route21.setCamelContext(camelContext);
		route22.setCamelContext(camelContext);
		route23.setCamelContext(camelContext);
		route24.setCamelContext(camelContext);
		route25.setCamelContext(camelContext);
		route26.setCamelContext(camelContext);
		route27.setCamelContext(camelContext);
		route28.setCamelContext(camelContext);
		route29.setCamelContext(camelContext);
		route30.setCamelContext(camelContext);
		route31.setCamelContext(camelContext);
		route32.setCamelContext(camelContext);
		route33.setCamelContext(camelContext);
		route34.setCamelContext(camelContext);
		route35.setCamelContext(camelContext);
		route36.setCamelContext(camelContext);
		route37.setCamelContext(camelContext);
		route38.setCamelContext(camelContext);
		route39.setCamelContext(camelContext);
		route40.setCamelContext(camelContext);
		route41.setCamelContext(camelContext);
		route42.setCamelContext(camelContext);
		route43.setCamelContext(camelContext);
		route44.setCamelContext(camelContext);
		route45.setCamelContext(camelContext);
		route46.setCamelContext(camelContext);
		route47.setCamelContext(camelContext);
		route48.setCamelContext(camelContext);
		route49.setCamelContext(camelContext);
		route50.setCamelContext(camelContext);
		route51.setCamelContext(camelContext);
		route52.setCamelContext(camelContext);
		route53.setCamelContext(camelContext);
		route54.setCamelContext(camelContext);
		route55.setCamelContext(camelContext);
		route56.setCamelContext(camelContext);
		route57.setCamelContext(camelContext);
		route58.setCamelContext(camelContext);
		route59.setCamelContext(camelContext);
		route60.setCamelContext(camelContext);
		route61.setCamelContext(camelContext);
		route62.setCamelContext(camelContext);
		route63.setCamelContext(camelContext);
		route64.setCamelContext(camelContext);
		route65.setCamelContext(camelContext);
		route66.setCamelContext(camelContext);
		route67.setCamelContext(camelContext);
		route68.setCamelContext(camelContext);
		route69.setCamelContext(camelContext);
		route70.setCamelContext(camelContext);
		route71.setCamelContext(camelContext);
		route72.setCamelContext(camelContext);
		route73.setCamelContext(camelContext);
		route74.setCamelContext(camelContext);
		route75.setCamelContext(camelContext);
		route76.setCamelContext(camelContext);
		route77.setCamelContext(camelContext);
		route78.setCamelContext(camelContext);
		route79.setCamelContext(camelContext);
		route80.setCamelContext(camelContext);
		route81.setCamelContext(camelContext);
		route82.setCamelContext(camelContext);
		route83.setCamelContext(camelContext);
		route84.setCamelContext(camelContext);
		route85.setCamelContext(camelContext);
		route86.setCamelContext(camelContext);
		route87.setCamelContext(camelContext);
		route88.setCamelContext(camelContext);
		route89.setCamelContext(camelContext);
		route90.setCamelContext(camelContext);
		route91.setCamelContext(camelContext);
		route92.setCamelContext(camelContext);
		route93.setCamelContext(camelContext);
		route94.setCamelContext(camelContext);
		engine.specifyGlue(bipGlue);
		engine.start();
		engine.execute();
		Thread.sleep(80000);
	}

	@Test
	public void bipSwMultiTest99() throws BIPException, InterruptedException {

		BIPGlue bipGlue = new TwoSynchronGlueBuilder() {
			@Override
			public void configure() {

				synchron(SwitchableRoute.class, "on").to(
						MonitorNoDataManyRoutes.class, "add");
				synchron(SwitchableRoute.class, "finished").to(
						MonitorNoDataManyRoutes.class, "rm");
				port(SwitchableRoute.class, "off")
						.acceptsNothing();
				port(SwitchableRoute.class, "off")
						.requiresNothing();

			}

		}.build();
		BIPEngine engine = engineFactory.create("myEngine", bipGlue);

		CamelContext camelContext = new DefaultCamelContext();
		camelContext.setAutoStartup(false);

		MonitorNoDataManyRoutes monitorNoDataManyRoutes = new MonitorNoDataManyRoutes(50);
		final BIPActor executorM = engine.register(monitorNoDataManyRoutes, "monitor", true);
		
		SwitchableRoute route1 = new SwitchableRoute("1", camelContext);
		SwitchableRoute route2 = new SwitchableRoute("2", camelContext);
		SwitchableRoute route3 = new SwitchableRoute("3", camelContext);
		SwitchableRoute route4 = new SwitchableRoute("4", camelContext);
		SwitchableRoute route5 = new SwitchableRoute("5", camelContext);
		SwitchableRoute route6 = new SwitchableRoute("6", camelContext);
		SwitchableRoute route7 = new SwitchableRoute("7", camelContext);
		SwitchableRoute route8 = new SwitchableRoute("8", camelContext);
		SwitchableRoute route9 = new SwitchableRoute("9", camelContext);
		SwitchableRoute route10 = new SwitchableRoute("10", camelContext);
		SwitchableRoute route11 = new SwitchableRoute("11", camelContext);
		SwitchableRoute route12 = new SwitchableRoute("12", camelContext);
		SwitchableRoute route13 = new SwitchableRoute("13", camelContext);
		SwitchableRoute route14 = new SwitchableRoute("14", camelContext);
		SwitchableRoute route15 = new SwitchableRoute("15", camelContext);
		SwitchableRoute route16 = new SwitchableRoute("16", camelContext);
		SwitchableRoute route17 = new SwitchableRoute("17", camelContext);
		SwitchableRoute route18 = new SwitchableRoute("18", camelContext);
		SwitchableRoute route19 = new SwitchableRoute("19", camelContext);
		SwitchableRoute route20 = new SwitchableRoute("20", camelContext);
		SwitchableRoute route21 = new SwitchableRoute("21", camelContext);
		SwitchableRoute route22 = new SwitchableRoute("22", camelContext);
		SwitchableRoute route23 = new SwitchableRoute("23", camelContext);
		SwitchableRoute route24 = new SwitchableRoute("24", camelContext);
		SwitchableRoute route25 = new SwitchableRoute("25", camelContext);
		SwitchableRoute route26 = new SwitchableRoute("26", camelContext);
		SwitchableRoute route27 = new SwitchableRoute("27", camelContext);
		SwitchableRoute route28 = new SwitchableRoute("28", camelContext);
		SwitchableRoute route29 = new SwitchableRoute("29", camelContext);
		SwitchableRoute route30 = new SwitchableRoute("30", camelContext);
		SwitchableRoute route31 = new SwitchableRoute("31", camelContext);
		SwitchableRoute route32 = new SwitchableRoute("32", camelContext);
		SwitchableRoute route33 = new SwitchableRoute("33", camelContext);
		SwitchableRoute route34 = new SwitchableRoute("34", camelContext);
		SwitchableRoute route35 = new SwitchableRoute("35", camelContext);
		SwitchableRoute route36 = new SwitchableRoute("36", camelContext);
		SwitchableRoute route37 = new SwitchableRoute("37", camelContext);
		SwitchableRoute route38 = new SwitchableRoute("38", camelContext);
		SwitchableRoute route39 = new SwitchableRoute("39", camelContext);
		SwitchableRoute route40 = new SwitchableRoute("40", camelContext);
		SwitchableRoute route41 = new SwitchableRoute("41", camelContext);
		SwitchableRoute route42 = new SwitchableRoute("42", camelContext);
		SwitchableRoute route43 = new SwitchableRoute("43", camelContext);
		SwitchableRoute route44 = new SwitchableRoute("44", camelContext);
		SwitchableRoute route45 = new SwitchableRoute("45", camelContext);
		SwitchableRoute route46 = new SwitchableRoute("46", camelContext);
		SwitchableRoute route47 = new SwitchableRoute("47", camelContext);
		SwitchableRoute route48 = new SwitchableRoute("48", camelContext);
		SwitchableRoute route49 = new SwitchableRoute("49", camelContext);
		SwitchableRoute route50 = new SwitchableRoute("50", camelContext);
		SwitchableRoute route51 = new SwitchableRoute("51", camelContext);
		SwitchableRoute route52 = new SwitchableRoute("52", camelContext);
		SwitchableRoute route53 = new SwitchableRoute("53", camelContext);
		SwitchableRoute route54 = new SwitchableRoute("54", camelContext);
		SwitchableRoute route55 = new SwitchableRoute("55", camelContext);
		SwitchableRoute route56 = new SwitchableRoute("56", camelContext);
		SwitchableRoute route57 = new SwitchableRoute("57", camelContext);
		SwitchableRoute route58 = new SwitchableRoute("58", camelContext);
		SwitchableRoute route59 = new SwitchableRoute("59", camelContext);
		SwitchableRoute route60 = new SwitchableRoute("60", camelContext);
		SwitchableRoute route61 = new SwitchableRoute("61", camelContext);
		SwitchableRoute route62 = new SwitchableRoute("62", camelContext);
		SwitchableRoute route63 = new SwitchableRoute("63", camelContext);
		SwitchableRoute route64 = new SwitchableRoute("64", camelContext);
		SwitchableRoute route65 = new SwitchableRoute("65", camelContext);
		SwitchableRoute route66 = new SwitchableRoute("66", camelContext);
		SwitchableRoute route67 = new SwitchableRoute("67", camelContext);
		SwitchableRoute route68 = new SwitchableRoute("68", camelContext);
		SwitchableRoute route69 = new SwitchableRoute("69", camelContext);
		SwitchableRoute route70 = new SwitchableRoute("70", camelContext);
		SwitchableRoute route71 = new SwitchableRoute("71", camelContext);
		SwitchableRoute route72 = new SwitchableRoute("72", camelContext);
		SwitchableRoute route73 = new SwitchableRoute("73", camelContext);
		SwitchableRoute route74 = new SwitchableRoute("74", camelContext);
		SwitchableRoute route75 = new SwitchableRoute("75", camelContext);
		SwitchableRoute route76 = new SwitchableRoute("76", camelContext);
		SwitchableRoute route77 = new SwitchableRoute("77", camelContext);
		SwitchableRoute route78 = new SwitchableRoute("78", camelContext);
		SwitchableRoute route79 = new SwitchableRoute("79", camelContext);
		SwitchableRoute route80 = new SwitchableRoute("80", camelContext);
		SwitchableRoute route81 = new SwitchableRoute("81", camelContext);
		SwitchableRoute route82 = new SwitchableRoute("82", camelContext);
		SwitchableRoute route83 = new SwitchableRoute("83", camelContext);
		SwitchableRoute route84 = new SwitchableRoute("84", camelContext);
		SwitchableRoute route85 = new SwitchableRoute("85", camelContext);
		SwitchableRoute route86 = new SwitchableRoute("86", camelContext);
		SwitchableRoute route87 = new SwitchableRoute("87", camelContext);
		SwitchableRoute route88 = new SwitchableRoute("88", camelContext);
		SwitchableRoute route89 = new SwitchableRoute("89", camelContext);
		SwitchableRoute route90 = new SwitchableRoute("90", camelContext);
		SwitchableRoute route91 = new SwitchableRoute("91", camelContext);
		SwitchableRoute route92 = new SwitchableRoute("92", camelContext);
		SwitchableRoute route93 = new SwitchableRoute("93", camelContext);
		SwitchableRoute route94 = new SwitchableRoute("94", camelContext);
		SwitchableRoute route95 = new SwitchableRoute("95", camelContext);
		SwitchableRoute route96 = new SwitchableRoute("96", camelContext);
		SwitchableRoute route97 = new SwitchableRoute("97", camelContext);
		SwitchableRoute route98 = new SwitchableRoute("98", camelContext);
		SwitchableRoute route99 = new SwitchableRoute("99", camelContext);

		final BIPActor executor1 = engine.register(route1,"1", true);
		final BIPActor executor2 = engine.register(route2,"2", true);
		final BIPActor executor3 = engine.register(route3,"3", true);
		final BIPActor executor4 = engine.register(route4,"4", true);
		final BIPActor executor5 = engine.register(route5,"5", true);
		final BIPActor executor6 = engine.register(route6,"6", true);
		final BIPActor executor7 = engine.register(route7,"7", true);
		final BIPActor executor8 = engine.register(route8,"8", true);
		final BIPActor executor9 = engine.register(route9,"9", true);
		final BIPActor executor10 = engine.register(route10,"10", true);
		final BIPActor executor11 = engine.register(route11,"11", true);
		final BIPActor executor12 = engine.register(route12,"12", true);
		final BIPActor executor13 = engine.register(route13,"13", true);
		final BIPActor executor14 = engine.register(route14,"14", true);
		final BIPActor executor15 = engine.register(route15,"15", true);
		final BIPActor executor16 = engine.register(route16,"16", true);
		final BIPActor executor17 = engine.register(route17,"17", true);
		final BIPActor executor18 = engine.register(route18,"18", true);
		final BIPActor executor19 = engine.register(route19,"19", true);
		final BIPActor executor20 = engine.register(route20,"20", true);
		final BIPActor executor21 = engine.register(route21,"21", true);
		final BIPActor executor22 = engine.register(route22,"22", true);
		final BIPActor executor23 = engine.register(route23,"23", true);
		final BIPActor executor24 = engine.register(route24,"24", true);
		final BIPActor executor25 = engine.register(route25,"25", true);
		final BIPActor executor26 = engine.register(route26,"26", true);
		final BIPActor executor27 = engine.register(route27,"27", true);
		final BIPActor executor28 = engine.register(route28,"28", true);
		final BIPActor executor29 = engine.register(route29,"29", true);
		final BIPActor executor30 = engine.register(route30,"30", true);
		final BIPActor executor31 = engine.register(route31,"31", true);
		final BIPActor executor32 = engine.register(route32,"32", true);
		final BIPActor executor33 = engine.register(route33,"33", true);
		final BIPActor executor34 = engine.register(route34,"34", true);
		final BIPActor executor35 = engine.register(route35,"35", true);
		final BIPActor executor36 = engine.register(route36,"36", true);
		final BIPActor executor37 = engine.register(route37,"37", true);
		final BIPActor executor38 = engine.register(route38,"38", true);
		final BIPActor executor39 = engine.register(route39,"39", true);
		final BIPActor executor40 = engine.register(route40,"40", true);
		final BIPActor executor41 = engine.register(route41,"41", true);
		final BIPActor executor42 = engine.register(route42,"42", true);
		final BIPActor executor43 = engine.register(route43,"43", true);
		final BIPActor executor44 = engine.register(route44,"44", true);
		final BIPActor executor45 = engine.register(route45,"45", true);
		final BIPActor executor46 = engine.register(route46,"46", true);
		final BIPActor executor47 = engine.register(route47,"47", true);
		final BIPActor executor48 = engine.register(route48,"48", true);
		final BIPActor executor49 = engine.register(route49,"49", true);
		final BIPActor executor50 = engine.register(route50,"50", true);
		final BIPActor executor51 = engine.register(route51,"51", true);
		final BIPActor executor52 = engine.register(route52,"52", true);
		final BIPActor executor53 = engine.register(route53,"53", true);
		final BIPActor executor54 = engine.register(route54,"54", true);
		final BIPActor executor55 = engine.register(route55,"55", true);
		final BIPActor executor56 = engine.register(route56,"56", true);
		final BIPActor executor57 = engine.register(route57,"57", true);
		final BIPActor executor58 = engine.register(route58,"58", true);
		final BIPActor executor59 = engine.register(route59,"59", true);
		final BIPActor executor60 = engine.register(route60,"60", true);
		final BIPActor executor61 = engine.register(route61,"61", true);
		final BIPActor executor62 = engine.register(route62,"62", true);
		final BIPActor executor63 = engine.register(route63,"63", true);
		final BIPActor executor64 = engine.register(route64,"64", true);
		final BIPActor executor65 = engine.register(route65,"65", true);
		final BIPActor executor66 = engine.register(route66,"66", true);
		final BIPActor executor67 = engine.register(route67,"67", true);
		final BIPActor executor68 = engine.register(route68,"68", true);
		final BIPActor executor69 = engine.register(route69,"69", true);
		final BIPActor executor70 = engine.register(route70,"70", true);
		final BIPActor executor71 = engine.register(route71,"71", true);
		final BIPActor executor72 = engine.register(route72,"72", true);
		final BIPActor executor73 = engine.register(route73,"73", true);
		final BIPActor executor74 = engine.register(route74,"74", true);
		final BIPActor executor75 = engine.register(route75,"75", true);
		final BIPActor executor76 = engine.register(route76,"76", true);
		final BIPActor executor77 = engine.register(route77,"77", true);
		final BIPActor executor78 = engine.register(route78,"78", true);
		final BIPActor executor79 = engine.register(route79,"79", true);
		final BIPActor executor80 = engine.register(route80,"80", true);
		final BIPActor executor81 = engine.register(route81,"81", true);
		final BIPActor executor82 = engine.register(route82,"82", true);
		final BIPActor executor83 = engine.register(route83,"83", true);
		final BIPActor executor84 = engine.register(route84,"84", true);
		final BIPActor executor85 = engine.register(route85,"85", true);
		final BIPActor executor86 = engine.register(route86,"86", true);
		final BIPActor executor87 = engine.register(route87,"87", true);
		final BIPActor executor88 = engine.register(route88,"88", true);
		final BIPActor executor89 = engine.register(route89,"89", true);
		final BIPActor executor90 = engine.register(route90,"90", true);
		final BIPActor executor91 = engine.register(route91,"91", true);
		final BIPActor executor92 = engine.register(route92,"92", true);
		final BIPActor executor93 = engine.register(route93,"93", true);
		final BIPActor executor94 = engine.register(route94,"94", true);
		final BIPActor executor95 = engine.register(route95,"95", true);
		final BIPActor executor96 = engine.register(route96,"96", true);
		final BIPActor executor97 = engine.register(route97,"97", true);
		final BIPActor executor98 = engine.register(route98,"98", true);
		final BIPActor executor99 = engine.register(route99,"99", true);

		final RoutePolicy routePolicy1 = createRoutePolicy(executor1);
		final RoutePolicy routePolicy2 = createRoutePolicy(executor2);
		final RoutePolicy routePolicy3 = createRoutePolicy(executor3);
		final RoutePolicy routePolicy4 = createRoutePolicy(executor4);
		final RoutePolicy routePolicy5 = createRoutePolicy(executor5);
		final RoutePolicy routePolicy6 = createRoutePolicy(executor6);
		final RoutePolicy routePolicy7 = createRoutePolicy(executor7);
		final RoutePolicy routePolicy8 = createRoutePolicy(executor8);
		final RoutePolicy routePolicy9 = createRoutePolicy(executor9);
		final RoutePolicy routePolicy10 = createRoutePolicy(executor10);
		final RoutePolicy routePolicy11 = createRoutePolicy(executor11);
		final RoutePolicy routePolicy12 = createRoutePolicy(executor12);
		final RoutePolicy routePolicy13 = createRoutePolicy(executor13);
		final RoutePolicy routePolicy14 = createRoutePolicy(executor14);
		final RoutePolicy routePolicy15 = createRoutePolicy(executor15);
		final RoutePolicy routePolicy16 = createRoutePolicy(executor16);
		final RoutePolicy routePolicy17 = createRoutePolicy(executor17);
		final RoutePolicy routePolicy18 = createRoutePolicy(executor18);
		final RoutePolicy routePolicy19 = createRoutePolicy(executor19);
		final RoutePolicy routePolicy20 = createRoutePolicy(executor20);
		final RoutePolicy routePolicy21 = createRoutePolicy(executor21);
		final RoutePolicy routePolicy22 = createRoutePolicy(executor22);
		final RoutePolicy routePolicy23 = createRoutePolicy(executor23);
		final RoutePolicy routePolicy24 = createRoutePolicy(executor24);
		final RoutePolicy routePolicy25 = createRoutePolicy(executor25);
		final RoutePolicy routePolicy26 = createRoutePolicy(executor26);
		final RoutePolicy routePolicy27 = createRoutePolicy(executor27);
		final RoutePolicy routePolicy28 = createRoutePolicy(executor28);
		final RoutePolicy routePolicy29 = createRoutePolicy(executor29);
		final RoutePolicy routePolicy30 = createRoutePolicy(executor30);
		final RoutePolicy routePolicy31 = createRoutePolicy(executor31);
		final RoutePolicy routePolicy32 = createRoutePolicy(executor32);
		final RoutePolicy routePolicy33 = createRoutePolicy(executor33);
		final RoutePolicy routePolicy34 = createRoutePolicy(executor34);
		final RoutePolicy routePolicy35 = createRoutePolicy(executor35);
		final RoutePolicy routePolicy36 = createRoutePolicy(executor36);
		final RoutePolicy routePolicy37 = createRoutePolicy(executor37);
		final RoutePolicy routePolicy38 = createRoutePolicy(executor38);
		final RoutePolicy routePolicy39 = createRoutePolicy(executor39);
		final RoutePolicy routePolicy40 = createRoutePolicy(executor40);
		final RoutePolicy routePolicy41 = createRoutePolicy(executor41);
		final RoutePolicy routePolicy42 = createRoutePolicy(executor42);
		final RoutePolicy routePolicy43 = createRoutePolicy(executor43);
		final RoutePolicy routePolicy44 = createRoutePolicy(executor44);
		final RoutePolicy routePolicy45 = createRoutePolicy(executor45);
		final RoutePolicy routePolicy46 = createRoutePolicy(executor46);
		final RoutePolicy routePolicy47 = createRoutePolicy(executor47);
		final RoutePolicy routePolicy48 = createRoutePolicy(executor48);
		final RoutePolicy routePolicy49 = createRoutePolicy(executor49);
		final RoutePolicy routePolicy50 = createRoutePolicy(executor50);
		final RoutePolicy routePolicy51 = createRoutePolicy(executor51);
		final RoutePolicy routePolicy52 = createRoutePolicy(executor52);
		final RoutePolicy routePolicy53 = createRoutePolicy(executor53);
		final RoutePolicy routePolicy54 = createRoutePolicy(executor54);
		final RoutePolicy routePolicy55 = createRoutePolicy(executor55);
		final RoutePolicy routePolicy56 = createRoutePolicy(executor56);
		final RoutePolicy routePolicy57 = createRoutePolicy(executor57);
		final RoutePolicy routePolicy58 = createRoutePolicy(executor58);
		final RoutePolicy routePolicy59 = createRoutePolicy(executor59);
		final RoutePolicy routePolicy60 = createRoutePolicy(executor60);
		final RoutePolicy routePolicy61 = createRoutePolicy(executor61);
		final RoutePolicy routePolicy62 = createRoutePolicy(executor62);
		final RoutePolicy routePolicy63 = createRoutePolicy(executor63);
		final RoutePolicy routePolicy64 = createRoutePolicy(executor64);
		final RoutePolicy routePolicy65 = createRoutePolicy(executor65);
		final RoutePolicy routePolicy66 = createRoutePolicy(executor66);
		final RoutePolicy routePolicy67 = createRoutePolicy(executor67);
		final RoutePolicy routePolicy68 = createRoutePolicy(executor68);
		final RoutePolicy routePolicy69 = createRoutePolicy(executor69);
		final RoutePolicy routePolicy70 = createRoutePolicy(executor70);
		final RoutePolicy routePolicy71 = createRoutePolicy(executor71);
		final RoutePolicy routePolicy72 = createRoutePolicy(executor72);
		final RoutePolicy routePolicy73 = createRoutePolicy(executor73);
		final RoutePolicy routePolicy74 = createRoutePolicy(executor74);
		final RoutePolicy routePolicy75 = createRoutePolicy(executor75);
		final RoutePolicy routePolicy76 = createRoutePolicy(executor76);
		final RoutePolicy routePolicy77 = createRoutePolicy(executor77);
		final RoutePolicy routePolicy78 = createRoutePolicy(executor78);
		final RoutePolicy routePolicy79 = createRoutePolicy(executor79);
		final RoutePolicy routePolicy80 = createRoutePolicy(executor80);
		final RoutePolicy routePolicy81 = createRoutePolicy(executor81);
		final RoutePolicy routePolicy82 = createRoutePolicy(executor82);
		final RoutePolicy routePolicy83 = createRoutePolicy(executor83);
		final RoutePolicy routePolicy84 = createRoutePolicy(executor84);
		final RoutePolicy routePolicy85 = createRoutePolicy(executor85);
		final RoutePolicy routePolicy86 = createRoutePolicy(executor86);
		final RoutePolicy routePolicy87 = createRoutePolicy(executor87);
		final RoutePolicy routePolicy88 = createRoutePolicy(executor88);
		final RoutePolicy routePolicy89 = createRoutePolicy(executor89);
		final RoutePolicy routePolicy90 = createRoutePolicy(executor90);
		final RoutePolicy routePolicy91 = createRoutePolicy(executor91);
		final RoutePolicy routePolicy92 = createRoutePolicy(executor92);
		final RoutePolicy routePolicy93 = createRoutePolicy(executor93);
		final RoutePolicy routePolicy94 = createRoutePolicy(executor94);
		final RoutePolicy routePolicy95 = createRoutePolicy(executor95);
		final RoutePolicy routePolicy96 = createRoutePolicy(executor96);
		final RoutePolicy routePolicy97 = createRoutePolicy(executor97);
		final RoutePolicy routePolicy98 = createRoutePolicy(executor98);
		final RoutePolicy routePolicy99 = createRoutePolicy(executor99);
		
		
		RouteBuilder builder = new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("file:inputfolder1?delete=true").routeId("1")
						.routePolicy(routePolicy1).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder1");

				from("file:inputfolder2?delete=true").routeId("2")
						.routePolicy(routePolicy2).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder2");

				from("file:inputfolder3?delete=true").routeId("3")
						.routePolicy(routePolicy3).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder3");

				from("file:inputfolder4?delete=true").routeId("4")
						.routePolicy(routePolicy4).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder4");

				from("file:inputfolder5?delete=true").routeId("5")
						.routePolicy(routePolicy5).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder5");

				from("file:inputfolder6?delete=true").routeId("6")
						.routePolicy(routePolicy6).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder6");

				from("file:inputfolder7?delete=true").routeId("7")
						.routePolicy(routePolicy7).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder7");

				from("file:inputfolder8?delete=true").routeId("8")
						.routePolicy(routePolicy8).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder8");

				from("file:inputfolder9?delete=true").routeId("9")
						.routePolicy(routePolicy9).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder9");

				from("file:inputfolder10?delete=true").routeId("10")
						.routePolicy(routePolicy10).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder10");

				from("file:inputfolder11?delete=true").routeId("11")
						.routePolicy(routePolicy11).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder11");

				from("file:inputfolder12?delete=true").routeId("12")
						.routePolicy(routePolicy12).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder12");

				from("file:inputfolder13?delete=true").routeId("13")
						.routePolicy(routePolicy13).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder13");

				from("file:inputfolder14?delete=true").routeId("14")
						.routePolicy(routePolicy14).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder14");

				from("file:inputfolder15?delete=true").routeId("15")
						.routePolicy(routePolicy15).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder15");

				from("file:inputfolder16?delete=true").routeId("16")
						.routePolicy(routePolicy16).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder16");

				from("file:inputfolder17?delete=true").routeId("17")
						.routePolicy(routePolicy17).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder17");

				from("file:inputfolder18?delete=true").routeId("18")
						.routePolicy(routePolicy18).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder18");

				from("file:inputfolder19?delete=true").routeId("19")
						.routePolicy(routePolicy19).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder19");

				from("file:inputfolder20?delete=true").routeId("20")
						.routePolicy(routePolicy20).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder20");

				from("file:inputfolder21?delete=true").routeId("21")
						.routePolicy(routePolicy21).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder21");

				from("file:inputfolder22?delete=true").routeId("22")
						.routePolicy(routePolicy22).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder22");

				from("file:inputfolder23?delete=true").routeId("23")
						.routePolicy(routePolicy23).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder23");

				from("file:inputfolder24?delete=true").routeId("24")
						.routePolicy(routePolicy24).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder24");

				from("file:inputfolder25?delete=true").routeId("25")
						.routePolicy(routePolicy25).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder25");

				from("file:inputfolder26?delete=true").routeId("26")
						.routePolicy(routePolicy26).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder26");

				from("file:inputfolder27?delete=true").routeId("27")
						.routePolicy(routePolicy27).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder27");

				from("file:inputfolder28?delete=true").routeId("28")
						.routePolicy(routePolicy28).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder28");

				from("file:inputfolder29?delete=true").routeId("29")
						.routePolicy(routePolicy29).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder29");

				from("file:inputfolder30?delete=true").routeId("30")
						.routePolicy(routePolicy30).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder30");

				from("file:inputfolder31?delete=true").routeId("31")
						.routePolicy(routePolicy31).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder31");

				from("file:inputfolder32?delete=true").routeId("32")
						.routePolicy(routePolicy32).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder32");

				from("file:inputfolder33?delete=true").routeId("33")
						.routePolicy(routePolicy33).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder33");

				from("file:inputfolder34?delete=true").routeId("34")
						.routePolicy(routePolicy34).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder34");

				from("file:inputfolder35?delete=true").routeId("35")
						.routePolicy(routePolicy35).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder35");

				from("file:inputfolder36?delete=true").routeId("36")
						.routePolicy(routePolicy36).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder36");

				from("file:inputfolder37?delete=true").routeId("37")
						.routePolicy(routePolicy37).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder37");

				from("file:inputfolder38?delete=true").routeId("38")
						.routePolicy(routePolicy38).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder38");

				from("file:inputfolder39?delete=true").routeId("39")
						.routePolicy(routePolicy39).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder39");

				from("file:inputfolder40?delete=true").routeId("40")
						.routePolicy(routePolicy40).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder40");

				from("file:inputfolder41?delete=true").routeId("41")
						.routePolicy(routePolicy41).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder41");

				from("file:inputfolder42?delete=true").routeId("42")
						.routePolicy(routePolicy42).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder42");

				from("file:inputfolder43?delete=true").routeId("43")
						.routePolicy(routePolicy43).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder43");

				from("file:inputfolder44?delete=true").routeId("44")
						.routePolicy(routePolicy44).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder44");

				from("file:inputfolder45?delete=true").routeId("45")
						.routePolicy(routePolicy45).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder45");

				from("file:inputfolder46?delete=true").routeId("46")
						.routePolicy(routePolicy46).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder46");

				from("file:inputfolder47?delete=true").routeId("47")
						.routePolicy(routePolicy47).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder47");

				from("file:inputfolder48?delete=true").routeId("48")
						.routePolicy(routePolicy48).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder48");

				from("file:inputfolder49?delete=true").routeId("49")
						.routePolicy(routePolicy49).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder49");

				from("file:inputfolder50?delete=true").routeId("50")
						.routePolicy(routePolicy50).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder50");

				from("file:inputfolder51?delete=true").routeId("51")
						.routePolicy(routePolicy51).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder51");

				from("file:inputfolder52?delete=true").routeId("52")
						.routePolicy(routePolicy52).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder52");

				from("file:inputfolder53?delete=true").routeId("53")
						.routePolicy(routePolicy53).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder53");

				from("file:inputfolder54?delete=true").routeId("54")
						.routePolicy(routePolicy54).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder54");

				from("file:inputfolder55?delete=true").routeId("55")
						.routePolicy(routePolicy55).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder55");

				from("file:inputfolder56?delete=true").routeId("56")
						.routePolicy(routePolicy56).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder56");

				from("file:inputfolder57?delete=true").routeId("57")
						.routePolicy(routePolicy57).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder57");

				from("file:inputfolder58?delete=true").routeId("58")
						.routePolicy(routePolicy58).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder58");

				from("file:inputfolder59?delete=true").routeId("59")
						.routePolicy(routePolicy59).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder59");

				from("file:inputfolder60?delete=true").routeId("60")
						.routePolicy(routePolicy60).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder60");

				from("file:inputfolder61?delete=true").routeId("61")
						.routePolicy(routePolicy61).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder61");

				from("file:inputfolder62?delete=true").routeId("62")
						.routePolicy(routePolicy62).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder62");

				from("file:inputfolder63?delete=true").routeId("63")
						.routePolicy(routePolicy63).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder63");

				from("file:inputfolder64?delete=true").routeId("64")
						.routePolicy(routePolicy64).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder64");

				from("file:inputfolder65?delete=true").routeId("65")
						.routePolicy(routePolicy65).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder65");

				from("file:inputfolder66?delete=true").routeId("66")
						.routePolicy(routePolicy66).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder66");

				from("file:inputfolder67?delete=true").routeId("67")
						.routePolicy(routePolicy67).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder67");

				from("file:inputfolder68?delete=true").routeId("68")
						.routePolicy(routePolicy68).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder68");

				from("file:inputfolder69?delete=true").routeId("69")
						.routePolicy(routePolicy69).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder69");

				from("file:inputfolder70?delete=true").routeId("70")
						.routePolicy(routePolicy70).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder70");

				from("file:inputfolder71?delete=true").routeId("71")
						.routePolicy(routePolicy71).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder71");

				from("file:inputfolder72?delete=true").routeId("72")
						.routePolicy(routePolicy72).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder72");

				from("file:inputfolder73?delete=true").routeId("73")
						.routePolicy(routePolicy73).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder73");

				from("file:inputfolder74?delete=true").routeId("74")
						.routePolicy(routePolicy74).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder74");

				from("file:inputfolder75?delete=true").routeId("75")
						.routePolicy(routePolicy75).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder75");

				from("file:inputfolder76?delete=true").routeId("76")
						.routePolicy(routePolicy76).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder76");

				from("file:inputfolder77?delete=true").routeId("77")
						.routePolicy(routePolicy77).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder77");

				from("file:inputfolder78?delete=true").routeId("78")
						.routePolicy(routePolicy78).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder78");

				from("file:inputfolder79?delete=true").routeId("79")
						.routePolicy(routePolicy79).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder79");

				from("file:inputfolder80?delete=true").routeId("80")
						.routePolicy(routePolicy80).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder80");

				from("file:inputfolder81?delete=true").routeId("81")
						.routePolicy(routePolicy81).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder81");

				from("file:inputfolder82?delete=true").routeId("82")
						.routePolicy(routePolicy82).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder82");

				from("file:inputfolder83?delete=true").routeId("83")
						.routePolicy(routePolicy83).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder83");

				from("file:inputfolder84?delete=true").routeId("84")
						.routePolicy(routePolicy84).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder84");

				from("file:inputfolder85?delete=true").routeId("85")
						.routePolicy(routePolicy85).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder85");

				from("file:inputfolder86?delete=true").routeId("86")
						.routePolicy(routePolicy86).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder86");

				from("file:inputfolder87?delete=true").routeId("87")
						.routePolicy(routePolicy87).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder87");

				from("file:inputfolder88?delete=true").routeId("88")
						.routePolicy(routePolicy88).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder88");

				from("file:inputfolder89?delete=true").routeId("89")
						.routePolicy(routePolicy89).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder89");

				from("file:inputfolder90?delete=true").routeId("90")
						.routePolicy(routePolicy90).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder90");

				from("file:inputfolder91?delete=true").routeId("91")
						.routePolicy(routePolicy91).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder91");

				from("file:inputfolder92?delete=true").routeId("92")
						.routePolicy(routePolicy92).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder92");

				from("file:inputfolder93?delete=true").routeId("93")
						.routePolicy(routePolicy93).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder93");

				from("file:inputfolder94?delete=true").routeId("94")
						.routePolicy(routePolicy94).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder94");

				from("file:inputfolder95?delete=true").routeId("95")
						.routePolicy(routePolicy95).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder95");

				from("file:inputfolder96?delete=true").routeId("96")
						.routePolicy(routePolicy96).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder96");

				from("file:inputfolder97?delete=true").routeId("97")
						.routePolicy(routePolicy97).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder97");

				from("file:inputfolder98?delete=true").routeId("98")
						.routePolicy(routePolicy98).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder98");

				from("file:inputfolder99?delete=true").routeId("99")
						.routePolicy(routePolicy99).process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
							}
						}).to("file:outputfolder99");

			}
		};
		try {
			camelContext.addRoutes(builder);
			camelContext.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		route1.setCamelContext(camelContext);
		route2.setCamelContext(camelContext);
		route3.setCamelContext(camelContext);
		route4.setCamelContext(camelContext);
		route5.setCamelContext(camelContext);
		route6.setCamelContext(camelContext);
		route7.setCamelContext(camelContext);
		route8.setCamelContext(camelContext);
		route9.setCamelContext(camelContext);
		route10.setCamelContext(camelContext);
		route11.setCamelContext(camelContext);
		route12.setCamelContext(camelContext);
		route13.setCamelContext(camelContext);
		route14.setCamelContext(camelContext);
		route15.setCamelContext(camelContext);
		route16.setCamelContext(camelContext);
		route17.setCamelContext(camelContext);
		route18.setCamelContext(camelContext);
		route19.setCamelContext(camelContext);
		route20.setCamelContext(camelContext);
		route21.setCamelContext(camelContext);
		route22.setCamelContext(camelContext);
		route23.setCamelContext(camelContext);
		route24.setCamelContext(camelContext);
		route25.setCamelContext(camelContext);
		route26.setCamelContext(camelContext);
		route27.setCamelContext(camelContext);
		route28.setCamelContext(camelContext);
		route29.setCamelContext(camelContext);
		route30.setCamelContext(camelContext);
		route31.setCamelContext(camelContext);
		route32.setCamelContext(camelContext);
		route33.setCamelContext(camelContext);
		route34.setCamelContext(camelContext);
		route35.setCamelContext(camelContext);
		route36.setCamelContext(camelContext);
		route37.setCamelContext(camelContext);
		route38.setCamelContext(camelContext);
		route39.setCamelContext(camelContext);
		route40.setCamelContext(camelContext);
		route41.setCamelContext(camelContext);
		route42.setCamelContext(camelContext);
		route43.setCamelContext(camelContext);
		route44.setCamelContext(camelContext);
		route45.setCamelContext(camelContext);
		route46.setCamelContext(camelContext);
		route47.setCamelContext(camelContext);
		route48.setCamelContext(camelContext);
		route49.setCamelContext(camelContext);
		route50.setCamelContext(camelContext);
		route51.setCamelContext(camelContext);
		route52.setCamelContext(camelContext);
		route53.setCamelContext(camelContext);
		route54.setCamelContext(camelContext);
		route55.setCamelContext(camelContext);
		route56.setCamelContext(camelContext);
		route57.setCamelContext(camelContext);
		route58.setCamelContext(camelContext);
		route59.setCamelContext(camelContext);
		route60.setCamelContext(camelContext);
		route61.setCamelContext(camelContext);
		route62.setCamelContext(camelContext);
		route63.setCamelContext(camelContext);
		route64.setCamelContext(camelContext);
		route65.setCamelContext(camelContext);
		route66.setCamelContext(camelContext);
		route67.setCamelContext(camelContext);
		route68.setCamelContext(camelContext);
		route69.setCamelContext(camelContext);
		route70.setCamelContext(camelContext);
		route71.setCamelContext(camelContext);
		route72.setCamelContext(camelContext);
		route73.setCamelContext(camelContext);
		route74.setCamelContext(camelContext);
		route75.setCamelContext(camelContext);
		route76.setCamelContext(camelContext);
		route77.setCamelContext(camelContext);
		route78.setCamelContext(camelContext);
		route79.setCamelContext(camelContext);
		route80.setCamelContext(camelContext);
		route81.setCamelContext(camelContext);
		route82.setCamelContext(camelContext);
		route83.setCamelContext(camelContext);
		route84.setCamelContext(camelContext);
		route85.setCamelContext(camelContext);
		route86.setCamelContext(camelContext);
		route87.setCamelContext(camelContext);
		route88.setCamelContext(camelContext);
		route89.setCamelContext(camelContext);
		route90.setCamelContext(camelContext);
		route91.setCamelContext(camelContext);
		route92.setCamelContext(camelContext);
		route93.setCamelContext(camelContext);
		route94.setCamelContext(camelContext);
		route95.setCamelContext(camelContext);
		route96.setCamelContext(camelContext);
		route97.setCamelContext(camelContext);
		route98.setCamelContext(camelContext);
		route99.setCamelContext(camelContext);
		engine.specifyGlue(bipGlue);
		engine.start();
		engine.execute();
		Thread.sleep(100000);
	}
	
	private RoutePolicy createRoutePolicy(final BIPActor executor) {

		return  new RoutePolicy() {

			public void onInit(Route route) {
			}

			public void onExchangeDone(Route route, Exchange exchange) {

				executor.inform("end");
			}

			public void onExchangeBegin(Route route, Exchange exchange) {
			}

			@Override
			public void onRemove(Route arg0) {
			}

			@Override
			public void onResume(Route arg0) {
			}

			@Override
			public void onStart(Route arg0) {
			}

			@Override
			public void onStop(Route arg0) {
			}

			@Override
			public void onSuspend(Route arg0) {
			}
		};
	}
	
	@Test
	public void computeAverage() throws IOException {
		File file = new File("/home/mavridou/workspace/javaengineperformance/DataSwitchableRoutes/Time/eclipse/99+1");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		int count = 0;
		double sum = 0;
		bufferedReader.readLine();
		while ((line = bufferedReader.readLine()) != null) {
			sum += Integer.parseInt(line);
			count++;
		}
		if (count == 0)
			return;
		System.out.println(sum / count);
	}
	
}
