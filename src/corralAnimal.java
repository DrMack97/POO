import Proven.animalAbstract;

public class corralAnimal {

    public static void hablarAnimal(animalAbstract animal){
        animal.hablar(); // me obliga a implementar un metodo particular para cada clase heredera 
    }

    public static void main(String[] args) {
        System.out.println("hello everybody welcome to the corral");
        //herederos clase animal 

        gatoAbstract gato = new gatoAbstract("Felix");
        perroAbstract perro = new perroAbstract("Doggy");
        pezAbstract pescado = new pezAbstract("Blau");

        hablarAnimal(pescado);
        hablarAnimal(perro);
        hablarAnimal(gato);

    }
    
}
