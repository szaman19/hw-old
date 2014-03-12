import java.util.*;
import java.io.*;

public class MergeSort{

    public ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){

	ArrayList ans = new ArrayList<String>();
	int apos = 0;
	int bpos = 0;
	/*	
	while(anspos < ans.length){
	    if(a[apos] < b[bpos]){
		ans[anspos] = a[apos];
		if(apos + 1 < a.length){
		    apos++;
		    anspos++;
		}
		else{
		    a[apos] = b[bpos];
		    anspos++;
		}
	    }
	    else{
		ans[anspos] = b[bpos];
		if(bpos + 1 < b.length){
		    bpos++;
		    anspos++;
		}
		else{
		    anspos++;
		    b[bpos] = a[apos];
		}
	    }
	}
	*/
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
    /*
    public int[] mergeSort(int[] L){

	if (L.length <= 1){
	    return L;
	}
	
	int[]a = new int[L.length/2];
	int[]b = new int[(L.length) - (L.length/2)];
	int count = 0;
	
	for(int i = 0; i < a.length; i++){
	    a[i] = L[count];
	    count++;
	}

	for(int i = 0; i < b.length; i++){
	    b[i] = L[count];
	    count++;
	}

	a = mergeSort(a);
	b = mergeSort(b);

	L = merge(a,b);
	return L;
    }
    */
    public ArrayList<String> mergeSort(ArrayList<String> stringArray){
	if(stringArray.size() <= 1){
	    return stringArray;
	}

	ArrayList a = new ArrayList<String>();
	ArrayList b = new ArrayList<String>();

	int i = 0;
	
	for(;i<stringArray.size()/2;i++){
	    a.add(stringArray.get(i));
	}

	for(;i<stringArray.size();i++){
	    b.add(stringArray.get(i));
	}

	a = mergeSort(a);
	b = mergeSort(b);
	
	stringArray = merge(a,b);
	return stringArray;
    }
}