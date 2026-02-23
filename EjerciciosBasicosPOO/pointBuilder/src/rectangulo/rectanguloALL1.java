package rectangulo;

public class rectanguloALL1 {
    public static void main(String[] args) {
        rectangulo x1 = new rectangulo(0, 0, 5, 5);
        rectangulo x2 = new rectangulo(7, 9, 2, 3);
        
        x1.showInfo("rectanulo1 :");
        x2.showInfo("rectanulo2 :");
    }

    static class rectangulo  {
        
        private double x1, y1, x2, y2, base, altura = 0;

        public rectangulo(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y2 = y2;
            this.y1 = y1;
            this.x2 = x2;
            
    
            //CALCULO ALTURA * BASE

            this.base = Math.abs(x2 - x1);
            this.altura = Math.abs(y2 - y1);
        }
        
        double calculoPerimetro() {return 2 *(base + altura);}
        double calculoArea(){ return base * altura;}

        void showInfo(String rectangulo){
            System.out.println(rectangulo + ": RECTANGULO " + x1 + " , "+y1);
            System.out.println("Base: "+ base + " | altura: "+ altura);
            System.out.println("perimetro: "+ calculoPerimetro() + "\n area: "+ calculoArea());
            System.out.println("=================================================");
        }
    }

}
