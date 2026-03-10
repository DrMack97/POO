package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Dungeon {
    Map<Integer, String> rooms;
    Map<String, Integer> monster;
    Scanner sc;
    Random rd;
    int hpPlayer, attackDmg;
    boolean orcDead, goblinDead;
    public Dungeon() {
        rooms = new HashMap<>();
        monster = new HashMap<>();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
                
               
       
    }

    public void initData() {
        rooms.put(1, "Empty room");
        rooms.put(2, "Goblin");
        rooms.put(3, "Fountain");
        rooms.put(4, "Orc");
        rooms.put(5, "King of Bongo");

        monster.put("Goblin", 20);
        monster.put("Orc", 80);
        monster.put("King of Bongo", 90);

        hpPlayer = 100;
        attackDmg = 20;
        orcDead = goblinDead = false;
    }

    public String rollRoom(){
        Set<Integer> possibleRooms = rooms.keySet();

        int roll = rd.nextInt(0,possibleRooms.size());

        return rooms.get(possibleRooms.toArray()[roll]);
        
    }

    public void run(){
        rollRoom();
        rollRoom();

        System.out.println("Goblin Dead");
        rooms.remove(2);

    }

    public void changingRoom(String room){
        switch (room) {
            case "Emtpy room":
                System.out.println("it seems and empty room...");
                break;
            case "Goblin":
                if (!goblinDead) {
                    //fight with goblin
                    System.out.println("you found a Goblin");
                    goblinDead = fightMonster(room);
                }
            case "orc":
                if(!orcDead){
                    //fight with orc
                }
            case "fountain":
                System.out.println("your life has restored");
                hpPlayer = 100;
            case "King of Bongo":
                if (goblinDead && orcDead) {
                    //fight with boss 
                }else{

                }
            default:
                break;
        }
    }

    public boolean fightMonster(String monsterName){
        int hpMonster = monster.get(monsterName);
        int maxAtackMonster = (int)0.2*hpMonster;

            //toDo
        //do - while de la pelea 

        //todo vericar quien a ganado 
    }
}
