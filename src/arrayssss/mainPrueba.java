package arrayssss;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mainPrueba {

    static private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random rng = new Random();
        eje11Menu menu = new eje11Menu();

        int arrBueno[] = new int[rng.nextInt(50)];
        inversorArrays(arrBueno);
        mostrarLista(arrBueno);
        //////////////////////////////////////////////////////////////////

        System.out.println("^".repeat(25) + "Bienvenido al consultorio " + "^".repeat(25));
        int pacientes = pacientes();
        System.out.println("cantidad de pacientes: " + pacientes);

        double[] Npacientes = new double[pacientes]; // en este momento es un array vacia

        Npacientes = pacientesPeso(pacientes);

        mostrarListaDouble(Npacientes);

        //calculos 
        double pesoMin = pesoMinimo(Npacientes);
        double pesoMax = pesoMax(Npacientes);
        double pesoMedio = pesoMedio(Npacientes);
        double [] Gordos = Gordos(pesoMedio,Npacientes);

        System.out.println("=".repeat(20)+" ESTUDIOS "+"=".repeat(20));

        System.out.printf("Peso MINIMO: %.2f - Peso Max: %.2f - Peso Medio: %.2f", pesoMin, pesoMax, pesoMedio);
        mostrarListaDouble(Gordos);

        //11.-
        System.out.println("=".repeat(20)+" LISTA PACIENTES "+"=".repeat(20));
        
        menu.selecOption();
        

    }

    /**
     * 10. Programa que pide los datos de peso de un número de personas en
     * determinar por el usuario y muestra los valores mínimo, máximo, media y el
     * número de
     * personas que tienen peso superior a la media
     */
    static int pacientes() {
        System.out.println("con cuantos pacientes desea trabajar hoy?");
        int Npacientes = sc.nextInt();
        return Npacientes;
    }

    static double[] pacientesPeso(int pacientes) { // este metodo rellenara el array con el peso de los pacientes
        double[] pacientesPesos = new double[pacientes];
        for (int i = 0; i < pacientes; i++) {
            System.out.println("indique el peso del paciente: " + (i + 1) + "\nsiusplau pacientes del dia: " + pacientes);
            pacientesPesos[i] = sc.nextDouble();
        }

        return pacientesPesos;
    }

    static double pesoMinimo(double[] pacientesPesos) {
        double elFlaco = pacientesPesos[0]; // variable a el primer valor del array

        for (int i = 0; i < pacientesPesos.length; i++) { // compara todos
            if (pacientesPesos[i] < elFlaco) { // comparara todos con el primero
                elFlaco = pacientesPesos[i]; // flaco sera = al paciente con menor peso
            }
        }
        return elFlaco;

    }

    static double pesoMax(double[] pacientesPesos) {
        double muyGordo = pacientesPesos[0];

        for (int i = 0; i < pacientesPesos.length; i++) {
            if (pacientesPesos[i] > muyGordo) {
                muyGordo = pacientesPesos[i];
            }
        }

        return muyGordo;
    }

    static double pesoMedio(double[] pacientesPesos) {

        double suma = 0;

        for (int i = 0; i < pacientesPesos.length; i++) {
            suma += pacientesPesos[i];
        }
        double media = suma / pacientesPesos.length;
        
        return media;

    }

    static double[] Gordos(double media, double[] pacientesPesos) {
            double [] Gordos = new double[pacientesPesos.length];
        for (int i = 0; i < pacientesPesos.length; i++) {
            if (pacientesPesos[i] > media) {
                Gordos[i] = pacientesPesos[i];
            }
        }
            return Gordos;
    }

    // 9. arrays gemelas metodo:
    static int[] inversorArrays(int[] arr) {
        // array bueno:
        // este paso solo rellena de valor el array que recibe como parametro (1-100)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // creamos array bueno instanciando Arrays.copOf

        for (int i = 0; i < arr.length / 2; i++) {
            int variableTemporal = arr[i];
            arr[i] = arr[arr.length - 1 - i]; // 100 -1 -Pos(i)cion actual
            arr[arr.length - 1 - i] = variableTemporal;
        }

        return arr;
    }

    static int[] inversorArrays2(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // creamos array bueno instanciando Arrays.copOf
        int[] arrMalo = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arrMalo.length / 2; i++) {
            int variableTemporal = arrMalo[i];
            arrMalo[i] = arrMalo[arrMalo.length - 1 - i]; // 100 -1 -Pos(i)cion actual
            arrMalo[arrMalo.length - 1 - i] = variableTemporal;
        }

        return arrMalo;
    }

    // metodo para mostrar array
    static void mostrarLista(int[] datos) {
        // mostrar lista
        System.out.println();
        for (int i = 0; i < datos.length; i++) {
            System.out.println("dato " + (i + 1) + ":" + " " + datos[i]);
        }
        System.out.println();
    }

    // mostrar datos para arrat DOUBLE

    static void mostrarListaDouble(double[] datos) {
        // mostrar lista
        System.out.println();
        for (int i = 0; i < datos.length; i++) {
            System.out.printf(" n# "+(i+1)+" Peso paciente: %.0f\n", datos[i]);
                        

        }
        System.out.println();
    }
}
