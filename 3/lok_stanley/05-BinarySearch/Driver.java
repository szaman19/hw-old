import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[]args){
	/*
	MergeSort mergeSort = new MergeSort();
	
	ArrayList test = new ArrayList<String>();
	
	test.add("fun");
	test.add("apple");
	test.add("wow");
	test.add("google");
	test.add("tech");
	test.add("java");
	test.add("coffee");
	test.add("yes");
	test.add("no");
	
	test = mergeSort.mergeSort(test);
	
	for(int i = 0; i < test.size(); i++){
	    System.out.println(test.get(i));
	}
	*/

	PersonAge a = new PersonAge(10,"Bob");
	PersonAge b = new PersonAge(12,"Steve");

	System.out.println(a.compareTo(b));
	//Should be -1

	PersonName c = new PersonName(10, "Bob");
	PersonName d = new PersonName(12, "Steve");

	System.out.println(c.compareTo(d));
	//Should be a negative number

	BinarySearch test = new BinarySearch();

	int[] blah = {0,1,2,3,4,5,6,7,8,9,10};

	System.out.println(test.lbsearch(4,blah));
	//System.out.println(test.rbsearch(7,blah));
	//System.out.println(test.rbsearch(0,blah));
	//System.out.println(test.rbsearch(12,blah));

    }
}