import java.util.ArrayList;
import java.util.Random;

public class MergeSortComp {

    public  ArrayList<Comparable> mergesort(ArrayList<Comparable> C) {
        if (C.size() <= 1)
            return C;

        int firstHalf = C.size() / 2;

        ArrayList<Comparable> A = new ArrayList<Comparable>();
        for (int i = 0; i < firstHalf; i++) {
            A.add(C.get(i));
        }

        int secondHalf = C.size() - firstHalf;
        ArrayList<Comparable> B = new ArrayList<Comparable>();
        for (int i = 0; i < secondHalf; i++) {
            B.add(C.get(firstHalf + i));
        }

	A = mergesort(A);
	B = mergesort(B);
        return merge(A,B);
    }

    public  ArrayList<Comparable> merge(ArrayList<Comparable> A, ArrayList<Comparable> B) {
        ArrayList<Comparable> C = new ArrayList<Comparable>();
        int iA = 0;
	int iB = 0;
	int iC = 0;

        // Until one array is exhausted, take the lesser of each half
        while (iA < A.size() && iB < B.size()) {
            if (A.get(iA).compareTo(B.get(iB)) < 0) {
                C.add(A.get(iA));
                iA++;
            } else {
                C.add(B.get(iB));
                iB++;
            }
            iC++;
        }

        // Fill the rest of the return array

        while (iA < A.size()) {
            C.add(A.get(iA));
            iC++;
            iA++;
        }

        while (iB < B.size()) {
            C.add(A.get(iB));
            iC++;
            iB++;
        }
        
        return C;
    }
    
    public static void main(String[] args){

    }
    
}
