public class Person implements Comparable<Person>{
    
    private int age;
    private String name;
   
    public Person(int age, String name){
	this.age = age;
	this.name = name;
    }

    public int compareTo(Person p){
	if (p.age != age){
	    return age - p.age;
	} else {
	    return name.compareTo(p.name);
	}
    
    }
    public String toString(){
	return name + ": " + age;
    }

    
}