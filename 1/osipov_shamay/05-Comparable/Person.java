class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name,int age){
	this.name = name;
	this.age = age;
    }

    public int compareTo(Person other){
        //int last = (this.name).compareTo(other.name);
	int last = (this.age).compareTo(other.age);
        return last;
    }
}
