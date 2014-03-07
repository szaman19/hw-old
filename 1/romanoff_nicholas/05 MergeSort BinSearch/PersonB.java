// Nicholas Romanoff
// Period One
// Homework #05 Person for use with MergeSort3
// 2014-03-05

import java.util.*;

// compareTo compares age
public class PersonB implements Comparable {

  	// instance variables
   	private String _name;
   	private int _age;

	// default constructor 
	public PersonB() {
		setName("Nick");
		setAge(16);
	}

	// overloaded constructor 
	public PersonB(String name, int age) {
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
       		if (!(other instanceof PersonB)) {
            		throw new ClassCastException("\nError message!"
                                                     + " compareTo() input not a Person");
		}
		return (((Integer)this.getAge()).compareTo((Integer)((PersonB)other).getAge()));
	}

	// toString method overwritten
	public String toString() {
		return _name + " " + _age;
	}

	
}
