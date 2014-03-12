import java.util.*;
import java.io.*;

public class Person implements  Comparable<Person> {

    private String name = "";
    private int age = 0;

    public Person (String nameinput, int ageinput){
	name = nameinput;
	age = ageinput;
    }

    public String getName(){
	return name;
    }
    public int getAge(){
	return age;
    }
    public String toString(){
	//	return name;
		return Integer.toString(age);
    }
 

    public int compareTo (Person p){
		if (age < p.getAge()){
	    return -1;
	}
	if (age == p.getAge()){
	    return 0;
	}
	if (age > p.getAge()){
	    return 1;
	    }

	/*if (name.compareTo(p.getName()) < 0){
	  return -1;
	  }
	  if (name.compareTo(p.getName()) == 0){
	  return 0;
	  }
	  if (name.compareTo(p.getName()) > 0){
	  return 1;
	  }*/

	return 0;
    }
}

    
    
