// Nicholas Romanoff
// Period One
// Homework #03 Merge Sort
// 2014-03-02

class MergeSort {

	// mergeSort function of nlogn runtime
	public static int[] mergeSort(int[] a) {
		// basecase
		if (a.length <= 1) {
			return a;
		}
		else {
			// splits a into halves
			// half 1
			int[] h1 = new int[a.length / 2];
			for (int x = 0; x < h1.length; x++) {
				h1[x] = a[x];
			}
			// half 2
			int[] h2 = new int[a.length - h1.length];
			for (int x = 0; x < h2.length; x++) {
				h2[x] = a[x + h1.length];
			}
			// runs mergesort on both halves
			int[] r1 = mergeSort(h1);
			int[] r2 = mergeSort(h2);
			// merges components and returns
			return merge(r1, r2);
		}
	}

	// helper function for merging ordered arrays
	public static int[] merge(int[] a, int[] b) {
		int[] merged = new int[a.length + b.length];
		int x = 0; // placeholder for a
		int y = 0; // placeholder for b
		while (x + y < merged.length) {	
			// chooses smallest # from next two choices
			// adds to merged and updates placeholders
			// next element is in a
			if ((x < a.length) && ((y >= b.length) || (a[x] <= b[y]))) {
				merged[x + y] = a[x];
				x++;
			}
			// next element is in b
			else {
				merged[x + y] = b[y];
				y++;
			}
		}
		return merged;
	}

	// driver helper function for testing merge
	public int[] randomOrderedArray() {
		int r = (int)(Math.random() * 15) + 1;
		int[] array = new int[r];
		int prev = 0;
		for (int x = 0; x < r; x++) {
			array[x] = (prev + (int)(Math.random() * 5));
			prev = array[x];
		}
		return array;
	}

	// driver helper function for testing mergesort
	public int[] randomArray() {
		int[] array = new int[(int)(Math.random() * 20) + 5];
		for (int x = 0; x < array.length; x++) {
			array[x] = (int)(Math.random() * 100);
		}
		return array;
	}

	// helper function for print arrays
	public void printArray(int[] a) { 
		String printStr = "[";
        	for (int n : a) {
			printStr += " " + n;
		}
		System.out.println(printStr += " ]");
	}

	// driver for testing
	public static void main(String[] args) {

		MergeSort merger = new MergeSort();

		// Uncomment to test Merge

		/*
		System.out.println("\nTesting Merge...");
		for (int x = 0; x < 10; x++) {
			System.out.println("\nArray A");
			int[] a = merger.randomOrderedArray();
			merger.printArray(a);
			System.out.println("Array B");
			int[] b = merger.randomOrderedArray();
			merger.printArray(b);
			System.out.println("Merged");	
			merger.printArray(merge(a,b));
		*/ 

		// Uncomment to test MergeSort

		/*
		System.out.println("\nTesting MergeSort...");
		for (int x = 0; x < 10; x++) {
			int[] r = merger.randomArray();
			System.out.println("\nBefore MergeSort:");
			merger.printArray(r);
			System.out.println("After MergeSort:");
			merger.printArray(mergeSort(r));
		}
		*/
	
	}
}
