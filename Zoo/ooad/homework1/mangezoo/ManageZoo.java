package ooad.homework1.mangezoo;

import java.util.ArrayList;
import java.util.List;

import ooad.homework1.animal.*;
import ooad.homework1.zooanimals.*;
import ooad.homework1.zookeeper.*;

public class ManageZoo {

	public static void main(String[] args) {
		
		
		// Felines	
		Cat charlie = new Cat("Charlie");
		Cat chloe = new Cat("Chloe");
		Cat chris = new Cat("Chris");
		
		Tiger tom = new Tiger("Tom");
		Tiger ted = new Tiger("Ted");
		
		Lion lucas = new Lion("Lucas");
		Lion lincoln = new Lion("Lincoln");
		
		List<Animal> animal_list = new ArrayList<Animal>();
		animal_list.add(charlie);
		animal_list.add(chloe);
		animal_list.add(chris);
		
		animal_list.add(tom);
		animal_list.add(ted);
		
		animal_list.add(lucas);
		animal_list.add(lincoln);
		
		// Pachyderm
		Elephant evan = new Elephant("Evan");
		Elephant erik = new Elephant("Erik");
		
		Hippo hiro = new Hippo("Hiro");
		Hippo hillary = new Hippo("Hillary");
		Hippo hibai = new Hippo("Hibai");
		
		Rhino riley = new Rhino("Riley");
		Rhino robert = new Rhino("Robert");
		
		animal_list.add(evan);
		animal_list.add(erik);
		
		animal_list.add(hiro);
		animal_list.add(hillary);
		animal_list.add(hibai);
		
		animal_list.add(riley);
		animal_list.add(robert);
		
		// Canine
		Dog dave = new Dog("Dave");
		Dog daniel = new Dog("Daniel");
		Dog drew = new Dog("Drew");
		Dog dot = new Dog("Dot");
		
		Wolf william = new Wolf("William");
		Wolf wayne = new Wolf("Wayne");
		
		animal_list.add(dave);
		animal_list.add(daniel);
		animal_list.add(drew);
		animal_list.add(dot);
		
		animal_list.add(william);
		animal_list.add(wayne);
		
		
		
		ZooKeeper.wakeup_animal(animal_list);
		
		ZooKeeper.rollcall_animal(animal_list);
		
		ZooKeeper.feed_animal(animal_list);
		
		ZooKeeper.exercise_animal(animal_list);
		
		ZooKeeper.shutdown(animal_list);
	}

}
