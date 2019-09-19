package ooad.homework.zooanimals;

import ooad.homework.animal.*;
import ooad.homework.zookeeper.Cat_interface;

/**
 * Hello world!
 *
 */
public class Tiger extends Animal implements Cat_interface
{
    String name;
    public Tiger(String s){
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
    	System.out.println("Name:"+ name + " Type:" + getType() + " Roar Roar");
    }

}
