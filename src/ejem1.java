public class ejem1 {

    public static void main(String[] args) {
        RegaloNadal rn = new RegaloNadal();
        RegaloAniversario ra = new RegaloAniversario();
        System.out.println();
    }


}
class Regalo  {
    Envase envase;   
    Contenido contenido;
    public Regalo(){
    reg = new Envase();
    contenido = new Contenido();
    }
}
class Envase{
    public Envase(){
        System.out.println("creo un envase");
        

    }
}
class Contenido{
    public Contenido(){
        System.out.println("creo un contenido");
    }

}
class RegaloNadal extends Regalo{
    public RegaloNadal(){
            System.out.println("creando regalo de aniversario");
    public RegaloNadal(Envase reg, Contenido contenido ){
        super();
    }
        
    }

}
class RegaloAniversario extends Regalo{
    public RegaloAniversario(){
                System.out.println("creando regalo de aniversario");
    }
}