package ooad.homework1.zooanimals;

import ooad.homework1.animalfamily.*;

/**
 * 
 *
 */
public class Hippo extends Pachyderm {


	public Hippo(String s) {
		super(s);
	}


	@Override
	public String roam() {
		return "is roaming like a Hippo.";
		
	}
	
	@Override
	public String eat() {
		return "is eating like a Hippo.";
		
	}

	
	final String type = "Hippo";
	@Override
	public String getType() {
		return type;
	}


	@Override
	public String makeNoise() {
		return "is making noise like a Hippo.";
	}

}
