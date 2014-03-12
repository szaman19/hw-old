
public class Person implements Comparable{
    private String _name;
    private int _age;
    public Person(String name, int age) {
	_name = name;
	_age = age;
    }
    public String getName() {
	return _name;
    }
    public int getAge() {
	return _age;
    }
    public int compareTo (Object o) {
	return _name.compareTo(((Person)o).getName());
    }
    public String toString(){
	return "" + _name + _age;
    }
}
