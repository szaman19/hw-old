import java.io.*;
import java.util.*;

public class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person() {
	name = "Bob";
	age = 30;
    }

    public Person(String n, int a) {
	name = n;
	age = a;
    }

    public int getAge() {
	return age;
    }

    public String getName() {
	return name;
    }

    // compares age
    // 0 = same age; 1 = this is older; -1 = p is older
    public int compareTo(Person p) {
	if (age == p.getAge()) {
	    return 0;
	}
	else if (age > p.getAge()) {
	    return 1;
	}
	else {
	    return -1;
	}
    }

    /*
    public int compareTo(Person p) {
	if (name.equals(p.getName())) {
	    return 0;
	}
	else {
	    for (int i=0; i<name.length() && i<p.getName().length(); i++) {
		if (name.charAt(i) > p.getName().charAt(i)) {
		    return 1;
		}
		else {
		    return -1;
		}
	    }
	    return 1;
	}
    }
    */
}
