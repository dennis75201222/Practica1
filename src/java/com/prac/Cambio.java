
package com.prac;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Cambio", urlPatterns = {"/Cambio"})
public class Cambio extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>");
            out.println("<body>");
            out.println("<head>");
            out.println("<title>Servlet Cambio</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cambio de moneda</h1>");
            out.println("<br>");
            out.println("<h3>Ingrese la moneda que desea Cambiar</h3>");
            out.println("<form action='' method='post'>");
            out.println("Ingrese la moneda en bs:");
            out.println("<input type='number' name='boli' required>");
            out.println("<br><br>");
            out.println("Ingrese la moneda en $:");
            out.println("<input type='number' name='dolar' required>");
            out.println("<br><br>");
            out.println("<input type=submit value='Cambiar moneda'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
           
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer boli = Integer.valueOf(request.getParameter("boli"));
        Integer dolar = Integer.valueOf(request.getParameter("dolar"));
        double result1 = 0.14430;
        double result2 = 6.905;
        response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<head>");
            out.println("<title>Servlet Cambio</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cambio de moneda</h1>");
            out.println("<br><br><br><br>");
            
            result1 = boli*result1;
            result2 = dolar*result2;
            
            if(dolar != null || boli!=null){
                
                
                out.println("El cambio de "+dolar+" Dolares a Boliviano es igual a "+result2+" Bolivianos");
                out.println("<br><br>");
                
                out.println("El cambio de "+boli+" Bolivianos a Dolares es igual a "+result1+" Dolares");
            }
            else{
                
            }
               
            out.println("</body>");
            out.println("</html>");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
