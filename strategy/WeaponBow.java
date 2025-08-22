package strategy;

/*
 * class implementing the weaponbow.attack()
 * method
 */
public class WeaponBow extends WeaponBehavior{
   
    /**
     * Will move a ascii bow across the screen slowely
     */
    public void attack()
    {   
        
        for(int i=0; i<99; i++)
        {
            System.out.println("-->");
            Resources.sleep(speed);
            Resources.clear();
            System.out.println("\t");

        }

        
    }
}