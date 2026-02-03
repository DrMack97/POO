package Proven;
import Proven.com.cars;

public class eje1 {
    public static void main(String[] args) {
        cars skrt = new cars();

        skrt.setVelocidadMax(250);
        
        System.out.println(skrt.getVelocidadMax());

        skrt.velocidad(300);
        skrt.fullChola();
    }

}
