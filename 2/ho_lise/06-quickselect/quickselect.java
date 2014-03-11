import java.util.*;
public class quickselect{
    public static int quickselect(int[] a, int k, int low, int high){
	if (low >= high){
	    return a[k];
	}
	int p =a[(int)(Math.random()*(high-low))];
	int[] F = new int[a.length];
	int f=0;
	int[] E = new int[a.length];
	int e=0;
	for (int i =0; i < a.length; i++){
	    if (a[i] <p){
		F[f] = a[i];
		f++;
	    }
	    else if (a[i] > p){
		E[e] = a[i];
		e++;
	    }
	}      
	System.out.println(Arrays.toString(F) + " " + Arrays.toString(E));
	System.out.println(k + " " + e + " " + f);
	// if p is within the bounds between the gap of the front array and the end array compared to the total array length, then p is our solution.
	//for example [1,2,3,4] [6,7,45], if the array has 8 characters and we are looking for the fifth elements, instead of adding the multiple copies of p into one of the array, we can skip that step and just return p
	if (a.length-e >=k && f <=k ){
	    return p;
	}
       	else if (f > k){
	    return quickselect(E,k-e,f,high);
	}
	else{
	    return quickselect(F,k-f,low, f);
	}
	
    }

    public static void main (String[]args){
	int[] X = new int[]{1,2,42,13,5,7,8,4,13,2,1,3};
	int[] Y = new int[X.length];
	for (int i =0; i < X.length;i++ ){
	    Y[i] = X[i];
	}
	Arrays.sort(Y);
	System.out.println(Arrays.toString(Y));
	System.out.println(Y[4]+ "\n");

	System.out.println(Arrays.toString(X));

	System.out.println(quickselect(X,4,0,X.length-1));
	

    }
	



}