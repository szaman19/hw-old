import java.io.*;
import java.util.*;


//CODE NEEDS DEBUGGING: CLASSES WERE NOT COMPATIBLE
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
	if (this.getAge() < p.getAge())
	    return -1;
	if (this.getAge() > p.getAge())
	    return 1;
	else
	    return 0;
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
	
	for (int i = 0; i < list.size(); i++){
	    System.out.println(list.get(i).getName()+ " :");
	    System.out.print(list.get(i).getAge()+"\n");
	}
	
	System.out.println();
	m.mergeSort(list);
	for (int i = 0; i < list.size(); i++){
	    System.out.println((list.get(i)).getName()+ " :");
	    System.out.print(list.get(i).getAge()+"\n");
	}

    }
	  
}
	
