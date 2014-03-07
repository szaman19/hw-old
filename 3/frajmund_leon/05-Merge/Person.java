public class Person implements Comparable<Person>{
    private int age;
    private String name;

    public Person(){
	age = 17;
	name = "Benedict";
    }

    public Person(int age, String name){
	this.age = age;
	this.name = name;
    }

    public String getName(){
	return name;
    }

    public int compareTo(Person other){
	if (this.age < other.age)
	    return -1;
	if(this.age == other.age)
	    return 0;
	return 1;
    }
}