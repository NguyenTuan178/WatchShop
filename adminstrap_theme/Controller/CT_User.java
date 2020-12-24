package Controller;

import bin.Customer;
import bin.User;
import entity.CustomerEntity;
import entity.UserEntyti;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

@WebServlet(name = "CT_User", urlPatterns = "/CT_User")
public class CT_User extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        //demo_template
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Collection<User> values = new UserEntyti().getAll();
        request.setAttribute("list",values);
        request.getRequestDispatcher("admin/user.jsp").forward(request,response);
    }
}
