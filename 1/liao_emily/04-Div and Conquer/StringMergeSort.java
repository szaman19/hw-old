import java.io.*;
import java.util.*;

public class StringMergeSort {

    public ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b) {
	ArrayList<String> result = new ArrayList<String>();
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

    public ArrayList<String> msort(ArrayList<String> L){
	if (L.size() <= 1){
	    return L;
	}
	
	ArrayList<String> a = new ArrayList<String>();
	for (int x = 0; x < L.size()/2; x++) 
	    a.set(x, "-");
	ArrayList<String> b = new ArrayList<String>();
	for (int y = 0; y < L.size() - a.size(); y++) 
	    b.set(y, "-");
	int i;
	for (i=0;i<L.size()/2;i++){
	    a.set(i, L.get(i));
	}
	for (; i<L.size();i++) {
	    b.set((L.size()-i-1), L.get(i));
	}
	a = msort(a);
	b = msort(b);
	ArrayList<String> result = merge(a,b);
	return result;
    }

}
