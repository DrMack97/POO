package rectangulo;

public class rectanguloMain {
    public static void main(String[] args) {
    
    rectanguloBuilder x1 = new rectanguloBuilder(1.1, 7.9, 5.5, 2.3);
    rectanguloBuilder x2 = new rectanguloBuilder(0.0, 7.9, 5.5, 2.3);
    
    /////////////////////// rectangulo 1 //////////////////
    
    double perimetrox1 = x1.rectanguloPerimetro();
    double alturax1 =  x1.rectanguloAltura();
    double basex1 = x1.rectanguloBasebase();
    double AREAx1 = x1.rectanguloArea(basex1, alturax1);

    /////////////////////// rectanulo 2 //////////////////
    double alturax2 = x2.rectanguloAltura();
    double basex2 =  x2.rectanguloBasebase();
    double perimetrox2 = x2.rectanguloPerimetro();
    double AREAx2 = x2.rectanguloArea(basex2, alturax2);
    

    System.out.println();
    System.out.println("rectangulos: ");
    System.out.println();
    System.out.println("rectanulo 1: ");
    System.out.println(x1.toString());
    System.out.println("rectanulo 2: ");
    System.out.println(x2.toString());
    
    System.out.println();
    System.out.println("=== Calculos ===");
    System.out.println();

    System.out.println(" rectangulo 1: ");

    System.out.println("ALTURA rentangulo 1: " + alturax1);
    System.out.println();
    System.out.println("BASE rectangulo 1: " + basex1);
    System.out.println();
    System.out.println("PERIMETRO 1: " + perimetrox1);
    System.out.println();
    System.out.printf("AREA 1: %.2f", AREAx1);

    System.out.println();

    System.out.println(" rectangulo 2: ");
    System.out.println();
    System.out.println("ALTURA rectangulo 2: " + alturax2);
    System.out.println();
    System.out.println("BASE rectangulo2: " + basex1);
    System.out.println();
    System.out.println("PERIMETRO 2: " + perimetrox2);
    System.out.println();
    System.out.printf("AREA 2 %.2f", AREAx2);

    System.out.println();

        x2.setAll(2.35, 1.40, 4.25, 4.50);
        x1.setX1Y1(10,8);
        x1.setX2Y2(12, 10);

        x1.getPerimetro();
        x1.getArea();
        x2.getPerimetro();
        x2.getArea();

        x1.imprime();
        x2.imprime();

        rectanguloBuilder rect = x1.rectanguloRANDOM();

        System.out.printf("rectangulo aleatorio: x1: %.2f, x2: %.2f, y1: %.2f, y2: %.2f"
            , rect.getX1(), rect.getX2(), rect.getY1(), rect.getY2());


    }
}
