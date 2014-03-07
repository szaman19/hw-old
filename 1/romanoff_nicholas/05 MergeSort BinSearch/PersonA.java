// Nicholas Romanoff
// Period One
// Homework #05 Person for use with MergeSort3
// 2014-03-05

import java.util.*;

// compareTo compares names
public class PersonA implements Comparable {

  	// instance variables
   	private String _name;
   	private int _age;

	// default constructor 
	public PersonA() {
		setName("Nick");
		setAge(16);
	}

	// overloaded constructor 
	public PersonA(String name, int age) {
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
	
	// compareTo abstract method overwritten to compare names
    	public int compareTo(Object other) {
       		if (!(other instanceof PersonA)) {
            		throw new ClassCastException("\nError message!"
                                                     + " compareTo() input not a Person");
		}
 		return (this.getName()).compareTo(((PersonA)other).getName());
	}

	// toString method overwritten
	public String toString() {
		return _name + " " + _age;
	}
}
