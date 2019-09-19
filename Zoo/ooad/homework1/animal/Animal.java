package ooad.homework1.animal;

/**
 * Abstract class
 *
 */
public abstract class Animal 
{
	private String name = "None";
    
    public Animal(String s){
        this.name = s;
    }
    
    
    // setter: set name
    public void setName(String name) {
    	this.name = name;
    }
    
    // getter: get name
    public String getName(){
        return this.name;
    }
	
    public String sleep() {
    	return "is sleeping.";
    }
    
    public String wakeup() {
    	return "is waking up.";
    }
    
    public String roam() {
    	return "is roaming.";
    }
    
    public String eat() {
    	return "is eating.";
    }
    
    
    public abstract String getType();
    public abstract String getFamily();
    public abstract String makeNoise();
    
}
