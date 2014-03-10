public class MergeSort{

    public int[] split(int[] L){
	if(L.length <= 1){
	    return L;
	}else{
	    int half = L.length / 2;
	    int[] A = new int[half];
	    int[] B = new int[L.length - half];
	    int index = 0;
	    for(int x = 0; x < A.length;x++){
		A[x] = L[index];
		index++; 
	    }
	    for(int x = 0; x < B.length; x++){
		B[x] = L[index];
		index++;
	    }
	    
	    A = split(A);
	    B = split(B);
	    L = merge(A,B);
	    return L;
	}
    }

    public int[] merge(int[] A,int[] B){
	int indexA = 0;
	int indexB = 0;
	int[] result = new int[A.length + B.length];
	for(int index = 0; index < (A.length + B.length); index++){
		if(indexA == A.length){
		     result[index] = B[indexB];
		     indexB++;
		}else if(indexB == B.length){
		     result[index] = A[indexA];
                     indexA++;	
		}else if(A[indexA] >= B[indexB]){	
		    result[index] = A[indexA];	
		    indexA++;
		}else{
		    result[index] = B[indexB];
		    indexB++;
		}

		
	}

	return result;
    }

}
