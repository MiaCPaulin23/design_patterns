package strategy;

/*
 * child class of Character class with a single argument
 * constructor and a toString method
 */
public class Troll extends Character {
    
    public Troll(String name){
        super(name);
        
    }

   
    
    @Override
    public String toString()
    {
        return "/^\\";
        /*implement toString method based on what is says in video
         * 
         */
    }
}
