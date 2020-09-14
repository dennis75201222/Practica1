
package com.prac;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Matriz", urlPatterns = {"/Matriz"})
public class Matriz extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Matriz</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Matriz at " + request.getContextPath() + "</h1>");
            
            out.println("<form action='' method='post'>");
                out.println("Ingrese el tamaño de la matriz mxn = ");
                out.println("<input type='text' name='tama'>");
                out.println("<input type='submit' value='Generar matriz'>");
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
            
            Integer n = Integer.valueOf(request.getParameter("tama"));
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Matriz</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Matriz at " + request.getContextPath() + "</h1>");       
            out.println("El taamaño es de "+n);
            out.println("<br>");
            
             int [][] matriz = new int[100][100];
            int inicio=1;
            int limite=n;
            int c=1;
            
            while(c<=(n*n)){
                for(int i= inicio ; i<=limite ; i++){
                    matriz[inicio][i]=c++;
                }
                for(int i= inicio+1 ; i<=limite ; i++){
                    matriz[i][limite]=c++;
                }
                for(int i= limite-1 ; i>=inicio ; i--){
                    matriz[limite][i]=c++;
                }
                for(int i= limite-1 ; i<=inicio+1 ; i--){
                    matriz[i][inicio]=c++;
                }
                inicio = inicio+1;
                limite = limite-1;
            }
            
            for(int i=1;i<=n;i++){
                
                    for(int j=1;i<=n;i++){
                     out.println(matriz[i][j]+"\t");
                }
                    out.println("<br>");
            }
            
            
            
            
            
            out.println("</body>");
            out.println("</html>");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
