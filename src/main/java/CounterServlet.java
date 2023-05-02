import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


    @WebServlet(name = "CounterServlet", urlPatterns = "/count")
    public class CounterServlet extends HttpServlet {
        private int count = 0;
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");
            String reset = request.getParameter("reset");
            PrintWriter out = response.getWriter();
            if (reset == null) {
                count++;
            } else {
                out.println("<html>" + "COUNT HAS BEEN RESET!!!" + "</html>");
                count = 0;
            }
            out.println("<html>" + count + "<html>");
        }
    }

