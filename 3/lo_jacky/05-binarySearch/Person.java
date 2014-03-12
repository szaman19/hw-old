import java.util.ArrayList;

public class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age){
	this.name = name;
	this.age = age;
    }

    public String getName(){
	return name;
    }

    public int getAge(){
	return age;
    }

    public int compareTo(Object o){//compare person's name or age
	Person per = (Person)o;
        if (this.age != per.getAge())
	    return age - per.getAge();
	return name.compareTo(per.getName());
    }

    public static void main(String[] args){
	Person Jacky = new Person("Jacky", 16);
	Person Allen = new Person("Allen", 16);
	Person Michelle = new Person("Michelle", 15);
	System.out.println(Jacky.compareTo(Allen));
	System.out.println(Jacky.compareTo(Michelle));
	System.out.println(Allen.compareTo(Michelle));
    }
}
    
    
