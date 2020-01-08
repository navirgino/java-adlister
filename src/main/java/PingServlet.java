import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="PingServlet", urlPatterns =  "/ping")
public class PingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("<form action= './pong' >" +
                "<input type='submit' value='PING!'>" +
                "\n</form>");
        res.setHeader("content-type", "text/html");

//        res.sendRedirect("/pong);

    }
}
