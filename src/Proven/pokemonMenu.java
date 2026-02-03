import java.util.Scanner;

public class pokemonMenu {
    // atributos
    public String op1, op2, op3, op4;

    
    //constructor
    public pokemonMenu(String op1, String op2, String op3, String op4) {
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
    }


    //metodos
    public void mostrarMenu(int opcion) {
        System.out.println("==menu== \n op1 \n op2 \n op3 \n op4");

    }
    public int getOpcion(String msg) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        return opcion= sc.nextInt();
    }
}
