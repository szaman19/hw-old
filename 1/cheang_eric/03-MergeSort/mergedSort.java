import java.io.*;
import java.util.*;

public class mergedSort{

	int[] unsortedArray;
	int[] sortedArray;

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

	int[] splitArray1;
    int[] splitArray2;


    private void splitArray(int[] givenArray){

	int givenArrayLength = givenArray.length;
	splitArray1 = new int[givenArrayLength/2];
	splitArray2 = new int[givenArrayLength - splitArray1.length];


	int arrayEntityCounter = 0;
	int splitArray1IndexCounter = 0;
	int splitArray2IndexCounter = 0;


	for (int arrayEntity : givenArray){
	    
	    if (arrayEntityCounter < splitArray1.length){
		splitArray1[splitArray1IndexCounter] = arrayEntity;
		splitArray1IndexCounter++;
	    }
	    else{
		splitArray2[splitArray2IndexCounter] = arrayEntity;
		splitArray2IndexCounter++;
	    }
	    arrayEntityCounter++;
	}
    }

    public void printArray(int[] printMe){
	for (int printEntity : printMe){
	    System.out.println(printEntity);
	}
    }

    public void printArray1(){
	printArray(splitArray1);
	System.out.println("IOUBNEIOUQWBIOFNEA");
	printArray(splitArray2);
    }



	public void printMyArray(int[] printArray){
		for (int x : printArray) {
			System.out.println(x);			
		}
	}

	public int[] mergeSort(int[] sortMe){
		int[] returnArray = new int[sortMe.length];
		if (sortMe.length != 1){
			splitArray(sortMe);
			mergeSort(splitArray1);
			mergeSort(splitArray2);
		}
		else{
			int[] splitArrayMerged = merge(splitArray1,splitArray2);
			returnArray = merge(splitArrayMerged,sortedArray);
		}
		return returnArray;
	}

	public static void main(String[] args){

		mergedSort testMS = new mergedSort();
		int[] a = new int[7];
		a[0] = 5;
		a[1] = 6;
		a[2] = 10;
		//testMS.printMyArray(a);
		//int[] b = new int[3];
		//b[0] = 10;
		//b[1] = 50;
		//b[2] = 100;
		//System.out.println("\n\n\n\n\n\n");
		//testMS.printMyArray(testMS.merge(a,b));
		a[3] = 2;
		a[4] = 3;
		a[5] = 9;
		a[6] = 6;

		testMS.printMyArray(testMS.mergeSort(a));
	}
}

