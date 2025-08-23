package strategy;


/*
 * class implementing the weaponbow.attack()
 * method
 */
public class WeaponKnife extends WeaponBehavior{

    
    //Will move a string bow across the screen
    //first print the bow, makes the thread sleep
    //clears the string
    //then prints spaces depending on iterations
    public void attack()
    {
    
        for(int i=0; i<100; i++)
        {
                System.out.print("-|---- ");
                Resources.sleep(speed);  
                Resources.clear();
                for(int j=0; j<i; j++)
                {
                    System.out.print(" ");  
                }
            }

    }
    
}
