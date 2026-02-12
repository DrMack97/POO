package arrayssss;

import java.util.Random;

public class estadisticaMetods {
    // estadistica con arrays

    /**
     * suma los elementos del array
     */

    public int calculcularSuma(int[] dades) {
        int suma = 0;

        for (int i = 0; i < dades.length; i++) {
            suma += dades[i];
        }
        return suma;
    }

    /**
     * calcula el valor minimo de elementos de un array
     */

    public int calcularMinim(int[] datos) {
        int minim = datos[0];
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < minim) {
                minim = datos[i];
            }
        }
        return minim;
    }

    /*
     * calcular el minimo de elementos
     */
    public int calcularMax(int[] datos) {
        int max = datos[0];
        for (int i = 0; i < datos.length; i++) {
            if (max < datos[i]) {
                max = datos[i];
            }
        }
        return max;
    }

    // 1. calcula la media
    public int calcularMedia(int[] datos) {
        int media = calculcularSuma(datos) / datos.length;

        return media;
    }

    // 2. suma par e impar
    public void sumaPareImpar(int datos[]) {
        int sumaPar = 0;
        int sumaImpar = 0;

        for (int i = 0; i < datos.length; i++) {

            if (datos[i] % 2 == 0) {
                // System.out.println("suma numeros par");
                sumaPar += datos[i];

            } else {
                // System.out.println("suma numeros impares");

                sumaImpar += datos[i];
            }
        }
        System.out.println("sumar par: ");
        System.out.println(sumaPar);
        System.out.println();
        System.out.println("sumar impar: ");
        System.out.println(sumaImpar);
    }

    // 3.
    public void sumaPositivosNegativos(int[] datos) {
        int sumaPositivo = 0;
        int sumaNegativo = 0;
        for (int numero : datos) {
            if (numero > 0) {
                sumaPositivo += numero;
            } else {
                sumaNegativo += numero;
            }
        }
        System.out.println("sumar positivo: ");
        System.out.println(sumaPositivo);
        System.out.println();
        System.out.println("sumar negativo: ");
        System.out.println(sumaNegativo);
    }

    // 5 rellenar un array con numeros de un inicio a un final

    public int[] rellenarNum(int inicio, int fin) {

        // iniciar array final - inicio (para saber el tamano)
        int[] array = new int[fin - inicio + 1];

        // variable para el indice del array
        int index = 0;

        // bucle
        for (int i = inicio; i <= fin; i++) {
            array[index] = i; // index sera = i rellenando los espacios
            index++; // entre inicio y fin
        }

        return array;
    }

    // 6 rellenar un array de 100 valores con numeros aleatorios del 0 al 1000!!!
    public int[] rellenarAleatorio(int inicio, int fin) {
        Random rng = new Random();

        int[] arrayRandom = new int[fin - inicio + 1];

        for (int i = inicio; i < fin; i++) {
            int index = rng.nextInt(0, 1000);
            arrayRandom[i] = index;
        }
        return arrayRandom;
    }

    // 7. Progresion aritmetica
    public int[] progresionAritmetica(int tamano, int inicial, int diferencia) {
        // int progresion = 0;
        int[] aritmetica = new int[tamano];

        for (int i = inicial; i < tamano; i++) {
            aritmetica[i] = inicial + (i * diferencia);
        }
        return aritmetica;
    }
    // 8. lista de numeros ramdon
    public void listaRandom(int tamano, int valorBuscado) {
        Random rng = new Random();
        int[] listaRandom = new int[tamano];
        int veces = 0;

        //Generar numeros aleatorios 
        for (int i = 0; i < listaRandom.length; i++) {
            int index = rng.nextInt(0, 10)+1; //
            listaRandom[i] = index;

            //condicion de busqueda
            if (listaRandom[i] == valorBuscado) {
                veces++;
                System.out.println(valorBuscado + " esta en " + (i+1) + " " + veces+ " veces");
            }
        }
        System.out.println();
        System.out.println("-".repeat(15)+ " Lista " +"-".repeat(15));
        for (int i = 0; i < listaRandom.length; i++) {
            System.out.println("Posicion "+(i+1)+":" + " " + listaRandom[i]);
        }
        System.out.println("=".repeat(25));
    }

    //9.
}
