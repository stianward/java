package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset-UTF-8");

        //crear o recuperar el objeto http session
        HttpSession sesion = request.getSession();

        //recuperar lista de articulos previos
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //verficar si la lista de articulos exite
        if (articulos == null) {
            //inicializar la lista de articulos
            articulos = new ArrayList<>();
            //agregar lista a la sesion
            sesion.setAttribute("articulos", articulos);

        }
        //procesar el nuevo articulo
        String articulo = request.getParameter("articulo");

        //revisar articulo nuevo
        if (articulo != null && !articulo.trim().equals("")) {
            articulos.add(articulo);
        }
        
        //imprimir lista de articulos
        PrintWriter out=response.getWriter();
        out.print("lista articulos:");
        //iteramos todos los articulos
        for(String articulito:articulos){
            out.print("<li>"+articulito+"</li>");
        }
           //link regresar al inicio
           out.print("<a href='index.html'>REGRESAR</a>");
           out.close();
        
    }

}
