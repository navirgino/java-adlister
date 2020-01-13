import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {


        Object registeredUser = (request.getSession().getAttribute("isUser"));


        if(registeredUser != null)
        {
            if((boolean) registeredUser)
            {
                request.getSession().invalidate();

                response.sendRedirect("/login");
            }

        } else
            {
                response.sendRedirect("/login");
            }
    }

}
