package LISTAS;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MailApp_copy {

    mailAgent_copy ma; 
    Scanner sc; 

    public MailApp_copy(){
        ma = new mailAgent_copy();
        sc = new Scanner(System.in);

        ma.recieveMessage(new Message("Efrem", "Max", "Hola estic a la oficina avui no podré reunir-me. \nSalut!"));
        ma.recieveMessage(new Message("Juan", "Max", "Hola, com estas?"));
    
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Mail!");
        MailApp app = new MailApp();
        app.run();
    }

    public void run(){
     
        boolean exit = false;

        do{

            showMenu();
            try {
                
            
            switch (sc.nextInt()) {
                case 0:
                    exit = true;
                    System.out.println("saliendo");
                    break;
                case 1:
                    showBoxes();
                    break;
                case 2:
                    //TODO: Implement read in
                    readInBox();
                    break;
                case 3:
                    //TODO: Implement write and send
                    writeAndSend();
                    break;
            
                default:
                    System.out.println("Invalid option...");
                    break;
            }
            } catch (InputMismatchException e) {
                System.out.println("error");
                sc.nextLine();
            }
        }while(!exit);

    }

    public void showMenu(){
        System.out.println("0- Exit");
        System.out.println("1- Show Box");
        System.out.println("2- Read inBox");
        System.out.println("3- Write and send message");
    }

    public void showBoxes(){    
        //Permetre escriure IN, SENT, READ i mostrar la llista que toca.
        showMenuBoxes();

        int op = sc.nextInt();
        sc.nextLine();
        try {
            
        
        switch (op) {
            case 1:
                ma.showBox(BoxEnum.IN);
                break;
            case 2: 
                ma.showBox(BoxEnum.SENT);
                break;
            case 3: 
                ma.showBox(BoxEnum.READ);
                break;
            case 0:
                System.out.println("returning...");
        
            default:
                System.out.println("error! ");
                break;
        }

        } catch (BoxNotFoundException e) {
            
        }
    }

    public void showMenuBoxes(){
        System.out.println("Select the menu");
        System.out.println("1- In");
        System.out.println("2- Sent");
        System.out.println("3- Read");
        System.out.println("0- Return");
    }

    public void readInBox(){
        try {
            ma.showBox(BoxEnum.IN);
        
        
        System.out.println("que mensaje necesitas leer? ");
        int indice = sc.nextInt();
        //metodo readMessage
        ma.readMessageInBox(indice);

        } catch (BoxNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e){
            System.out.println("no existe ");
        }
    }

    public void writeAndSend(){
        System.out.println("a quien desea enviar el mensaje");

        String nameReciver = sc.nextLine();

        System.out.println("escribe el mensaje: (max 50)");

        String msg = sc.nextLine();

        Message nMsg = new Message("user", nameReciver, msg);

        ma.sendMessage(nMsg);

        // ma.sendMessage(new Message("user", nameReciver, msg));

    }
}
