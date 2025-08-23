package strategy;

// class with attack method that is used in setWeapon Behavior
//when there are no weapons
public class WeaponNone extends WeaponBehavior {

    //prints string that say there are no weapons
    public void attack()
    {
        System.out.println("I don't have a weapon....I can't fighT!!!!!!!");
    }


    
}
