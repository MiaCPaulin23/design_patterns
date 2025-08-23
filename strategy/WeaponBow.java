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
        System.out.print(")-->");
             for(int i=0; i<20; i++){
                 for(int j=0; j<1; j++)
                {
                    System.out.print( "-->" );
                    Resources.sleep(speed);
                    Resources.clear();
                    
                    
                }
                System.out.print( "\t ");
            }
                    
                
             
           
         
    }
}