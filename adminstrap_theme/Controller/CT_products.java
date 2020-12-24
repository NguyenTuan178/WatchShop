package Controller;

import bin.Product;
import bin.User;
import entity.ProductEntity;
import entity.UserEntyti;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "CT_products", urlPatterns = "/CT_products")
public class CT_products extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        //demo_template
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Collection<Product> values = new ProductEntity().getAll();
        request.setAttribute("list",values);
        request.getRequestDispatcher("admin/products.jsp").forward(request,response);
    }
}
