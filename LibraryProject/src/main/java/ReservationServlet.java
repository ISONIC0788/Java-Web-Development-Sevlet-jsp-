import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.servlet.ServletException;            // UPDATED
import jakarta.servlet.annotation.WebServlet;       // UPDATED
import jakarta.servlet.http.HttpServlet;            // UPDATED
import jakarta.servlet.http.HttpServletRequest;     // UPDATED
import jakarta.servlet.http.HttpServletResponse;    // UPDATED
import jakarta.servlet.http.HttpSession;            // UPDATED
import jakarta.servlet.RequestDispatcher;           // UPDATED

@WebServlet("/reserve")
public class ReservationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        if (session != null) {
            String book = request.getParameter("book_name");

            List<String> myBooks = (List<String>) session.getAttribute("my_books");
            if(myBooks == null) {
                myBooks = new ArrayList<>();
            }

            myBooks.add(book);
            session.setAttribute("my_books", myBooks);

            RequestDispatcher rd = request.getRequestDispatcher("status");
            rd.forward(request, response);
        } else {
            response.sendRedirect("login.html");
        }
    }
}