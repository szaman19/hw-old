import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class QuickSort{
    
    
    public static void quickSort(Integer[] A, int low, int high){
	int p = (int) (Math.random()*(high-low +1)) + low;


        if (high>low) {
	    System.out.println("P:"+p + "    H:" + high + "     L:" +low);
	    ArrayList<Integer> left = new ArrayList<Integer>();
	    ArrayList<Integer> right = new ArrayList<Integer>();
	    for(int i = 0; i < p; i++){
		if(A[i] < A[p])
		    left.add(A[i]);
		else
		    right.add(A[i]);
	    }
	    for(int i = p+1; i < A.length; i++){
		if(A[i] < A[p])
		    left.add(A[i]);
		else
		    right.add(A[i]);
	    }
	    
	left.add(A[p]);
	left.addAll(right);       
	A = left.toArray(A);
	quickSort(A,low,p);
	quickSort(A,p+1,high);


	}
    }

    
    
    public static void main(String[] args){
	int n = Integer.parseInt(args[0]);
	Random rnd = new Random();
	Integer[] a = new Integer[n];
	for (int i=0;i<n;i++)
	    a[i]=new Integer(rnd.nextInt(100));
	System.out.println(Arrays.toString(a));
	quickSort(a, 0, n-1);
	System.out.println(Arrays.toString(a));


    }
}

