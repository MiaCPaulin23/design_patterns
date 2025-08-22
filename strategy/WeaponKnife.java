package strategy;


public class WeaponKnife extends WeaponBehavior{

    
    //prints out the knife,holds the position for a few milliseconds and then clears
    //the space and then moves over; for loop repeats 100 times
    public void attack()
    {
    
        for(int i=0; i<99; i++)
        {
            System.out.println("-|----");
            Resources.sleep(speed);
            Resources.clear();
             System.out.println("\t");

        }

    }
    
}
