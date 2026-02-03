package Proven;
public class ejemploConstructor {

    int modelYears;
    String modelName;

    //constructor
    public ejemploConstructor(String name, int years  ){
        modelYears = years;
        modelName = name; 
    }

    public static void main(String[] args) {
        
        ejemploConstructor ace = new ejemploConstructor("Jefry Dahmer", 32);

        System.out.println(ace.modelName +" "+ ace.modelYears);
    }
}
