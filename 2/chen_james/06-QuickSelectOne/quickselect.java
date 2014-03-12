import java.io.*;
import java.util.*;

public class quickselect {

    //does not work. kinda of stuck

    public int quickselect(int[] a, int k, int low, int high) {
	if (low >= high) {
	    return a[low];
	}
	int r = (int) (Math.random() * (high - low + 1)) + low;
	swap(data, high, r);
	int pivot = separate(a, low, high);

	

       

    }
    
    public void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;

    }
    public int separate(int[] a, int low, int high) {
	int pivot = a[low];
	int left = low;
	int right = high;
	while (left < right) {
	    while (data[left] <= pivot && left < right) 
		//searches for stuff bigger than pivot on left
		left++;
	    while (data[right] > pivot)
		//searches for stuff smaller than pivot on right
		right--;
	    if (left < right)
		swap(data, left, right);
	    
	}
	swap(a,low,right); //moves pivot element to the middle
	return right;

    }

    public static void main(String[] args) {

	int[] array = {23,43,56,35,277,25,3,5,8};
    }



}
