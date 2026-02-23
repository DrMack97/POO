import java.util.Scanner;

public class Ascendente {
    public static void main(String[] args) {
    System.out.println("---");
        System.out.println("---");

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        
        //entrada
    System.out.println("indica tres numero ai pues: ");
        n1 = sc.nextInt();         n2 = sc.nextInt();         n3 = sc.nextInt();
        //////////// PROCESO COMPARATIVO EN ESCALA ASCENDENTE //////////////////
        if (n1<=n2 && n2<=n3) {
            System.out.println("ascendencia: " + n1 + " " + n2 + " " + n3);
        }else if (n1<=n3 && n3<=n2){
            System.out.println("Ascendencia: " + n1 + " " + n3 + " " + n2);
        }else if (n2<=n1 && n1<=n3){
            System.out.println("Ascendencia: " + n2 + " " + n1 + " " + n3);
        }else if (n2<=n3 && n3<=n1){
            System.out.println("Ascendencia: " + n2 + " " + n3 + " " + n1);
        }else if (n3<=n2 && n2<=n1){        //habia un (n3<=n2 && n2<=n3) es una condicion imposibru
            System.out.println("Ascendencia: " + n3 + " " + n2 + " " + n1);
            }else {
            System.out.println("Ascendencia: " + n3 + " " + n1 + " " + n2);
        }
            sc.close();
        }
    }
    
