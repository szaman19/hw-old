// Nicholas Romanoff
// Period One
// Homework #05 Person for use with MergeSort3
// 2014-03-05

import java.util.*;

public class Person implements Comparable {

  	// instance variables
   	private String _name;
   	private int _age;

	// default constructor 
	public Person() {
		setName("Nick");
		setAge(16);
	}

	// overloaded constructor 
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}

	// mutator methods
	public String setName(String name) {
		String oldName = _name;
		_name = name;
		return oldName;
	}

	public int setAge(int age) {
		int oldAge = _age;
		_age = age;
		return oldAge;
	}

	// accessor methods
	public String getName() {
		return _name;
	}

	public int getAge() {
		return _age;
	}

	// overwrites of compareTo abstract method: must comment on out
	// for comparing names
	
    	public int compareTo(Object other) {
       		if (!(other instanceof Person)) {
            		throw new ClassCastException("\nError message!"
                                                     + " compareTo() input not a Person");
		}
 
        	String thisName, otherName;
        	thisName = this.getName();
		otherName = other.getName();
		return thisName.length() - otherName.length();
	}
	

	// for comparing ages
    	public int compareTo(Object other) {
       		if (!(other instanceof Person)) {
            		throw new ClassCastException("\nError message!"
                                                     + " compareTo() input not a Person");
		}
        	int thisAge, otherAge;
        	thisAge = this.getAge();
		otherAge = other.getAge();
		return thisAge - otherAge;

	}
}
