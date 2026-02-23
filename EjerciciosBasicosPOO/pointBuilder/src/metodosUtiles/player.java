package metodosUtiles;

import java.util.Random;

public class player {

    private String name;
    private String clase;
    private double life;
    private double damage;
    private weapon arma;

    public player(String name, String clase, double life, weapon arma, double damage) {
        this.name = name;
        this.clase = clase;
        this.life = life;
        this.arma = arma;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "player [name=" + name + ", clase=" + clase + ", life=" + life + ", weapon=" + arma + ", damage="
                + damage + "]";
    }

    public double makeDamage(double damage) {
        Random rn = new Random();
        damage = rn.nextInt(15, 35);
        System.out.printf("your damage is %.0f", rn);
        return damage;
    }

    public double recibeDamage(double damage) {
        if (life > 0) {
            life -= damage;
            System.out.println("has recibe damage");
            return life;
        } else {
            System.out.println("is dead");
            return 0;
        }
    }

    public double parry() {

        return 0;
    }

    public sword equipeSword() {

        return new sword("new", 35, 5, 25);
    }

    public bow equipeBow() {
        return new bow(name, 25, 25, 10);
    }

}
