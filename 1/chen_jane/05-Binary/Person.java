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

    // compares age
    public int compareTo(Person p) {
	return this.age - p.age;
    }

}
