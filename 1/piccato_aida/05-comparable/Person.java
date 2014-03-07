import java.util.*;

public class Person implements Comparable {
    private int age;
    private String name;

    public Person(int age, String name) {
	age = a;
	name = n;
    }

    public String getName() {
	return name;
    }

    public int getAge() {
	return age;
    }

    public int compareTo(Person other) {
	return this.getAge() - other.getAge();
    }

    

}