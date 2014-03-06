import java.io.*;
import java.util.*;

public class Person implements Comparable {

    private int age;
    private String name;

    public Person() {
	name = "Bob";
	age = 30;
    }

    public Person(String n, int a) {
	name = n;
	age = a;
    }

}
