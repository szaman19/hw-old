import java.util.Random;

public class QuickSelect{
	//find the kth smallest element
	private Random Random = new Random();
	
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
		
		public static void main(String[] args){
			int[] test = {78,34,22,55,5};
			QuickSelect tester = new QuickSelect();
			System.out.println(tester.quickselect(test, 1, 0, test.length));
		}
		
	}
		
					
