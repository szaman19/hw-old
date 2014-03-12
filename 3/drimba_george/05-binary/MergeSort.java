import java.util.*;
import java.io.*;

public class MergeSort{

    public ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList<Comparable> b){

	ArrayList ans = new ArrayList<Comparable>();
	int spota = 0;
	int spotb = 0;

	while(spota < a.size() && spotb < b.size()){
	    if(a.get(spota).compareTo(b.get(spotb)) < 0){
		ans.add(a.get(spota));
		spota++;
	    }
	    else{
		ans.add(b.get(spotb));
		spotb++;
	    }
	}
	while(spota < a.size()){
	    ans.add(a.get(spota));
	    spota++;
	}
	while(spotb < b.size()){
	    ans.add(b.get(spotb));
	    spotb++;
	}
	return ans;
    }
    public ArrayList<Comparable> mergeSort(ArrayList<Comparable> arrayList){
	if(arrayList.size() <= 1){
	    return arrayList;
	}
	ArrayList a = new ArrayList<Comparable>();
	ArrayList b = new ArrayList<Comparable>();
	int i = 0;

	for(;i<arrayList.size()/2;i++){
	    a.add(arrayList.get(i));
	}

	for(;i<arrayList.size();i++){
	    b.add(arrayList.get(i));
	}

	a = mergeSort(a);
	b = mergeSort(b);
	arrayList = merge(a,b);
	return arrayList;
    }
}