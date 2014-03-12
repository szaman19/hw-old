import java.util.*;
public class quickselect{
    public static int quickselect(int[] a, int k, int low, int high){
	System.out.println("\n"+low + " " + high);
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
	System.out.println(Arrays.toString(F) + " " +Arrays.toString(a));
	System.out.println(high-low-e + "     " + p + "    " + e);
		F[high-low-e] = a[i];
		e++;
	    }
	} 
	System.out.println(p + " " + e + " " + f);

	System.out.println(Arrays.toString(F) + " " +Arrays.toString(a));
	for (int g =f; g<=high-e; g++){
	    System.out.println("***" + g);
	    F[g] = p;
	}
	System.out.println(Arrays.toString(F) + " " +Arrays.toString(a));
	for (int t = 0; t<=F.length-1;t++){
	    a[t+low] = F[t];
	}
	System.out.println(Arrays.toString(F) + " " +Arrays.toString(a));
/*
	for (int x=low; x<=high;x++){
	    F[x-low] = a[x];
	    }*/

	// if p is within the bounds between the gap of the front array and the end array compared to the total array length, then p is our solution.
	//for example [1,2,3,4] [6,7,45], if the array has 8 characters and we are looking for the fifth elements, instead of adding the multiple copies of p into one of the array, we can skip that step and just return p
	if (f+low==k){
	    return p;
	}
       	else if (f < k){
	    return quickselect(a,k,f+low+1,high);
	}
	else{
	    return quickselect(a,k,low,f+low-2);
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