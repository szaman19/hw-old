import java.io.*;
import java.util.*;

public class quickSelect{
	//int[] arrayA : Array to find the smallest number in
	//int k : the kth smallest number will be returned

	//LOW AND HIGH
	// act as caps to define a bounded array.
	//int low: the lower bound of the "array"
	//int high: the upper bound of the "array"
	//Random ranGenerator: The random class that will pump out random numbers.
	// int pivor: the random number pumped out by ranGenerator
			//Additionally, the ranGenerator will pump out a number between 
			//0 and the length of the arrayA.
	//int[] ordered: a new ordered int[]
	//int x: for each loop integer of arrayA
	//int oIndexL = index of unfilled cell in ordered:LOW
	//int oIndexH = index of unfilled cell in ordered:HIGH
	public static int quickSel(int[] arrayA, int k, int low, int high){
		Random ranGenerator = new Random();
		int pivot = ranGenerator.nextInt(arrayA.length);
		//checking if pivot is in bounds
		if (low >= high){
			return pivot;
		}
		else{
			int[] ordered = new int[arrayA.length];
			int oIndexL = 0;
			int oIndexH = ordered.length - 1;
			for (int x = 0; x < ordered.length; x++){
				if (arrayA[x] <= arrayA[pivot]){
					ordered[oIndexL] = arrayA[x];
					oIndexL++;
				}
				else{
					ordered[oIndexH] = arrayA[x];
					oIndexH--;
				}
			}
			quickSel(ordered, k, low, high - 1);
			}
			return 877;
		}

	public static void main(String[] args){
		int[] testmyass = new int[5];
		testmyass[0] = 5;
		testmyass[1] = 1;
		testmyass[2] = 40;
		testmyass[3] = 7;
		testmyass[4] = 15;

		System.out.println(quickSel(testmyass, 1,0,4));

	}
}
