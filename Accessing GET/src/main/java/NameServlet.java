import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name= "NameServlet"  , urlPatterns = "/name")

public class NameServlet extends HttpServlet {
    protected  void  doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException , IOException {

    }

    protected void  doGet(HttpServletRequest request , HttpServletResponse response)throws  ServletException , IOException{
//        getServletContext().getRequestDispatcher("/index2.html").forward(request , response);
           String firstname = request.getParameter("fname");
           String lastname = request.getParameter("lname");
           int  age  = Integer.parseInt(request.getParameter("age"));

           StringBuilder error = new StringBuilder();  // for all errors i will ricive

//           if (firstname == null || lastname == null){
//        System.out.println("Full name was not provide ");
//
//           }else {
//               System.out.println("Hello "+ firstname + " "+ lastname + ",nice to meet you ");
//           }

        if(firstname == null || firstname.trim().isEmpty()){
            error.append("A first name was not provided");
        }else if (lastname == null || lastname.trim().isEmpty()){
            error.append("A lst name was not provided");
        }else  if(age==0 ){
            error.append(" age was not provide ");
        }


        if(error.length()> 0 ){
            request.setAttribute("error", error.toString());
            request.setAttribute("firstname", firstname);
            request.setAttribute("lastname" , lastname);
            request.setAttribute("age" , age);
        }

        getServletContext().getRequestDispatcher("/name.jsp").forward(request , response);
    }
}
