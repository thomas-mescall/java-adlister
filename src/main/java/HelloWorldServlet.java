import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

    @WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
    public class HelloWorldServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html");
            String name = request.getParameter("name");
            PrintWriter out = response.getWriter();

            if (name == null) {
                out.println("Why hello there...");
            } else {
                out.println("Why hello there..." + name);
            }
        }
    }
