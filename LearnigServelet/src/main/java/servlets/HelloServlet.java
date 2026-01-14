package servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "HelloServlet" , urlPatterns = "/hello")

public class HelloServlet  extends HttpServlet {
    protected void  doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
      System.out.println("The post request has been made  hello url");
    }

    protected  void  doGet(HttpServletRequest request , HttpServletResponse response) throws  ServletException , IOException {
       System.out.println("the Get request has been made on hello url");
       response.setContentType("text/html");   // allow to get response in plain text
       response.getWriter().println("<h1>Hello</h1>");
       response.getWriter().println("<p>welcome to my website </p>");
    }

}
