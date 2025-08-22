package Strategy;
/**Base class from which king, knight and troll classes
 * are derived. Abstract skeleton class with a protected instance variable, a
 * private instance variable,public methods methods
 * to be overrrided,
 * in uml diagram, character is in italics, which is true for abstract classes, 
    Test
 */
//import weapon behavior and all child classes
 import Strategy.WeaponBehavior;
 import Strategy.WeaponBow;
 import Strategy.WeaponKnife;
 import Strategy.WeaponStars;
 import Strategy.Weapon_None;
 


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
         weaponbehavior.attack();
        /**
         * put attack implementation here depending on interface;
         * could do implementation depending on child classes
         */
    }

   
   
   
    public void setWeaponBehavior(WeaponBehavior weaponbehavior)
    {
       
        //grabs weapon behavior instance from main and sets to attack methods
        //imported into class

                        
        }
    }

    public abstract String toString()
    {
        /**Should be automatically imported into every class (?) so
         * maybe only needs to be implemented in child classes
         * but make abstract and have own implementation in each class
         * because of instructions
         */
    }
}
