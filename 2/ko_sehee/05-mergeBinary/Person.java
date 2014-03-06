public class Person implements Comparable{
    private int age;
    private String name;
    public Person(){
	name = "Christina Ko";
	    age = 16;
    }
    public Person(int a, String n){
	age = a;
	name = n;
    }
    public String getName(){
	return name;
    }
    public int getAge(){
	return age;
    }
} 
	