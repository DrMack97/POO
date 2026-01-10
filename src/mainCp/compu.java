package mainCp;

import java.util.InputMismatchException;
import java.util.Scanner;

import mainCp.cpMenu.cpMenu;

public class compu {
     
    static class Menu{
        String [] menuItems= {
            "Exit,",
            "encender compu",
            "apagar compu",
            "encender guardapantalla",
            "apagar guardapantalla"
        };
    public void show(){
        System.out.println("=============menu compu===============");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(Integer.toString(i)+".-"+menuItems[i]);
        }
        System.out.println("======================================");
    }
    public int readOpcions(){
        int option = -1;
        Scanner sc = new Scanner(System.in);
        try{
            option = sc.nextInt();
        } catch(InputMismatchException ime){
            ime.printStackTrace();
        }
        return option;
    }
    }
    public static void main(String[] args) {
        Menu normalMenu = new Menu();
        cpMenu eaMenu = new cpMenu("platino", "1TB", "LCD");
        Boolean exit=false;
        int option;
        do{
            normalMenu.show();
            option=normalMenu.readOpcions();
            switch (option) {
                case 0: // exit
                    exit = true;
                    break;
                case 1: //apagar switch
                    eaMenu.switchOn();
                    break;
                case 2: //encender switch
                    eaMenu.switchOff();
                    break;
                case 3:
                    eaMenu.TurnScreenSaverOn(); // cuidado al nombrar las funciones 
                    break;                      // puede provocar que el programa no haga
                case 4:
                    eaMenu.TurnScreenSaverOff();
                    break;
                default:
                    System.out.println("opcion equivocada ");
                    break;
            }
            if (!exit) {
                System.out.println("\nEstado actual: " + eaMenu.toString());
            }

        }while (!exit); {
            System.out.println("adeu");
        }
    }
}
