import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================NOTAS DEL SEMESTRE===========================================");
    
        //VARIABLES 
        int numero;
        System.out.println("ingrese su nota rey ");
        numero = sc.nextInt();
        switch (numero) {
            case (10): {
                System.out.println("Excel-int");
                break; 
            }
            case (9): {
                System.out.println("Excel-int");
                break;
            }
            case (8): {
                System.out.println("vayalo");
                break;
            }
            case(7): {
                System.out.println("activo");
                break;
            }
            case(6):{
                System.out.println("suficiente");
                break;
            }
            case(5):{
                System.out.println("suficiente");
                break;
            }
            case(4):{
                System.out.println("dont lose our time");
                break;
            }
            case(3):{
                System.out.println("dont lose our time");
                break;
            }
            case(2):{
                System.out.println("dont lose our time");
                break;
            }
            case(1):{
                System.out.println("dont lose our time");
                break;
            }
            case(0):{
                System.out.println("dead");
                break;
            }
            default:{
                System.out.println("invalido ");
            }

        }

    }

}


