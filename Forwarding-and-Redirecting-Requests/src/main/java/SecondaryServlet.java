import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "SecondaryServlet"  , urlPatterns = "/secondary")

public class SecondaryServlet extends HttpServlet {
    protected  void  doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {

    }


    protected  void  doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
              System.out.println("this request is passwd on /scondary url");
    }
}
