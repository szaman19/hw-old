import java.util.*;
import java.io.*;

public class mSortStrings{
    public ArrayList<String> mergeSort(ArrayList<String> A){
	if (A.size() <= 1){
	    return A;
	}else{
	    ArrayList<String> h1 = new ArrayList<String>();
	    ArrayList<String> h2 = new ArrayList<String>();
	    int i;
	    for (i = 0; i< h1.size(); i++){
		h1.set(i, A.get(i));
	    }
	    for (;i< A.size(); i++){
		h2.set(i-h1.size(), A.get(i));
	    }
	    h1 = mergeSort(h1);
	    h2 = mergeSort(h2);
	    return merge(h1, h2);
	}
    }
    //I started to change this, but I don't understand how we are supposed to sort the Strings!
    //Do we sort by length of String, or do we sort alphabetically?
    public ArrayList<String> merge(ArrayList<String> A, ArrayList<String> B){
	ArrayList<String> result = new ArrayList<String>();
	int i = 0, j = 0, k = 0;
	while (i < A.size() && j < B.size()){
	    if (A.get(i) < B.get(j)){
		result.set(k, A.get(i));
		i++;
	    }
	    else{
		result.set(k, B.get(j));
		j++;
	    }
	    k++;
	}

	while (i < A.size()){
	    result.set(k, A.get(i));
	    i++;
	    k++;
	}

	while (j < B.size()){
	    result.set(k,B.get(j));
	    j++;
	    k++;
	}
	return result;
    }

    public static void main(String[] args){
	MergeSort m = new MergeSort();
	ArrayList<String> a1 = new ArrayList<String>();
	    //aardvark, cat, elephant, giraffe, iguana, kangaroo, monkey, ostrich, quail, seal, unagi, whale, yak
	ArrayList<String> a2 = new ArrayList<String>();
	ArrayList<String> f = m.merge(a1,a2);
	for (int i= 0; i< f.size(); i++){
	    System.out.print(f[i] + ", ");
	}
	System.out.println("\n");
	ArrayList<String> a3 = new ArrayList<String>{10,1,9,2,8,3,7,4,6,5};
	ArrayList<String> g = m.mergeSort(a3);
	for (int i = 0; i< g.size(); i++){
	    System.out.print(g[i] + ", ");
	}
    }


}
