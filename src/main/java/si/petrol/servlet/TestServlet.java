package si.petrol.servlet;

import si.petrol.spring.beans.MyBean;
import si.petrol.spring.config.ApplicationContextHolder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "/testServlet", urlPatterns = "/*")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if (req.getPathInfo().contains("/test-session-bean")) {
            MyBean myBean = ApplicationContextHolder.getContext().getBean(MyBean.class);
            if (myBean != null) {
                myBean.manageSessionBean();
            }
        }

    }
}
