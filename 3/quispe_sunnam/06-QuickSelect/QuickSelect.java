
public class QuickSelect {

    public int quickselect(int[] a, int k, int low, int high) {
	if (low >= high)
	    return a[low];
	int pivot = high/2 + low;
	int[] list = new int[a.length];
	int a = 0;
	int b = a.length-1;
	int c = 0;
	for (int i = 0; i <= a.length; i++) {
	    if (a[i] < a[pivot]) {
		list[a] = a[i];
		a++;
	    }
	    else if (a[i] > a[pivot]){
		list[b] = a[i];
		b--;
	    }
	    else {
		list[i] = list[pivot];
	    }
	}
	if (k == pivot) {
	    return a[pivot];
	}
	else if (k < pivot) {
	    return quickselect(int[] list, int k, int low, int pivot);
	}
	else {
	    return quickselect(int[] list, int k, int pivot, int high);
	}
    }
}
