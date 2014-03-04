import java.io.*;
import java.util.*;

public class mergeSort{
	private int[] unsortedArray;
	private ArrayList<int[]> splitArrays = new ArrayList<int[]>();
	private int arrayLength = unsortedArray.length;

	public int[] printedSorted;

	public mergeSort(int[] givenArray){
		unsortedArray = givenArray;
		// printSorted = sorted List, and then make a toString
		splitArrays.add(givenArray);
	}

	private int[] sortRoutine(){

		if (arrayLength <= 1){
			//merge everything
		}
		else{
			//split things
		}

	}

	private void splitArray(){
		int lengthATBS = arrayToBeSplit.length;
		
	}
}