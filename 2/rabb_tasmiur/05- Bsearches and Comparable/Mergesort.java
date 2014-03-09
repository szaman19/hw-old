
import java.util.*;

public class Mergesort {
	
	public static void mergeSort(Comparable[] a){
		Comparable[] stor = new Comparable[a.length];
		mergeSort(a, stor, 0 , a.length-1);
	}
	
	public static void mergeSort(Comparable[] a, Comparable[] stor, int left, int right){
		if(left < right)
		{
			int mid = (left + right) / 2;
			mergeSort(a, stor, left, mid);
			mergeSort(a, stor, mid + 1, right);
			merge(a, stor, left, mid + 1, right);
		}
	}
	
	public static void merge(Comparable[]a, Comparable[] stor, int left, int right, int rEnd){
		int lEnd = right - 1;
		int k = left;
		int num = rEnd - left + 1;
		
		while (left <= lEnd && right <= rEnd)
			if(a[left].compareTo(a[right]) <= 0)
				stor[k++] = a[left++];
			else
				stor[k++] = a[right++];
		
		while (left <= lEnd)
			stor[k++] = a[left++];
		
		while (right <= rEnd)
			stor[k++] = a[right++];
		
		for(int i = 0; i < num; i++, rEnd--)
			a[rEnd] = stor[rEnd];
	}
	
	
	public static void main(String[]args){
		Integer[] B = {2, 18, 6,65, 3, 44, 5, 48, 1,95};
		String[] F = {"Daniel" , "Aaron", "Fred", "Zibui", "Inter", "Greg", "Manson"};
		mergeSort(F);
		mergeSort(B);
		System.out.println(Arrays.toString(B));

		System.out.println(Arrays.toString(F));
	}
}
