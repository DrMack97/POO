import Proven.animalAbstract;
import Proven.comerPienso;

public class perroAbstract extends animalAbstract implements comerPienso {

    public perroAbstract(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void hablar() {
        System.out.println("Guau!");
        
    }

    @Override
    public void comerPienso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comerPienso'");
    }

    
}
