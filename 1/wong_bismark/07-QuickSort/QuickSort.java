import java.util.*;
import java.util.Arrays;
public class QuickSort{	
	
	
	
	public static int[] quickSort(int[] a){
		//I've been having trouble separating the arrays so I've gone with the stupidest method I can manage, I'll check out the better method in class.
		int loCount = 0;
		int hiCount = 0;
		
	
		
		if(a.length <=1){
			return a;
			}
		else{
		Random gen = new Random();
		
		int indexP = gen.nextInt(a.length);
		int P = a[indexP];
		System.out.println(P);
		
			for (int i = 0; i< a.length ; i++){
				if(a[i] < P){
					loCount++;
					}
				else{
					hiCount++;
					}
				}
			
			//Found the appropriate array lengths above, now initializing them
			
			int[] lo = new int[loCount];
			System.out.println(loCount);
			loCount = 0;
			int[] hi = new int[hiCount];
			System.out.println(hiCount);
			hiCount = 1;
			
			//Now separating into two different arrays
			hi[0] = P;
			

			
			for(int i = 0; i < a.length; i++){
			
				if(a[i] < P){
					lo[loCount] = a[i];
					loCount++;
					}
				else{

				if(a[i] > P){

					hi[hiCount] = a[i];
					hiCount++;
					}
				}
				}
			
			int[] newA = quickSort(lo);
			int[] newB = quickSort(hi);
			
			int[] newC = new int[lo.length + hi.length];
			
			for(int i =0; i < newA.length; i++){
				newC[i] = newA[i];
				}
				
			for(int i =newA.length; i < newA.length + newB.length; i++){
				newC[i] = newB[i - newA.length];
				
			}
			System.out.println(Arrays.toString(newC));
			for(int i = 0; i < newC.length; i++){
				System.out.print(newC[i] + "  - "); 
				
			}
			System.out.println(" The above is the newC that is being returned to whatever it is being returned to \n");
			return newC;
			
		}
	}
	
	public static void main(String[] args){
		int[] poop = {213, 13, 2, 6346, 123, 72, 1, 626, 4, 1236, 234563463,1, 234, 35346, 13, 6465, 234, 16,1643};
		int[] p = { 1, 2, 3, 4, 5, 6, 7, 8, 9 , 10, 11, 12, 13, 14};
		quickSort(poop);
		Arrays.sort(poop);
		// Whenever I have duplicate numbers I get a 0 for the first, followed by the duplicate. I've beent rying to figure out how to fix this. 
		System.out.println(Arrays.toString(poop));
	}
}