import java.util.*;

public class MergeSort {
    public String printArray(int[] a) {
return Arrays.toString(a);
    }

<<<<<<< HEAD:1/piccato_aida/04-div-conquer/MergeSort.java
=======
    public String printArrayList(ArrayList<String> a) {
        String s = "";
	for (int i = 0; i < a.size(); i++) {
	    s += a.get(i) + " ";
	}
	return s;
    }
	
	
>>>>>>> 7c936b5e2227be1085b49a9f5146fb841f1829ac:1/piccato_aida/03-merge-sort/MergeSort.java
    
    public int[] merge(int[] a, int[] b) {
	int[] result = new int[a.length + b.length];
        int countA = 0;
        int countB = 0;
	int count = 0;
        while (count < (a.length + b.length)) {
            if (countA == a.length) {
                result[count] = b[countB];
		countB++;
            }
            else if (countB == b.length) {
                result[count] = a[countA];
                countA++;
            }
            else if (a[countA] > b[countB]) {

		result[count] = b[countB];
		countB++;
            }
            else {
                result[count] = a[countA];
                countA++;
            }
            count++;
        }
        return result;

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

    public ArrayList<String> mergeSortString(ArrayList<String> l) {
        ArrayList<String> a;
        ArrayList<String> b;
        if (l.size() <= 1) {
            return l;
        }
        else {
            int n = l.size()/2;
            a = new ArrayList<String>();
            b = new ArrayList<String>();
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

    public ArrayList<String> mergeString(ArrayList<String> a, ArrayList<String> b) {
        ArrayList<String> result = new ArrayList<String>();
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

