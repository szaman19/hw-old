// I have no idea what I'm doing with Comparables here. Quite frankly, I really dont know how to work with comparables at all, I didnt go over that last semester.
// <E extends Comparable<? super E>> <- I just got this by trying lots of stuff and looking at stack overflow...
// this version still has bugs that needs to be fixed

import java.util.*;
import java.lang.*;
public class MergeSort2 {
   
    public static <E extends Comparable<? super E>> ArrayList<E> merge(ArrayList<E> A, ArrayList<E> B){
        int a = 0;// index of ArrayList<E> A
	int b = 0;// index of ArrayList<E> B

	int c = 0; // index of completed array
	ArrayList<E> C = new ArrayList<E>();

	while (a <A.size() && b <B.size()){
	    if (A.get(a).compareTo(B.get(b))<0){
		C.add(A.get(a));
		a++;
	    }
	    else{
		C.add(B.get(b));
		b++;
	    }
	    c++; 
	}
	while (a<A.size()){
	    C.add(A.get(a));
	    c++;
	    a++;
	}
	while (b<B.size()){
	    C.add(B.get(b));
	    b++;
	    a++;
	}
	return C;
    }

    public static <E extends Comparable<? super E>> ArrayList<E> msort(ArrayList<E> L){
	if (L.size() <= 1){
	    return L;
	}
	else{
	    ArrayList<E> a = new ArrayList<E>(L.subList(0, L.size()/2));
	    ArrayList<E> b = new ArrayList<E>(L.subList(L.size()/2, L.size()));
	    ArrayList<E> A = msort(a);
	    ArrayList<E> B = msort(b);
	    L= merge(A,B);
	    return L;
	}
    }
   
    public static void main (String[]args){
	ArrayList<String> Y = new ArrayList<String>();
	Y.add("Apples");
	Y.add("Pineapples");
	Y.add("Pears");
	Y.add("Kiwi");
	Y.add("Banana");

	System.out.println("TEST WITH Strings******************\n"+Y.toString());
	ArrayList<String> ans = msort(Y);
	System.out.println(ans.toString());

	ArrayList<Integer> Z = new ArrayList<Integer>();
	Z.add(4);
	Z.add(34);	
	Z.add(0);
	Z.add(2);
	Z.add(21);
	System.out.println("TEST WITH INTS******************\n"+ Z.toString() );
	Z = msort(Z);
	System.out.println(Z.toString());

	ArrayList<Person> A = new ArrayList<Person>();
	A.add(new Person("Joyce", 15));
	A.add(new Person("Abel", 23));
	A.add(new Person("Shawn", 45));
	A.add(new Person("Mina", 5));
	A.add(new Person("Jack", 32));
	System.out.println("TEST WITH Person******************\n"+A.toString());
	A=msort(A);
	System.out.println(A.toString());
        }
}