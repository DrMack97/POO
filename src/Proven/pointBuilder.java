package Proven;

public class pointBuilder {
    //atributos
    String name = "badyal";
    String lastName = "tuzzy";
    int age = 22;
    public static void main(String[] args) {

        pointBuilder firstObj = new pointBuilder();

        pointBuilder girl = new pointBuilder();
        
        System.out.println("llego la "+girl.name+"con su mejor "+girl.lastName);
        System.out.println("ella tiene "+firstObj.age);
        firstObj.age = 28;
        girl.name = "david"; 
        girl.lastName = "anto";
        System.out.println(girl.name +" "+ girl.lastName +" "+ firstObj.age);
    } 
}

