public class Driver {
    public static void main(String[] args) {
	MergeSort ms = new MergeSort();
	int[] a = {1, 4, 6, 9, 32, 76};
	int[] b = {4, 36, 77};
	int[] c = {3, 6, 85, 2, 1, 3, 45, 76, 3, 7, 67};
	//System.out.println(ms.printArray(ms.merge(a,b)));
	System.out.println(ms.printArray(ms.mergeSort(c)));
	
    }

}