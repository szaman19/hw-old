public class Merge {

    private int[] A;

    public int[] mergeList(int[] a, int[] b) {

	int ai = 0;
	int bi = 0;
	int l = a.length + b.length;
	A = new int[l];

	for (int i=0;i<l;i++) {
	    if (ai == a.length) {
		A[i] = b[bi];
		bi++;
	    }
	    else if (bi == b.length) {
		A[i] = a[ai];
		ai++;
	    }
	    else if (a[ai] < b[bi]) {
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

    public int[] mergeSort(int[] A) {

	if (A.length <= 1)
	    return A;
	else {
	    int l1 = A.length / 2;
	    int l2 = A.length - l1;
	    int[] r1 = new int[l1];
	    int[] r2 = new int[l2];

	    for (int i=0;i<l1;i++) {
		r1[i] = A[i];
	    }

	    for (int i=0;i<l2;i++) {
		r2[i] = A[l1+i];
	    }

	    r1 = mergeSort(r1);
	    r2 = mergeSort(r2);

	    A = mergeList(r1, r2);
	}

	return A;

    }

    public static void main(String[] args) {

	Merge m = new Merge();
	int[] a = {0, 3, 5, 2, 3, 5, 1, 2, 12, 3, 5, 2, 3, 10000, 5, 666, 3, 14, 25, 14, 15, 13, 14, 15, 5, 3, 2, 4, 56, 3, 5, 1, 2, 5, 6};
	int[]b = m.mergeSort(a);
	for (int i=0;i<b.length;i++) {
	    System.out.println(b[i]);
	}

    }

}