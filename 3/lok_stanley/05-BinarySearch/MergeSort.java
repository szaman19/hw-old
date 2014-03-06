import java.util.*;
import java.io.*;

public class MergeSort{

    public ArrayList merge(ArrayList a, ArrayList b){

	ArrayList ans = new ArrayList();
	int apos = 0;
	int bpos = 0;

	while(apos < a.size() && bpos < b.size()){
	    if(a.get(apos).compareTo(b.get(bpos)) < 0){
		ans.add(a.get(apos));
		apos++;
	    }
	    else{
		ans.add(b.get(bpos));
		bpos++;
	    }
	}
	while(apos < a.size()){
	    ans.add(a.get(apos));
	    apos++;
	}
	while(bpos < b.size()){
	    ans.add(b.get(bpos));
	    bpos++;
	}
	return ans;
    }

    public ArrayList mergeSort(ArrayList arrayList){
	if(arrayList.size() <= 1){
	    return arrayList;
	}

	ArrayList a = new ArrayList();
	ArrayList b = new ArrayList();

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