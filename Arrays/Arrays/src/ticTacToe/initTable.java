package ticTacToe;

import java.util.Scanner;

public class initTable {
    // tipoDato[][] = nombreMatriz = new datatype[FILAS][COLUMBAS];
    public static void main(String[] args) {
        // TODO ini char matrix 3x3
        char[][] ticTacToe = new char[3][3];
        initTable2(ticTacToe);

        //TO DO call initTable 
        showTable(ticTacToe);
        int moves = 0;
        int [] pos; 
        
        boolean p2win = false;
        boolean p1win = false;
        /*FLUX  turno juador - preguntar pos - set pos() -
        showtable() - checkwinner()- repeat)
         */

        do {
            System.out.println("Ready player 1");

            pos = askPosUser();

            setPosChar(pos, 'x', ticTacToe);

            showTable(ticTacToe);

            //p1win = checkWinner( ticTacToe, pos[0], pos[1]);
            if (!p1win) { //evita que player 2 mueva si p1 gano
            System.out.println("Ready player 2");
            pos = askPosUser();

            setPosChar(pos, 'o', ticTacToe);

            showTable(ticTacToe);

            //p1win = checkWinner( ticTacToe, pos[0], pos[1]);
            }
            moves++;
            if (moves>=1) {
                break;
            }
        } while (!p1win && !p2win );
    }

    /*
     * 5 metodos:
     * inicializar tabla vacia
     * mostrar matriz
     * pedir posicion usiario
     * modificar matriz acorde a la posicion del usuario
     * CheckWiner()
     */

    static boolean checkWinner(char[][] tabla, int fila , int columna){
        char player = tabla[fila][columna];

        boolean win = true;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[fila][i] != player) {
                win = false;
                break;
            }
        }

        if (!win) {
            win = true;
            for (int i = 0; i < tabla.length; i++) {
            if (tabla[i][columna] != player) {
                win = false;
                break;
            }
            }
        }

        if (!win) {
            if(fila == columna){ // si fila = columna es decir 0.0 1.1 2.2
                win = true;
                for (int i = 0; i < tabla.length; i++) {
                    if(tabla[i][i] != player){ //revisa las posiciones iguales (diagonal)
                        win = false;            // es distinto de player? ('x' 'o')
                        break;                  // si ninguna iteracion encuentra != (distinto de)
                    }                           // resultado: win
                }
            }
            
        }

        if (!win) {
            
            if(fila + columna == tabla.length - 1){
            win = true;                             // 3 iteraciones:
            for (int i = 0; i < tabla.length; i++) {//1. 0.3-1-i   (i=0) pos= 0.2
                if (tabla[i][tabla.length - 1 - i] != player) {//  (i=1) pos= 1.1
                    win = false;                               //  (i=2) pos= 2.2
                    break;
                }
            }
            }
        }
        return win;
    }

    static void initTable2(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ' ';
            }

        }
    }

    static void showTable(char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("_" + matriz[i][j]);
            }
            System.out.println("");
        }
    }

    static int[] askPosUser() {
        Scanner sc = new Scanner(System.in);
        int[] filaColumna = new int[2];
        System.out.print("enter row: "); // Fila
        filaColumna[0] = sc.nextInt();
        System.out.print("enter column: ");// Columna
        filaColumna[1] = sc.nextInt();

        return filaColumna;
    }

    // 3 parametros (posicion: int[], la ficha 'x' u 'o' una matriz)
    static void setPosChar(int[] posicion, char Symbol, char[][] matriz) {
        /*
         * validador array debe ser mayor que 2
         * => array debe estar dentro del rango de la matriz:
         * >= 0 < 3 (matriz.length)
         */
        if ((posicion.length == 2) && (posicion[0] >= 0 && posicion[0] < matriz.length)
                && (posicion[1] >= 0 && posicion[1] < matriz[0].length)) {
            matriz[posicion[0]][posicion[1]] = Symbol;
        }

    }

}
