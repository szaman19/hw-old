import java.util.*;
import java.lang.*;
abstract public class MergeSort2 implements Comparable {
   
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
	MergeSort X = new MergeSort();
	ArrayList<String> Y = new ArrayList<String>();
	Y.add("Apples");
	Y.add("Asdf");
	Y.add("Zsdf");
	Y.add("Bsdf");
	Y.add("bsdf");

	System.out.println(Y.toString());
	ArrayList<String> ans = X.msort(Y);
	System.out.println(ans.toString());

	MergeSort A = new MergeSort();
	ArrayList<Integer> Z = new ArrayList<Integer>();
	Z.add(4);
	Z.add(34);	
	Z.add(0);
	Z.add(2);
	Z.add(21);
	System.out.println(Z.toString());
	Z = A.msort(Z);
	System.out.println(Z.toString());




    }
}