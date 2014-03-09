import java.io.*;
import java.util.*;

public class MergeSort implements Comparable<MergeSort>{
    public ArrayList<Object> merge(ArrayList<Object> a,ArrayList<Object> b){
	ArrayList<Object> res = new ArrayList<Object>();
	int counta = 0;
	int countb = 0;
	int total = a.size() + b.size();
	for (int i = 0;i<total;i++){
	    if (a.size() <= counta){
		res.add(b.get(countb));
		countb = countb + 1;
	    }
	    else if (b.size() <= countb){
		res.add(a.get(counta));
		counta = counta + 1;
	    }
	    else {
		Object temp = a.get(counta);
		if (temp.compareTo(b.get(countb)) < 0){
		    res.add(a.get(counta));
		    counta = counta + 1;
		}
		else {
		    res.add(b.get(countb));
		    countb = countb + 1;
		}
	    }
	}
	return res;
    }

    public ArrayList<Object> msort(ArrayList<Object> L){
	if (L.size() <= 1){
	    return L;
	}
	else {
	    int half = L.size()/2;
	    ArrayList<Object> a = new ArrayList<Object>();
	    ArrayList<Object> b = new ArrayList<Object>();
	    for (int i = 0;i<L.size();i++){
		if (i < half){
		    a.add(L.get(i));
		}
		else {
		    b.add(L.get(i));
		}
	    }
	    a = msort(a);
	    b = msort(b);
	    L = merge(a,b);
	}
	return L;
    }
}
