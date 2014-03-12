import java.io.*;
import java.util.*;

public class CompMergeSort {

    public ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList<Comparable> b) {
	ArrayList<Comparable> result = new ArrayList<Comparable>();
	for (int i = 0; i < a.size() + b.size(); i++) 
	    result.set(i, "-");
	int ia=0,ib=0;
	int i=0;
	while (ia < a.size() && ib < b.size() ) {
	    if (a.get(ia).compareTo(b.get(ib)) < 0) {
		result.set(i, a.get(ia));
		ia++;
	    }  
	    else {
		result.set(i, b.get(ib));
		ib++;
	    }
	    i++;
	}

	if (ia>=a.size()) {
	    for (;i<result.size();i++){
		result.set(i, b.get(ib));
		ib++;
	    }
	} else {
	    for (;i<result.size();i++){
		result.set(i, a.get(ia));
		ia++;
	    }
	}
	return result;
    }

    public ArrayList<Comparable> mergeSort(ArrayList<Comparable> L){
	if (L.size() <= 1){
	    return L;
	}
	
	ArrayList<Comparable> a = new ArrayList<Comparable>();
	for (int x = 0; x < L.size()/2; x++) 
	    a.set(x, "-");
	ArrayList<Comparable> b = new ArrayList<Comparable>();
	for (int y = 0; y < L.size() - a.size(); y++) 
	    b.set(y, "-");
	int i;
	for (i=0;i<L.size()/2;i++){
	    a.set(i, L.get(i));
	}
	for (; i<L.size();i++) {
	    b.set((L.size()-i-1), L.get(i));
	}
	a = mergeSort(a);
	b = mergeSort(b);
	ArrayList<Comparable> result = merge(a,b);
	return result;
    }

    public static void main ( String[] args ) {

	//I don't understand how to print the ArrayList--compilation errors always pop up...       

	/*	ArrayList<Comparable> test1 = new ArrayList<Comparable>();
	for (int i = 0; i < 6; i++ ) 
	    test1.add(Math.random() * 20);
	    System.out.println(Arrays.toString(mergeSort(test1)));*/

	ArrayList<Person> listy = new ArrayList<Person>();
	Person Pepe = new Person("Pepe", 12);
	Person Kiki = new Person("Kiki", 16);
	Person Flora = new Person("Flora", 15);
	Person Will = new Person("Will", 18);
	listy.add(Pepe);
	listy.add(Kiki);
	listy.add(Flora);
	listy.add(Will);
	System.out.println(mergeSort(listy));

    }

}
