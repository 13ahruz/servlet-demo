package az.edu.turing;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try{
            resp.setContentType("text/plane");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().println("Name Surname");
        }catch (IOException e){
            System.out.println("Error occurred in /me");
        }

    }
}
