import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/rejected.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        String sessionCode = (String) req.getSession().getAttribute("access_code");
        String requestCode = (String) req.getParameter("code");
        if (sessionCode == null || requestCode == null)
        {
            req.getRequestDispatcher("/WEB-INF/rejected.jsp").forward(req, res);
            return;
        }

        if (requestCode.equals(sessionCode))
        {
            req.getRequestDispatcher("/WEB-INF/admin.jsp").forward(req, res);
        } else
        {
            req.getRequestDispatcher("/WEB-INF/rejected.jsp").forward(req, res);
        }

    }
}
