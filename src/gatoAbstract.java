import Proven.animalAbstract;
import Proven.comerPienso;

public class gatoAbstract extends animalAbstract implements comerPienso {

    

    public gatoAbstract(String nombre) {
        super(nombre);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void hablar() {
        System.out.println("Miau");        
    }

    @Override
    public void comerPienso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comerPienso'");
    }
}
