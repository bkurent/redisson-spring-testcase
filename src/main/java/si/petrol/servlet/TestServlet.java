package si.petrol.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import si.petrol.spring.beans.MyBean;

@WebServlet(name = "/testServlet", urlPatterns = "/*")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if (req.getPathInfo().contains("/test-session-bean")) {
            WebApplicationContext application = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
            MyBean testSessionBean = application.getBean(MyBean.class);
            testSessionBean.manageSessionBean();
        }

    }
}
