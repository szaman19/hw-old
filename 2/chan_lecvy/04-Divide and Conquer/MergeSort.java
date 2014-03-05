import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class MergeSort {

    public ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b) {
	ArrayList <String> c = new ArrayList <String>(a.size() + b.size());
	int ia = 0, ib = 0;
	int i = 0;
	while (ia <a.size() && ib < b.size()) {
	    if (a.get(ia).compareTo(b.get(ib)) <= 0) {
		c.add(i,a.get(ia));
		      ia++;
	    }
	  
		else {
		    c.add(i,b.get(ib));
		    ib++;
		}
	    i++;
	}


	if (ia>=a.size()) {
	    for (;i<c.size();i++){
		c.add (i,b.get(ib));
		ib++;
	    }
	} else {
	    for (;i<c.size();i++){
		c.add(i,a.get(ia));
		ia++;
	    }
	}

	return c;
    }

    public ArrayList<String> msort(ArrayList <String> array){
	if (array.size()<=1) {
	    return array;
	}
	ArrayList<String> a = new ArrayList<String>(array.subList(0,array.size()/2));
	ArrayList<String> b = new ArrayList<String>(array.subList (array.size()/2, array.size()));

	
	System.out.println (a);
	System.out.println (b);
	

	a = new ArrayList <String>(msort (a));
	b = new ArrayList<String>(msort (b));
	array = new ArrayList<String> (merge(a,b));
	return array;

    }
	/*
	int[] a = new int[L.length/2];
	int[] b = new int[L.length-a.length];
	int i;
	for (i=0;i<a.length;i++) {
	    a[i]=L[i];
	}
	for (;i<L.length;i++){
	    b[ i-a.length] = L[i];
	}	    

	a = msort(a);
	b = msort(b);
	int[] result = merge(a,b);
	return result;
	} */
   public static void main(String[] args) {
       MergeSort m = new MergeSort();
       String []  list = {"John", "Cena", "Chicken", "Pokemon", "Yolofanclub"};
       
       ArrayList <String> foo = new ArrayList<String> ();
       for (String i : list) 
	   foo.add(i);
       System.out.println (foo);
       foo = new ArrayList <String> (m.msort(foo));
       System.out.println (foo);
 

   }
}