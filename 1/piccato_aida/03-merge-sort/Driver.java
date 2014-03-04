<<<<<<< HEAD
import java.util.*;
public class Driver {
    public static void main(String[] args) {
	MergeSort ms = new MergeSort();
	Random rand = new Random();
	int[] c = new int[20];
	for (int i = 0; i < 20; i++) {
	    c[i] = rand.nextInt(1000);
	}
	int[] a = {1, 4, 6, 9, 32, 76};
	int[] b = {4, 36, 77};
	//System.out.println(ms.printArray(ms.merge(a,b)));
	System.out.println(ms.printArray(ms.mergeSort(c)));
	
    }

}
=======
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
>>>>>>> 748ab58a5354e0f47714188f11b400c9bb2e0909
