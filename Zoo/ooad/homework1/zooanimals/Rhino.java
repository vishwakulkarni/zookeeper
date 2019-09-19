package ooad.homework1.zooanimals;

import ooad.homework1.animalfamily.*;

/**
 * 
 *
 */
public class Rhino extends Pachyderm {


	public Rhino(String s) {
		super(s);
	}

	
	@Override
	public String sleep() {
		return "is sleeping like a Rhino.";
		
	}

	
	final String type = "Rhino";
	@Override
	public String getType() {
		return type;
	}


	@Override
	public String makeNoise() {
		return "is making noise like a Rhino.";
	}

}
