import java.io.*;
import java.util.*;
public class Person implements Comparable {
    String name;
    int age;
    
    public Person(String name, int age) {
	name = this.name;
	age = this.age;
    }
    
    public int compareTo (Object a) {
	if (age > ((Person)a).age)
	    return 1;
	if (age < ((Person)a).age)
	    return -1;
	return 0;
	
    }

    public String toString() {
	return name + " " + age;
    }
}
