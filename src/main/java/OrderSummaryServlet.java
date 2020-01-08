import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name="OrderSummaryServlet", urlPatterns = "/order-summary")
public class OrderSummaryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{

        String order = req.getParameter("order");
        String amount = req.getParameter("amount");
        PrintWriter out = res.getWriter();
        out.println("You ordered " + amount + " units of " + order);
        res.setHeader("content-type", "text/html");
    }
}
