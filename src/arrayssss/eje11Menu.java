package arrayssss;

/**
 * 11. Programa para mantener en memoria una lista de nombres (String). Las opciones del
menú de funcionalidades serán: salir, listar, buscar, añadir, modificar. La lista se
mantiene en un array de longitud N (N a entrar por el usuario)....
 */
import java.util.Scanner;

public class eje11Menu {
    private Scanner sc;
    public String[] nombres;

    public void showMenu() {
        sc = new Scanner(System.in);

        System.out.print(" ".repeat(20) + "- menu pacientes -" + " ".repeat(20)
                + "\n1.-> listar " + "\n2.- buscar  \n3.- agregar \n4.- modificar \n0.- salir");
    }

    public void selecOption() {
        int op = 0;

        do {

            showMenu();
            System.out.println();
            op = sc.nextInt();

            sc.nextLine();// importante limpiar el bufer
            switch (op) {

                case 1:
                    System.out.print("N# de pacientes: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    nombres = new String[n];

                    break;
                case 2:
                    System.out.print("que paciente desea buscar? ");
                    String buscado = sc.next();
                    usoBuscar(buscado, nombres);

                    break;
                case 3:
                    agregar(nombres);

                    break;
                case 4:
                    // modificar
                    modificar(nombres);

                    break;

                default:
                    System.out.println("adios! ");
                    break;
            }
        } while (op != 0);

        showList(nombres);
    }

    // metodos:
    // buscar

    public void usoBuscar(String buscado, String[] lista) {

        int index = 0;

        for (int i = 0; i < lista.length; i++) {

            if (buscado.equalsIgnoreCase(lista[i])) {// forma correcta de comparar strings
                index = i;
            }
        }
        System.out.println(buscado + " se encuentra en el indice " + index);

    }

    // agregar
    public String[] agregar(String[] lista) {

        System.out.println("cual es el nombre de tus pacientes ?");
        // paso 1 encontrar el pimer vacio
        int vacio = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null || lista[i].isEmpty()) {
                vacio = i;
                break;
            }
        }

        // paso 2 verficar que la lista este llena
        if (vacio == -1) {
            System.out.println("lista llena");
            return lista;
        }

        // paso 3

        for (int i = vacio; i < lista.length; i++) {
            System.out.print("paciente " + (i + 1) + ": ");
            lista[i] = sc.nextLine().trim();
        }
        return lista;
    }

    // modificar lista
    public String[] modificar(String[] lista) {

        System.out.println("cuale nombre desea modificar? ");
        System.out.print("Nombre: ");
        String nom = sc.nextLine().trim();

        for (int i = 0; i < lista.length; i++) {
            if (nom.equalsIgnoreCase(lista[i])) {// forma correcta de comparar strings
                System.out.print("Modificar: ");
                lista[i] = sc.nextLine().trim();
                System.out.println("Modificado correctamente");
            }
        }

        return lista;
    }
    //show lista con Strings 
    public void showList(String [] lista){
        System.out.println();
        System.out.println("lista: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Paciente "+(i+1)+"."+lista[i]);
        }
        System.out.println();
    }

}
