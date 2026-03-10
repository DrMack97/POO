package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapGrades {

    private final Map<String, Integer> grades;

    public mapGrades() {
        grades = new HashMap<>();
    }

    public static void main(String[] args) {

        mapGrades mg = new mapGrades();

        mg.run();
    }

    private void initData() {
        grades.put("Maria", 5);
        grades.put("juan", 6);
        grades.put("romer", 5);
        grades.put("romer", 7);
        grades.put("NoLand", 10);

    }

    /**
     * display all grades
     */
    public void displayGrades() {
        System.out.println("===grades===");

        for (Map.Entry<String, Integer> EntrySet : grades.entrySet()) {
            System.out.println("Alumn: " + EntrySet.getKey() + " has grade " + EntrySet.getValue());
        }
    }

    public void run() {

        initData();
        displayGrades();

        System.out.println(calculateGlobalMean());
        System.out.println("Introduce nombre para actualizar nota: ");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        if (grades.containsKey(name)) {
            System.out.println("Nota nueva");
            int nota = sc.nextInt();
            grades.put(name,nota);
        }
    }

    public float calculateGlobalMean() {
        float mean = 0;

        for (Integer grade : grades.values()) {
            mean += grade.intValue();
        }

        return mean / grades.values().size();
    }


}
