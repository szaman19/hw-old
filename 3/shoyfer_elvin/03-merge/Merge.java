import java.util.Arrays;

public class Merge {
	// Given two sorted arrays a and b, merge them into one sorted array.

	public static int[] mergeSort(int[] a, int[] b) {
		int newSize = a.length + b.length;
		int[] result = new int[newSize];

		int positionA = 0; 
		int positionB = 0;
		int positionResult = 0;  

		int thisA = 0;
		int thisB = 0;

		while (((positionA < a.length) || (positionB < b.length)) && (positionResult < newSize)) {

			if (positionA < a.length) {
				thisA = a[positionA];
			}
			if (positionB < b.length) {
				thisB = b[positionB];
			}

			if (positionA == a.length) {
				result[positionResult] = thisB;
				positionB++;
				positionResult++;
			}

			else if (positionB == b.length) {
				result[positionResult] = thisA;
				positionA++;
				positionResult++;
			}

			else if (thisA < thisB) {
				result[positionResult] = thisA;
				positionA++;
				positionResult++;
				System.out.println(thisA);


			}

			else if (thisB <= thisA) {
				result[positionResult] = thisB;
				positionB++;
				positionResult++;
				System.out.println(thisB);

			}

		}
		return result;
	}
	
	public static void main(String[] args) {

		int[] a1 = {3, 4, 5};
		int[] b1 = {1, 2, 7};
		int[] a2 = {1, 5};
		int[] b2 ={2, 4, 6};
		int[] a3 = {1, 5, 9};
		int[] b3 = {2, 7};

		System.out.println("Test 1: Equal sizes."); 
		System.out.println(Arrays.toString(mergeSort(a1, b1)));

		System.out.println("Test 2: A length < B length.");
		System.out.println(Arrays.toString(mergeSort(a2, b2)));

		System.out.println("Test 3: A length > B length.");
		System.out.println(Arrays.toString(mergeSort(a3, b3)));		

	}
}