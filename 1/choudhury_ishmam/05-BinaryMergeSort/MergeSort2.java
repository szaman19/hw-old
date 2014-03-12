import java.io.*;
import java.util.*;

//how can I reduce to the base case? for the iterative binary. I looked at
// other people's code, but it didn't quite "click" for me. 
public class MergeSort2 {
    int[] temp;
	
    public ArrayList<Comparable> merge(ArrayList<Comparable> A, 
									ArrayList<Comparable> B) {
					 
	   int posA = 0;
	   int posB = 0;
	   int count = 0;
	   ArrayList<Comparable> fin = new ArrayList<Comparable>();
	   for (int i = 0; i < A.size() + B.size(); i++) {
	       if (posA == A.size()) {
		   fin.add(B.get(posB));
		   posB++;
	       }
	       else if (posB == B.size()) {
		   fin.add(A.get(posA));
		   posA++;
	       }
	       else if (A.get(posA).compareTo(B.get(posB)) > 0) {
		   fin.add(A.get(posA));
		   posA++;
	       }
	       else {
		   fin.add(B.get(posB));
		   posB++;
	       }
	       count++;
	   }
	   return fin;
	}

	
	public int rbsearch(int n, int[] L) {
		if (L.length == 1) {
			if (L[0] == n) {
				return 0; 
			}
			else {
				return -1;
			}
		}
		int midInd = L.length/2;
		if (L[midInd] == n) {	
			return midInd;
		}
		if (n > L[midInd]) {
				int i = 0;
				for (int pos = midInd; pos < L.length; pos++) {
					temp[i] = L[pos];
					i++;
				}
				rbsearch(n, temp);
			}
		else {
			//if (n < L[midInd])
			int i = 0;
			for (int pos = 0; pos < midInd; pos++) {
				temp[i] = L[pos];
				i++;
			rbsearch(n, temp);
			}
		}
	}

	public int ibsearch(int n, int[] L) {
		return n;
		int midInd = L.length/2
		while (midInd != 0) {
			if (L[midInd] == n) {
				return midInd;
			}
			if (n > L[midInd]) {
				//how to reduce???
				}
			else {
				//how to reduce????
			}
	}
}   