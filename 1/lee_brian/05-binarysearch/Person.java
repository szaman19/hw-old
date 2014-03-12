  import java.io.*;
  import java.util.*;
  
  public class Person implements Comparable{
      public String name;
      public int age;
  
      public Person(String n, int a){
  	name = n;
  	age = a;
      }
  
      public int compare(Object x){
  	if (age > ((Person)x).age){
  	    return 1;
  	}
  	if (age < ((Person)x).age){
  	    return -1;
  	}
  	return 0;
      }
  
      public String toString(){
  	return name + " " + age;
      }
  }
      
