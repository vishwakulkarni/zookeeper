package ooad.homework1.zooanimals;

import ooad.homework1.animalfamily.*;

/**
 * 
 *
 */
public class Wolf extends Canine {


	public Wolf(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}


//	@Override
//	public String makeNoise() {
//		return "is making noise like a Wolf.";
//		
//	}
//	
//	@Override
//	public String sleep() {
//		return "is sleeping like a Wolf";
//	}

	
	final String type = "Wolf";
	@Override
	public String getType() {
		return type;
	}

}
