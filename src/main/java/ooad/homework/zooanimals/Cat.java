package ooad.homework.zooanimals;

import ooad.homework.zookeeper.Cat_interface;
import ooad.homework.animal.*;

/**
 * Hello world!
 *
 */
public class Cat extends Animal implements Cat_interface
{
    String name;
    public Cat(String s){
        name = s;
    }
    public String getType() {
    	return type;
    }
    public String getName(){
        return name;
    }
    public void sleep(){
    	System.out.println("Name:"+ name + " Type:" + getType() + " is sleeping now");
    }
    public void wakeup(){
        System.out.println("Name:"+ name + " Type:" + getType() + " is waking up");
    }
    public void eat(){
    	System.out.println("Name:"+ name + " Type:" + getType() + " is eating now");
    }
    public void roam(){
    	System.out.println("Name:"+ name + " Type:" + getType() + " is roaming around");
    }
    public void makenoise(){
    	System.out.println("Name:"+ name + " Type:" + getType() + " Meow Meow");
    }

}
