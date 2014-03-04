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