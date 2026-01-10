package caballeriza;
import java.util.Random;
import java.util.Scanner;

public class userPlayer extends player {

    public userPlayer(String name, char cPLayer) {
        super(name, cPLayer);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void advance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("quieres tirar (0) no / (1) si ");
        
        int op = sc.nextInt();
    }

    if(op == 1){
        Random rnd = new Random();
    }
    
}
