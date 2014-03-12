import java.util.*;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age){
	this.name = name;
	this.age = age;
    }

    // public int compareTo(Person other){
    // 	return this.age-other.age;
    // }

    public int compareTo(Person other){
	return this.name.compareTo(other.name);
    }

    public String toString(){
	return name+","+age;
    }

    public static void main(String[]args){
	Person a = new Person("Bob",23);
	Person b = new Person("Jill",4);
	System.out.println(a);
	System.out.println(b);
	System.out.println(a.compareTo(b));
	System.out.println(b.compareTo(a));
    }
    
}
