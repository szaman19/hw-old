import java.util.*;
public class Driver {
    public static void main(String[] args) {
	MergeSort ms = new MergeSort();
	/*
        Random rand = new Random();
	int n = 14000000;
        int[] c = new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = rand.nextInt(1000);
	}
	
        int[] a = {1, 4, 6, 9, 32, 76};
        int[] b = {4, 36, 77};
        long start = System.currentTimeMillis();
        ms.mergeSort(c);
	long elapsed = System.currentTimeMillis();
	System.out.println(MergeSort:  + (elapsed - start));
	*/

	/*
	ArrayList<String> a = new ArrayList<String>();
	a.add("hello");
	a.add("how");
	a.add("are");
	a.add("you");
	a.add("today?");

	System.out.println(ms.mergeSortComparable(a));
	*/

	Person a = new Person("John", 42);
	Person b = new Person("Paul", 15);
	Person c = new Person("Ringo", 34);
	Person d = new Person("George", 56);

	ArrayList<Person> array = new ArrayList<Person>();
	array.add(a);
	array.add(b);
	array.add(c);
	array.add(d);

	System.out.println(ms.mergeSortComparable(array));

	
    }
}
