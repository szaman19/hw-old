public class Driver {
    public static void main(String[] args) {
	MergeSort ms = new MergeSort();
	int[] a = {1, 4, 5, 19, 72};
	int[] b = {5, 7, 10, 21, 21};
	System.out.println(ms.printArray(a));
	System.out.println(ms.printArray(b));
	System.out.println(ms.printArray(ms.merge(a,b)));
    }
}
