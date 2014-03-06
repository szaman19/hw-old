import java.io.*;
import java.util.*;

public class Person implements Comparable{
	public int age;
	public String name;
	
	public Person(int a, String n){
		age = a;
		name = n;
	}
	
	public int compareTo(Person other){
		if (this.age > other.age)
			return 1;
		else if (this.age < other.age)
			return -1;
		else{
			if (((this.name).compareTo(other.name))>0)
				return 1;
			if (((this.name).compareTo(other.name))==0)
				return 0;
			else
				return -1;
		}
	}
}