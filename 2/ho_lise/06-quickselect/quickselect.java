import java.util.*;
public class quickselect{
    public static int quickselect(int[] a, int k, int low, int high){
	if (low >= high){
	    return a[k];
	}
	int p =a[(int)(Math.random()*(high-low))+low];
	int[] F = new int[high-low+1];
	int f=0;
	int e=0;
	for (int i =low; i <= high; i++){
	    if (a[i]<p){
		F[f] = a[i];
		f++;
	    }
	    else if (a[i] > p){
		F[high-low-e] = a[i];
		e++;
	    }
	} 
	for (int g =f; g<=high-low-e; g++){
	    F[g] = p;
	}
	for (int t = 0; t<=F.length-1;t++){
	    a[t+low] = F[t];
	}

	// if p is within the bounds between the gap of the front array and the end array compared to the total array length, then p is our solution.
	//for example [1,2,3,4] [6,7,45], if the array has 8 characters and we are looking for the fifth elements, instead of adding the multiple copies of p into one of the array, we can skip that step and just return p
	if (f+low<=k && high-low-e>=k){
	    return p;
	}
       	else if (f+low < k){
	    return quickselect(a,k,f+low+1,high);
	}
	else{
	    return quickselect(a,k,low,f+low-1);
	}	
    }

    public static void main (String[]args){
	int[] X = new int[]{1,2,42,13,5,3,7,8,4,3,13,2,1,3};
	int[] Y = new int[X.length];
	for (int i =0; i < X.length;i++ ){
	    Y[i] = X[i];
	}
	Arrays.sort(Y);
	System.out.println(Arrays.toString(Y));
	System.out.println(Y[4]+ "\n");

	System.out.println(Arrays.toString(X));
	System.out.println(quickselect(X,0,0,X.length-1));
	System.out.println(quickselect(X,1,0,X.length-1));
	System.out.println(quickselect(X,2,0,X.length-1));
	System.out.println(quickselect(X,3,0,X.length-1));
	System.out.println(quickselect(X,4,0,X.length-1));
	System.out.println(quickselect(X,5,0,X.length-1));
	System.out.println(quickselect(X,6,0,X.length-1));
	System.out.println(quickselect(X,7,0,X.length-1));
	System.out.println(quickselect(X,8,0,X.length-1));
	System.out.println(quickselect(X,9,0,X.length-1));
	System.out.println(quickselect(X,10,0,X.length-1));
	System.out.println(quickselect(X,11,0,X.length-1));
	System.out.println(quickselect(X,12,0,X.length-1));
	System.out.println(quickselect(X,13,0,X.length-1));

	

    }
	



}