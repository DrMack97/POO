package LISTAS;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LLISTAS {

    public static void main(String[] args) {

        System.out.println("hello llistes");

        List<Integer> data = new LinkedList<>();

                System.out.println(data.size());
                System.out.println(data.isEmpty());

        data.add(Integer.valueOf(23));
        data.add(Integer.valueOf(42));
        data.add(Integer.valueOf(15));

        for (Integer elem : data) {
            System.out.println(elem);
        }

        System.out.println("Using iterator");
        System.out.println("collection contains value 42?");

        Iterator<Integer> iter = data.iterator();

        while (iter.hasNext()) {
            Integer elem = iter.next();
            System.out.println(elem);
        }

        System.out.println();
    }

}
