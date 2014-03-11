import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	MergeSort m = new MergeSort();
	ArrayList<Comparable> L = new ArrayList<Comparable>();
	L.add("q");
	L.add("w");
	L.add("e");
	L.add("r");
	System.out.println(m.msort(L));
	ArrayList<Comparable> l = new ArrayList<Comparable>();
	l.add(1);
	l.add(5);
	l.add(3);
	l.add(2);
	System.out.println(m.msort(l));
	
	Person p = new Person();
	Person q = new Person(9,"Joe");
	System.out.println(p.compareTo(q));

	BinarySearch b = new BinarySearch();
	int[] a = {1,2,3,4,5,6,7};
	System.out.println(b.rbsearch(1,a));
	System.out.println(b.ibsearch(7,a));
	
    }
}
