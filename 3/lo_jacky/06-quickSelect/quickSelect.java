public class quickSelect{

    //broken code; need significant fixing
    public int quickSelect(int[] a, int k, int low, int high){
	if (low >= high)
	    return a[low];
	else{
	    int pivotInd = high/2 + low;
	    int pivot = a[pivotInd];
	    int[] temp = new int[a.length];
	    int h1 = 0, h2 = a.length-1;
	    for (int i = 0; i < a.length; i++){
		if (a[i] < pivot){
		    temp[h1] = a[i];
		    h1++;
		}else if (a[i] > pivot){
		    temp[h2] = a[i];
		    h2--;
		}else{
		    temp[i] = temp[pivotInd];
		}
	    }
	    if (k == pivot)
		return pivot;
	    else if (k < pivot)
		return quickSelect(temp, k, low, pivotInd);
	    else
		return quickSelect(temp, k, pivotInd, high);
	}
    }
}
