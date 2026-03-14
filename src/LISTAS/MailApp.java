package LISTAS;

import java.util.Scanner;

public class MailApp {

    mailAgent ma; 
    Scanner sc; 

    public MailApp(){
        ma = new mailAgent();

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

            switch (sc.nextInt()) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    //TODO: Implement show boxes
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
        try{
        switch (sc.nextInt()) {
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
                System.out.println("Returning...");
                break; 
        }
    }catch(BoxNotFoundException bnfe){
        System.out.println(bnfe.getMessage());
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

            System.out.println("Select the message you want to read:");
            int idMsg = sc.nextInt();

            ma.readMessageInBox(idMsg);

        } catch (BoxNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void writeAndSend(){

        String sender, reciver, msg; 
        sc.nextLine();

        System.out.println("To: ");        
        reciver = sc.nextLine();
        System.out.println("Message: ");
        msg = sc.nextLine();

        ma.sendMessage(new Message("Efrem", reciver, msg));
    }   
}
