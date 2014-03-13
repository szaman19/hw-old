public class QuickSelect {

    public int quickselect(int[] a, int k, int low, int high) {

	if (low >= high)
	    return low;
	else {
	    int pivot = a[(high + low)/2];
	    int[] temp = new int[a.length];
	    int l=0, h=0;

	    //partitioning array
	    for (int i=low;i<high;i++) {
		if (a[i] < pivot){
		    temp[l] = a[i];
		    l++;
		}
		else if (a[i] > pivot) {
		    temp[a.length-h] = a[i];
		    h++;
		}
	    }
	    a = temp;

	    //if random pivot chosen is index we look for
	    int picot i = a.indexOf(pivot);
	    if (i == k) {
		return pivot;
	    }
	    //altering paramemter depending on where the pivot placed
	    else if (i > k) {
		return quickselect(a, k, low, i);
	    }
	    else {
		return quickselect(a, h, i, high);
	    }
	}
	return -1;

    }



}
