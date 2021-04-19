package domain;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        
        if(name.equals("pepe") && password.equals("123")){
            PrintWriter out=response.getWriter();
            out.print("<h1>BIENVENIDO </h1>"+name);
        }else{
            response.sendError(response.SC_UNAUTHORIZED,"las credenciales son invalidas!");
        }
        
    }
    
}
