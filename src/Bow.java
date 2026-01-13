public class Bow extends Weapon implements recargable, upgradable {

    private double curve; 
    private int arrow, levelUP;

    public Bow(String name, double damage, double weight, double curve) {
        super(name, damage, weight);
        this.curve = curve;
        this.arrow = 3;
        this.levelUP = 0;
    }

    @Override
    public double use(){

        double useDamage = calculateDamage();
        arrow --;
        return useDamage;
    }

    @Override
    public double use(double intensity){
        //calculo daño
        double useDamage = calculateDamage();
        // si daño es 0 lo dejo en 0 sino se lo sumo a intencidad 

            arrow--;
        return useDamage;
    }

    @Override
    public double calculateDamage() {
        double calcDamage = 0.0;
        if (arrow > 0){
            calcDamage= getDamage() + curve;
            levelUP--;
        } 
        
        return calcDamage;
        
    }

    public void recargar(){
        this.arrow += arrow;
    }

    public void improve(){
        if
    }

}
