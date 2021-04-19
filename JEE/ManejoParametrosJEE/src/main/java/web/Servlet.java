package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 @WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
    //leer parametros formulario HTML
    
    String usuario=request.getParameter("usuario");
    String clave=request.getParameter("clave");
    
        System.out.println("usuario = " + usuario);
        System.out.println("clave = " + clave);
        
        //imprime para
        PrintWriter out =response.getWriter();
        out.print("<html><body><h1>el parametro usuario es: "+usuario+"</h1>");
        out.println("<h1>El password es: "+clave+"</h1></body></html>");
        out.close();
        
    }
   
    
}
