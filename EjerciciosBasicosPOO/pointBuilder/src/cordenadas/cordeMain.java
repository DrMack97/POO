package cordenadas;

import java.util.Random;

public class cordeMain {

    //inicializar objecto:

    // object "name" = new object();
    public static void main(String[] args) {

        pointBuilder corde = new pointBuilder(5, 0);
        pointBuilder corde2 = new pointBuilder(10, 10);
        pointBuilder corde3 = new pointBuilder(-3,7);


        System.out.println(corde + " " + corde2 + " "+ corde3);
        System.out.println();

        System.out.println("Operaciones!!!");

        System.out.println("RESTA:");
        System.out.println();
        System.out.println(corde.resta(corde3));
        System.out.println();
        System.out.println("SUMA: ");
        System.out.println(corde.suma(corde2));
        System.out.println();
        System.out.println("Multiplicacion");
        System.out.println(corde.multiplicacion(20));
        System.out.println();
        System.out.println("division ");
        System.out.println(corde.division(2));
        System.out.println();
        System.out.println("Distancia");
        System.out.println(corde.distancia(corde3));
        System.out.println();
        System.out.println("equals");
        System.out.println(corde.equals(corde2));
        System.out.println();
        System.out.println("mayorQUE");
        System.out.println(corde.mayorQue(corde2));
        System.out.println();
        System.err.println("menorQue");
        System.out.println(corde.menorQue(corde3));

        

        System.out.println("division interactiva");
        corde.dividerInteractive();
        System.out.println(corde.dividerInteractive());

        System.out.println(creaPuntoAleatorio());
    }

    public static pointBuilder creaPuntoAleatorio(){
        Random rnd = new Random();

        return new pointBuilder(rnd.nextInt(0, 99)+ 1, rnd.nextInt(0, 99)+1);
    }
}
