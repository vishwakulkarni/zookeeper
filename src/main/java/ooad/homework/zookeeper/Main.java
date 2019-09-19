package ooad.homework.zookeeper;

import ooad.homework.zookeeper.*;

public class Main{
    public static void main(String[] args) {
        ZooKeeper david = new ZooKeeper();
        System.out.println("Zookeeper David is waking up animals : ");
        david.wakeup_animals();
        System.out.println("\nZookeeper David is roll calling the animals : ");
        david.callAnimals();
        System.out.println("\nZookeeper David is feeding animals : ");
        david.feedAnimals();
        System.out.println("\nZookeeper David is exercising animals : ");
        david.exerciseAnimals();
        System.out.println("\nZookeeper David is Shutting down the zoo : ");
        david.sleepAnimals();
    }
}