package ooad.homework1.zooanimals;

import ooad.homework1.animalfamily.*;

/**
 * 
 *
 */
public class Tiger extends Feline {


	public Tiger(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String makeNoise() {
		return "is making noise like a Tiger.";
		
	}

	
	final String type = "Tiger";
	@Override
	public String getType() {
		return type;
	}

}
