package Strategy;


//imports methods in resource file
import Strategy.Resources.*;


public class WeaponKnife extends WeaponBehavior{

    public WeaponKnife(int speed){

        super(speed);
        this.speed=speed;
    }

    
    //prints out the knife,holds the position for a few milliseconds and then clears
    //the space and then moves over; for loop repeats 100 times
    public void attack()
    {
    
        for(int i=0: i<99: i++)
        {
            System.out.println("-|----");
            Strategy.Resources.sleep(speed);
            Strategy.Resources.clear();
             System.out.println("\t");

        }

    }
    
}
