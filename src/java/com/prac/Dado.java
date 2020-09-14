
package com.prac;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Dado", urlPatterns = {"/Dado"})
public class Dado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Dado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Dado x </h1>");
            out.println("Juego de dados , gana el saque con los dados 7 u 11 , los demas pierden");
             out.println("<br><br>");
            out.println("<a href='javascript:location.reload()'>Lanzar los dados</a>");
            /*Dado 1*/
            int Li=1,Ls=6,posible,A;        
            double aleat;       
            posible=(Ls+1)-Li;
            aleat=Math.random()*posible;
            aleat=Math.floor(aleat);
            aleat=(Li+aleat);
            A=(int)aleat;
            out.println("<h3>Valor del primer dado__: "+ A+"</h3>");
            /*Dado 2*/
            int a=1,b=6,B;
            double valr;
            posible=(b+1)-a;
            aleat=Math.random()*posible;
            aleat=Math.floor(aleat);
            aleat=(a+aleat);
            B=(int)aleat;
            out.println("<h3>Valor del segundo dado__: "+B+"</h3>");
            
            out.println("<br>");
            int resultado;
            resultado = A+B;
            if(resultado == 7 || resultado ==11){
               
                out.println("Los resultados Sumados dan "+resultado+" GANASTE !!   :D");
            }
            else{
                out.println("Perdiste  :C  " );
            }
            
            out.println("</body>");
            out.println("</html>");
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
