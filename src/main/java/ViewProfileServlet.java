import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {

    HttpSession session;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);

//        String username = (String)session.getAttribute("user");
//        request.setAttribute("username", username);

        String logout = request.getParameter("logout");
        boolean exit = logout.equals("true");
        if(exit) {
            request.getRequestDispatcher("../logout.jsp").forward(request, response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(session != null) {
            session.invalidate();
        }
        request.getRequestDispatcher("../logout.jsp").forward(request, response);

    }
}
