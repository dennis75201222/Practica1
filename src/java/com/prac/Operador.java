
package com.prac;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Operador", urlPatterns = {"/Operador"})
public class Operador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Operador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet  Operaciones</h1>");
            out.println("<form action='' method='post'>");
            out.println("<h3>Ingrese dos numero mas el operador que desea realizar </h3>");
            out.println("<input type='number' name='primero'>");
            
            out.println("<select name='ope'>");
                out.println("<option value='suma'>Sumar</option>");
                out.println("<option value='resta'>Restar</option>");
                out.println("<option value='multiplicar'>Multiplicar</option>");
                out.println("<option value='divicion'>Dividir</option>");
            out.println("</select>");   
                
            out.println("<input type='number' name='segundo'>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Integer primero = Integer.valueOf(request.getParameter("primero"));
        Integer segundo = Integer.valueOf(request.getParameter("segundo"));
        String valor = request.getParameter("ope");
        int resultado;
        double resultado1;
        out.println("<html>");
            out.println("<body>");
            out.println("<head>");
            out.println("<title>Servlet Operador</title>"); 
            out.println("</head>");
            out.println("<body>");
            out.println("<br><br><br><br>");
                if(primero != null || segundo != null){
                    out.println("<h3>Usted quiere "+valor+"</h3>");
                    if("suma".equals(valor)){
                        resultado = primero+segundo;
                        out.println("La suma de los numero es igual a "+resultado);
                    }
                    if("resta".equals(valor)){
                        resultado = primero-segundo;
                        out.println("La resta de los numero es igual a "+resultado);
                    }
                    if("multiplicar".equals(valor)){
                        resultado = primero*segundo;
                        out.println("La multiplicacion de los numero es igual a "+resultado);
                    }
                    if("divicion".equals(valor)){
                        resultado1 = primero/segundo;
                        out.println("La divicion de los numero es igual a "+resultado1);
                    }
                }
                
            out.println("</body>");
            out.println("</html>");
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
