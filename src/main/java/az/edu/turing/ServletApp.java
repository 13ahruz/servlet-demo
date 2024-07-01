package az.edu.turing;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServletApp {
    public static void main(String[] args) {

        Server server = new Server(9000);
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.setContextPath("/");

        handler.addServlet(new ServletHolder(new HomePageServlet()), ("/"));
        handler.addServlet(new ServletHolder(new MeServlet()), ("/me"));
        handler.addServlet(new ServletHolder(new NameServlet()), ("/greetings"));

        server.setHandler(handler);

        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}