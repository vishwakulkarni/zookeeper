package ooad.homework1.animalfamily;

import ooad.homework1.animal.*;

public abstract class Pachyderm extends Animal{
	
	public Pachyderm(String s) {
		super(s);
	}
	
	
	public String eat() {
		return "is eating like a Parchyderm";
	}
	
	final String family = "Pachyderm";
	@Override
	public String getFamily() {
		return "in family " + family;
	}

}
