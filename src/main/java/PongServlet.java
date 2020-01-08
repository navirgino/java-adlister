import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name="PongServlet", urlPatterns =  "/pong")
public class PongServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println("<form action= './ping' >" +
                "<input type='submit' value='PONG!'>" +
                "\n</form>");
        res.setHeader("content-type", "text/html");

//        res.sendRedirect("/ping");

    }
}
