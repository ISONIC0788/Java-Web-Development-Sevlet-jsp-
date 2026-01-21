import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/history")
public class HistoryServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);

        out.println("<html><body><div align='center'>");

        if (session != null) {
            String user = (String) session.getAttribute("user");
            List<String> books = (List<String>) session.getAttribute("my_books");

            out.println("<h2>History for Student: " + user + "</h2>");
            out.println("<table border='1' width='50%'>");
            out.println("<tr><th>Book Title</th></tr>");

            if (books != null) {
                for (String b : books) {
                    out.println("<tr><td>" + b + "</td></tr>");
                }
            } else {
                out.println("<tr><td>No books reserved yet.</td></tr>");
            }
            out.println("</table>");
            out.println("<br><a href='reserve_book.html'>Reserve Another Book</a>");
        } else {
            out.println("<h3>Please login first.</h3>");
            out.println("<a href='login.html'>Go to Login</a>");
        }

        out.println("</div></body></html>");
    }}