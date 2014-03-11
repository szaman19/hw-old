public class Person implements Comparable{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    public int compareTo(Object o) {
        Person p=(Person)o;
        return this.age - p.age ;

    }*/

    public int compareTo(Object o) {
        Person p=(Person)o;
        return this.name.compareTo(p.name);


    }


}
