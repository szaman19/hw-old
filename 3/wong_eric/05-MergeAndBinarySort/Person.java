public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String n, int a) {
	this.name = n;
	this.age = a;
    }

    public int getAge() {
	return age;
    }
    public String getName() {
	return name;
    }

    public String toString() {
	String result = this.name + " is " + this.age + " old.";
	return result;
    }

    public int compareTo(Person a) {
	if (this.age < a.getAge())
	    return -1;
	else if (this.age > a.getAge())
	    return 1;
	else 
	    return this.name.compareTo(a.getName());
    }

}