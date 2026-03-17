package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Dungeon {
    // numero hab nombre hab
    Map<Integer, String> rooms;
    // mosnster name / lifepoints
    Map<String, Integer> monster;

    Scanner sc;
    Random rd;
    int hpPlayer, attackDmg;
    boolean orcDead, goblinDead;

    public Dungeon() {
        rooms = new HashMap<>();
        monster = new HashMap<>();
        sc = new Scanner(System.in);
        rd = new Random();
        
    }

    public static void main(String[] args) {
        Dungeon dg = new Dungeon();
        dg.run();
    }

    public void initData() {
        rooms.put(1, "empty room");
        rooms.put(2, "goblin");
        rooms.put(3, "fountain");
        rooms.put(4, "orc");
        rooms.put(5, "king of bongo");

        monster.put("goblin", 20);
        monster.put("orc", 80);
        monster.put("king of bongo", 90);

        hpPlayer = 100;
        attackDmg = 20;
        orcDead = false; 
        goblinDead = false;
    }

    public String rollRoom() {
        // 1. Obtenemos las llaves actuales
        Set<Integer> possibleRooms = rooms.keySet();

        // 2. Generamos un índice entre 0 y EL NUMERO DE LLAVES QUE QUEDAN
        // por el al eliminar una con rooms.remove() no afectara negativamente
        int roll = rd.nextInt(0, possibleRooms.size());

        // 3. Convertimos a arreglo para acceder por posición
        // mete el SET en una ARRAY de manera de darle un orden con el indice:
        // 1 =[0], 2 = [1], 3 = [2]
        Object[] keysArray = possibleRooms.toArray();
        Integer randomKey = (Integer) keysArray[roll];

        // 4. Retornamos el valor asociado a esa llave
        return rooms.get(randomKey);
    }

    public int rollRoomId() {

        if (rooms.isEmpty()) {
            return -1;// mazmorra vacia
        }
        // 1. Obtenemos el set de llaves actuales (IDs)

        Set<Integer> keys = rooms.keySet();

        // 2. lo pasamos a un arreglo para poder elegir una posicion
        Object[] keysArray = keys.toArray();

        // 3. Elegimos un indice aleatorio
        int index = rd.nextInt(keysArray.length);

        // 4. Retornamos la llave (ID) que esta en esa posicion
        return (int) keysArray[index];

    }

    public void run() {
        initData(); // cargar todo

        boolean playing = true;

        while (playing && hpPlayer > 0) {
            System.out.println("\n1. Explorar siguiente habitacion ");
            System.out.println("\n2. salir de la mazmorra");

            int choice = sc.nextInt();

            if (choice == 1) {
                if (!rooms.isEmpty()) {

                    int currentRoomId = rollRoomId();

                    if (currentRoomId != -1) {
                        String nextRoom = rooms.get(currentRoomId);
                        changingRoom(nextRoom, currentRoomId);
                    } else {
                        System.out.println("no quedan habitaciones por explorar ");
                        playing = false;
                    }

                }
            } else {
                System.out.println("sales del Dungeon ");
                playing = false;
            }

            if (monster.isEmpty()) {
                System.out.println("Limpiste la zona ");
                playing = false;
            }
        }

    }

    public void changingRoom(String room, int roomId) {

        switch (room.toLowerCase()) {
            case "empty room":
                System.out.println("it seems and empty room...");
                break;

            case "goblin":
            case "orc":

                if (fightMonster(room)) {
                    System.out.println("Victoria! Has derrotado a " + room);
                    monster.remove(room);
                    rooms.remove(roomId);
                    if (room.equalsIgnoreCase("goblin"))
                        goblinDead = true;
                    if (room.equalsIgnoreCase("orc"))
                        orcDead = true;

                }
                break;
            case "king of bongo":
                if (goblinDead && orcDead ) {
                    if (fightMonster(room)) {
                        System.out.println("¡HAS GANADO EL JUEGO!");
                        monster.remove(room);
                        rooms.remove(roomId);
                    }
                } else {
                    System.out.println("La puerta del Boss está cerrada. Necesitas las almas del Goblin y el Orco.");
                }
                break;
            case "fountain":
                System.out.println("your life has restored");
                hpPlayer = 100;
                break;

            default:
                System.out.println("no hay nada interesante en este rincon");
                break;
        }
    }

    public boolean fightMonster(String monsterName) {
        int hpMonster = monster.get(monsterName);

        while (hpPlayer > 0 && hpMonster > 0) {
            hpMonster -= attackDmg;

            if (hpMonster > 0) {
                // recalcula el daño del moster siempre antes de atacar
                // 2.evasion
                if (rd.nextInt(100) >= 15) {

                    int dañoActual = ((int) (0.2 * hpMonster));
                    int realDamage = rd.nextInt(dañoActual) + 1;
                    hpPlayer -= realDamage;
                    System.out.println("El monstuo devuelve el golpe");
                } else {
                    System.out.println("un ataque esquivado");
                }
            }
        }

        if (hpMonster <= 0) {
            return true;
        }
        return false;
    }
}
