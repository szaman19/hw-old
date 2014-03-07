import java.io.*;
import java.util.*;

public class MergeSort{
    public ArrayList<String> mSort(ArrayList<String> a){
	if (a.size() <= 1){
	    return a;
	}
	else{
	    int half = a.size()/2;
	    ArrayList<String> h1 = new ArrayList<String>();
	    ArrayList<String> h2 = new ArrayList<String>();
	    for (int i=0;i<half;i++){
		h1.add(a.get(i));
	    }
	    for (;i<a.size()-half;i++){
		h2.add(a.get(i));
	    }
	    h1 = mSort(h1);
	    h2 = msort(h2);
	    a = merge(h1, h2);
	}
    }
    
    public ArrayList<String> merge(ArrayList<String> x, ArrayList<String>y){
	ArrayList<String> result = new ArrayList<String>();
	int xcount = 0;
	int ycount = 0;
	for (int i=0; i<x.size()+y.size();i++){
	    if (x.get(xcount) < y.get(ycount)){
		result.add(y.get(ycount));
		ycount++;
	    }
	    //so I know that I have to compare the characters, just haven't reached that point yet
	    else {
		result.add(x.get(xcount));
		xcount++;
	    }
	}
    }

}
//sorry promise i will work on this later, i got home at 11:30
