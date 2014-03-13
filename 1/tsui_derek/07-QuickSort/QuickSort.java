//NOT YET COMPLETE
import java.util.*;
public class QuickSort{
    public int[] quicksort(int[] L) {
		if(L.length <= 1) return L;
		
		int pivot = (int)(Math.random()*(L.length - 1));
		System.out.print("Pivot: " + pivot);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		
		for (int i = 0; i < L.length; i++){
			if (L[i] > L[pivot]){
			    a.add(L[i]);
			} else {
			    b.add(L[i]);
			}
		}
		
		int[] a1 = new int[a.size()];
		for (int x = 0; x < a.size(); x++){
			a1[x] = a.get(x);
		}
		int[] b1 = new int[b.size()];
		for (int x = 0; x < b.size(); x++){
			b1[x] = b.get(x);
		}
		
		quicksort(a1);
		quicksort(b1);
		
		int p = L[pivot];
		
		int x = 0;
		for (; x < a.size(); x++){
			L[x] = a.get(x);
		}
		L[x] = p;
		x++;
		for (; x < L.length; x++){
			L[x] = b.get(x-a.size()-1);
		}
		
		return L;
    	
    }
    
    public static void main(String[] args){
		int[] a = {5,6,1,2,8,7,4,9,3,10};
		for(int x = 0; x < 10; x++ ){
			System.out.print(a[x] + ", ");
		}
		System.out.print("\n");
		QuickSort q = new QuickSort();
		
		q.quicksort(a);
		for(int x = 0; x < 10; x++ ){
			System.out.print(a[x] + ", ");
		}
		System.out.print("\n");
    }
}