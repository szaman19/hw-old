// I eventually fixed the problem but I was and still am completely confused on the idea of comparables -> why do I have to overwrite the compareTo method??

// I don't really get Comparables... although I managed to get this to work...

// PREVIOUS PROBLEMS: (RESOLVED)
// why does this file keep saying that I cannot implement Comparable because it is not abstract?? 
import java.util.*;
public class Person implements Comparable<Person>{  
    private String name;
    private int age;
    public Person(String n, int a){
	name = n;
	age=a;
    }
    /* With the name
    public int compareTo (Person Other){
	int dif = name.compareToIgnoreCase(Other.name);
	return name.compareTo(Other.name);
    }
    */

    //comparing via ages :) 
    public int compareTo(Person Other){
	int dif = age-Other.age;
	return dif;
    }
    public String toString(){
	return name;
    }
    public static void main(String[]args){
	Person A = new Person("Bob", 12);
	Person B = new Person("Maria", 32);
	Person C = new Person("Billy", 4);

	System.out.println(A.compareTo(B));
	System.out.println(A.compareTo(C));
	System.out.println(C.compareTo(B));
    }
}
