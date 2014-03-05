public class MergeSort{

    public int[] split(int[] L){
	if(L.length == 1){
	    return L;
	}else{
	    int half = L.length / 2;
	    int[] A = new int[half];
	    int[] B = new int[L.length - half];
	    for(int x = 0; x < half;x++){
		A[x] = L[x]; 
	    }
	    for(int x = half; x < L.length; x++){
		B[x] = L[x];
	    }
	    
	    split(A);
	    split(B);
	    
	    merge(A,B);
	  
	}
    }

    public int[] merge(int[] A,int[] B){
	int indexA = 0;
	int indexB = 0;
	int[] result = new int[A.length + B.length];
	while(indexA + indexB < (A.length + B.length) - 2){
		if(A[indexA] >= B[indexB]){	
		    result[indexA+indexB] = A[indexA];	
		    indexA++;
		}else{
		    result[indexA+indexB] = B[indexB];
		    indexB++;
		}
	}

	return result;
    }

}
