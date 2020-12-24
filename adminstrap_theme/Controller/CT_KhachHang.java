package Controller;

import bin.Customer;
import bin.Product;
import entity.CustomerEntity;
import entity.ProductEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "CT_KhachHang", urlPatterns = "/CT_KhachHang")
public class CT_KhachHang extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        //demo_template
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Collection<Customer> values = new CustomerEntity().getAll();
           request.setAttribute("list",values);
        request.getRequestDispatcher("admin/khachhang.jsp").forward(request,response);
    }
}
