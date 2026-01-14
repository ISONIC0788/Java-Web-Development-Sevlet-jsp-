package com.mycv;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class PersonalServlet extends HttpServlet  {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp ) throws ServletException , IOException {
      resp.setContentType("text/html"); // to tell browser are send html

        PrintWriter out = resp.getWriter(); //allow to write content to the browser
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Personal Info</title>");
        out.println("<link rel='stylesheet' href='css/style.css'>"); // Link the same CSS!
        out.println("</head>");
        out.println("<body>");

        // Shared Navigation Bar
        out.println("<nav>");
        out.println("<a href='index.html'>Home</a>");
        out.println("<a href='profile' class='active'>Personal Info</a>");
        out.println("<a href='education' >Education</a>");
        out.println("</nav>");

        // Page Specific Content
      // Page Specific Content
      out.println("<div class='container'>");
      out.println("<h1>About Me</h1>");

      out.println("<p><strong>Name:</strong> Ebedi Meleck</p>");
      out.println("<p><strong>Email:</strong> ebedimeleck@gmail.com</p>");
      out.println("<p><strong>Location:</strong> Rwanda</p>");

      out.println("<h2>Profile</h2>");
      out.println("<p>");
      out.println("I am an Information Technology student and a passionate Java developer ");
      out.println("with strong interest in backend and web application development. ");
      out.println("I enjoy building systems that solve real-world problems using Java technologies.");
      out.println("</p>");

      out.println("<h2>Technical Interests</h2>");
      out.println("<ul>");
      out.println("<li>Java Servlets & Web Applications</li>");
      out.println("<li>JDBC and Database Integration</li>");
      out.println("<li>RESTful APIs</li>");
      out.println("<li>Frontend basics: HTML, CSS, JavaScript</li>");
      out.println("</ul>");

      out.println("<h2>Career Goal</h2>");
      out.println("<p>");
      out.println("My goal is to become a skilled software engineer who builds reliable, ");
      out.println("secure, and scalable applications. I am continuously learning ");
      out.println("new technologies and improving my problem-solving skills.");
      out.println("</p>");

      out.println("</div>");

      out.println("</body>");
        out.println("</html>");

    }
}
