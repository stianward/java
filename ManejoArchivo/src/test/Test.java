package test;

import manejoArchivos.ManejoArchivos;
import static manejoArchivos.ManejoArchivos.crearArchivo;





public class Test {
    public static void main(String[] args) {
        String archivo="prueba.txt";
        String contenido="HOLA SOY UN ARCHIVO DE JAVA";
      //  crearArchivo(archivo);
      //  ManejoArchivos.escribirArchivo(archivo, contenido);
        ManejoArchivos.anexarInformacion(archivo, "ANEXADO grandisooooo amigo!");
        ManejoArchivos.leerArchivo(archivo);
    }
}
