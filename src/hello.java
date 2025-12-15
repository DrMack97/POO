public class hello {
    public static void main(String[] args) {
        System.out.println("el delos cuadratdos");
        
        Quadrat q1, q2;

        q1 = new Quadrat(3.0);
        q2 = new Quadrat(5.0);

        System.out.println("area q1 = " + q1.area() + " ya que tengo costado " + q1.costat);

        System.out.println("area q2 = " + q2.area() + " ya que tengo costado " + q2.costat);

        q1.incrementaCostat(1);

        System.out.println("area q1= "+ q1 + "");

    }

}
