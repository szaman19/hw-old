import java.io.*;
import java.util.*;

public class Person implements Comparable{
    public String name;
    public int age;
    Random r = new Random();

    public Person(){
	name = "Fred";
	age = r.nextInt(30);
    }
    public Person(String n,int a){
	name = n;
	age = a;
    }
   
    public int compareTo(Object o){
	this.name = x;
	o.name = y;
	return x.compareToIgnoreCase(y);
    }

}