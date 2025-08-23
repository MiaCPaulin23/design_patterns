package strategy;

/**
 * child class of character
 * has a single argument contructor and a toString method
 * that is overridden, even though automatically included
 * do to java.lang in every class
 * has all methods from base class
 */
public class King extends Character {
    
    
    //constructor
    public King(String name)
    {
        super(name);
    }
    
    //prints character
    @Override
    public String toString()
    {
       return "__|/^^^\\__";
    }

    
}
