package strategy;

/*
 * class implementing the weaponstars.attack()
 * method
 */
public class WeaponStars extends WeaponBehavior{


    //Attack method that prints out the stars being thrown
    public void attack()
    {
    
        for(int i=0; i<100; i++)
        {
           System.out.print("*");
           
             }

    }
    
    
}
