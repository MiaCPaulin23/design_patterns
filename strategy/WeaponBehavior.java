package Strategy;

/*Abstract class from which the different weapon behavior 
classes are derived and abstract character class extends
all derived classes are to be imported in top of Character class
files to be used in child classes that inherit these weapon behaviors;
For weapon behavior method called, use switch/case statement inside loop;
Turn character to be repeated and cleared into variable; then loop with that
variable with conditional implementation already added; add which implementation o
of method inside switch/case statement 
 */
public abstract class WeaponBehavior {

    protected int speed;//had to make instance variable protected, even though in 
    //uml diagram it was private and couldn't access thwm in child
    //classes
    //the speed at which the weapons move(?)
    //add value to sleep method parameter for miliiseconds

     
    public WeaponBehavior(int speed)
    {
        this.speed=speed;
    }
    
    
    public abstract void attack();//skeleton method to be implemented in base
     //classes dependng on behavior
     //will use in character class(via super()); will add implementation
     //though other derived classes in character in setBehavior methods by
     //creating instances inside if the attack method so that king, knight
     //and troll can use
    

    
     
}
