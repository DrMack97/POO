package arrayssss;

import java.util.Arrays;
import java.util.Random;

public class mainPrueba {
    public static void main(String[] args) {
        Random rng = new Random();
        

        int[] listaRandom = new int[100];
        int veces = 0;
        for (int i = 0; i < listaRandom.length; i++) {
            int relleno = rng.nextInt(0, 10)+1;
            listaRandom[i] = relleno;
            if (listaRandom[i] == 10) {
                veces++;
                System.out.println(10 + " esta en " + (i+1) + " " + veces+ " veces");
            }
        }
        mostrarLista(listaRandom);


        //9. crear arrays gemelas pero una inversa
        int bueno [] = new int[100];

        for (int i = 0; i < bueno.length; i++) {
            bueno[i] = i +1;
        }

        int[] malo = Arrays.copyOf(bueno, bueno.length);

        for (int i = 0; i < malo.length/2; i++) {   //paso 1 configurar el bucle para recorrer la MITAD
            int temp = malo[i];                     //paso 2 guardar temporalmente el valor actual
            malo[i] = malo[malo.length - 1 - i];   //paso 3 mover el valor opuesto a la posicion actual
            malo[malo.length - 1 - i] = temp;     //paso 4 colocar el valor guardado en la posicion opuesta
        }

        mostrarLista(bueno);
        System.out.println();
        mostrarLista(malo);
}



static void mostrarLista(int [] datos){
        //mostrar lista
        System.out.println();
        for (int i = 0; i < datos.length; i++) {
            System.out.println("dato "+(i+1)+":" + " " + datos[i]);
        }
        System.out.println();
    }
}

