import java.util.*;
import java.io.*;

public class Person implements Comparable<Person>{

    public int age = 0;
    public String name = "";
    public Person(int x, String y){
	age = x;
	name = y;
    }    
    public void setAge(int x){
	age = x;
    }
    public int getAge(){
	return age;
    }
    public void setName(String y){
	name = y;
    }
    public String getName(){
	return name;
    }
    public static void main(String[] arrgs){
	Person a = new Person(24, "Stew");
	Person b = new Person(16,"Abe");
	System.out.println(a.getAge());
	System.out.println(a.getName());
	a.comparableTo(b);
    }
      public void comparableTo(Person b){
	if(getName().compareTo(b.getName())>0){
	    System.out.println(getName() + "alphabetically precedes" + b.getName()); 
	}else{
	    System.out.println(b.getName() + "alphabetically precedes" + getName()); 
	}
	if(getAge()>b.getAge()){
	    System.out.println(getName() + "is older than" + b.getName());
	}else{
	    System.out.println(b.getName() + "is older than" + getName());	
	}    
    }
    
}
