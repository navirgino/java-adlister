import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    private int hitCount;

    public void init(){
        hitCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {



//        res.sendRedirect("/hello");



        String name = req.getParameter("name");

        if(name == null || name.equalsIgnoreCase(" ")) {
            PrintWriter out = res.getWriter();
            out.println("<h1>Hello, World!</h1>"+ hitCount);
            res.setContentType("text/html");
            hitCount++;

        }else if(name.equalsIgnoreCase("reset")){
            PrintWriter out = res.getWriter();
            out.println("<h1>Hello, World</h1>" + hitCount);
            res.setContentType("text/html");
            hitCount = 0;

        }else {
            res.setContentType("text/html");
            hitCount++;
            PrintWriter out = res.getWriter();
            out.println("<h1>Hello, " + name + "</h1>" + hitCount);

        }




    }
}
