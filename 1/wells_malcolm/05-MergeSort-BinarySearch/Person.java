import java.util.*;
public class Person implements Comparable<Person>{
    private int age;
    private String name;
    public int getAge(){
	return age;
    }
    public String getName(){
	return name;
    }
    public int compareTo(Person B){
	return age-B.getAge();
    }
}
