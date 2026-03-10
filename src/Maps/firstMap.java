package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class firstMap {

    public static void main(String[] args) {

        Map<String,Integer> items = new HashMap<>();

        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("E", 60);
        items.put("F", 70);
        items.put("G", 80);

        System.out.println("transformar a set");

        for(Map.Entry<String,Integer> entry : items.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        System.out.println("access an element of map");

        System.out.println(items.get("D"));

        System.out.println("Iterate only key");

        Set<String> keys = items.keySet();

        for(String key : keys){
            System.out.println(key+"--"+items.get(key));
        }
        
    }

}
