package strategy;

/**
 * child class of character
 * has a single argument contructor and a toString method
 * that is overridden, even though automatically included
 * do to java.lang in every class
 * has all methods from base class
 */
public class King extends Character {
    //saying base class is final, won't let me extend it
    
    
    public King(String name)
    {
        super(name);//not recognizing instance variable from base class
    }
    
    @Override
    public String toString()
    {
       return "ascii art";
    }

    
}
