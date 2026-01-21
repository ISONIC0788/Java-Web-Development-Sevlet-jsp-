import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;            // UPDATED
import jakarta.servlet.annotation.WebServlet;       // UPDATED
import jakarta.servlet.http.HttpServlet;            // UPDATED
import jakarta.servlet.http.HttpServletRequest;     // UPDATED
import jakarta.servlet.http.HttpServletResponse;    // UPDATED
import jakarta.servlet.http.HttpSession;            // UPDATED
import jakarta.servlet.RequestDispatcher;           // UPDATED

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String pass = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(pass.equals("123")) {
            HttpSession session = request.getSession();
            session.setAttribute("user", name);
            response.sendRedirect("reserve_book.html");
        } else {
            out.print("<h3 style='color:red; text-align:center'>Sorry, username or password error!</h3>");
            RequestDispatcher rd = request.getRequestDispatcher("login.html");
            rd.include(request, response);
        }
    }
}