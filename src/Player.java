import java.util.Random;

public class Player {
    Weapon weapon;
    Weapon Sword = new Sword("Excalibur", 100.0, 1000.0, 2.0);
    Weapon bow = new Bow("Hood", 80.0, 50.0, 20.0);
    public static void main(String[] args) throws Exception {

        Player p1 = new Player();

        p1.showInfo();

        System.out.println("Damage = "+ p1.useWeapon(0));
        System.out.println("Damage = "+ p1.useWeapon(0));
        System.out.println("Damage = "+ p1.useWeapon(0));
        System.out.println("Damage = "+ p1.useWeapon(0));

        p1.showInfo();

        System.out.println("Damage = "+ p1.useWeapon(1));
    }
    public void showInfo(){
        weapon.showInfo();
    }

    public double useWeapon(int option){

        double damage = 0.0;
        switch (option) {
            case 0:
                damage = bow.use();
                break;
            case 1:
                Random rd = new Random();
                damage = Sword.use(rd.nextDouble(100+1));
                break;
        
            default:
                break;
        }
        return damage;
    }

    public void rechargeWeapon(){
        //valido que weapon se comporta con bow
        if( weapon instanceof Bow){
            //hacer cast y usar recharge
            ((Bow)weapon).recargar();
        }
    }
    public void improveWeapon(){
        if (weapon instanceof upgradable) {
            ((upgradable)weapon).improve();
        }
    }
    public void improveBow(){
        
    }
        
}



