package PRACTICAS;

import java.util.HashMap;
import java.util.Map;

public class mapPTC {

    public static void main(String[] args) {
        Map<String, Double> vd = new HashMap<>();

        vd.put("Mario", 5.0);
        vd.put("nuke", 25.2);
        vd.put("RE", 67.0);
        vd.put("unoMas", 0.0);

        if (vd.containsKey("Mario")) {
            double precioA = vd.get("Mario");
            precioA += 5.0;
            vd.put("Mario", precioA);

            System.out.println(vd.entrySet());
            System.out.println(precioA);
        }else{
            vd.put("Mario", 50.0);
            System.out.println("done! ");
        }

        for (String jogo : vd.keySet()) {
            System.out.println(jogo);
            
        }

    }

}
