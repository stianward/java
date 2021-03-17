package manejoArchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {

        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            /*CREA EL OBJETO ARCHIVO*/
            salida = new PrintWriter(archivo);
            /*ABRE EL ARCHIVO*/
            System.out.println("ARCHIVO CREADO");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getStackTrace());

        } finally {
            salida.close();
        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {

        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            /*CREA EL OBJETO ARCHIVO*/
            salida = new PrintWriter(archivo);
            /*ABRE EL ARCHIVO*/
            salida.println(contenido);
            System.out.println("ARCHIVO CREADO");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getStackTrace());

        } finally {
            salida.close();
        }
    }

    public static void anexarInformacion(String nombreArchivo, String contenido) {
        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            /*CREA EL OBJETO ARCHIVO*/
            salida = new PrintWriter(new FileWriter(archivo, true));
            /*ABRE EL ARCHIVO*/
            salida.println(contenido);
            System.out.println("ARCHIVO CREADO");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getStackTrace());

        } catch (IOException ex) {
            System.out.println(ex.getStackTrace());
        } finally {
            salida.close();
        }

    }
    public static void leerArchivo(String nombreArchivo){
    File archivo=new File(nombreArchivo);
    
        try {
            BufferedReader entrada=new BufferedReader(new FileReader(archivo)); /*buffered lee lineas completas*/
            String lectura=entrada.readLine();
            while(lectura!=null){ /*LEER MIENTRAS NO HAYAN LINEAS EN BLANCO*/
                System.out.println("lectura="+lectura);
                lectura=entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
