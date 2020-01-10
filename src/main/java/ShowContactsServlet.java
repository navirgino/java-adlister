import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/contacts")

public class ShowContactsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        //Use the factory to get the dao object
        Contacts contactsDao = DaoFactory.getContactsDao();

        //use a method on the dao to get all the products
        List<Contact> contacts = contactsDao.all();

        //pass data to the jsp
        req.setAttribute("contacts", contacts);
        req.getRequestDispatcher("/contacts/index.jsp").forward(req, res);
    }
}
