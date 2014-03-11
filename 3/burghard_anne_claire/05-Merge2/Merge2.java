import java.io.*;
import java.util.*;
public class Merge2{
    
    public ArrayList<Comparable>() merge(ArrayList<Comparable> a, ArrayList<Comparable> b) {

	ArrayList<Comparable> result = new ArrayList<Comparable>[a.size()+b.size()];
	int ia=0,ib=0;
	int i=0;
	while (ia<a.size() && ib<b.size()) {
	    if (a.get(ia).compareTo(b.get(ib)) < 0) {
		result.get(i) = a.get(ia);
		ia++;
	    }  
	    else {
		result.set(i, b.get(ib));
		ib++;
	    }
	    i++;
	}
	if (ia.compareTo(a.size()) >=0){
	    for (;i<result.size();i++){
		result.set(i,b.get(ib));
		ib++;
	    }
	}
	else{
	    for (;i<result.length;i++){
		result.set(i,a.get(ia));
		ia++;
	    }
	}
	return result;
    }
    
    public ArrayList<Comparable> msort(ArrayList<Comparable> L) {
	
	if (L.size <= 1){
	    return L;
	}
       	ArrayList<Comparable> a = new int[L.size()/2];
	ArrayList<Comparable> b = new int[L.size() - a.size()];
	
	int i;
	for (i=0;i<a.size();i++){
	    a.set(i, L.get(i));
	}
	for ( ; i<L.size();i++){
	    b.set(i-a.size, L.get(i));
	}
	a = msort(a);
	b = msort(b);
	ArrayList<Comparable> result = merge(a,b);
	return result;
    }
    
}
