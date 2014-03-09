public class Person implements Comparable {

    private String name;
    private int age;

    public Person(String a, int b) {
	name = a;
	age = b;
    }

    public int compareTo(Object p) {
	return ageTest((Person)p);
	//return nameTest((Person)p);
    }

    public int ageTest(Person q) {
	return age - q.age;
    }

    public int nameTest(Person r) {
	return name.compareTo(r.name);
    }

}
