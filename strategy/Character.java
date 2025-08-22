package strategy;
/**Base class from which king, knight and troll classes
 * are derived. Abstract skeleton class with a protected instance variable, a
 * private instance variable,public methods methods
 * to be overrrided,
 * in uml diagram, character is in italics, which is true for abstract classes, 
    Test
 */


 public abstract class Character {

    protected String name;//name of person to be entered in, choosing character
    private WeaponBehavior weaponBehavior;//type of weapon behavior being chosen


    //single argument constructor
    public Character(String name)
    {
        this.name=name;
    }
    
    public void attack()
    {
         weaponBehavior.attack();
        /**
         * put attack implementation here depending on interface;
         * could do implementation depending on child classes
         */
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior)
    {
       this.weaponBehavior = weaponBehavior;
        //grabs weapon behavior instance from main and sets to attack methods
        //imported into class
    }

    public abstract String toString();
}
