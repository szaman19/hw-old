import java.util.*;
public class QuickSelect {
    private Random rand = new Random();

    public String printArray(int[] a) {
	return Arrays.toString(a);
    }
  
    public int quickselect(int[] a, int k) {
	return quickselectWorker(a, k, 0, a.length);
    }
    public int quickselectWorker(int[] a, int k, int low, int high) {
	
	if (low >= high) {
	    return a[high];
	}
	int pivot = a[rand.nextInt(high - low) + low];
	int[] temp = new int[a.length];
	int pivIndex = 0;
	int left = 0;
	int right = a.length - 1;
	for (int i = 0; i < a.length; i++) {
	    if (a[i] != pivot) {
		if (a[i] < pivot) {
		    temp[left] = a[i];
		    left++;
		    pivIndex++;
		}
		else {
		    temp[right] = a[i];
		    right--;
		}
	    }
	}
	temp[pivIndex] = pivot;
	a = temp;
	if (pivIndex == k) {
	    return pivot;
	}

        if (pivIndex > k) {
	    return quickselectWorker(a, k, low, pivIndex);
	}

	else {
	    return quickselectWorker(a, k, pivIndex, high);
	}
  
    }
}
