package Proven.com;

public class cars {
    // esto es un atributo 
    private int velocidadMax = 220;

    //metodos de la clase 
    public void fullChola(){
        System.out.println("vamos con todo lo que hay ");
    }
    public void velocidad(int veloz){
        System.out.println("velocidad actual "+ veloz + " "+ velocidadMax);
    }
    //get and set 
    public int getVelocidadMax(){
        return velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax){
        this.velocidadMax = velocidadMax;
    }
    //para poder usarlo en elmain 
}
