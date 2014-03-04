public class MergeSort{
    public int[] merge(int[] a, int[] b){
	int alen = a.length;
	int blen = b.length;
	int[] ans = new int[alen + blen];
	int spota = 0;
	int spotb = 0;
	for(int i=0;i<a.length+blen;i++){
	    System.out.println(spota + " " + spotb);
	    if(spota == alen){
		ans[i] = b[spotb];
		spotb++;
	    }
	    else if(spotb == blen){
		ans[i] = a[spota];
		spota++;
	    }
	    else{
		if(a[spota] > b[spotb]){
		    ans[i] = b[spotb];
		    spotb++;
		}
		else{
		    ans[i] = a[spota];
		    spota++;
		}
	}

    public int[] mergeSort(int[] L){
	if(L.length <= 1){
	    return L;
	}
	int a = L.length / 2;
	int b = L.length - a;
	int[] A = new int[a];int[] B = new int[b];
	for(int i=0;i<a;i++){
	    A[i] = L[i];
}
	for(int i=0;i<b;i++){
	    B[i] = L[a+i];
	}
	int[] nA = mergeSort(A);
	int[] nB = mergeSort(B);
	return merge(nA,nB);
    }
}
	return ans;
}
    public static void main(String[] args){
	int[] a = new int[]{2,4,8,16,32,64,128,256,512};
	int[] b = new int[]{3,9,27,81,243,729,2187,2188,2189,2191};
	int[] s = merge(a,b);
	}