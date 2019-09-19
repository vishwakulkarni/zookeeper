package ooad.homework1.animalfamily;

import ooad.homework1.animal.*;

public abstract class Canine extends Animal{
	
	public Canine(String s) {
		super(s);
	}
	
	public String wakeup() {
		return "is waking like a Canine.";
	}
	
	public String makeNoise() {
		return "is making noise like a Canine";
	}
	
	final String family = "Canine";
	@Override
	public String getFamily() {
		return "in family " + family;
	}

}
