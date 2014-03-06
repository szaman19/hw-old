public class Person implements Comparable{
	String name;
	int age;
	
	public Person(int x, String y){
		name = y;
		age = x;
	}
	
	public int compareTo(Object y){
		if (age == ((Person)y).age)
			return name.compareTo(((Person)y).name);
		else
			return new Integer(age).compareTo(new Integer(((Person)y).age));
	}
	
	public String toString(){
		return name + "(" + age + ")";
	}
}