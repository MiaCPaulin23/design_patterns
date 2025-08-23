package strategy;

/*Child class of Character class with a single
 * argument constructor and a toString Method that
 * prints string representation
 */

public class Knight extends Character {
    
      
     public Knight(String name)
    {
        super(name);
        }
    
    @Override
    public String toString()
    {
        return "_\n (--)";
        
    }
}
