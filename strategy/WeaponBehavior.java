package strategy;

/*Abstract class from which the different weapon behavior 
classes are derived and abstract character class extends
all derived classes are to be imported in top of Character class
files to be used in child classes that inherit these weapon behaviors;
  */
public abstract class WeaponBehavior {

    protected int speed=100;//had to make instance variable protected, even though in 
    //uml diagram it was private and couldn't access thwm in child
    //classes
    //the speed at which the weapons move
    //in sleep method

    
    //skeleton method to be implemented in child
     //classes dependng on behavior of each character
    public abstract void attack();

    
     
}
