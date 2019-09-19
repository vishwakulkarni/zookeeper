package ooad.homework1.zooanimals;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import ooad.homework1.animalfamily.*;

/**
 * 
 *
 */
public class Cat extends Feline {

	public Cat(String s) {
		super(s);
	}

	
	final String type = "Cat";
	
	@Override
	public String getType() {
		return type;
	}

	public String eat1() {
		return "is eating like a Cat.";
		
	}

	@Override
	public String makeNoise() {
		return "is making noise like a Cat.";
		
	}
	
	public ArrayList<String> catActions(){
	
		ArrayList<String> cactions = new ArrayList<String>();
		Cat c = new Cat("None");
		cactions.add(c.wakeup());
		cactions.add(c.makeNoise());
		cactions.add(c.eat1());
		cactions.add(c.roam());
		cactions.add(c.sleep());
		return cactions;
		
	}
	
	@Override
	public String eat() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 5);
		// System.out.println(randomNum);
		ArrayList<String> cactions = catActions();
		return cactions.get(randomNum);
	}
 
}
