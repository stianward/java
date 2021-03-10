package test;
import aritmeta.*;
public class TestExcepciones {

    public static void main(String[] args) {

        int num = 0;
        try {
            num = Aritmetica.division(12, 0);
        } catch (Exception e) {

            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }

        System.out.println("" + num);

    }

}
