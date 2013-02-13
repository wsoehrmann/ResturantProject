/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.ResturantModel;

/**
 *
 * @author Wesley
 */
@WebServlet(name = "OrderController", urlPatterns = {"/OrderController"})
public class OrderController extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        
        
        
        PrintWriter out = response.getWriter();
        Double sItem1 = Double.parseDouble(request.getParameter("menuitem1"));
        Double sItem2 = Double.parseDouble(request.getParameter("menuitem2"));
        Double sItem3 = Double.parseDouble(request.getParameter("menuitem3"));
        Double sItem4 = Double.parseDouble(request.getParameter("menuitem4"));
        Double sItem5 = Double.parseDouble(request.getParameter("menuitem5"));
        String strTotal = "";
        String strTotalWithTip = "";
        String strTotalWithTax = "";


        try {
            ResturantModel order = new ResturantModel();
            order.setMenuItem1(sItem1);
            order.setMenuItem2(sItem2);
            order.setMenuItem3(sItem3);
            order.setMenuItem4(sItem4);
            order.setMenuItem5(sItem5);

            strTotal = "" + order.getTotalBeforeTax();
            strTotalWithTip = "" + order.getTip();
            strTotalWithTax = "" + order.getTotalAfterTax();

        } catch (NumberFormatException nfe) {
            strTotal = "Sorry must order from the menu";
        }
            String destination = "/menu.jsp";
            request.setAttribute("Total", strTotal);
            request.setAttribute("TotalWithTip", strTotalWithTip);
            request.setAttribute("TotalWithTax", strTotalWithTax);
            RequestDispatcher view =
                    request.getRequestDispatcher(destination);
            view.forward(request, response);
        
    }
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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

