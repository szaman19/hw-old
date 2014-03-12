import java.util.*;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(String n, int a) {
	age = a;
	name = n;
    }

    public String toString() {
	return name + ", " + age;
    }

    public String getName() {
	return name;
    }

    public int getAge() {
	return age;
    }

    public int compareTo(Person other) {
	//Comparison by age
	//return this.getAge() - other.getAge();

	//Comparison by name
	return name.compareTo(other.getName());
    }

    

}
