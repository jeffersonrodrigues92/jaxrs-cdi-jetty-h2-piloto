package com.transfer.revolut;

import java.util.Date;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.message.internal.XmlJaxbElementProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.transfer.revolut.entity.User;

public class AppMain {

	@SuppressWarnings({ "deprecation" })
	private static SessionFactory buildSessionFactory(Class clazz) {
		return new Configuration().configure().addAnnotatedClass(clazz).buildSessionFactory();
	} 

	public static void main(String[] args) throws Exception {
		// Create JAX-RS application.
		final ResourceConfig application = new ResourceConfig()
				.packages("com.transfer.revolut")
				.register(new AppBinder());


		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");

		Server jettyServer = new Server(8080);
		jettyServer.setHandler(context);

		ServletHolder jerseyServlet = new ServletHolder(new	org.glassfish.jersey.servlet.ServletContainer(application));
		jerseyServlet.setInitOrder(0);
		context.addServlet(jerseyServlet, "/*");

		try {
			jettyServer.start();
			jettyServer.join();

		} finally {
			jettyServer.destroy();
		}

//		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
//		context.setContextPath("/");
//
//		Server jettyServer = new Server(8080);
//		jettyServer.setHandler(context);
//
//		ServletHolder jerseyServlet = new ServletHolder(new	org.glassfish.jersey.servlet.ServletContainer(application));
//		jerseyServlet.setInitOrder(0);
//
//		context.addServlet(jerseyServlet, "/*");
//
//		// ... removed property (init-param) to compile.
//
//		try {
//			jettyServer.start();
//			jettyServer.join();
//		} catch (Exception e) {
//			System.out.println("Could not start server");
//			e.printStackTrace();
//		} finally {
//			jettyServer.destroy();
//		}

	}
}