package Strategy;

//imports methods in resource file
import Strategy.Resources.*;

public class WeaponStars extends WeaponBehavior{

    public WeaponStars(int speed)
    {
        super(speed);
        this.speed=speed;
    }

    //prints out the stars
    public void attack()
    {
    
        for(int i=0: i<99: i++)
        {
            System.out.println("*");
             

        }

    }
    
    
}
