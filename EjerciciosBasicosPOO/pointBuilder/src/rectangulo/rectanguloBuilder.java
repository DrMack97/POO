package rectangulo;

import java.util.Random;

public class rectanguloBuilder {

    private double x1,x2,y1,y2 = 0;
    private double base =0;
    private double altura =0;
    final static private double min = 0;
    final static private double max = 100;

    public rectanguloBuilder(double x1, double x2, double y1, double y2) {
        if ((x1 > min && x1 < max) && (x2 > min && x2 < max) && (y1 > min && y1 < max) && (y2 > min && y2 < max) 
            && (x2 > x1) && (y2 > y1)) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.base = 0;
        this.altura = 0;

        }else{
            System.err.println("ERROR al instanciar Rectangulo...");
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.base = 0;
        this.altura = 0;
        }
        // BASE Y ALTURA;
    }

    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        if (x1 > min && x1 < max) {
            this.x1 = x1;
        }else {
            System.err.println("x1 no puede ser menor que 0");
        }
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        if (x2 > min && x2 < max){
        this.x2 = x2;
        }else{
            System.err.println("x2 no puede ser menor que 0");
        }
        
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        if (y1 > min && y1 < max){
        this.y1 = y1;
        }else{
            System.err.println("y1 no puede ser menor que 0");
        }
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        
        if (y2 > min && y2 < max){
        this.y2 = y2;
        }else{
            System.err.println("y2 no puede ser menor que 0");
        }
    }

    @Override
    public String toString() {
        return String.format("x1: %.2f, x2: %.2f, y1: %.2f, y2: %.2f",
        x1 , x2 , y1 , y2);
    }

    public double rectanguloBasebase(){
        base = 0;
        while (true) {
            if (x1 < 0 || x2 < 0) {
                throw new IllegalArgumentException("Las coordenadas x no pueden ser negativas");
            }else{
            base = x2 - x1;
            return base;
            }
        }
    }
    public double rectanguloAltura(){

        altura = 0;
        while (true){
        if (y1 < 0 || y2 < 0) {
            throw new IllegalArgumentException("Las coordenadas y no pueden ser negativas");
        
        }else{

        altura = y2 - y1;
        return altura;

            }
        }
    }
    
    public double rectanguloBase(int area, int altura){
        double base = area/altura;
        return base;
    }

    public double rectanguloPerimetro(){
        double perimetro = x1 + x2 + y1 + y2;

        return perimetro;
    }

    public double rectanguloArea(double base, double altura){
        double area = base * altura;
        return area;
    }

    public void imprime(){
        System.out.println("Puntos :");
        System.out.println("=".repeat(50));
        System.out.println("x1: " + x1 +" x2: "+ x2 + " y1: "+ y1+" y2: "+y2);
        System.out.println("=".repeat(50));
        System.out.println("Calculos!");
        System.out.println("=".repeat(50));
        System.out.println();
        System.out.println("Base " + rectanguloBasebase());
        System.out.println("\nAltura "+ rectanguloAltura());
        System.out.println("\nPERIMETRO " + getPerimetro());
        System.out.println("\nAREA " + getArea());

    }
    public void setX1Y1(double x1,double y1){
        if(x1 > 0 && y1 > 0){
            this.x1 = x1;
            this.y1 = y1;
        }else{
            System.err.println("no se puede instanciar 0");
        }
    }
    public void setX2Y2(double x2,double y2){
        if(x2 > 0 && y2 > 0){
            this.x2 = x2;
            this.y2 = y2;
        }else{
            System.err.println("no se puede instanciar 0");
        }
    }
    
    public void setAll(double x1, double x2, double y1, double y2) {
        if(((x1 > 0) && (x2 > 0) && (y1 > 0) && (y2 > 0)) &&
            ((x2 > x1) && (y2 > y1))) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }else{
            System.err.println("ERROR al instanciar Rectangulo...");
        }
    }
    public double getArea(){
        double area = base * altura;
        return area;
    }

    public double getPerimetro(){
        double perimetro = x1 + x2 + y1 + y2;
        return perimetro;
    }
    public rectanguloBuilder rectanguloRANDOM(){
        Random rnd = new Random();
        return new rectanguloBuilder(rnd.nextDouble(min, max), rnd.nextDouble(min, max),rnd.nextDouble(min, max),rnd.nextDouble(min, max)); 
    }
}