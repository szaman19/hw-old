import java.util.*;

public class quickSort{

    Random rand = new Random();

    //NOTE: DOES NOT WORK FOR ARRAYS WITH MORE THAN ONE IDENTICAL NUMBERS
    public int[] quickSort(int[] arr){
	if (arr.length <= 1)
	    return arr;
	else{
	    int pivotInd = rand.nextInt(arr.length);
	    int pivot = arr[pivotInd];
	    ArrayList<Integer> h1 = new ArrayList<Integer>();
	    ArrayList<Integer> h2 = new ArrayList<Integer>();
	    for (int i = 0; i < arr.length; i++){
		if (arr[i] < pivot)
		    h1.add(arr[i]);
		else if (arr[i] > pivot)
		    h2.add(arr[i]);
	    }
	    int[] low = new int[h1.size()];
	    int[] high = new int[h2.size()];
	    for (int i = 0; i < low.length; i++)
		low[i] = h1.get(i);
	    for (int i = 0; i < high.length; i++)
		high[i] = h2.get(i);
	    int[] r1 = quickSort(low);
	    int[] r2 = quickSort(high);
	    return combine(r1,pivot,r2);
	}
    }

    public int[] combine(int[] r1, int n, int[] r2){
	int[] r = new int[r1.length + r2.length + 1];
	int i = 0;
	for (; i < r1.length; i++)
	    r[i] = r1[i];
	r[i] = n;
	i++;
	for (int j = 0; j < r2.length; j++){
	    r[i] = r2[j];
	    i++;
	}
	return r;
    }

    public static void main(String[] args){
	quickSort qs = new quickSort();
	int[] a = {97,53,21,32,52,41,36,85,27,40,39,68,25,74,62,57,16,18,15,17};
	for (int i = 0; i < a.length; i++)
	    System.out.print(a[i] + ", ");
	System.out.println();
	System.out.println();
	int[] b = qs.quickSort(a);
	for (int i = 0; i < b.length; i++)
	    System.out.print(b[i] + ", ");
    }
	
}
