public class Person implements Comparable {
    private String name;
    private int age;

    public Person() {
	name = new String("Foo Bar");
	age = 21;
    }

    public Person(String name, int age) {
	name = name;
	age = age;
    }

    public String getname() {
	return name;
    }
    public int getage() {
	return age;
    }

    public int compareTo(Object x) {
	if (x == null) {
	    throw(new NullPointerExcepton("\n Null"));
	}
	else if (! (x instanceof Person)) {
	    throw (new ClassCastException("\n Not a person"));
	}
	return (this.getname().compareTo(((Person)x).getname())) + (this.getage() - ((Person)x).getage());
	    }

    public boolean comp(Object y) {
	if (x == null) {
	    throw (new NullPointerException("\n Null"));
	}
	return ((x instanceof Person) || ((this.getName().compareTo(((person))x).getname()) == 0) && (this.getage() == (((Person)x).getage())));
    }
}
