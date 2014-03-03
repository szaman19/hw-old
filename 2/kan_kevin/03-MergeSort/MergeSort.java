public class MergeSort{
    public int[] mergeSort(int[] A){
	if (A.length <= 1){
	    return A;
	}else{
	    int[] h1 = new int[A.length/2];
	    int[] h2 = new int[A.length/2];
	    for (int i = 0; i< A.length/2; i++){
		h1[i] = A[i];
	    }
	    for (int j = A.length/2;j< A.length; j++){
		h2[j-(A.length/2)] = A[j];
	    }
	    int[] R1 = mergeSort(h1);
	    int[] R2 = mergeSort(h2);
	    return merge(R1, R2);
	}
    }
    public int[] merge(int[] A, int[] B){
	int[] result = new int[A.length + B.length];
	int i = 0, j = 0, k = 0;
	while (i < A.length && j < B.length)
	    {
		if (A[i] < B[j])
		    {
			result[k] = A[i];
			i++;
		    }
		else
		    {
			result[k] = B[j];
			j++;
		    }
		k++;
	    }

	while (i < A.length)
	    {
		result[k] = A[i];
		i++;
		k++;
	    }

	while (j < B.length)
	    {
		result[k] = B[j];
		j++;
		k++;
	    }

	return result;
    }


    public static void main(String[] args){
	MergeSort m = new MergeSort();
	int[] a1 = new int[]{1,3,5,7,9,11,13,15,17,19};
	int[] a2 = new int[]{2,4,6,8,10,12,14,16,18,20};
	int[] f = m.merge(a1,a2);
	for (int i= 0; i< f.length; i++){
	    System.out.print(f[i] + ", ");
	}
	System.out.print("\n");
	int[] a3 = new int[]{8,23,76,4,3,9,7,928,4,63};
	int[] g = m.mergeSort(a3);
	for (int i= 0; i< g.length; i++){
	    System.out.print(g[i] + ", ");
	}
	System.out.print("\n");	
    }


}