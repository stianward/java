package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset-UTF-8");
        PrintWriter out=response.getWriter();
        String usuario=request.getParameter("usuario");
        String password=request.getParameter("password");
        String tecnologias[]=request.getParameterValues("tecnologia");
        String genero=request.getParameter("genero");
        String ocupacion=request.getParameter("ocupacion");
        String musica[]=request.getParameterValues("musica");
        String comentario=request.getParameter("comentarios");
        
        out.print("<h1>BIENVENIDO!: "+usuario+"</h1>");
        out.print("las tecnologias escogidas son: ");
        for(String tecnologia:tecnologias){
            out.print(tecnologia);
            out.print(" / ");
        }
        
        out.print("ERES UN(A): "+genero);
        out.print("TE DEDICAS A: "+ocupacion);
     
        
    }
    
    
}
