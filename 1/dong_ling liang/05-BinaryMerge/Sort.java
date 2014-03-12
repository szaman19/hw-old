import java.io.*;
import java.util.*;

public class Sort {


    public ArrayList<Comparable> mergeSort(ArrayList<Comparable> alist){
	if (alist.size() <= 1){
	    return alist;
	}
	else {
	    int temp = alist.size();
	    ArrayList<Comparable> x = new ArrayList<Comparable>();
	    for (int i = 0; i< temp/2; i++){
		x.add(alist.get(i));
	    }
	    ArrayList<Comparable> y = new ArrayList<Comparable>();
	    for (int i = temp/2; i<alist.size(); i++){
		y.add(alist.get(i));
	    }
	    x = mergeSort(x);
	    y = mergeSort(y);
	    alist = merge(x, y);
	    return alist;
	}
    }
    public static int rbSearch(int[] L, int n){
	return rbSearch(n, L, 0, L.length-1);
    }

    public static int rbSearch(int n, int[] L, int low, int high){
	int med = (high+low)/2;
	if (low>high)
	    return -1;
	if (L[med] == n)
	    return med;
	else if (L[med] > n)
	    return rbSearch(n, L, low, med-1);
	else if (L[med] < n)
	    return rbSearch(n, L, med+1, high);
	else
	    return -1;	
    }

    public static int ibSearch(int[] A, int val){
	int low = 0;
	int high = A.length-1;
	while (low <= high){
	    int med = (low+high)/2;
	    if (A[med] == val)
		return med;
	    else if (A[med] > val)
		high = med - 1;
	    else if (A[med] < val)
		low = med + 1;
	}
	return -1;
    }

    public String toString(ArrayList<Comparable> alist){
	String ret = "";
	for (int i = 0; i<alist.size(); i++){
	    ret += alist.get(i) + " ";
	}
	return ret;
    }
    
    public ArrayList<Comparable> merge(ArrayList<Comparable> A, ArrayList<Comparable> B){
	ArrayList<Comparable> C = new ArrayList<Comparable>();
	int a = 0;
	int b = 0;
	for (int i = 0 ; i < A.size() + B.size() ; i++){
	    if (a<A.size() && b<B.size()){
		if (A.get(a).compareTo(B.get(b)) <= 0 ){
		    C.add(A.get(a));
		    a++;
		}
		else {
		    C.add(B.get(b));
		    b++;
		}
	    }
	    else if (a>=A.size()){
		C.add(B.get(b));
		b++;
	    }
	    else if (b>=B.size()){
		C.add(A.get(a));
		a++;
	    }
	}
	return C;
    }
    public static void main(String[] args){
	Random rand = new Random();
	Sort an = new Sort();
	ArrayList<Comparable> a  = new ArrayList<Comparable>();
	int temp = rand.nextInt(10);
	for (int i = 0; i<temp + 5; i++){
	    int t = (int)Math.pow(10, rand.nextInt(4));
	    a.add(rand.nextInt(100000)/t);
	}

	int[] aa = new int[a.size()];
	for (int i = 0; i<aa.length; i++){
	    aa[i] = i + 1;
	}

	System.out.println("rb and ibsearch below");
	System.out.println("answer: 2");
	System.out.println(rbSearch(aa, aa[2]));
	System.out.println(ibSearch(aa, aa[2]));

	ArrayList<Comparable> ab = new ArrayList<Comparable>();
	for  (int i = 0; i<a.size(); i++){
	    ab.add("" + a.get(i));
	}

	ab.add("apple");
	ab.add("food");
	ab.add("z");
	a.add("Z");

      
	ArrayList<Comparable> b  = new ArrayList<Comparable>();
	for (int i = 0; i<temp + 5; i++){
	    int t = (int)Math.pow(10, rand.nextInt(4));
	    b.add(rand.nextInt(100000)/t);
	}

	System.out.println(an.toString(ab));
	System.out.println(an.toString(an.mergeSort(ab)));
	System.out.println("\n Above is String sort, below is int sort \n");
	System.out.println(an.toString(b));
	System.out.println(an.toString(an.mergeSort(b)));

	ArrayList<Comparable> al = new ArrayList<Comparable>();
	Person jack = new Person("Jack Frost", 18);
	Person elsa = new Person("Elsa", 18);
	Person anna = new Person("Anna", 16);
	al.add(jack);
	al.add(elsa);
	al.add(anna);
	System.out.println(an.toString(al));
	System.out.println(an.toString(an.mergeSort(al)));
    }


}