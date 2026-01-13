public class Sword extends Weapon implements upgradable {

    private double length; 
    private int levelUP;

    public Sword(String name, double damage, double weight, double length) {
        super(name, damage, weight);
        this.length = length;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("length: "+ length);
    }

    @Override
    public double use(){
        return calculateDamage();
    }

    @Override
    public double use(double intensity){
        return calculateDamage() + intensity;
    }

    @Override
    public double calculateDamage() {
        levelUP--;
        return getDamage() + length;
    }
    @Override
    public void improve(){
        if(levelUP <= 0){
            length *= 2;
            levelUP =3 + (int) length;
        }
    }


}
