import java.util.*;

public class QuickSort {

    //Not Working

    public static int[] quicksort(int[] a) {
	if(a.length <= 1) {
	    return a;
	}
	else {
	    int[] fin = new int[a.length];
	    int low = 0;
	    int high = a.length-1;
	    return partition(a, low, high);
	}
    }
	    

    public static int[] partition(int[] a, int low, int high) {
        int p = low + (int)(Math.random()*(high - low + 1));
	int t = a[high];
	a[high] = a[p];
	a[p] = t;
        int track = low;
        for (int i = track; i < high; i++) {
            if (a[i] < a[high]) {
		t = a[i];
		a[i] = a[track];
		a[track] = t;
                track++;
            }
        }
	t = a[track];
	a[track] = a[high];
	a[high] = t;
	if(a.length <= 1) {
	    return a;
	}
	else {
	    int[] x = new int[p-low];
	    int[] y = new int[high-p];
	    for(int i = 0; i < x.length; i++) {
		x[i] = a[i];
	    }
	    for(int j = 0; j < y.length; j++) {
		y[j] = a[x.length+j];
	    }
	    x = partition(x, low, p-1);
	    y = partition(y, p+1, high);
	    int[] fin = new int[a.length];
	    for(int i = 0; i < x.length; i++) {
		fin[i] = x[i];
	    }
	    fin[x.length] = a[p];
	    for(int j = 0; j < y.length; j++) {
		fin[j+x.length] = y[j];
	    }
	    return fin;
	}
    }

    public static void main(String[] args) {
	int[] a = {3, 7, 9, 0, 10, 2, 8, 1, 13, 27, 20, 17, 15, 4, 5};
	int[] b = quicksort(a);
	for(int x = 0; x < b.length; x++) {
	    System.out.print(b[x] + ", ");
	}
    }

}
