package cordenadas;
import java.util.Scanner;
public class pointBuilder {
    private int x = 0;
    private int y = 0;
    
    public pointBuilder(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "puntoBuilder x: " + x + " y: " + y;
    }

    //operadores

    public pointBuilder resta(pointBuilder otro){
        return new pointBuilder((this.x) - otro.x, this.y - otro.y );
    }
    public pointBuilder suma(pointBuilder otro){
        return new pointBuilder(this.x + otro.x , this.y + otro.y);
    }
    public pointBuilder multiplicacion(int escalar ){
        return new pointBuilder(this.x * escalar, this.y *escalar);
    }
    // manera simple de division por 0
    public pointBuilder division (int otro) throws IllegalArgumentException{
        if ( otro == 0){
            throw new IllegalArgumentException("no se puede dividir por 0");
        }
        return new pointBuilder(this.x / otro, this.y/otro);
    }

    //division con INTERACTIVIDAD
    public pointBuilder dividerInteractive(){
        Scanner sc = new Scanner(System.in);
        double divisor;

        while (true) {
            try {
                System.out.println("ingrese numero divisor:" );
                divisor = sc.nextDouble();
                if( divisor == 0){
                    System.out.println("imposible dividir por 0");
                }else {
                    return new pointBuilder((int)(this.x / divisor ),(int)( this.y /divisor));
                }
            } catch (IllegalArgumentException e){
                System.out.println("error: "+ e.getMessage());
            }
        }
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    public boolean equals(pointBuilder otro) {
        return this.x == otro.x && this.y == otro.y;
    }
    // comparadores
    public boolean mayorQue(pointBuilder otro){
        return (this.x > otro.x) && (this.y > otro.y);
    }

    public boolean menorQue(pointBuilder otro){
        return (this.x < otro.x) && (this.y < otro.y);
    }

    public double distancia (pointBuilder otro){
        int dx = this.x - otro.x;
        int dy = this.x - otro.y;
        return Math.sqrt(dx*dx + dy *dy );
    }

    // CON OPERADOR ternario 
    public pointBuilder distanciaEntrePuntoyPunta(pointBuilder otro){
        double newX =(this.x > otro.x) ? this.x - otro.x : 0;
        double newY =(this.y > otro.y) ? this.y - otro.y : 0;
        return new pointBuilder((int)newX,(int) newY);
    }

    public void imprime(){
        System.out.println("punto x" + x);
        System.out.println("punto y"+ y);
    }
    public void setXY(int x, int y){
        if (x > 0 && y > 0) {
            this.x = x;
            this.y = y;
        }else{
            System.err.println("debe se mayor que 0");
        }

    }
    public void desplaza(int dx, int dy){
        if (dx > 0 && dy > 0) {
            this.x = dx + x;
            this.x = dy + y;
        }else{
            System.err.println("dx y dy deben se mayor que 0");
        }
    
    }

    

    

}
