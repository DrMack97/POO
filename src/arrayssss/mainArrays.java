package arrayssss;
import java.util.Scanner;
public class mainArrays {
    

    //atributos objetos 
    // permitiran hacer metodos fuera del main utizando el objeto "menu"
    private static menuArrayStrings ma1Menu, fightMenu, bagMenu, pokemonMenu;
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        // main menu
        menuArrayStrings ma1Menu = new menuArrayStrings(4);
        // fightMenu
        menuArrayStrings fightMenu = new menuArrayStrings(4);
        // bag menu 
        menuArrayStrings bagMenu = new menuArrayStrings(10);
        // pokemonsMenu
        menuArrayStrings pokemonMenu = new menuArrayStrings(6);
        

        //inicial menu sin parametros 
        ma1Menu.initMenu();

        initMainMenu();
        //Init Menu
        ma1Menu.setStringAtIndex(0, "Fight");
        ma1Menu.setStringAtIndex(1, "Bag");
        ma1Menu.setStringAtIndex(2, "Pokemon");
        ma1Menu.setStringAtIndex(3, "Run");

        ma1Menu.printVertical();

        // Init Fight menu
        fightMenu.setStringAtIndex(0, "Atack 1");
        fightMenu.setStringAtIndex(1, "Atack 2");
        fightMenu.setStringAtIndex(2, "Atack 3");
        fightMenu.setStringAtIndex(3, "Defensa");

        // Init Bag menu
        fightMenu.setStringAtIndex(0, "Obj 1");
        fightMenu.setStringAtIndex(1, "Obj 2");
        fightMenu.setStringAtIndex(2, "Obj 3");
        fightMenu.setStringAtIndex(3, "Obj 4");
        fightMenu.setStringAtIndex(4, "Obj 5");
        fightMenu.setStringAtIndex(5, "Obj 6");
        fightMenu.setStringAtIndex(6, "Obj 7");
        fightMenu.setStringAtIndex(7, "Obj 8");
        fightMenu.setStringAtIndex(8, "Obj 9");
        fightMenu.setStringAtIndex(9, "Obj 10");

        // Init Pokemon menu
        pokemonMenu.setStringAtIndex(0, "Pokemon 1");
        pokemonMenu.setStringAtIndex(1, "Pokemon 2");
        pokemonMenu.setStringAtIndex(2, "Pokemon 3");
        pokemonMenu.setStringAtIndex(3, "Pokemon 4");


        
        //Segons opció mostrar
        //1. fight menu horizontal
        //2. Bag menu vertical
        //3. Pokemon menu horizontal
        //4. Mostrar missatge de has fugit
    

        //init figth menu

        //init pkmMenu

        //init bagMenu

        //segun mostrar opciones 
        //1 figth menu horizontal
        //2 bag menu vertical 
        //3 pkm Menu horizontal
        //4 mostrar mensaje de huida!
        

        System.out.println();
    }

    public static void initMainMenu(){
        ma1Menu = new menuArrayStrings(4);

        String ops[] = {"Fight","Bag","Pkm","Run"};
        //init menu

        ma1Menu.initMenuWithArray(ops);
    }

    public static void initMainMenu2(){
        ma1Menu = 
    }
}
