//Johnathan Yan
//Period 1

public class Mergesort{
	private static int[] mergeSort( int[] a, int[] b ) {
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
	
	public static void main(String[] args){
		int[] a = {1,5,7};
		int[] b = {1,6,8,9};
		System.out.println(mergeSort(a,b)); // use toString method
	}
}