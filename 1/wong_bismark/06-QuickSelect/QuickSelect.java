import java.util.*;
public class QuickSelect{

	public static int quickselect(int[] a, int k, int low, int high){
		Random poo = new Random();
		
		int answers = 0;
		
		boolean success = false;
		
		int rand = poo.nextInt(high - low) + low;
		
		int pivot = a[rand];
	
		if(low <= high){
		     success = true;
	        	answers = low;
		}
		else{
		
			for(int q = low; q < high; q++){
				if(a[q] < pivot && q < rand){
					int[] butt = new int[a.length];
					butt[0] = a[q];
					for(int i = 0; i < q; i++){
						butt[i+1] = a[i];
						}
					for(int j = q; j < a.length; j++){
						butt[j] = a[j+1];
						}
					
					a = butt;
			
				}
				else if(a[q] > pivot && q > rand){
					int[] butt = new int[a.length];
	
					for(int i = 0; i < q; i++){
						butt[i] = a[i];
						}
										
					for(int j = q; j < a.length - 1; j++){
						butt[j] = a[j+1];
						}
					butt[a.length] = a[q];
			
					a = butt;
			
				}
			}
			
			int pivotpoint = 0;
		for(int i = 0; i< a.length; i++){
		
			if(a[i] == pivot){
				i = pivotpoint;
			}
			
			if(a[i] == pivot && i == k){
			    success = true;
				answers = a[i];
				}
			}
		if(!success){
		    if(pivotpoint > k){
			quickselect(a, k, low, pivotpoint);
			}
			else{
			quickselect(a, k, pivotpoint, high);
			}
			}
		}
		return answers;
	}
	
	public static void main(String[] args){
		
		int[] doop = {1,2,3,123, 553, 234,7, 123,6, 123, 623,23,12345,12};
		
		quickselect{doop, 3, 0, doop.length};

		}
}