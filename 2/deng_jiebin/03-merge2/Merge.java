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

    public int[] mergesort(int[] a){
	if(a.length <= 1){
	    return a;
	}
	else{
	    int[] a1 = new int[a.length/2];
	    int[] a2 = new int[a.length-a1.length];
	    for(int i = 0; i<a1.length; i++){
		a1[i] = a[i];
	    }
	    for(int j = a.length/2; j<a.length; j++){
		a2[j-(a.length/2)] = a[j];
	    }
	    a1 = mergesort(a1);
	    a2 = mergesort(a2);
	    a = merge(a1,a2);
	    return a;
	}
    }
    
    public static void main(String[]args){
	int[] a = {1,2,3,4,5,6,7,8};
	int[] b = {0,5,5,6,9,10};
	Merge m = new Merge();
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	System.out.println("Result: "+Arrays.toString(m.merge(a,b))+"\n");
	
	int[] c = {5,6,2,3,7,9,0,1,8,4,10};
	System.out.println(Arrays.toString(c));
	System.out.println("Result: "+Arrays.toString(m.mergesort(c))+"\n");

	int[] d = new int[100];
	Random r = new Random();
	for(int i = 0; i<d.length; i++){
	    d[i] = r.nextInt(10000);
	}
	//System.out.println(Arrays.toString(d));
	System.out.println("Result: "+Arrays.toString(m.mergesort(d))+"\n");
    }
}
