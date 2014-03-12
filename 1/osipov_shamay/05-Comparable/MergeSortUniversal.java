import java.util.*;
import java.io.*;

public class MergeSortUniversal{

    public <T extends Comparable<? super T>> ArrayList<T> split(ArrayList<T> L){
	if(L.size() <= 1){
		return L;
	}else{
		int half = L.size() / 2;
		ArrayList<T> A = new ArrayList<T>();
		ArrayList<T> B = new ArrayList<T>();
		int index = 0;
		for(int x = 0; x < A.size();x++){
		    A.add(L.get(index));
		    index++;
		}
		for(int x = 0; x < B.size(); x++){
		    B.add(L.get(index));
		    index++;
		}

	A = split(A);
	B = split(B);
	L = merge(A,B);
	return L;
	}
    }

    public <T extends Comparable<? super T>> ArrayList<T> merge(ArrayList<T> A,ArrayList<T> B){
	int indexA = 0;
	int indexB = 0;
	ArrayList<T> result = new ArrayList<T>();
	for(int index = 0; index < (A.size() + B.size()); index++){
		if(indexA == A.size()){
			result.add(B.get(indexB));
			indexB++;
		}else if(indexB == B.size()){
			result.add(A.get(indexA));
                	indexA++;	
		}else if(A.get(indexA).compareTo(B.get(indexB)) >= 0){	
			result.add(A.get(indexA));	
			indexA++;
		}else{
			result.add(B.get(indexB));
			indexB++;
		}

	}

	return result;
    }

}
