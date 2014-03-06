import java.util.*;

public class Merge {

    private String[] A;

    public String[] mergeList(String[] a, String[] b) {

	int ai = 0;
	int bi = 0;
	int l = a.length + b.length;
	A = new String[l];

	for (int i=0;i<l;i++) {
	    if (ai == a.length) {
		A[i] = b[bi];
		bi++;
	    }
	    else if (bi == b.length) {
		A[i] = a[ai];
		ai++;
	    }
	    else if (a[ai].compareTo(b[bi]) < 0) {
		A[i] = a[ai];
		ai++;
	    }
	    else {
		A[i] = b[bi];
		bi++;
	    }
	}

	return A;
    }

    public String[] mergeSort(String[] A) {

	if (A.length <= 1)
	    return A;
	else {
	    String[] r1 = new String[A.length/2];
	    String[] r2 = new String[A.length - r1.length];

	    for (int i=0;i<r1.length;i++) {
		r1[i] = A[i];
	    }

	    for (int i=0;i<r2.length;i++) {
		r2[i] = A[r1.length+i];
	    }

	    r1 = mergeSort(r1);
	    r2 = mergeSort(r2);

	    A = mergeList(r1, r2);
	}

	return A;

    }


    public static void main(String[] args) {

	Merge m = new Merge();
	String[] l = {"e", "a", "h", "s", "d", "w"};
	System.out.println(Arrays.toString(l));
	String[] r = m.mergeSort(l);
	System.out.println(Arrays.toString(r));

    }

}
