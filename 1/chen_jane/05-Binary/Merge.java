import java.io.*;
import java.util.*;

public class Merge {

    public static ArrayList<Comparable> mergeSort(ArrayList<Comparable> A) {
	if (A.size() <= 1)
	    return A;
	else {
	    ArrayList<Comparable> a = new ArrayList<Comparable>();
	    ArrayList<Comparable> b  = new ArrayList<Comparable>();
	    int half = A.size() / 2;
	    for (int i=0; i<half; i++) {
		if (i < half) {
		    a.add(A.get(i));
		}
		else {
		    b.add(A.get(i));
		}
	    }
	    a = mergeSort(a);
	    b = mergeSort(b);
	    return merge(a,b);
	}
    }

    public static ArrayList<Comparable> merge(ArrayList<Comparable> A, ArrayList<Comparable> B) {
	ArrayList<Comparable> sorted = new ArrayList<Comparable>();
	int a=0, b=0;
	for (int i=0; i<A.size()+B.size(); i++) {
	    if (a == A.size()) {
		sorted.add(B.get(b));
		b++;
	    }
	    else if (b == B.size()) {
		sorted.add(A.get(a));
		a++;
	    }
	    else if (B.get(b).compareTo(A.get(a)) < 0) {
		sorted.add(A.get(a));
		a++;
	    }
	    else {
		sorted.add(B.get(b));
		b++;
	    }
	}
	return sorted;
    }

    public static String toString(ArrayList<Comparable> array) {
	String s = "{ ";
	for (int i=0; i<array.size(); i++) {
	    s = s + array.get(i);
	    if (i != array.size() - 1)
		s = s + ", ";
	    else
		s = s + " ";
	}
	s = s + "} ";
	return s;
    }

    public static void main(String[] args) {
	ArrayList<Comparable> L = new ArrayList<Comparable>();
	L.add(new Person());
	L.add(new Person("Helen", 15));
	L.add(new Person("Troy", 10));
	L.add(new Person("Susan",20));
	L.add(new Person("Chris",22));
	L.add(new Person("Shiro",18));
	System.out.println(toString(mergeSort(L)));

	Person p1 = new Person();
	Person p2 = new Person("Sam",18);
	Person p3 = new Person("Tom",30);
	System.out.println(p1.compareTo(p2));
	System.out.println(p2.compareTo(p1));
	System.out.println(p1.compareTo(p3));
    }
}
