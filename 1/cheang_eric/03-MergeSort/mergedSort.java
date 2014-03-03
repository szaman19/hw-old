import java.io.*;
import java.util.*;

public class mergedSort{

	int[] unsortedArray;

	public mergedSort(int[] givenArray){
		unsortedArray = givenArray;
	}
	public mergedSort(){
		System.out.println("test");
	}

	public int[] merge(int[] arrayA, int[] arrayB){
		int currentAIndex = 0;
		int currentBIndex = 0;
		int returnArrayIndex;
		int[] returnArray = new int[arrayA.length + arrayB.length];

		for (returnArrayIndex = 0; returnArrayIndex <= returnArray.length; returnArrayIndex++){
			if (currentAIndex >= arrayA.length){
				for (; currentBIndex < arrayB.length; currentBIndex++){
					returnArray[returnArrayIndex] = arrayB[currentBIndex];
					returnArrayIndex++;
				}
				return returnArray;
			}
			if (currentBIndex >= arrayB.length){
				for (; currentAIndex < arrayA.length; currentAIndex++){
					returnArray[returnArrayIndex] = arrayA[currentAIndex];
					returnArrayIndex++;
				}
				return returnArray;
			}

			if (arrayA[currentAIndex] <= arrayB[currentBIndex]){
				returnArray[returnArrayIndex] = arrayA[currentAIndex];
				currentAIndex++;
			}
			else{
				returnArray[returnArrayIndex] = arrayB[currentBIndex];
				currentBIndex++;
			}
		}
		return returnArray;
	}



	public void printMyArray(int[] printArray){
		for (int x : printArray) {
			System.out.println(x);			
		}
	}

	public static void main(String[] args){

		mergedSort testMS = new mergedSort();
		int[] a = new int[3];
		a[0] = 5;
		a[1] = 6;
		a[2] = 10;
		testMS.printMyArray(a);
		int[] b = new int[3];
		b[0] = 10;
		b[1] = 50;
		b[2] = 100;
		System.out.println("\n\n\n\n\n\n");
		testMS.printMyArray(testMS.merge(a,b));
	}
}

