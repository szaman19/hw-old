public class Person implements Comparable{
    private String name;
    private int age;

    public Person (String n, int a){
	name = n;
	age = a;
    }

    public int compareTo(Person other){
	if(this = other){
	    return this;
	}
	if(this.age > other.age)
	    return other.age;
	if(this.age < other.age)
	    return this.age;
	if(this.name > other.name)
	    return other.name;
	if(this.name < other.name)
	    return this.name;
    }
}
