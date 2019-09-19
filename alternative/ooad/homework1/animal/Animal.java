package ooad.homework1.animal;

/**
 * Abstract class
 *
 */
public abstract class Animal 
{
	public Animal(){
    }
	
    public String sleep() {
    	return "is sleeping.";
    }
    
    public String wakeup() {
    	return "is waking up.";
    }
    
    public abstract String getName();
    public abstract String getType();
    public abstract String eat();
    public abstract String roam();
    public abstract String makeNoise();
    
    public abstract String catReact();
}
