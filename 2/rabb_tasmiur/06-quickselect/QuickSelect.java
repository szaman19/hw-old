
import java.util.Arrays;

public class QuickSelect {
	
	public static int quickSelect(int[] a, int k, int low, int hi){
		
		if(hi <= low){
			return a[hi];
		}
		
		else{
			int sec = (int)(Math.random() *(hi - low)) + low;
			int[] stor = new int[a.length];
			int Low = 0;
			int Hi = a.length - 1;
			
			for(int x = 0; x < a.length; x++){
				if (x == sec){
					x++;
				}
				
				if(a[x] <= a[sec]){
					stor[Low] = a[x];
					Low++;
				}
				
				else if(a[x] > a[sec]){
					stor[Hi] = a[x];
					Hi--;
				}
			}
			
			stor[Low] = a[sec];
			sec = Hi;
			
			if(sec == k){
				return stor[sec];
			}
			
			else{
				int z = 0;
				for(int x:stor){ //this for loop is so cool!!
					a[z] = x;
					z++;
				}
				
				if(k < sec){
					return quickSelect(a, k, low, sec - 1);
				}
				
				else{
					
					return quickSelect(a, k, sec + 1, hi);
				}
			}
		}
	}

	
}
