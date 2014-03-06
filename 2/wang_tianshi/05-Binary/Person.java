import java.io.*;
import java.util.*;

public class Person implements Comparable<Person>{
    
    private String name;
    private int age;

    public Person(String n, int a){
	name = n;
	age = a;
    }

    public Person(){
	name = "John";
	age = 16;
    }

    public String getName(){
	return this.name;
    }

    public int getAge(){
	return  this.age;
    }

    public int compareTo(Person p){
	return (p.getAge() - this.getAge());
    }

    public static void main(String[] args){
	Person p1 = new Person("Leo",30);
	Person p2 = new Person();

	System.out.println(p1.compareTo(p2));
    }
	  
}
	