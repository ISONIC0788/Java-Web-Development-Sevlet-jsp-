import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;            // UPDATED
import jakarta.servlet.annotation.WebServlet;       // UPDATED
import jakarta.servlet.http.HttpServlet;            // UPDATED
import jakarta.servlet.http.HttpServletRequest;     // UPDATED
import jakarta.servlet.http.HttpServletResponse;    // UPDATED

@WebServlet("/status")
public class StatusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String book = request.getParameter("book_name");

        out.println("<html><body><div align='center'>");
        out.println("<h2>Reservation Successful!</h2>");
        out.println("<p>You have successfully reserved: <b>" + book + "</b></p>");
        out.println("<hr>");
        out.println("<a href='history'>View My Reservation History</a>");
        out.println("</div></body></html>");
    }
}