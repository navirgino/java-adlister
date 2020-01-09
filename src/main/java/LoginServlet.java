import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
            req.getRequestDispatcher("/login.jsp").forward(req, res);
    }
    @Override
    protected  void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")){
            res.sendRedirect("./profile");
        }else{
            res.sendRedirect("./login.jsp");
        }
    }
}
