public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String s, int x){
	name = s;
	age = x;
    }

    public int compareTo(Person p){
	//by age
	//return (this.age - p.age);

	//by name
	return (this.name.compareTo(p.name));
    }

    public String toString(){
	return name;
    }
}