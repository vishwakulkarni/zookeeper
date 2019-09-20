package ooad.homework1.animalfamily;

import ooad.homework1.animal.*;

public abstract class Feline extends Animal{
	
	public Feline(String s) {
		super(s);
	}
	
	public String roam() {
		return "is roaming like a Feline.";
	}
	
	public String eat() {
		return "is eating like a Feline";
	}
	
	final String family = "Feline";
	@Override
	public String getFamily() {
		return "in family " + family ;
	}

}
