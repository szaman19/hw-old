import java.io.*;
import java.util.*;

public class person implements Comparable{
	String name;
	Integer age;

	public int compareTo(person other){
		int compares = this.name.compareTo(other.name);
        if (compares == 0) {
        	return this.age.compareTo(other.age);
        }
	}

}