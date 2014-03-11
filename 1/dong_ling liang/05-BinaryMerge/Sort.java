//I finished ib and rbsearch too, but won't put the code up until tomorrow morning because my github folders 
//are now messed up, so I'd rather do it manually via point and click


import java.io.*;
import java.util.*;

public class Sort {

    private int med;

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

    public int rbsearch(int n, int[] L){
	med = L.length;
	if (med < 1){
	    return -1;
	}
	else if (med == 1){
	    if med[0] == n { return 0; }
	    else {return -1; }
	}
	else {
	    int[] temp;
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
	    a.add(""+rand.nextInt(100000)/t);
	}
	a.add("apple");
	a.add("food");
	a.add("z");
	a.add("Z");

      
	ArrayList<Comparable> b  = new ArrayList<Comparable>();
	for (int i = 0; i<temp + 5; i++){
	    int t = (int)Math.pow(10, rand.nextInt(4));
	    b.add(rand.nextInt(100000)/t);
	}

	System.out.println(an.toString(a));
	System.out.println(an.toString(an.mergeSort(a)));
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
