import java.io.*;
import java.util.*;

public class merge implements Comparable {
     public ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){
	ArrayList<String> result = new ArrayList();
	int ia = 0, ib = 0;
	while (ia < a.size() || ib < b.size()){
	    if (a.get(ia).compareTo (b.get(ib)) > 0){
		result.add(b.get(ib));
		ib = ib + 1;
	    }
	    else if (a.get(ia).compareTo(b.get(ib)) < 0){
		result.add(a.get(ia));
		ia = ia + 1;
	    }
	    else if (ia >= a.size()){
		result.add(b.get(ib));
		ib = ib + 1;
	    else {
		result.add(a.get(ia));
		ia = ia + 1;
	    }
	}
	return result;
    }

    public ArrayList<String> msort (ArrayList<String> L){
	if (L.size() <= 1){
	    return L;
	}
	int half = L.size()/2;

	ArrayList<String> a = L.subList(0, half); //incompatible type??
	ArrayList<String> b = L.subList(half, L.size());
	// int i;
	// for (i=0; i<L.length/2; i++){
	//     a.add(L.get(i));
	// }
	// for (;i<L.size();i++){
	//     b.add(L.get(i));
	// }
	a = msort(a);
	b = msort(b);
	ArrayList<String> result = merge(a,b);
	return result;
    }

    public int compareTo(merge other){
return 
    }
}
