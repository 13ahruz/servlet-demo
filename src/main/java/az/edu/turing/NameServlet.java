package az.edu.turing;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class NameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            resp.setContentType("text/plain");
            resp.setCharacterEncoding("UTF-8");
            String name = req.getParameter("Name");
            if (name == null) {
                name = "Java EE";
            }
            resp.getWriter().println("Hello, " + name);
        } catch (IOException e) {
            System.out.println("Error occurred in /greetings");
        }

    }
}
