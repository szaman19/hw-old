/* 
I kind of have no clue what's going on here
*/

import java.io.*;
import java.util.*;

public class QuickSort {

	public int[] QuickSort (int [] L) {
		if (L.length <= 1) {
			return L;
		}
		int piv = (int)(Math.random() * L.length);
		ArrayList<int> lowerHalf = new ArrayList();
		ArrayList<int> upperHalf = new ArrayList();
		for (int item:L) {
			if (item <= piv) {
				lowerHalf.add(item);
			}
			else {
				upperHalf.add(item);
			}
		}
		int[] R1 = QuickSort(upperHalf.toArray());
		int[] R2 = QuickSort(lowerHalf.toArray());
	}
}