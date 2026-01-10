package mainEnc;

import java.util.Scanner;

import OOencapsulacion.convertidorTemp;

public class mainTemp {

    public static void main(String[] args) {

        int f = 0;
        int c = 0;        
        convertidorTemp converter = new convertidorTemp();
        Scanner sc = new Scanner(System.in);
        System.out.println("////////////////convetidor////////////////");
        System.out.println();

        System.out.println("proporciona temperatura en F");
        f= sc.nextInt();

        System.out.println("proporciona temperatura en C");
        c= sc.nextInt();

        System.out.println("temperatura en celcius es: "+converter.farenhC(c)+" g");

        System.out.println("temperatura en Farenh: "+ converter.celciusF(f)+" f");

        sc.close();   
    }
}
