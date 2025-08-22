package Strategy;

/*
 * child class of Character class with a single argument
 * constructor and a toString method
 */
public class Troll extends Character {
    
    public Troll(String name){
        super(name);
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
