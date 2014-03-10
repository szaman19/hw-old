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
	    for (i = 0; i< A.size()/2; i++){
		h1.add(A.get(i));
	    }
	    for (int j = A.size()/2;j< A.size(); j++){
		h2.add(A.get(j));
	    }
	    h1 = mergeSort(h1);
	    h2 = mergeSort(h2);
	    return merge(h1, h2);
	}
    }
    public ArrayList<String> merge(ArrayList<String> A, ArrayList<String> B){
	ArrayList<String> result = new ArrayList<String>(A.size() + B.size());
	int i = 0, j = 0;
        for (int k =0;k < A.size()+B.size();k++){
            if (i == A.size()){
                result.add(k,B.get(j));
                j++;
            }
            else if (j == B.size() ){
                result.add(k,A.get(i));
                i++;
            }
            
            else if(A.get(i).compareTo(B.get(j)) <= 0){
                result.add(k,A.get(i));
                i++;
            }
            else{
                result.add(k,B.get(j));
                j++;
            }
        }
	return result;
    }

    public static void main(String[] args){
	mSortStrings m = new mSortStrings();
	ArrayList<String> a = new ArrayList<String>();
	a.add("aardvark");
	a.add("cat");
	a.add("elephant");
	a.add("bear");
	a.add("duck");
	a.add("flamingo");
	    //aardvark, cat, elephant, giraffe, iguana, kangaroo, monkey, ostrich, quail, seal, unagi, whale, yak
	ArrayList<String> g = m.mergeSort(a);
	for (int i = 0; i< g.size(); i++){
	    System.out.print(g.get(i) + ", ");
	}
    }
}
