package arrayssss;

import java.util.Arrays;
import java.util.Scanner;

public class primerosEje {

    static private Scanner sc = new Scanner(System.in);
    static private estadisticaMetods operation = new estadisticaMetods();
    public static void main(String[] args) {
        
        
        System.out.println("tamano de elementos desea almacenar? ");
        int n = sc.nextInt();
        int lista [] = leerLista(n);
        mostrarLista(lista);

        System.out.println("suma de valores ");
        System.out.println(operation.calculcularSuma(lista));
                System.out.println();

        System.out.println("valor maximo: ");
        System.out.println(operation.calcularMax(lista));
                System.out.println();

        System.out.println("valor mini");
        System.out.println(operation.calcularMinim(lista));
        System.out.println();

        //promedio
        System.out.println("*media* suma/cantidad de valores : ");
        System.out.println(operation.calcularMedia(lista));
        // suma de par e impar 
        System.out.println();

        System.out.println("suma numeros par e impar ");
        operation.sumaPareImpar(lista);
        System.out.println();

        // suma de negativos y positivos
        System.out.println(" suma negativos y positivos ");
        operation.sumaPositivosNegativos(lista);

        // 4. usar FILL
        System.out.println("indique dos valores a para longitud y m para dar valor");
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("m: ");
        int m = sc.nextInt();
        int [] fill = new int[a];
        Arrays.fill(fill, m);
        mostrarLista(fill);
        
        //5. rellenar array 

        int [] newArray = operation.rellenarNum(a, m);
        mostrarLista(newArray);
        //O 
        //mostrarLista(operation.rellenarNum(a, m));

        //6.
        int [] RandomArray = operation.rellenarAleatorio(a, m);
        mostrarLista(RandomArray);
        
        //7
        System.out.println("indique tamano - inicio - diferencia");
        System.out.print("tamano ");
        int tamano= sc.nextInt();
        System.out.print("inicio ");
        int inicial=sc.nextInt();
        System.out.print("difernecia ");
        int diferencia=sc.nextInt();
        mostrarLista(operation.progresionAritmetica(tamano, inicial, diferencia));
        
        //8. buscador de valores en una lista random
        System.out.println("indique tamano y valor a buscar");
        System.out.print("tamano ");
        int t = sc.nextInt();
        System.out.print("valor a buscar ");
        int buscar = sc.nextInt();
        operation.listaRandom(t, buscar);



    }

    static int [] leerLista(int longitud){
        //declarar e instanciar array;
        int [] dades = new int[longitud]; //longitud sera el tamaño de la lista

        //leer los elementos
        for (int i = 0; i < longitud; i++) {
            System.out.println("introduzca dato " + (i+1)+" tamaño del array: "+ longitud);
            int elem = sc.nextInt();
        // pasarlo a la lista
        dades[i] = elem;
        }
        return dades;
    }

    public static void mostrarLista(int [] datos){
        //mostrar lista
        System.out.println();
        for (int i = 0; i < datos.length; i++) {
            System.out.println("dato "+(i+1)+":" + " " + datos[i]);
        }
        System.out.println();
    }
}
