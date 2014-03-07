import java.io.*;
import java.util.*;

public class Merge {
    
	public int[] merge(int[] A, int[] B) {
	    int aPos = 0; 
	    int bPos = 0;
	    int count = 0;
	    int l = A.length + B.length;
	    int[] fin = new int[l];
	    for (int i = 0; i < l; i++) {
		if (aPos == A.length) {
		    fin[i] = B[bPos];
		    bPos++;
		}
		else if (bPos == B.length) {
		    fin[i] = A[aPos];
		    aPos++;
		}
		else if (A[aPos] > B[bPos]) {
		    fin[i] = A[aPos];
		    aPos++;
		}
		else {
		    fin[i] = B[bPos];
		    bPos++;
		}
		count++;
	    }
	    return fin;
	}
    
	public int[] mergeSort(int[] l) {
        int[] a;
        int[] b;
        if (l.length <= 1) {
            return l;
        }
        else {
            int n = l.length/2;
            a = new int[n];
            b = new int[l.length - n];
            for (int i = 0; i < l.length; i++) {
                if (i < n) {
                    a[i] = l[i];
                }
                else {
                    b[i - n] = l[i];
                }
            }
	}
        a = mergeSort(a);
        b = mergeSort(b);
        l = merge(a, b);
        return l;
    }
	
	public ArrayList<Comparable> mergeSortString(ArrayList<Comparable> l) {
        ArrayList<Comparable> a;
        ArrayList<Comparable> b;
        if (l.size() <= 1) {
            return l;
        }
        else {
            int n = l.size()/2;
            a = new ArrayList<Comparable>();
            b = new ArrayList<Comparable>();
            for (int i = 0; i < l.size(); i++) {
                if (i < n) {
                    a.add(l.get(i));
                }
                else {
                    b.add(i-n, l.get(i));
                }
            }
	}
        a = mergeSortString(a);
        b = mergeSortString(b);
        l = mergeString(a, b);
        return l;

    }

    public ArrayList<Comparable> mergeString(ArrayList<Comparable> a, ArrayList<Comparable> b) {
        ArrayList<Comparable> result = new ArrayList<Comparable>();
        int countA = 0;
        int countB = 0;
	int count = 0;
        while (count < (a.size() + b.size())) {
            if (countA == a.size()) {
                result.add(b.get(countB));
	        countB++;
            }
            else if (countB == b.size()) {
                result.add(a.get(countA));
                countA++;
            }
            else if (a.get(countA).compareTo(b.get(countB)) > 0) {

		result.add(b.get(countB));
	        countB++;
            }
            else {
                result.add(a.get(countA));
                countA++;
            }
            count++;
        }
        return result;
    }

} 