package Strategy;

//import resources class to be able to use methods
import Strategy.Resources.*;

/*
 * class implementing the weaponbow.attack()
 * method
 */
public class WeaponBow extends WeaponBehavior{

   
    public WeaponBow(int speed)
    {
        super(speed);
        this.speed=speed;
    }
   
    //prints out the bow,holds the position for a few milliseconds and then clears
    //the space and then moves over
    
    public void attack()
    {   
        
        for(int i=0: i<99: i++)
        {
            System.out.println("-->");
            Strategy.Resources.sleep(speed);
            Strategy.Resources.clear();
            System.out.println("\t");

        }

        
    }
}