public  abstract class Weapon {
    private String name;
    private double damage;
    private double weight;
    
    public Weapon(String name, double damage, double weight) {
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

    public double use(double intensity){ //MISMA funcion + 1 parametro
        System.out.println("Using-> "+ name);
        return damage + intensity;
    }

    public abstract double calculateDamage();

    
}
