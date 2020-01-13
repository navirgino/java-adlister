import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/contacts/edit")
public class EditContactServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        if (req.getParameter("id") != null)
        {
            Contact contactToEdit = DaoFactory.getContactsDao()
                    .getContactById(Long.parseLong(req.getParameter("id"))
                    );
            req.setAttribute("contact", contactToEdit);
            req.getRequestDispatcher("/contacts/edit.jsp").forward(req, res);
        }
        else
        {
            res.sendRedirect("/contacts");
        }

    }
}
