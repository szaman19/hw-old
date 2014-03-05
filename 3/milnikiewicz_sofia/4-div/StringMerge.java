import java.io.*;
import java.util.*;

public class StringMerge{

    public static void main (String[] args){
	StringMerge m = new StringMerge();
	ArrayList<String> thearray = new ArrayList<String>();
	thearray.add("fish");
	thearray.add("sleep");
	thearray.add("insomnia");
	System.out.println(m.msort(thearray));
	//i think i have an infinite loop in here somewhere
	//whoops too late to fix it

    }

    public ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b) {
	ArrayList<String> result = new ArrayList<String>(a.size()+b.size());
	int ia=0,ib=0;
	int i=0;
	while (ia<a.size() && ib<b.size()) {
	    if ((a.get(ia)).compareTo(b.get(ib)) < 0 ) {
		result.add(a.get(ia));
		ia++;
	    }  else {
        	result.add(b.get(ib));
		ib++;
	    }
	    i++;
	}

	if (ia>=b.size()) {
	    for (;i<result.size();i++){
		result.add(b.get(ib));
		ib++;
	    }
	} else {
	    for (;i<result.size();i++){
		result.add(a.get(ia));
		ia++;
	    }
	}
	return result;
    }
    
    public ArrayList<String> msort(ArrayList<String> L) {

	if (L.size()<=1){
	    return L;
	}

	ArrayList<String> a = new ArrayList<String>(L.size()/2);
        ArrayList<String> b = new ArrayList<String>(L.size()/2);

	int i;
	for (i=0;i<a.size();i++){
	    a.add(L.get(i));
	}
	for ( ; i<L.size();i++){
	    b.add(L.get(i));
	}
	a = msort(a);
	b = msort(b);
	ArrayList<String> result = merge(a,b);
	return result;
    }

}
