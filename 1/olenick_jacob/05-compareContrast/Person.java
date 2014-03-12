import java.io.*;
import java.util.*;

public class Person implements Comparable{

    private int age;
    private String name;
    private Random r = new Random();

    public Person(){
	age = r.nextInt(99)+1;
	for (int j = 0; j < r.nextInt(7)+3; j++){
	    name = name + (char)(r.nextInt(26) + 97);
	}
    }

    public int getAge(){
	return age;
    }
    public String getName(){
	return name;
    }

    public int compareTo(Object other){
	return age - ((Person)other).getAge();
    }

    public String toString(){
	return "" + age;
    }
}