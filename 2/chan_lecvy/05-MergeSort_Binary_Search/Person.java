public class Person implements Comparable {

    String name;
    int age;

    public Person (String ename, int eage) {
	name = ename;
	age = eage;
    }
    /*
    public int compareTo (Object a) {
	return name.compareTo (((Person)a).name);
    }
    */
    public int compareTo (Object a) {
	if (age > ((Person)a).age)
	    return 1;
	if (age < ((Person)a).age)
	    return -1;
	return 0;
    }


    public String toString () {
	return name + " " + age;
    }

}


