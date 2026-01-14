import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.rmi.ServerException;

public class XMLServlet extends HttpServlet {
    protected void  doPost(HttpServletRequest request , HttpServletResponse response)throws ServerException, IOException {

    }

    protected  void  doGet(HttpServletRequest request , HttpServletResponse response) throws  ServerException , IOException{
        System.out.println("Get called on XML SERVERLET");
    }
}
