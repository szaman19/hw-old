public class MergeSort{

    public int[] merge(int[]a, int[]b){

	int[] ans = new int[a.length + b.length];
	int anspos = 0;
	int apos = 0;
	int bpos = 0;

	while(anspos < ans.length){
	    if(a[apos] < b[bpos]){
		ans[anspos] = a[apos];
		if(apos + 1 < a.length){
		    apos++;
		    anspos++;
		}
		else{
		    a[apos] = b[bpos];
		    anspos++;
		}
	    }
	    else{
		ans[anspos] = b[bpos];
		if(bpos + 1 < b.length){
		    bpos++;
		    anspos++;
		}
		else{
		    anspos++;
		    b[bpos] = a[apos];
		}
	    }
	}
	return ans;
    }

    public int[] mergeSort(int[] L){

	if (L.length <= 1){
	    return L;
	}
	
	int[]a = new int[L.length/2];
	int[]b = new int[(L.length) - (L.length/2)];
	int count = 0;
	
	for(int i = 0; i < a.length; i++){
	    a[i] = L[count];
	    count++;
	}

	for(int i = 0; i < b.length; i++){
	    b[i] = L[count];
	    count++;
	}

	a = mergeSort(a);
	b = mergeSort(b);

	L = merge(a,b);
	return L;
    }
}