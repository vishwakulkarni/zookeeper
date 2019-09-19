package ooad.homework.zooanimals;
import ooad.homework.animal.Animal;
import ooad.homework.animaltype.Canine;

public class Dog extends Animal implements Canine
{
	String name;
    public Dog(String s){
        name = s;
    }
    public String getType() {
    	return type;
    }
    public String getName(){
        return name;
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void wakeup(){
        System.out.println(name + " is waking up");
    }
    public void eat(){
        System.out.println(name + " is eating now");
    }
    public void roam(){
        System.out.println(name + " is roaming arround");;
    }
    public void makenoise(){
        System.out.println(name + " makes noise as meo");;
    }
}
