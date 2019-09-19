package ooad.homework1.zooanimals;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import ooad.homework1.animaltype.*;

/**
 * 
 *
 */
public class Cat extends Feline {
	
    private String name = "None";
	
	public Cat(){
    }
    
    
    public Cat(String s){
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
		return "is mewmewing.";
		
	}
	
	public ArrayList<String> catActions(){
	
		ArrayList<String> cactions = new ArrayList<String>();
		Cat c = new Cat();
		cactions.add(c.wakeup());
		cactions.add(c.makeNoise());
		cactions.add(c.eat());
		cactions.add(c.roam());
		cactions.add(c.sleep());
		return cactions;
		
	}
	
	public String catReact() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 5);
		// System.out.println(randomNum);
		ArrayList<String> cactions = catActions();
		return cactions.get(randomNum);
	}
 
}
