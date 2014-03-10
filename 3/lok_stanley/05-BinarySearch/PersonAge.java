import java.util.*;
import java.io.*;

public class PersonAge implements Comparable{

    private int age;
    private String name;

    public Person(int age, String name){
	this.age = age;
	this.name = name;
    }


    public int compareTo(Person in){
	if(in.getAge < age){
	    return -1;
	}
	else if(in.getAge == age){
	    return 0;
	}
	return 1;
    }


    public int getAge(){
	return age;
    }
    
    public String getName(){
	return name;
    }

}