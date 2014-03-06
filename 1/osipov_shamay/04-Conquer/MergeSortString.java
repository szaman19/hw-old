import java.util.*;
import java.io.*:

public class MergeSortString{

    public ArrayList<String> split(ArrayList<String> L){
	if(L.size() <= 1){
	    return L;
	}else{
	    int half = L.size() / 2;
	    ArrayList<String> A = new ArrayList<String>();
	    ArrayList<String> B = new ArrayList<String>();
	    int index = 0;
	    for(int x = 0; x < A.size();x++){
		A.get(x).set(L.get(index));
		index++; 
	    }
	    for(int x = 0; x < B.size(); x++){
		B.get(x).set(L.get(index));
		index++;
	    }
	    
	    A = split(A);
	    B = split(B);
	    L = merge(A,B);
	    return L;
	}
    }

    public ArrayList<String> merge(ArrayList<String> A,ArrayList<String> B){
	int indexA = 0;
	int indexB = 0;
	ArrayList<String> result = new ArrayList<String>();
	for(int index = 0; index < (A.size() + B.size()); index++){
		if(indexA == A.size()){
		     result.get(index).set(B.get(indexB));
		     indexB++;
		}else if(indexB == B.size()){
		     result.get(index).set(A.get(indexA));
                     indexA++;	
		}else if(A.get(indexA).compareTo(B.get(indexB)) >= 0){	
		    result.get(index).set(A.get(indexA));	
		    indexA++;
		}else{
		    result.get(index).set(B.get(indexB));
		    indexB++;
		}

		
	}

	return result;
    }

}
