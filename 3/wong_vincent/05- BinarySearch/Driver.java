import java.io.*;
import java.util.*;
public class Driver {
    
    public static Comparable max(Comparable a, Comparable b) {
	if (a.compareTo(b) > 0)
	    return a;
	else
	    return b;
    }
    
    public static void main(String[] args) {
	List <Integer> ints = new ArrayList <Integer>();
	ints.add(10);
	ints.add(6);
	ints.add(70);
	ints.add(45);
	ints.add(90);
	ints.add(56);
	ints.add(11);

	List <String> strings = new ArrayList <String>();
	strings.add(10);
	strings.add(6);
	strings.add(70);
	strings.add(45);
        strings.add(90);
	strings.add(56);
	strings.add(11);
	
	MergeSort A = new MergeSort();
	A.msort(ints);
	A.msort(strings);
    }
}

