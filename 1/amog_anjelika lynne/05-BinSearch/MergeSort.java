import java.io.*;
import java.util.*;

public class MergeSort{
    public ArrayList<Comparable> merge (ArrayList<Comparable> A, ArrayList<Comparable> B){
	int len = A.size() + B.size();
	ArrayList<Comparable> C = new ArrayList();
	int count = 0;
	int countA = 0;
	int countB = 0;
	while (count < len){
	    if (countA == A.size()){
		C.add(B.get(countB));
		countB++;
	    }
	    else if (countB == B.size()){
		C.add(A.get(countB));
		countA++;
	    }
	    else if (A.get(countA).compareTo(B.get(countB)) < 0){
		C.add(A.get(countA));
		countA++;
	    }
	    else {
		C.add(B.get(countB));
		countB++;
	    }
	    count++;
	}
	return C;
    }

    public ArrayList<Comparable> mergeSort(ArrayList<Comparable> L){
	int len = L.size();
	int i = 0;
	if (len <= 1)
	    return L;
	else{
	    int lenA = len / 2;
	    int lenB = len - lenA;
	    ArrayList<Comparable> A = new ArrayList();
	    ArrayList<Comparable> B = new ArrayList();
	    for (int iA = 0; iA < lenA; iA++){
		A.set(iA, L.get(i));
		i++;
	    }
	    for (int iB = 0; iB < lenB; iB++){
		B.set(iB, L.get(i));
		i++;
	    }
	    A = mergeSort(A);
	    B = mergeSort(B);
	    L = merge(A,B);
	    return L;
	}
    }
}
