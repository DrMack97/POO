package metodosUtiles;

public abstract class weapon{
    private String name;
    private double damage;
    private double weight;


    public weapon(String name, double damage, double weight) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
    }

    public double getDamage(){
        return damage;
    }

    public void showInfo(){
        System.out.println("Name: "+ name
        + " damage: " + String.format("%.2f",damage)
        + " weight: " + String.format("%.2f",weight)
        );
    }

    public double use(){
        System.out.println("Using-> "+ name);
        return damage;
    }

    public double use(double intensity){
        System.out.println("Using-> "+ name);
        double totalDamge = damage + intensity;
        return totalDamge;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double calculateDamage();

}
