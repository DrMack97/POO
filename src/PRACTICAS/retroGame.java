package PRACTICAS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class retroGame {
    Map<String, Double> Game;
        int [] expositor;
        List<String> almacen;
        juego j;

    public retroGame() {
        Game = new HashMap<>();
        expositor = new int[5];
        almacen = new ArrayList<>();
        j = new juego("zelda", 15);
    }

    public static void main(String[] args)  {
        retroGame pc = new retroGame();
        
        try {
            j = pc.getPrecio("Zelda");
            System.out.println("juego encontrado: "+ j.getGameName() + "- precio "+ j.getPrice());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
    pc.buscarAlmacen("Sonic");
    } catch (objetoNotFoundExcepcion e) {
    System.out.println(e.getMessage()); 
    }
    }

    public void buscarAlmacen(String objeto) throws objetoNotFoundExcepcion {
        boolean found = false;

        for (int i = 0; i < almacen.size(); i++) {

            
            if (almacen.get(i).equalsIgnoreCase(objeto)) {
                almacen.remove(i);
                System.out.println("eliminao");
                found = true;
                break;
            }
        }
        if(!found){
            throw new objetoNotFoundExcepcion();
        }
        
    }

    public void initData(){
        Game.put("Zelda", 59.99);
    }

    public juego getPrecio(String nameGame) throws objetoNotFoundExcepcion{
        try{
        if (Game.containsKey(nameGame)) {

            return new juego(nameGame, j.getPrice());
        }else{
            throw new objetoNotFoundExcepcion();
        }
        }catch(NullPointerException e){
            System.out.println("error critico");
            throw e;
        }
    }

    public int [] nombresCodigos(){
        ArrayList<String> nombresCodigos = new ArrayList<>();
        nombresCodigos.add("101");
        nombresCodigos.add("202");

        int[] expositor = new int[nombresCodigos.size()];

        for (int i = 0; i < nombresCodigos.size(); i++) {
            //rellenar un array con el contenido de un array list
            try {
                int id = Integer.parseInt(nombresCodigos.get(i));
                expositor[i] = id;
            } catch (Exception e) {
                System.out.println(" uno de los codigos no es un numero valido ");
                expositor[i] = 0; 
            }

        }

        return expositor;
    }
}
