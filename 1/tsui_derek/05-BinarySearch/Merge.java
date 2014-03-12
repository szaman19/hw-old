import java.util.*;
public class Merge{
    public static ArrayList<Comparable> mergeSort(ArrayList<Comparable> A){
	if (A.size() == 1) return A;
	else {
	    ArrayList<Comparable> B = new ArrayList<Comparable>();
	    ArrayList<Comparable> C = new ArrayList<Comparable>();
	    
	    for (int x = 0; x < A.size() / 2; x++){
		B.add(A.get(x));
	    }
	    for (int x = B.size(); x < A.size(); x++){
		C.add(A.get(x));
	    }
	
	    A = merge(mergeSort(B),mergeSort(C));
	    return A;
	}
    }

    public static ArrayList<Comparable> merge(ArrayList<Comparable> A, ArrayList<Comparable> B){
	ArrayList<Comparable> C = new ArrayList<Comparable>();
	
	int apos = 0;
	int bpos = 0;
	for (int x = 0; x < A.size() + B.size(); x++){
	    if (apos >= A.size()){
			C.add(B.get(bpos));
			bpos++;
	    } else if (bpos >= B.size()){
			C.add(A.get(apos));
			apos++;
	    } else {
			if (B.get(bpos).compareTo(A.get(apos)) <= 0) {
			    C.add(B.get(bpos));
			    bpos++;
			} else {
			    C.add(A.get(apos));
			    apos++;				
			}
	    }
	}
	return C;
    }
	
    public static void printArray (ArrayList<Comparable> a){
	for (Comparable x : a){
	    System.out.print(x + ", ");
	}
	System.out.println();
    }

    public static void main(String[] args){
	/*
	ArrayList<Comparable> c = new ArrayList<Comparable>();
	for (int x = 0; x < 100; x++){
	    c.add((int)(Math.random()*100));
	}
	printArray(c);
	c = mergeSort(c);
	printArray(c);
	*/
	ArrayList<Comparable> c = new ArrayList<Comparable>();
	c.add(new Person("Bob", 25));
	c.add(new Person("Al", 15));
	c.add(new Person("Cat", 20));
	c.add(new Person("Dee", 30));
     
	printArray(c);
	c = mergeSort(c);
	printArray(c);
    }
}