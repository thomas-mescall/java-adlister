import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String user = request.getParameter("user");
        String address = request.getParameter("address");
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String toppings = request.getParameter("toppings");

        System.out.println("Name: " + user);
        System.out.println("Delivery Adress: " + address);
        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + toppings);

        System.out.println("<h1> Pizza Time! </h1>");


        response.getWriter().println(user);
        response.getWriter().println(address);
        response.getWriter().println(crust);
        response.getWriter().println(sauce);
        response.getWriter().println(size);
        response.getWriter().println(toppings);

        response.getWriter().println("Pizza Time!");
    }

}

