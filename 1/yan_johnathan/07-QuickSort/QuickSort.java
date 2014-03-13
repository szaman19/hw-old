//Johnathan Yan
//Period 1

import java.util.*;

public class QuickSort{
	//find the kth smallest element
	private Random Random = new Random();
	
	/* HW 6
	public int quickselect(int[] a, int k, int low, int high){
		if (low >= high)
			return a[high];
		int p = a[Random.nextInt(high - low) + low];
		int[] temp = new int[a.length];
		int lcount = 0;
		int rcount = a.length-1;
		for (int x: a){
			if (x < p){
				temp[lcount] = x;
				lcount++;
			}
			if (x > p){
				temp[rcount] = x;
				rcount--;
			}
		}
		temp[lcount] = p;
		a = temp;
		if ((lcount + 1) == k)
			return temp[lcount];
		if ((lcount + 1) < k)
			return quickselect(a,k,(lcount), high);
		else
			return quickselect(a,k,low,(lcount));
		}
	*/
		
		public int[] quicksort(int[] a){
			if (a.length <= 1)
				return a;
			else{
				int high = a.length - 1;
				int low = 0;
				ArrayList<Integer> temp = new ArrayList<Integer>();
				int p = a[Random.nextInt(high-low) + low];
				ArrayList<Integer> left = new ArrayList<Integer>();
				ArrayList<Integer> right = new ArrayList<Integer>();
				for (int x: a){
					if (x < p)
						left.add(x);
					if (x > p)
						right.add(x);
					}
				int[] leftA = new int[left.size()];	
				int[] rightA = new int[right.size()];
				for (int x = 0; x < left.size(); x++)
					leftA[x] = left.get(x);
				for (int x = 0; x < right.size(); x++)
					rightA[x] = right.get(x);
				int[] R1 = quicksort(leftA);
				int[] R2 = quicksort(rightA);
				for (int x: R1)
					temp.add(x);
				temp.add(p);
				for (int x: R2)
					temp.add(x);
				int[] ret = new int[temp.size()];
				for (int x = 0; x < temp.size(); x++)
					ret[x] = temp.get(x);
				return ret;
				}
			}
		
		public static void main(String[] args){
			int[] test = {78,34,22,55,5};
			int[] testLong = {78,34,22,55,5,1385,1439,2222,1,5,7,953195,3453,2221,22014};
			QuickSort tester = new QuickSort();
		//	System.out.println(tester.quickselect(test, 1, 0, test.length));
			System.out.println(Arrays.toString(tester.quicksort(test)));
			System.out.println(Arrays.toString(tester.quicksort(testLong)));
			
			
		}
		
	}
		
					
