package Strategy;

// class with attack method that is used in setWeapon Behavior
//when there are no weapons
public class Weapon_None extends WeaponBehavior {

    public Weapon_None(int speed)
    {
        super(speed);
        this.speed=speed;
    }

    public void attack()
    {
        System.out.println("I don't have a weapon....I can't fighT!!!!!!!");
    }


    
}
