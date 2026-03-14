import java.util.Scanner;

public class mainMon {
    private static claseMon[] players = new claseMon[3];
    private static claseMon boss;
    private static claseMon current;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //metodo que inicia el juego
        initGame();

        //GameFlow
        do {
            System.out.println(" === estado actual ===");
            System.out.println("ProvenMon: "+ current.getName() + " vs boss HP: "+boss.getLife());
            
            System.out.println("change character(CH) \nor \nAttack(AT)?: ");
            String choice = sc.nextLine().toUpperCase();

            if(choice.equals("CH")){
                System.out.println("introduce el nombre del provenMon: ");
                String newName = sc.nextLine();
                changeCurrent(newName);

            }else if(choice.equals("AT")){
                current.showAttacks(); //mostrar ataques

                System.out.println("elije un ataque: ");
                String chooseAttack = sc.nextLine();

                //ejecutar ataque 
                
                boss.reduceLife(current.getDamage(chooseAttack));

                System.out.println(current.getName() + " hace damage" );
            }
        } while (boss.getLife() > 0);

        System.out.println("boss derrotado! ");
    }

    static void initGame() {
        boss = new claseMon("bruce lee", 9999);

        players[0] = new claseMon("Donatello", 25);
        players[1] = new claseMon("Rafaello", 25);
        players[2] = new claseMon("Sant Miguel", 25);

        current = players[0];

        players[0].setAttackDamageIdx("FireBall", 1500, 0);

    }

    public static void showStatus() {
        // luchador actual

        String status = current.getName() + " ";

        for (int i = 0; i < players.length; i++) {
            status += current.showDamage(i) + " " + current.getAttacks(i) + " ";
        }

        status += "VS " + boss.getLife();

        System.out.println(status);
    }

    public static void changeCurrent(String name) {
        boolean encontrado = false;

        for (claseMon indice : players) {
            if (indice != null && indice.getName().equalsIgnoreCase(name)) {
                current = indice;
                encontrado = true;
                System.out.println("has cambiado a: " + current.getName());
                break;
            }
            // este if debe ir fuera del for para que sea
            // tomado en cuenta al finalizar el bucle foreach
        }

        if (!encontrado) {
            System.out.println("luchador no encontrado ");
        }
    }

    static public void attack(claseMon opponent, String attackName) {
        // 1. Buscamos cuanto daño hace el ataque solicitado
        int damageToDeal = current.getDamage(attackName);
        // valida el damage
        if (damageToDeal > 0) {
            // lo aplicamos
            opponent.reduceLife(damageToDeal);
            System.out.println(current.getName() + " usa " + attackName + " haciendo: " + damageToDeal + " damage");

        } else {
            System.out.println("el ataque no existe o no hace damage");
        }
    }
}
