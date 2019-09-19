package ooad.homework1.mangezoo;

import java.util.ArrayList;
import java.util.List;

import ooad.homework1.animal.*;
import ooad.homework1.zooanimals.*;
import ooad.homework1.zookeeper.*;

public class ManageZoo {

	public static void main(String[] args) {
			
		Cat charlie = new Cat("Charlie");
		Cat chloe = new Cat("Chloe");
		
		Tiger tom = new Tiger("Tom");
		Tiger ted = new Tiger("Ted");
		
		List<Animal> animal_list = new ArrayList<Animal>();
		animal_list.add(charlie);
		animal_list.add(chloe);
		animal_list.add(tom);
		animal_list.add(ted);
		
		
		ZooKeeper.wakeup_animal(animal_list);
		
		ZooKeeper.rollcall_animal(animal_list);
		
		ZooKeeper.feed_animal(animal_list);
		
		ZooKeeper.exercise_animal(animal_list);
		
		ZooKeeper.shutdown(animal_list);
	}

}
