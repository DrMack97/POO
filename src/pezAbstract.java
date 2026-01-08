import Proven.animalAbstract;

public class pezAbstract extends animalAbstract {

    public pezAbstract(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void hablar() {   
        System.out.println("Glup!");     
    }

}
