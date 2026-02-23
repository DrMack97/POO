import java.util.Scanner;
public class Pruebas {
    public static void main(String[] args) {
        System.out.println("---");
        System.out.println("---");
        Scanner mira = new Scanner(System.in);
    /////////////////////////////Interruptor Booleano/////////////////////////////////////////
            System.out.println("apagado? ");
                String estado = mira.nextLine();
                boolean Interruptor = true;

                if (Interruptor) {
                    System.out.println("encendido ");
                    
                } else{
                    System.out.println("Apagao ");
                }
                    System.out.println("Interruptor: " + estado);
            
    

    }
}
