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
	age = 25;
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
	Person p3 = new Person("Tyler", 16);
	Person p4 = new Person("Bob", 2);
	Person p5 = new Person("Phil",76);

	merge m = new merge();

	ArrayList<Person> list = new ArrayList<Person>();
	
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	list.add(p5);
	list.add(new Person("Newbie",45));
	
	System.out.println(list);
	System.out.println(m.mergeSort(list));
    }
	  
}
	
