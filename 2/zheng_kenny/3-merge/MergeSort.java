import java.util.*;

public class MergeSort{
    public int[] Merge(int[] a, int[] b){
	int[] ret = new int[a.length + b.length];
	int indexA = 0;
	int indexB = 0;
	for(int i=0; i < ret.length, i++){
	    if(indexA < a.length && indexB < b.length){
		if(a[indexA] > b[indexB]){
		    ret[i] = b[indexB];
		    indexB++;
		}
		else{
		    ans[i] = a[indexA];
		    indexA++;
		}
	    }
	    else if(indexA == a.length){
		ans[i] = b[indexB];
		indexB++;
	    }
	    else{
		ans[i] = a[indexA];
		indexA++;
	    }
	}
	return ret;
	
    }
    
    /*    public int[] MergeSort(int[] L){
	firsthalf = new int[L.length/2+1];
	secondhalf = new int[L.length/2+1];
	for(int i = 0; i <= ;i++){
	    if(L.length <= 1){
		return L;
	    }
	    else{
    */				
