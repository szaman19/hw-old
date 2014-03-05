/*
  mergesort(L)
  if length of L<= 1
  return L
  else
  split L into halves
  a and b
  a = mergeSort(a)
  b = mergeSort(b)
  L = merge(a,b)
  return L

*/
import java.util.*;
public class 5mergeSort{
    
    public int[] merge(int[] a, int[] b){
	int[] ans = new int[a.length + b.length];
	int stepA = 0;
	int stepB = 0;
	for(int i = 0; i<ans.length; i++){
	    if(stepA < a.length && stepB < b.length){
		if(a[stepA] >= b[stepB]){
		    ans[i] = b[stepB];
		    stepB++;
		}
		else{
		    ans[i] = a[stepA];
		    stepA++;
		}
	    }
	    else if(stepA >= a.length){
		ans[i] = b[stepB];
		stepB++;
	    }
	    else{
		ans[i] = a[stepA];
		stepA++;
	    }
	}
	return ans;
    }
    
    public int[] mergeSort(int[] L){
	halfListA = new int[L.length/2+1];
	halfListB = new int[L.length/2+1];
	if (L.length <= 1){
	    return L;
	}else{
	    for (int a = 0; a < L.length/2){
		halfListA[a] = L[a];
	    }
	}
    }
}
