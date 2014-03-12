public class Driver {
    public static void main(String[] args) {
	QuickSelect qs = new QuickSelect();
	int[] a = {23, 3, 7, 9, 34, 6, 1, 9, 13};
	int[] aSorted = new int[a.length];
	//System.out.println(qs.quickselect(a, 4));

	//System.out.println(qs.quickselect(a, 5));

	for (int i = 0; i < a.length; i++) {
	    aSorted[i] = qs.quickselect(a, i);
	    
	}

	System.out.println(qs.printArray(aSorted));
    }
}
