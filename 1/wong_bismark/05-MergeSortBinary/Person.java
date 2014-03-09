public class Person implements Comparable<Person> {

    int age;
    String name;

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

    public String toString(){
	String butt = name;
	butt = butt + " is " +  age + " years old.";
	return butt;
    }

    public int compareTo( Person other){
	//	int butt = age - other.getAge(); //Compare Age
	int butt = name.compareTo(other.getName());
	return butt;
    }

}