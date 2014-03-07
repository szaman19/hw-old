import java.util.*;
import java.io.*;

public class PersonName implements Comparable{

    private int age;
    private String name;
    
    public Person(int age, String name){
	this.age = age;
	this.name = name;
    }
    
    
    public int compareTo(Person in){
	if(in.getName.compareTo(name)){
	    return -1;
	}
	else if(in.getName.compareTo(name)){
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