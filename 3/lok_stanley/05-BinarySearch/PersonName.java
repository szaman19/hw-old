import java.util.*;
import java.io.*;

public class PersonName implements Comparable<PersonName>{

    private int age;
    private String name;
    
    public PersonName(int age, String name){
	this.age = age;
	this.name = name;
    }
    
    
    public int compareTo(PersonName in){
	return name.compareTo(in.getName());
    }


    public int getAge(){
	return age;
    }
    
    public String getName(){
	return name;
    }

}