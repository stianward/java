package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet")
public class SesionesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession(); //OBJETO QUE OBTIENE LA SESION
        String titulo = null;

        //pedir atributo contrador visitas a la sesion
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");

        if (contadorVisitas == null) {
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        } else {
            contadorVisitas++;
            titulo = "Bienvenido de nuevo!";
        }
        //agregamos nuevo valor a la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //enviar respuesta al cliente
        PrintWriter out=response.getWriter();
        out.print("NO. accesos al recurso:"+contadorVisitas);
        out.print("Identificado sesion:"+sesion.getId());

    }
}
