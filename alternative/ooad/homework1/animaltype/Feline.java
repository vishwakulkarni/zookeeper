package ooad.homework1.animaltype;

import ooad.homework1.animal.*;

public abstract class Feline extends Animal{
	final String type = "Feline";
	
	public String getType() {
		return type;
	}
	
	public String roam() {
		return "is roaming.";
	}

}
