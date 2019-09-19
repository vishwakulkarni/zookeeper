package ooad.homework1.zooanimals;

import ooad.homework1.animalfamily.*;

/**
 * 
 *
 */
public class Dog extends Canine {


	public Dog(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String wakeup() {
		return "is waking up like a Dog.";
	}
	
	@Override
	public String makeNoise() {
		return "is making noise like a Dog.";
	}
	
	@Override
	public String eat() {
		return "is eating like a Dog.";
	}
	
	@Override
	public String roam() {
		return "is roaming like a Dog.";
	}
	
	@Override
	public String sleep() {
		return "is sleeping like a Dog.";
	}
	
	final String type = "Dog";
	@Override
	public String getType() {
		return type;
	}

}
