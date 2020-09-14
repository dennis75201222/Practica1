
package com.prac;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Edad", urlPatterns = {"/Edad"})
public class Edad extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
             out.println("<html>");
            out.println("<body>");
            out.println("<head>");
            out.println("<title>Servlet LeeParametros POST(Formulario)</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Lee Parametros</h1>");
            out.println("<br><br>");
            out.println("<form action='' method='post'>");
            out.println("Nombre:");
            out.println("<input type='text' name='nombre' required>");
            out.println("<br>");
            out.println("Año de nacimiento:");
            out.println("<input type='number' name='anio' required>");
            out.println("<br>");
            out.println("<input type=submit value='Calcular la edad del sujeto'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
   


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String nombre = request.getParameter("nombre");
            Integer anio = Integer.valueOf(request.getParameter("anio"));
            int result=2020;
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.println("<head>");
            out.println("<title>Servlet LeeParametros</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<br><br><br><br>");
                if(nombre != null || anio != null){
                    if(anio<=2020){
                        result = result - anio;
                        out.println("<h3>El sujeto "+ nombre +" tiene la edad de "+result+" años<br></h3>");
                    }
                    else{
                        out.println("Aun no nacio el sujeto xD");
                    }
                }
                else{
                   out.println("No ingreso ningun dato"); 
                }
                
            out.println("</body>");
            out.println("</html>");
    }


   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
