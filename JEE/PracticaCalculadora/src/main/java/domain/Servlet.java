package domain;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
     int num1,num2,res;
     PrintWriter out;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        out=response.getWriter();
                
        this.num1=Integer.parseInt(request.getParameter("numero1")) ;
        this.num2=Integer.parseInt(request.getParameter("numero2"));
        out.print("<h1>");
        out.print(this.res=this.num1+this.num2);
        out.print("</h1>");
        if(this.res>10){
            out.print("<H1>NUMERO MAYOR A 10</H1>");
        }else{
            response.sendError(response.SC_CONFLICT,"LO SENTIMOS EL VALOR ES MENOR");
            
        }
        
    }
    

    
    
}
