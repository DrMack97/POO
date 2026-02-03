package arrayssss;

import java.util.Scanner;

public class menuArrayStrings {
         
    private String op[];
    private int opSet;

    // constructor de array
    public menuArrayStrings (int length){
        op = new String[length];
        opSet = 0;
    }

    public void setOption(String op){

        if (opSet < this.op.length) {
            //puedo añadir
            setStringAtIndex(opSet, op);
            opSet++;
        } else {
            System.out.println("menu esta lleno ");
        }
    }

    public boolean setStringAtIndex(int i, String s){
        boolean result;
        if(i < 0 || i >= op.length){
            System.out.println("No pots Introduir un valoir en auquest index");
            result = false;
        } else {
            op[i] = s;
            result = true;        
        }
        return result;
    }

    //punto de control
    //Menu principal que dereiva a Subs menus (figth, bag, pokemon, run)
    //crea primero los submenus de cada accion
    //utiliza switch
    public void controlMainMenu(){

        Scanner sc = new Scanner(System.in);
        int op = -1;

        do {
            
        } while (op == 0);
    }

    public void printVertical(){
        System.out.println();

        for (int i = 0; i < op.length/2; i++){
            System.out.print((i) + "- " + op[i] + " ");
        }
        System.out.println();

        for (int i = op.length/2; i < op.length; i++){
            System.out.print((i) + "- " + op[i]+ " ");
        }
        System.out.println();
    }

    public void getOptAtindex(int opt){
        String result = " ";

    }

    public void printHorizontal(){
        System.out.println();

        String result = "";

        for (int i = 0; i < op.length/2; i++){
            System.out.print("- " + op[i] + " ");
        }
        System.out.println();
    }

    //metodo initMenu que permita rellenar todas las posiciones desde 0 a -1
    public void initMenu(){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < op.length; i++) {
            System.out.println("entra un valor por la posicion " +(i+1)+ " del menu");
            String op = sc.nextLine();
            setStringAtIndex(i, op);
        }
    }


    //metodo para que reciba una array como parametro 
    public void initMenuWithArray(String [] op){
        this.op = op;
    }

    // create mainMenu (menu de cada opcion) 

    // poder printarla el menu horizontal

    //metodo setOption(Strings)

}
