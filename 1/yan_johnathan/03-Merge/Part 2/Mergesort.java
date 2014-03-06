//Johnathan Yan
//Period 1
//nlogn

public class Mergesort{

	public static int[] merge( int[] a, int[] b ) {
	
		int[] ret = new int[a.length + b.length];
		int countA = 0;
		int countB = 0;
		int count = 0;

		while (count < (a.length + b.length)){

			if (countA == a.length){
				ret[count] = b[countB];
				countB++;
			}
			
			else if (countB == b.length){
				ret[count] = a[countA];
				countA++;
			}
			
			else if (a[countA] < b[countB]){
				ret[count] = a[countA];
				countA++;
			}
			
			else {
				ret[count] = b[countB];
				countB++;
			}
			count++;
		}
		
		return ret;
	
	}
	
	public static int[] mergeSort( int[] x ){
		if (x.length <= 1)
			return x;
		else{
			int[] left = new int[x.length/2]; // left half
			int[] right = new int[x.length - (x.length/2)]; // right half
		
			for (int y = 0; y < left.length; y++) // fills in left half from left to right until full
				left[y] = x[y];
		
			for (int y = x.length/2; y < x.length; y++) // does the same for right hlaf
				right[y - (x.length/2)] = x[y];
		
			int[] retLeft = mergeSort(left); // continuously splits left in half until 
											 // only 1 element per array, merges these arrays
											 // therefore they are in order
		
			int[] retRight = mergeSort(right); // continuously splits right in half until 
											 // only 1 element per array, merges these arrays
											 // therefore they are in order
											 
			x = merge(retLeft,retRight); // merges the pre-sorted arrays retLeft and retRight
		}
			return x;
	}
	
	public static void main(String[] args){
		int[] a = {1,5,7};
		int[] b = {8,1,6,9};
		System.out.println(merge(a,b)); // use toString method
		System.out.println(mergeSort(b)); // use toString method
	}
}
