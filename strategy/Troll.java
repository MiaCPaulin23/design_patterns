package strategy;

/*
 * child class of Character class with a single argument
 * constructor and a toString method that print
 * string representation of Troll
 */
public class Troll extends Character {
    
    public Troll(String name){
        super(name);
        
    }

   
    
    @Override
    public String toString()
    {
        return "/^\\";
        
    }
}
