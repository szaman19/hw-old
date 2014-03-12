import java.io.*;
import java.util.*;

public class quick{
    public int quickselect(int[] a, int k, int low, int high) {
        if (low <= high) {
            int pivot = partition(a, low, high);
            if (pivot == k) {
                return a[k];
            } else if (pivot > k) {
                return quickselect(a, k, low, pivot - 1);
            } else {
                return quickselect(a, k, pivot + 1, high);
            }
        }
        else
            return a[low];
    }

    public int partition(int[] a, int low, int high) {
        int pivot = low + new Random().nextInt(high - low + 1);
        swap(a, high, pivot);
        int lstore = low;
        for (int i = lstore; i < high; i++) {
            if (a[i] > a[high]) {
                swap(a, i, lstore);
                lstore++;
            }
        }
        swap(a, lstore, high);
        return lstore;
    }

    public void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args){
        quick q = new quick();
        int[] a = {1,15,3,53,33,22,64,82,49,67};
        System.out.println(q.quickselect(a,5,0,8));
    }
}