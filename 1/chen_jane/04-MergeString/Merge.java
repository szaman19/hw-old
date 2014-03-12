import java.io.*;
import java.util.*;

public class Merge {

    // using an array to merge strings
    // starts here
    public static String[] merge(String[] A, String[] B) {
	String[] sorted = new String[A.length + B.length];
	int a=0,b=0;
	for (int i=0; i<sorted.length; i++) {
	    if (a == A.length) {
		sorted[i] = B[b];
		b++;
	    }
	    else if (b == B.length) {
		sorted[i] = A[a];
		a++;
	    }
	    // compareString is true if a < b
	    else if ( compareString(A[a], B[b]) ) {
		sorted[i] = A[a];
		a++;
	    }
	    else {
		sorted[i] = B[b];
		b++;
	    }
	}
	return sorted;
    }

    public static String[] mergeSort(String[] A) {
	if (A.length <= 1) 
	    return A;
	else {
	    int half = A.length / 2;
	    String[] a = new String[half];
	    String[] b = new String[A.length - half];
	    for (int i=0; i<half; i++)
		a[i] = A[i];
	    for (int i=half; i<A.length; i++)
		b[i-half] = A[i];

	    a = mergeSort(a);
	    b = mergeSort(b);
	    return merge(a,b);
	}
    }

    public static boolean compareString(String a, String b) {
	// returns true if a is lower than b
	// note: capital letters are lower than lower case letters on ascii
	for (int i=0; i<a.length() && i<b.length() ; i++) {
	    if (a.charAt(i) < b.charAt(i))
		return true;
	    else
		return false;
	}
	return true;
    }

    public static String toString(String[] array) {
	String s = "{ ";
	for (int i=0; i<array.length; i++) {
	    s = s + array[i];
	    if (i != array.length-1)
		s = s + ", ";
	    else 
		s = s + " ";
	}
	s = s + "}";
	return s;
    }

    // using an ArrayList to merge
    // starts here vvvvvv

    public static ArrayList<String> merge(ArrayList<String> A, ArrayList<String> B) {
	ArrayList<String> sorted = new ArrayList<String>();
	int a=0,b=0;
	for (int i=0; i<A.size()+B.size(); i++) {
	    if (a == A.size()) {
		sorted.add(B.get(b));
		b++;
	    }
	    else if (b == B.size()) {
		sorted.add(A.get(a));
		a++;
	    }
	    else if (compareTo(A.get(a),B.get(b))) {
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

    public static ArrayList<String> mergeSort(ArrayList<String> A) {
	if (A.size() <= 1) 
	    return A;
	else {
	    int half = A.size() / 2;
	    ArrayList<String> a = new ArrayList<String>();
	    ArrayList<String> b = new ArrayList<String>();
	    for (int i=0; i<half; i++) 
		a.add(A.get(i));
	    for (int i=half; i<A.size(); i++)
		b.add(A.get(i));

	    a = mergeSort(a);
	    b = mergeSort(b);
	    return merge(a,b);
	}
    }

    public static boolean compareTo(String a, String b) {
	// returns true if a is lower than b
	// note: capital letters are lower than lower case letters on ascii
	for (int i=0; i<a.length() && i<b.length() ; i++) {
	    if (a.charAt(i) < b.charAt(i))
		return true;
	    else
		return false;
	}
	return true;
    }

    public static String toString(ArrayList<String> al) {
	String s = "{ ";
	for (int i=0; i<al.size(); i++) {
	    s = s + al.get(i);
	    if (i != al.size()-1)
		s = s + ", ";
	    else 
		s = s + " ";
	}
	s = s + "}";
	return s;
    }

    public static void main(String[] args) {
	Merge m = new Merge();
	ArrayList<String> test1 = new ArrayList<String>(Arrays.asList( "Alpha","Beta","Gamma","Nu" ));
	ArrayList<String> test2 = new ArrayList<String>(Arrays.asList( "Delta","Mu","epsilon" ));
	System.out.println(m.toString(merge(test1,test2)));

	ArrayList<String> a = new ArrayList<String>(Arrays.asList( "omega","upsilon","Tau","Phi","chi","Zeta","pi","Mu" ));
	System.out.println(m.toString(mergeSort(a)));

    }

}
