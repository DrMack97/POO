package rugby;

import java.util.Scanner;

public class rugbyMain {
    private Scanner sc;
    private rugbyPlayer jg;

    public static void main(String[] args) {
        rugbyPlayer[] teamList = new rugbyPlayer[4];

        // name variable //objt
        teamList[0] = new rugbyPlayer("Antoine Dupont", "Francia", 5);
        teamList[1] = new rugbyPlayer("Beauden Barrett", "All Blacks", 3);
        teamList[2] = new rugbyPlayer("Romain Ntamack", "Francia", 2);
        teamList[3] = new rugbyPlayer("Aaron Smith", "All Blacks", 4);

    }

    static rugbyPlayer[] getAllTeam(rugbyPlayer[] team, String busquedaTeam) {
        int count = 0;
        int indice = 0;
            

        
            for (int i = 0; i < team.length; i++) {
            if (team[i].getTeam().equalsIgnoreCase(busquedaTeam)) { // compara strings
                count++; // debes usar los metodos del obj
                // que entra como parametro
            }else if (!team[i].getTeam().equalsIgnoreCase(busquedaTeam)) {
                return null;
            }

        }
        rugbyPlayer[] jugadoresContados = new rugbyPlayer[count];

         // creamos indice aparte para avanzar manualmente la cuenta
        for (int i = 0; i < team.length; i++) {

            if (team[i].getTeam().equalsIgnoreCase(busquedaTeam)) {
                jugadoresContados[indice] = team[i];
                indice++;
            }

        }
        return jugadoresContados;
                
    }

    static void showAllTries(rugbyPlayer[] team, String name) {
        int sumaTries = 0;
        for (int i = 0; i < team.length; i++) {
            sumaTries = +team[i].getTries();
        }
        String selectName = "";
        int tries = 0;

        for (int i = 0; i < team.length; i++) {
            if (team[i].getName().equalsIgnoreCase(name))
                selectName = team[i].getName();
            tries = team[i].getTries();
        }

        System.out.println("Jugador: " + selectName + "\nTries: " + tries + "\nTotal Tries: " + sumaTries);
    }

    static rugbyPlayer[] showAllMoreEqualThan(rugbyPlayer[] team, int tries) {
        int count = 0;

        for (int i = 0; i < team.length; i++) {
            if (team[i].getTries() == tries) {
                count++;
            }
        }

        rugbyPlayer[] showAllMoreEqualThan = new rugbyPlayer[count];

        int manIndice = 0;
        for (int i = 0; i < team.length; i++) {
            if (team[i].getTries() == tries) {
                showAllMoreEqualThan[manIndice] = team[i];
                manIndice++;
            }
        }

        return showAllMoreEqualThan;
    }
}
