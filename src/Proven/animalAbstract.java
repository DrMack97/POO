package Proven;

public abstract class animalAbstract {
    private String nombre;

    public animalAbstract(String nombre){
        this.nombre = nombre;
    }
    
    public abstract void hablar();

    public void decirNombre(){
        System.out.println("me llamo "+ nombre);
    }

}
