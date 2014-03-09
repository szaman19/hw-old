public class Person implements Comparable{

    private String _name;
    private int _age;

    public Person(String name, int age) {
	_name = name;
	_age = age;
    }

    public String toString(Person person) {
	return person._name;
    }

    public int compareTo(Object person) {
	if(_age != ((Person)person)._age) {
	    return ((Integer)_age).compareTo(((Person)person)._age);
	}
	else {
	    return _name.compareTo(((Person)person)._name);
	}
    }

}
