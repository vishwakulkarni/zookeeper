package ooad.homework1.zooanimals;

import ooad.homework1.animaltype.*;

/**
 * 
 *
 */
public class Tiger extends Feline {
	
    private String name = "None";
    public Tiger(String s){
        this.name = s;
    }
    
    
    // setter: set name
    public void setName(String name) {
    	this.name = name;
    }
    
    // getter: get name
    public String getName(){
        return name;
    }

	@Override
	public String eat() {
		return "is eating.";
		
	}

	@Override
	public String makeNoise() {
		return "is roaring.";
		
	}
	
	@Override
	public String catReact() {
		return "NA";
	}

}
