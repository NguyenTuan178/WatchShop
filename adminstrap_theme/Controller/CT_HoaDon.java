package Controller;

import bin.Customer;
import bin.HoaDon;
import entity.CustomerEntity;
import entity.HoaDonEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "CT_HoaDon", urlPatterns = "/CT_HoaDon")
public class CT_HoaDon extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        //demo_template
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Collection<HoaDon> values = new HoaDonEntity().getAll();
        request.setAttribute("list",values);
        request.getRequestDispatcher("admin/hoadon.jsp").forward(request,response);

    }
}
