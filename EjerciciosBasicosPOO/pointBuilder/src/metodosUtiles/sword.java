package metodosUtiles;

public class sword extends weapon implements weapons {
    private double length; 

    public sword(String name, double damage, double weight, double length) {
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
        return getDamage() + length;
    }

    @Override
    public double getDefensiveBonus() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getEfectName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean hasEspecialEfect() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isDefensive() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isGoodForParry() {
        // TODO Auto-generated method stub
        return false;
    }

    
    
}
