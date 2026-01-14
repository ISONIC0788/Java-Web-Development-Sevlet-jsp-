import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet (name = "PresidentServlet" , urlPatterns = "/president")
public class PresidentServlet extends HttpServlet {
    protected void  doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {

    }

    protected  void  doGet(HttpServletRequest request , HttpServletResponse response) throws  ServletException , IOException{

//        getServletContext().getRequestDispatcher("/secondary").forward(request, response); // here allow to load th jsp page
        response.sendRedirect("https://dzone.com/deployment");

    }
}
