package Controller;

import bin.Product;
import bin.User;
import entity.ProductEntity;
import entity.RegisterEntity;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "CT_AddProduct", urlPatterns = "/CT_AddProduct")
public class CT_AddProduct extends HttpServlet {
    private String insert_or_edit ="/admin/products.jsp";
    private String product ="/admin/indexAdmin.jsp";
    private ProductEntity dao;

    public CT_AddProduct() throws SQLException ,ClassNotFoundException{
        super();
        dao = new ProductEntity();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        //demo_template
    }
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


      PrintWriter out = response.getWriter();
    try {
        String name = request.getParameter("name");
        String img =request.getParameter("img");
        Product pro = new Product(1111,name,img,"aaaaa",222,222,"121313");
//        pro.setName(request.getParameter("name"));
//        pro.setImg(request.getParameter("img"));
//        pro.setBrand(request.getParameter("brand"));
//        pro.setPrice(Long.parseLong(request.getParameter("price")));
//        pro.setCompare_price(Long.parseLong(request.getParameter("pricesale")));
//        pro.setSale(request.getParameter("sale"));
        if( pro.getName()!=null ) {
            ProductEntity.addone(pro);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/CT_products");
            dispatcher.forward(request,response);
        }else {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/admin/product_add.jsp");
            dispatcher.forward(request,response);
        }
    }finally {
        out.close();
    }




    }
}
