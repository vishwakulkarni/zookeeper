package ooad.homework.zooanimals;
import ooad.homework.animal.*;
import ooad.homework.animaltype.*;

public class Wolf extends Animal implements Canine
{
	String name;
    public Wolf(String s){
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
    	System.out.println("Name:"+ name + " Type:" + getType() + " roar noise");
    }
}
