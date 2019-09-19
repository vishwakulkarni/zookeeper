package ooad.homework.zookeeper;

import ooad.homework.zooanimals.Cat;
import ooad.homework.zooanimals.Tiger;

/**
 * Hello world!
 *
 */
public class ZooKeeper 
{
    Cat []cats = new Cat[2];
    Tiger []tigers = new Tiger[2];
    public ZooKeeper(){
        cats[0] = new Cat("Charlie");
        cats[1] = new Cat("Chloe");
        tigers[0] = new Tiger("Tom");
        tigers[1] = new Tiger("Thomas");
    }
    public void wakeup_animals(){
        for(int i=0;i<cats.length;i++){
            cats[i].wakeup();
        }
        for(int i=0;i<tigers.length;i++){
            tigers[i].wakeup();
        }
    }
    public void getTypes() {
    	for(int i=0;i<cats.length;i++){
            System.out.println(cats[i].getType());
        }
        for(int i=0;i<tigers.length;i++){
            System.out.println(tigers[i].getType());
        }
    }
}
