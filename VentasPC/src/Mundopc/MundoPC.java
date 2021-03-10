package Mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPC {

    public static void main(String[] args) {
        Monitor monitor = new Monitor("samsung", 15.6);
        Monitor monitor2 = new Monitor("JANUS", 15.6);
        Teclado teclado = new Teclado("usb", "coolermaster");
        Teclado teclado2 = new Teclado("usb", "JANUS");
        Raton raton = new Raton("usb", "genius");
        Raton raton2 = new Raton("usb", "microsoft");
        Computadora computadora = new Computadora("ASUS", monitor, teclado, raton);
        Computadora computadora2 = new Computadora("SURFACE", monitor2, teclado2, raton2);

        Orden orden = new Orden();
        orden.agregarComputadora(computadora);
        orden.agregarComputadora(computadora2);
        orden.mostrarOrden();

    }

}
