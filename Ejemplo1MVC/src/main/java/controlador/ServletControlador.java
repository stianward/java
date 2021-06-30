package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        /*PROCESAMOS PARAMETROS DE LA VISTA*/
        
        
        /* CREAMOS JAVABEAN*/
        Rectangulo rectangulo=new Rectangulo(2,3);
        
        /*AGREGAMOS EL JAVABEAN EN ALGUN ALCANCE
        -->REQUEST(*)
        -->SESSION(*)
        -->APPLICATION
        */
        
        /*COMPARTIR INFORMACION EN EL ALCANCE*/
        
        
        /*ALCANCE REQUEST*/
        request.setAttribute("mensaje","saludos desde el servlet");
        
        
        /*COMPARTIMOS LA VARIABLE - LLAVE VALOR ALCANCE SESSION*/      
        HttpSession sesion=request.getSession();
        sesion.setAttribute("rectangulo", rectangulo);
        
        
        /*REDIRECCIONAR A LA VISTA SELECCIONADA*/
        RequestDispatcher rd=request.getRequestDispatcher("vista/desplegarVariables.jsp");
        /*PROPAGAMOS LOS OBETOS REQUEST Y RESPONSE AL JSP, ES DECIR RECUPERARÀ LA INFORMACIÓN COMPARTIDA DE CADA ALCANCE*/
        rd.forward(request, response);
        
    }
    
}
