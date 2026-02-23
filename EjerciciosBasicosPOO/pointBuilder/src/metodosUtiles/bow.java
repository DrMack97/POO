package metodosUtiles;

public class bow extends weapon implements weapons{

    private double curve;

    public bow(String name, double damage, double weight, double curve) {
        super(name, damage, weight);
        this.curve = curve;

    }

    @Override
    public void showInfo() {
        System.out.println("NOMBRE "+ getName());
        super.showInfo();
    }


    @Override
    public double use() {
        System.out.println("Usando :"+ getName());
        return getDamage();
    }


    @Override
    public double use(double intensity) {
        System.out.println("Usando :"+ getName());
        double totalDamge = getDamage() + intensity;
        return totalDamge;
        
    }

    

    @Override
    public String toString() {
        
        return super.toString() + "| Curve: "+curve;
    }

    @Override
    public double calculateDamage() {
    
        return this.getDamage();
    }

    @Override
    public double getDefensiveBonus() {
        return 0;
    }

    @Override
    public String getEfectName() {
        // TODO Auto-generated method stub
        return "tiro preciso ";
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return getName();
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
