package ooad.homework1.zookeeper;

import java.util.List;

import ooad.homework1.animal.*;
import ooad.homework1.zooanimals.*;


public class ZooKeeper {
	
	// wake up the animals 
	public static void wakeup_animal(List<Animal> animal_list) {
		System.out.println("======================");
		System.out.println("Zookeeper is waking up the animals:\n");
		for (Animal a : animal_list) {
			if (a instanceof Cat) {
				System.out.println(a.getName() + ", " + a.getType() + ", " + a.getFamily() + ", "  + a.eat());
			}
			else {
				System.out.println(a.getName() + ", " + a.getType() + ", " + a.getFamily() + ", " + a.wakeup());
			}
			
		}
	}
	
	// roll call the animals
	public static void rollcall_animal(List<Animal> animal_list) {
		System.out.println("----------------------");
		System.out.println("Zookeeper is roll-calling the animals:\n");
		for (Animal a : animal_list) {
			if (a instanceof Cat) {
				System.out.println(a.getName() + ", " + a.getType() + ", " + a.getFamily() + ", "  + a.eat());
			}
			else {
			System.out.println(a.getName() + ", " + a.getType() + ", " + a.getFamily() + ", " + a.makeNoise());
			}
		}
	}
	
	// feed the animals
	public static void feed_animal(List<Animal> animal_list) {
		System.out.println("----------------------");
		System.out.println("Zookeeper is feeding the animals:\n");
		for (Animal a : animal_list) {
			if (a instanceof Cat) {
				System.out.println(a.getName() + ", " + a.getType() + ", " + a.getFamily() + ", " + a.eat());
			}
			else {
			System.out.println(a.getName() + ", " + a.getType() + ", " + a.getFamily() + ", " + a.eat());
			}
		}
	}
	
	// exercise the animals
	public static void exercise_animal(List<Animal> animal_list) {
		System.out.println("----------------------");
		System.out.println("Zookeeper is exercising the animals:\n");
		for (Animal a : animal_list) {
			if (a instanceof Cat) {
				System.out.println(a.getName() + ", " + a.getType() + ", " + a.getFamily() + ", " + a.eat());
			}
			else {
			System.out.println(a.getName() + ", " + a.getType() + ", " + a.getFamily() + ", " + a.roam());
			}
		}
	}
	
	// shut down the zoo
	public static void shutdown(List<Animal> animal_list) {
		System.out.println("----------------------");
		System.out.println("Zookeeper is shutting down the zoo:\n");
		for (Animal a : animal_list) {
			if (a instanceof Cat) {
				System.out.println(a.getName() + ", " + a.getType() + ", " + a.getFamily() + ", " + a.eat());
			}
			else {
			System.out.println(a.getName() + ", " + a.getType() + ", " + a.getFamily() + ", " + a.sleep());
			}
		}
		System.out.println("======================");
	}

}
