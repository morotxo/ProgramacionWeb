/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletProducto;

import EJB.EJBProducto;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david13mo
 */
@WebServlet(name = "servletProductoUpdate", urlPatterns = {"/servletProductoUpdate"})
public class servletProductoUpdate extends HttpServlet {
    @EJB
    private EJBProducto ejbProducto;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if (request.getMethod().equals("GET")){
            out.println("1");
            ejbProducto=new EJBProducto();
            out.println("2");
            ejbProducto.getProducto().setIdProducto(Integer.valueOf(request.getParameter("id").trim()));
//            ejbProducto.getProducto().setIdProducto(1);
            out.println("3");
            ejbProducto.getByID();
            request.setAttribute("ejbProducto", ejbProducto);
            request.getRequestDispatcher("producto/update.jsp").forward(request, response);
        }
        if (request.getMethod().equals("POST")){
            out.println("1");
            ejbProducto=new EJBProducto();
            out.println("2");
            out.println(">>>>>>>>>>>>>>>>: "+request.getParameter("txtID"));
            out.println(">>>>>>>>>>>>>>>>: "+request.getParameter("txtdescripcion"));
            ejbProducto.getProducto().setIdProducto(Integer.valueOf(request.getParameter("txtID")));
//            ejbProducto.getProducto().setIdProducto(1));
            out.println("3");
            ejbProducto.getProducto().setDescripcion(request.getParameter("txtdescripcion"));
            out.println("4");
            ejbProducto.getProducto().setMarca(request.getParameter("txtmarca"));
            ejbProducto.getProducto().setCategoria();
            ejbProducto.getProducto().setPrecio(Double.parseDouble(request.getParameter("txtprecio")));
            ejbProducto.getProducto().setStock(Integer.valueOf(request.getParameter("txtstock")));
            boolean retorno=ejbProducto.update();
            request.setAttribute("resultado", retorno?"Correcto":"Incorrecto");
            request.getRequestDispatcher("producto/resultado.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
