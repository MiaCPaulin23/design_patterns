package Strategy;

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
        this.name=name;
    }

    public void attack()
    {
        super.attack();
        /**
         * put attack implementation here depending on interface;
         * could do implementation depending on child classes
         */
    }

    public void setWeaponBehavior(WeaponBehavior weaponbehavior)
    {
        super.setWeaponBehavior(WeaponBehavior weaponbehavior);
        /**implementation for weapon behaviors of classes, based on WeaponBehavior
         * interface.  Use swtch/case statements instead of if/else/then
        */
    }
    
    @Override
    public String toString()
    {
        super.toString();
        /*implement toString method based on what is says in video
         * 
         */
    }

    
}
