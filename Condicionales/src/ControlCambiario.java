import java.util.Scanner;

public class ControlCambiario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double CAMBIO;
        double EU = 1;
        double USD = 1.17;
        double COP = 4606;
        double CL = 1134;
        double MEX = 21.50;
        double Franco = 0.93;
        System.out.println("///////////////////////////////////control cambiario 30/09/25 //////////////////////////////////////////");
        //////////////////ENTRADA/////////////////////
        System.out.println("ELIJA SU TIPO DE CAMBIO");
        System.out.println("1. EU a USD");
        System.out.println("2. EU a COP");
        System.out.println("3. EU a CL");
        System.out.println("4. EU a MEX");
        System.out.println("5. EU a FRANCO");
        
        opcion = scanner.nextInt();
        
        ///////////////////PROCESO/////////////////////////////
                /*//if (opcion == 1) {
                    double CAMBIO1 = EU * USD;
                    }else if (opcion == 2){
                    double CAMBIO2 = EU * COP;
                    }else if (opcion == 3){
                    double CAMBIO3 = EU * CL;
                    }else if (opcion == 4){
                    double CAMBIO4 = EU * MEX;
                    }else if (opcion == 5){
                    double CAMBIO5 = EU * Franco;
                }else{
                System.err.println(":error:");/* */
                //}

        //////////////////////SALIDA/////////////////////////////////
        switch (opcion) {
            case 1:
                System.out.println("Euro a dolar: ");
                    System.out.print("Ingrse monto: ");
                    
                    CAMBIO = scanner.nextDouble();
                    if (CAMBIO <= 9999 && CAMBIO >= 0) {
                        EU = CAMBIO * USD;
                        System.out.printf("Monto en dolares: $%.2f USD\n" , EU);
                    } else {
                        System.out.println("error");
                    }
                break;
            case 2:
                System.out.print("Euro a Peso Colombiano");
                    System.out.print("Ingrse monto: ");
                    
                    CAMBIO = scanner.nextDouble();
                    if (CAMBIO <= 9999 && CAMBIO >= 0) {
                        EU = CAMBIO * COP;
                        System.out.println("Monto en Peso Colombia: $" + EU);
                    } else {
                        System.out.println("error");
                    }
                break;
            case 3:
                System.out.print("Euro a Peso chileno");
                    System.out.print("Ingrse monto: ");
                    
                    CAMBIO = scanner.nextDouble();
                    if (CAMBIO <= 9999 && CAMBIO >= 0) {
                        EU = CAMBIO * CL;
                        System.out.println("Monto en Pesos Chilenos: $" + EU);
                    } else {
                        System.out.println("error");
                    }
                break;
            case 4:
                System.out.print("Euro a Peso Mexicano");
                    System.out.print("Ingrse monto: ");
                    
                    CAMBIO = scanner.nextDouble();
                    if (CAMBIO <= 9999 && CAMBIO >= 0) {
                        EU = CAMBIO * MEX;
                        System.out.println("Monto en Pesos Mexicanos: $" + EU);
                        } else {
                        System.out.println("error");
                    }
                break;
            case 5:
                System.out.print("Euro a Franco Suizo");
                System.out.print("Ingrse monto: ");
                    
                    CAMBIO = scanner.nextDouble();
                    if (CAMBIO <= 9999 && CAMBIO >= 0) {
                        EU = CAMBIO * Franco;
                        System.out.println("Monto en Suizo: $" + EU);
                        } else {
                        System.out.println("error");
                    }
                break;
            default:
                System.out.println("TAS LOCO RAMON");
                break;
        }
                scanner.close();

    }

}
