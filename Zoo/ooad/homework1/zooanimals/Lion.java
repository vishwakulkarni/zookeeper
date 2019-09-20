package ooad.homework1.zooanimals;

import ooad.homework1.animalfamily.*;

/**
 * 
 *
 */
public class Lion extends Feline {


	public Lion(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String roam() {
		return "is roaming like a Lion.";
		
	}

	
	final String type = "Lion";
	@Override
	public String getType() {
		return type;
	}


	@Override
	public String makeNoise() {
		return "is making noise like a Lion.";
	}

}
