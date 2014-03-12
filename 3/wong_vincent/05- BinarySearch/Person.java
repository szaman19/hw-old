import java.io.*;
import java.util.*;
public class Person implements Comparable{
    private String name;
    private int age;
    
    public Person(String a, int b) {
	name = a;
	age = b;
    }

    public String getName() {
	return name;
    }

    public int getAge() {
	return age; 
    }

    public int compareTo(){
	//also not sure what to put here
    }
}
