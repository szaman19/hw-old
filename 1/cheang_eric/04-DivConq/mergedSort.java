import java.io.*;
import java.util.*;

public class mergedSort{

	int[] unsortedArray;
	int[] sortedArray;
	int[] splitArray1;
    int[] splitArray2;

    public int[] getSplitArray1(){
    	return splitArray1;
    }
    public int[] getSplitArray2(){
    	return splitArray2;
    }

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
			System.out.print("[" + x + "] , ");	
		}
		System.out.println("");
	}

	public int[] mergeSort(int[] sortMe){
		if (sortMe.length <=  1){
			return sortMe;
		}
		int[] mergedSplitArray1;
		int[] mergedSplitArray2;
		splitArray(sortMe);
		mergedSplitArray1 = mergeSort(splitArray1);
		mergedSplitArray2 = mergeSort(splitArray2);
		sortedArray = merge(mergedSplitArray1, mergedSplitArray2);
		return sortedArray;
	}

	public static void main(String[] args){

		mergedSort testMS = new mergedSort();
		int[] a = new int[4];
		a[0] = 5;
		a[1] = 20;
		a[2] = 10;
		a[3] = 1;

		testMS.printMyArray(a);
		System.out.println("\n");
		a = testMS.mergeSort(a);
		System.out.println("\n");
		testMS.printMyArray(a);
	}
}

