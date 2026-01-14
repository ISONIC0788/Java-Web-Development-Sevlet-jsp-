import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.rmi.ServerException;

@WebServlet(name = "AnnotatedServlet"  , urlPatterns = {"/Kody", "/chees" , "/kody/simpson"})

public class AnnotatedServlet  extends HttpServlet {
    protected void  doPost(HttpServletRequest request , HttpServletResponse response)throws ServerException , IOException {

    }

    protected  void  doGet(HttpServletRequest request , HttpServletResponse response) throws  ServerException , IOException{
          System.out.println("GET POST HAVE BE SEND");
    }


}
