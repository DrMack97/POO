package Proven;
public class superClase {

    public static void main(String[] args) {
        System.out.println("herencia");

        Envas vaso = new Envas("8L");
        Envas vaso2 = new Envas(); 
        System.out.println(vaso);
        System.out.println(vaso2);

    }

    class Envas{
        public Envas(){
            System.out.println("crenado envase");
            volum = "1.5 L";
        }
        public Envas(String volum){
        System.out.println("creando objeto nuevo ");
        this.volum = volum;
    }
    
    }
}
class ampolla extends Envas{
    String material;

    public ampolla(){
        super();
        System.out.println("creando una ampolla");
        material = "plastic";
    }
}
