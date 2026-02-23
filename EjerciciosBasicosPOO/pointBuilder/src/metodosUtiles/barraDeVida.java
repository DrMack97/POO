package metodosUtiles;

import java.util.Scanner;

public class barraDeVida {
public static void main(String[] args) {

    int maxVida = 60,  vida = 60; 
    char c = '█';

    Scanner sc = new Scanner(System.in);


    do{
    System.out.print("\033[H\033[2J");
    System.out.flush();

    for(int i = 0; i < 20; i++){
        if(i < (vida*20)/maxVida ) {
        System.out.print(c);
        }else{
            System.out.print(' ');
        }
    }

    System.out.println("("+vida+")");

    System.out.println("Quanta vida treiem?");
    int damage =  sc.nextInt();

    vida -= damage;
    }while(vida > 0);

    sc.close();
    }


    //METODOS//

    //--- BARRA DE VIDA ---//
    public static void  lifeBarr(int vida , char L){
        int vidaMax = vida;
        do {
            for (int i = 0; i < 20; i++) {
                if(i< (vida*20)/vidaMax){
                System.out.print(L);
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println("[ "+vida+" ]");
        
        } while (vida > 0);
    }

    public static void makeDamage(int damage){
        
    }
    public static void recibeDamage(){

    }
}
