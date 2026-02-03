package Proven;
public class Quadrat {

    //atributos
    public double costat;

    //constructor
    public Quadrat(double costat){
        this.costat = costat;
    }

    //metodo para obtene area
    public double area(){
        return costat * costat;
    }
    public double getCostat(){
        return costat;
    }
    public void incrementaCostat(double incrementa){
        costat += incrementa;
    }
}
