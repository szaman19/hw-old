//Used the mergesort from the class code as a skeleton because I'm still debugging my own

import java.io.*;
import java.util.*;
public class mergeComp {

    public ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList<Comparable> b) {
	ArrayList<Comparable> result = new ArrayList();
	int ia=0,ib=0;
	int i=0;
	while (ia<a.size()&&ib<b.size()) {
	    if (a.get(ia).compareTo(b.get(ib)) < 0) {
		result.add(a.get(ia));ia++;
	    }  else {
		//result[i]=b[ib];ib++;
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
    
    public ArrayList<Comparable> compSort(ArrayList<Comparable> L) {	
	if (L.size()<=1){
	    return L;
	}
	
	ArrayList <Comparable> a = new ArrayList();
	ArrayList <Comparable> b = new ArrayList();

	int i;
	for (i=0;i<L.size()/2;i++){
	    a.add(L.get(i));
	}
	for ( ; i<L.size();i++){
	    b.add(L.get(i));
	}
	a = compSort(a);
	b = compSort(b);
	ArrayList<Comparable> result = merge(a,b);
	return result;
    }
   

    public static void main(String[] args){
	mergeComp a = new mergeComp();
	ArrayList<Comparable> x = new ArrayList();
	x.add(8);x.add(4);x.add(73);x.add(16);x.add(23);x.add(54);x.add(32);x.add(3);x.add(85);
	System.out.println(a.compSort(x));
	
    }

}
