import java.io.*;
import java.util.*;

public class Person implements Comparable<Person>{
    private String name;
    private Integer age;

    public Person(String n, Integer a) {
	name = n;
	age = a;
    }
    
    public String toString() {
	return name + ", " + age;
    }

    public int compareTo(Person other) {
	return this.name.compareTo(other.name);
    }
}