import java.util.*;

public class Merge{
    
    public int[] merge(int[] a, int[] b){
	int[] ans = new int[a.length + b.length];
	int stepA = 0;
	int stepB = 0;
	for(int i = 0; i<ans.length; i++){
	    if(stepA < a.length && stepB < b.length){
		if(a[stepA] >= b[stepB]){
		    ans[i] = b[stepB];
		    stepB++;
		}
		else{
		    ans[i] = a[stepA];
		    stepA++;
		}
	    }
	    else if(stepA >= a.length){
		ans[i] = b[stepB];
		stepB++;
	    }
	    else{
		ans[i] = a[stepA];
		stepA++;
	    }
	}
	return ans;
    }
    
    public static void main(String[]args){
	int[] a = {1,2,3,4,5,6,7,8};
	int[] b = {0,5,5,6,9,10};
	Merge m = new Merge();
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	System.out.println("Result: "+Arrays.toString(m.merge(a,b)));
    }
}
