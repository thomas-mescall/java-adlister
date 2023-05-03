import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ColorPickServlet", urlPatterns = "/pick-color")
public class ColorPickServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pick-color.jsp").forward(request, response);
//        String colorPicked = request.getParameter("colorPicked");
    }




//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String colorPicked = request.getParameter("colorPicked");
//
//        String redirect = "/view-color?color=" + colorPicked;
//        response.sendRedirect(redirect);
//    }
}