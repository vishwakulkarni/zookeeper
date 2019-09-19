package ooad.homework.zookeeper;

import ooad.homework.zooanimals.Cat;
import ooad.homework.zooanimals.Tiger;
import ooad.homework.zooanimals.*;

/**
 * Hello world!
 *
 */
public class ZooKeeper 
{
    Cat []cats = new Cat[2];
    Tiger []tigers = new Tiger[2];
    Dog []dogs = new Dog[2];
    Wolf []wolves = new Wolf[2];
    public ZooKeeper(){
        cats[0] = new Cat("Charlie");
        cats[1] = new Cat("Chloe");
        tigers[0] = new Tiger("Tom");
        tigers[1] = new Tiger("Thomas");
        dogs[0] = new Dog("Dave");
        dogs[1] = new Dog("Dudley");
        wolves[0] = new Wolf("William");
        wolves[1] = new Wolf("Willie");
    }
    public void wakeup_animals(){
        for(int i=0;i<cats.length;i++){
            cats[i].wakeup();
        }
        for(int i=0;i<tigers.length;i++){
            tigers[i].wakeup();
        }
        for(int i=0;i<dogs.length;i++){
            dogs[i].wakeup();
        }
        for(int i=0;i<wolves.length;i++){
            wolves[i].wakeup();
        }
    }
    public void getTypes() {
    	for(int i=0;i<cats.length;i++){
            System.out.println(cats[i].getType());
        }
        for(int i=0;i<tigers.length;i++){
            System.out.println(tigers[i].getType());
        }
        for(int i=0;i<dogs.length;i++){
            System.out.println(dogs[i].getType());
        }
        for(int i=0;i<wolves.length;i++){
            System.out.println(wolves[i].getType());
        }
    }
}
