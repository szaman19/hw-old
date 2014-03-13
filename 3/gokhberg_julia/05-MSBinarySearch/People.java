import java.util.*;
import java.io.*;

public class Person implements Comparable<Person> {
    
    private int age = 0;
    private String name = "";
    
    public Person (int x, String s){
	age = x;
	name = s;
    }

    public String toString() {
	return "(" + name + ", " + age + ")";
    }

    public int getAge() {
	return age;
    }

    public int getName() { 
	return name;
    }

    public int compareToAge(Person other) {
	if (age < other.getAge){
	    return -1;
	}else if (age == other.getAge){
	    return 0;
	}else{
	    return -1;
	}
    }

    public itn compareTo(Person other) {
	return name.compareTo(other.getName):
    }
}

				       
				       	    
	    
	    
