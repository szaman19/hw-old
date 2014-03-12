public class Person implements Comparable<Person> {

    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age; 
        this.name = name;
    }

    public int compareTo(Person other) {
        return ((Integer)age).compareTo(other.age);
    }
}
