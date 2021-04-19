package web;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        //uso profeisonal POI.APACHE.ORG
        
        //PARA QUE EL NAVEGADOr NO GUARDE INFORMACION VIEJA-CACHE.
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Canche-Control", "no-store");
        response.setDateHeader("Expires", -1);
        
        PrintWriter out=response.getWriter();
        out.println("\t Valores");
        out.println("\t1");
        out.println("\t2");
        out.println("total\t=CONCAT(B2:B3)");
        out.close();
        
    }
}
