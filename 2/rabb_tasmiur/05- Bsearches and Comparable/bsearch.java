import java.util.Arrays;

public class bsearch{
   
	public static int ibSearch(int[]a , int x){
		int min = 0;
		int max = a.length - 1;
		while (min <= max){
			int mid = (min + max) / 2;
			if (a[mid] == x){
				return mid;
			}
			else if (a[mid] < x){
				min = mid + 1;
			}
			
			else {
				max = mid - 1;
			}
		}
		
		return -1;
	}
	
	/*public static int rbsearch(int n, int[] L){
		int count = (int)(L.length - 1) / 2;
		int index = -1;
		int[] storage = new int[count];
		if (L[count] == n){
		index = count;
		}
		else if
		(n > L[count]){
		storage = Arrays.copyOfRange(L,count, L.length - 1);
		index = rbsearch(n, storage);
		count = (int)(count + (L.length - 1)) / 2;
		}
		else if
		(n < L[count]){
		storage = Arrays.copyOfRange(L,0,count);
		index = rbsearch (n, storage);
		count = (int) count / 2;
		}
		return index;
		    }
	*/
	
	public static int rbsearch(int n, int[] L){
		int count = L.length / 2;
		int index = -1;
		int[] storage = new int[count];
		if (L[count] == n){
		index = count;
		}
		else if
		(n > L[count]){
		storage = Arrays.copyOfRange(L,count, L.length);
		index = rbsearch(n, storage);
		count = storage.length / 2;
		}
		else if
		(n < L[count]){
		storage = Arrays.copyOfRange(L,0,count);
		index = rbsearch (n, storage);
		count = storage.length / 2;
		}
		return index;
		    }
	
	 public static void main(String[]args){
		 int[] X = {14,25,37,38,45,67,77,82,91,99};
		 System.out.println(rbsearch(67,X));
		 
		 System.out.println(ibSearch(X,67));
		 
		 }


}