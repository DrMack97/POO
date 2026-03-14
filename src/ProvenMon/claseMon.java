package ProvenMon;

public class claseMon {
    private String name;
    private int life;
    private int[] damage;
    private String[] attacks;

    public claseMon(String name, int life) {
        this.name = name;
        this.life = life;
        damage = new int[10];
        attacks = new String[10];
    }
    // metodos

    // setAttackDamageIdx
    public void setAttackDamageIdx(String attackName, int attackDamage, int idx) {

        if (attackDamage > 0 && idx >= 0 && idx < 10) {
            attacks[idx] = attackName;
            damage[idx] = attackDamage;
        }
    }

    public int getDamage(String attackName) {
        for (int i = 0; i < attacks.length; i++) {
            if (attacks[i].trim().equalsIgnoreCase(attackName)) {
                return damage[i];
            }
        }
        return 0; // Si no lo encuentra, devuelve 0
    }

    public void reduceLife(int points) {
        if (points > 0 && life > 0) {
            life -= points;
            if (life < 0)
                life = 0;
        }
    }

    @Override
    public String toString() {
        String info = this.name + " " + this.life;
        for (int i = 0; i < attacks.length; i++) {
            // solo añadimos si el ataque existe
            if (attacks[i] != null) {
                info += " " + attacks[i] + " " + damage[i];
            }
        }
        return info;
    }

    public void showAttacks() {
        int count = 0;
        System.out.println("=== Attacks Menu ===");
        for (int i = 0; i < attacks.length; i++) {
            // ¿Qué condición pondrías para evitar imprimir nulos?
            if (attacks[i] != null) {
                System.out.print(attacks[i] + " ");
                count++;
                // si el contador es par hara un salto de linea
                if (count % 2 == 0) {
                    System.out.println();
                }
            }
        }

    }

    public void showLife() {
        // 1. Bucle para imprimir los asteriscos
        for (int i = 0; i < this.life; i++) {
            System.out.print("*");
        }
        // 2. Imprimir el número final
        System.out.println("(" + this.life + ")");
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int[] showDamage(int i) {
        return damage;
    }

    public String[] getAttacks(int i) {
        return attacks;
    }

    
}
