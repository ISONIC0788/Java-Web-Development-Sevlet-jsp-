package com.mycv;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EducationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Education & Skills</title>");
        out.println("<link rel='stylesheet' href='css/style.css'>");
        out.println("</head>");
        out.println("<body>");

        // Shared Navigation Bar
        out.println("<nav>");
        out.println("<a href='index.html'>Home</a>");
        out.println("<a href='profile'>Personal Info</a>");
        out.println("<a href='education' class='active'>Education</a>");
        out.println("</nav>");

        // Page Specific Content
        out.println("<div class='container'>");
        out.println("<h1>Education & Skills</h1>");

        out.println("<h3>Education</h3>");

// Secondary School
        out.println("<h4>Secondary Education</h4>");
        out.println("<p><strong>School:</strong> APEKI Tumba</p>");
        out.println("<p><strong>Program:</strong> TVET - Software Development</p>");
        out.println("<p><strong>Level:</strong> Advanced Diploma</p>");

// College
        out.println("<h4>College Education</h4>");
        out.println("<p><strong>College:</strong> Rwanda Polytechnic (RP) - Karongi College</p>");
        out.println("<p><strong>Program:</strong> Information Technology</p>");
        out.println("<p><strong>Current Level:</strong> Year 2</p>");

        out.println("<hr>"); // separator

// Skills
        out.println("<h3>Technical Skills</h3>");
        out.println("<ul>");
        out.println("<li>Java SE, Java Servlets, JDBC</li>");
        out.println("<li>HTML5, CSS3, JavaScript</li>");
        out.println("<li>React & Node.js (Basic)</li>");
        out.println("<li>MySQL & Database Design</li>");
        out.println("<li>Git & GitHub</li>");
        out.println("</ul>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}