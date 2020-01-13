import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")

public class ViewProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        Object registeredUser = (request.getSession().getAttribute("isUser"));

        if  (registeredUser != null)
        {
            if((boolean) registeredUser)
            {
                request.getRequestDispatcher("/profile.jsp").forward(request, response);
                response.sendRedirect("/profile");
                request.getSession().invalidate();

            }

        }else
        {
            response.sendRedirect("/login");

        }
//        request.getRequestDispatcher("")
    }
}
