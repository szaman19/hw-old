public class Person implements Comparable{
    private int age;
    private String name;

    public Person(int age, String name){
	this.age = age;
	this.name = name;
    }

    public int getAge(){
	return age;
    }

    public String getName(){
	return name;
    }
    
    public int compareTo(Person other){
	return age - other.getAge();
    }

    /*   
 public String compareTo(Person other){
	return name.compareTo(other.getName());
    */
    }
}
