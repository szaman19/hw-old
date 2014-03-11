import java.io.*;
import java.util.*;

public class Person implements Comparable {
    
    private String name;
    private int age;

    public Person(){
	name = "Kevin Li";
	age = 0;
    }

    public Person(String s, int n){
	name = s;
	age = n;
    }

    public void setName(String n){
	name = n;
    }

    public void setAge(int a){
	age = a;
    }

    public int getAge(){
	return age;
    }

    public String getName(){
	return name;
    }

    public int compareTo(Object b){
	//COMPARING BASED ON AGE
	//return ((Integer)age).compareTo((Integer)b.getAge());
	//COMPARING BASED ON NAME
	return name.compareTo(((Person)b).getName());
    }

    public String toString(){
	//return ""+age;
	return name;
    }
}
    