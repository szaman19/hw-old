import java.io.*;
import java.util.*;

public class Person implements Comparable<Person>{
    private int age;
    private String name;

    public Person(){
	age = 5;
	name = "John";
    }

    public Person(int a, String n){
	age = a;
	name = n;
    }

    public int getAge(){
	return age;
    }

    public String getName(){
	return name;
    }

    /*    public int compareTo(Person p){
	if (age == p.getAge()){
	    return 0;
	}
	else if (age < p.getAge()){
	    return -1;
	}
	else {
	    return 1;
	}
    }

    */

    public int compareTo(Person p){
	if (name.equals(p.getName())){
	    return 0;
	}
	int a = name.length();
	int b = p.getName().length();
	int max;
	if (a > b){
	    max = b;
	}
	else {
	    max = a;
	}
	for (int i = 0;i<max;i++){
	    if (name.charAt(i) < p.getName().charAt(i)){
		return -1;
	    }
	    if (name.charAt(i) > p.getName().charAt(i)){
		return 1;
	    }
	}
	if (max == a){
	    return -1;
	}
	return 1;
    }
}
