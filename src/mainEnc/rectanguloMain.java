package mainEnc;

import OOencapsulacion.rectanguloBuilder;

public class rectanguloMain {

    public static void main(String[] args) {
        
        rectanguloBuilder rect1 = new rectanguloBuilder();
        rectanguloBuilder rect2 = new rectanguloBuilder(8, 5);
        rectanguloBuilder rect3 = new rectanguloBuilder(10, 12);

        //mostrar con toString
    
    System.out.println("mostrar con toString");
    System.out.println("rect1 "+rect1.toString());
    System.out.println("rect2 "+ rect2.toString());
    System.out.println("el tercero sin toString"+ rect3);

    //perimetros y areas 

    System.out.println("el Rectangulo *rect1* tiene perimetro y area");
    System.out.println("rect1 perimetro "+ rect1.perimetro(0, 0));
    System.out.println("rect1 area "+ rect1.area(0, 0));
    System.out.println();
    System.out.println("el Rectangulo *rect2* tiene perimetro y area");
    System.out.println("rect2 perimetro "+ rect2.perimetro(8, 5));
    System.out.println("rect2 area "+ rect2.area(8, 5));
    System.out.println();
    System.out.println("el Rectangulo *rect3* tiene perimetro y area");
    System.out.println("rect3 perimetro "+ rect3.perimetro(10, 12));
    System.out.println("rect2 area "+ rect3.area(10, 12));

    //comparaciones 

    if (rect1.equals(rect3)) {
        System.out.println("rectangulos iguales ");
    }else{
        System.out.println("rectangulos diferentes");
    }
    if (rect3.equals(rect2)) {
        System.out.println("rectangulos iguales ");
    }else{
        System.out.println("rectangulos diferentes");
    }
    System.out.println();
    System.out.println("cambiamos valores del rect2");
    rect2.setBase(-4); //cambiar valor usandor set para acceder al validador de la
    System.out.println("rect2: "+rect2.toString());
    System.out.println("perimetro rect2 = "+rect2.perimetro(10, 12)+
    " area rect2 = "+ rect2.area(10,12));

    }
}

