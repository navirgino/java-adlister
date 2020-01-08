import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "OrderFormServlet", urlPatterns = "/order-form")
public class OrderFormServlet extends HttpServlet {

    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println(
                "<form action= './order-summary' method='POST'>\n" +
                "  Name of Product:<br>\n" +
                "  <input type=\"text\" name=\"order\"><br>\n" +
                "  How many?<br>\n" +
                "  <input type=\"text\" name=\"amount\">\n" +
                        "<input type='submit' value='Submit'>" +
                        "</form>");
        res.setHeader("content-type", "text/html");

    }
}
