import java.util.*;
public class Driver {
    public static void main(String[] args) {
	MergeSort ms = new MergeSort();
<<<<<<< HEAD
        Random rand = new Random();
	int n = 14000000;
        int[] c = new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = rand.nextInt(1000);
	}
        int[] a = {1, 4, 6, 9, 32, 76};
        int[] b = {4, 36, 77};
        long start = System.currentTimeMillis();
        ms.mergeSort(c);
	long elapsed = System.currentTimeMillis();
	System.out.println("MergeSort: " + (elapsed - start));
    }
}
=======
	/*
        Random rand = new Random();
        int[] c = new int[20];
        for (int i = 0; i < 20; i++) {
            c[i] = rand.nextInt(1000);
	}
        int[] a = {1, 4, 6, 9, 32, 76};
        int[] b = {4, 36, 77};                   
        System.out.println(ms.printArray(ms.mergeSort(c)));
	*/

	ArrayList<String> a = new ArrayList<String>();
	a.add("hello");
	a.add("how");
	a.add("are");
	a.add("you");
	a.add("today?");

	System.out.println(ms.printArrayList(ms.mergeSortString(a)));

	
    }
}
>>>>>>> 7c936b5e2227be1085b49a9f5146fb841f1829ac
