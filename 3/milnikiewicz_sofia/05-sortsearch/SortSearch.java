import java.io.*;
import java.util.*;


//this ALMOST works

public class SortSearch{

    public ArrayList<Comparable> a;
    Random rnd;

    public static void main (String[] args){
	int n = Integer.parseInt(args[0]);
	long start,elapsed;

	SortSearch s = new SortSearch(n);

	System.out.println();
	System.out.println("Initial Array: " + s.toString());
	System.out.println();
	
	/*System.out.println("Starting");
	  start = System.currentTimeMillis();*/
	ArrayList<Comparable> d = new ArrayList<Comparable>();
	d = s.msort(s.a);
	/*elapsed = System.currentTimeMillis()-start;*/
	System.out.println("Merge sort: "+d);
	/*System.out.println("Time: "+elapsed+"\n");*/
    }

    public SortSearch(int n){
	rnd = new Random();
	a = new ArrayList<Comparable>(n);
	for (int i=0;i<n;i++)
	    a.add(rnd.nextInt(100));
    }

    public SortSearch() {
	this(20);
    }

    public String toString() {
	return ""+a;
    }

    public ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList<Comparable> b) {
	ArrayList<Comparable> result = new ArrayList<Comparable>(a.size()+b.size());
	int ia=0,ib=0;
	int i=0;
	while (ia<a.size()&&ib<b.size()) {
	    if (a.get(ia).compareTo(b.get(ib))<-1) {
		result.add(a.get(ia));ia++;
	    }  else {
		result.add(b.get(ib));ib++;
	    }
	    i++;
	}

	if (ia>=a.size()) {
	    for (;i<result.size();i++){
		result.add(b.get(ib));ib++;
	    }
	} else {
	    for (;i<result.size();i++){
		result.add(a.get(ia));ia++;
	    }
	}
	return result;
    }
    
    public ArrayList<Comparable> msort(ArrayList<Comparable> L) {
	
	if (L.size()<=1){
	    return L;
	}
        ArrayList<Comparable> a = new ArrayList<Comparable>(L.size()/2);
	ArrayList<Comparable> b = new ArrayList<Comparable>(L.size() - a.size());

	int i;
	for (i=0;i<a.size();i++){
	    a.set(i, L.get(i));
	}
	for ( ; i<L.size();i++){
	    b.set(i-a.size(),L.get(i));
	}
	a = msort(a);
	b = msort(b);
	ArrayList<Comparable> result = merge(a,b);
	return result;

    }
}

