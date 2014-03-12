import java.util.*;

public class BinarySearch{

    public static int binsearch(int[] array, int n){
	Arrays.sort(array);
	int low = 0;
	int high = array.length-1;
	int mid;
	while(high >= low){
	    mid = (low+high)/2;
	    if(array[mid] == n){
		return mid;
	    }
	    if(array[mid] < n){
		low = mid + 1;
	    }
	    if(array[mid] > n){
		high = mid - 1;
	    }
	}
	return -1; //not found
    }

    public static int binsearch(int n, int low, int high, int[] array){
	Arrays.sort(array);
	int mid = (low+high)/2;
	if(low > high){
	    return -1; //not found
	}
	if(array[mid] < n){
	    return binsearch(n, mid+1, high, array);
	}
	if(array[mid] > n){
	    return binsearch(n, low, mid-1, array);
	}else{
	    return mid;
	}
    }

    public static void main(String[]args){
	int[] test = {5, 3, 4245, 2, 4, 100, 65, 43};
	int[] test2 = {2, 3, 4, 5, 43, 65, 100, 4245};
	System.out.println(binsearch(test, 4245));
	System.out.println(binsearch(test2, 4245));
    }
}
