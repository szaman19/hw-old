import java.util.*;
public class MergeSort{

    /*public static int[] splitLeft(int[]array){
	int size = array.length /2;
	int[] left = new int[size];
	for (int i = 0; i < size; i++){
	    left[i] = array[i];
	}
	return left;
    }

     public static int[] splitRight(int[]array){
	int sizeA = array.length / 2;
	int sizeB = array.length - sizeA;
	int[] right = new int[sizeB];
	for (int i = 0; i < sizeB; i++){
	    right[i] = array[i + sizeA];
}
	return right;
           }
    */

    public int[] merge(int[]a, int[]b){
	int[] ans = new int[a.length + b.length];
	int ia = 0;
	int ib = 0;
	for(int i = 0; i < ans.length - 1; i++){
	    if (ia == a.length){
		ans[i] = b[ib];
		ib++;}
	    if (ib == b.length){
		ans[i] = a[ia];
		ia++;
	    }
	    if (a[ia] < b[ib]){
		ans[i] = a[ia];
		ia++;
	    }else{
		ans[i] = b[ib];
		ib++;}
	}
	/*	if(a[a.length-1] > b[b.length -1]){
	    ans[ans.length -1] = a[a.length -1];
	}else{
	    ans[ans.length -1] = b[b.length -1];}
	*/
	return ans;
    }

    public int[] mergeSort(int[] array){
	if (array.length > 1){
	    int size = array.length;
	    int sizeA = size / 2;
	    int sizeB = size - sizeA;
	    int ia = 0;
	    int ib = 0;
	    int[] a = new int[sizeA];
	    int[] b = new int[sizeB];
	    for(int i = 0; i < size; i++){
		if (i < sizeA){
		    a[ia] = array[i];
		    ia++;
		}else{
		    b[ib] = array[i];
		    ib++;
		}
	    }
	    a = mergeSort(a);
	    b = mergeSort(b);
	    array = merge(a,b);
	}
	//Since nothing is done to the array there's no need for an else statement saying to return the array if it's less than 1!!! Effeciency	
	return array;
    
}


    public static void main(String[] arrrgs){
	MergeSort a = new MergeSort();
	//int[]one = {1,2,4,7,8,11,15};
	//int[]two = {2,2,2,8,8,11,19};
	//int[]three = a.merge(one, two);
	//	System.out.println(Arrays.toString(three));
	int[] whatever = {14,7,8,74,1,25,3,4,8,7,6,100,2};
	whatever = a.mergeSort(whatever);
	System.out.println(Arrays.toString(whatever));
	
}

}
