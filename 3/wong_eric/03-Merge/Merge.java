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

    public int[] selectionSort(int[] a) {
	int[] res = new int[a.length];
	for (int i=0;i<a.length;i++) {
	    int low = a[i];
	    int lowI = i;
	    for (int j=i;j<a.length;j++) {
		if (a[j] < low){
		    low = a[j];
		    lowI = j;
		}
	    }
	    a[lowI] = a[i];
	    res[i] = low;
	}
	return res;
    }

    public int[] makeList(int n) {
	int[] res = new int[n];
	for (int i=0;i<n;i++) {
	    res[i] = (int)(Math.random() * 100000);
	}
	return res;
    }

    public String toString(int[] a) {
	String ans = "";
	for (int i=0;i<a.length;i++) {
	    ans = ans + a[i] + ", ";
	}
	return ans;
    }

    public static void main(String[] args) {

	Merge m = new Merge();
	int[] a = m.makeList(1000000);
	long start, end;

	start = System.currentTimeMillis();
	int[]b = m.mergeSort(a);
	end = System.currentTimeMillis();
	System.out.println("Merge Sort: " + (end - start));

	start = System.currentTimeMillis();
	int[] c = m.selectionSort(a);
	end = System.currentTimeMillis();
	System.out.println("Selection Sort: " + (end - start));



    }

}