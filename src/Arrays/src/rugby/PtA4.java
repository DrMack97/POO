package rugby;

import java.util.Scanner;

public class PtA4 {
    public static void main(String[] args) {
        
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        rugbyPlayer[] rugbyPlayers = initPlayers();
        rugbyPlayer[] selectedPlayers;

        do {

            System.out.println("0.Exit");
            System.out.println("1.Get All from Team");
            System.out.println("2.Show All Tries");
            System.out.println("3.Show More Than");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    System.out.print("select team:");
                    String team = sc.nextLine().trim();
                    selectedPlayers = getAllTeam(rugbyPlayers, team);
                    
                    if(selectedPlayers != null  && selectedPlayers.length > 0){
                        showPlayer(selectedPlayers);
                    }else{
                        System.out.println("esta vacio");
                    }
                    
                    break;
                case 2:
                    showAllTries(rugbyPlayers);
                    break;
                case 3:
                    System.out.print("select try: ");
                    int tries = sc.nextInt();
                    showAllMoreThan(rugbyPlayers, tries);
                    break;
                default:
                    System.out.println("error num equivocado");
                    break;
            }

        } while (!exit);
    }

    public static rugbyPlayer[] getAllTeam(rugbyPlayer[] rPlayers, String team) {
        int count = 0;
        int manIndice = 0;

        for (int i = 0; i < rPlayers.length; i++) {
            if (rPlayers[i].getTeam().equalsIgnoreCase(team)) {
                count++;
            }
        }
        rugbyPlayer[] sRugbyPlayers = new rugbyPlayer[count];

        for (int i = 0; i < rPlayers.length; i++) {
            if (rPlayers[i].getTeam().equalsIgnoreCase(team)) {
                sRugbyPlayers[manIndice] = rPlayers[i];
                manIndice++;
            }
        }

        return sRugbyPlayers;
    }

    public static void showAllTries(rugbyPlayer[] rPlayers) {

        int sumaTries = 0;

        for (int i = 0; i < rPlayers.length; i++) {
            sumaTries += rPlayers[i].getTries();
        }
        for (int i = 0; i < rPlayers.length; i++) {
            System.out.println("Jugador: " + rPlayers[i].getName() + " Tries: " + rPlayers[i].getTries());
        }
        System.out.println("Total tries: " + sumaTries);
    }

    public static void showAllMoreThan(rugbyPlayer[] rPlayers, int tries) {
        for (int i = 0; i < rPlayers.length; i++) {
            if (rPlayers[i].getTries() >= tries) {
                System.out.println("Jugador: " + rPlayers[i].getName() + "\nTeam " + rPlayers[i].getTeam()
                        + " Select try:" + tries);
            }
        }
    }

    public static void showPlayer(rugbyPlayer[] show){
        for (int i = 0; i < show.length; i++) {
            System.out.println("Name "+show[i].getName());
        }
    }

    public static rugbyPlayer[] initPlayers() {
        rugbyPlayer[] rugbyPlayers = {
                new rugbyPlayer("Damian Penaud", "France", 6),
                new rugbyPlayer("Sam Prendregast", "Ireland", 4),
                new rugbyPlayer("Rose Bernadou", "France", 1),
                new rugbyPlayer("Enya Breen", "Ireland", 2),
                new rugbyPlayer("Finn Rusell", "Scotland", 5),
                new rugbyPlayer("Kelly Arbey", "France", 6),
                new rugbyPlayer("Dan Sheehan", "Ireland", 6),
                new rugbyPlayer("Ange Capuosso", "Italy", 7),
                new rugbyPlayer("Sarah Bonar", "Scotland", 5),
                new rugbyPlayer("Eva Donaldson", "Scotland", 6),
                new rugbyPlayer("Fiona Tuite", "Ireland", 5),
                new rugbyPlayer("Aura Muzzo", "Italy", 2),
                new rugbyPlayer("Antoine Doupont", "France", 7),

        };

        return rugbyPlayers;
    }

}
