public class binarySearchint{

    public int rbsearch(int n, int Lo,int Hi,int[] L){
	int mid = (Lo+Hi)/2;
	if (Lo == mid || Lo == Hi){
	    if (n == L[Lo]){
		return Lo;
	    } else if (n == L[Hi]){
		return Hi;
	    } else {
		return -1;
	    }
	}
	if (n < L[mid]){
	    return rbsearch(n,Lo,mid,L);
	} else if (n > L[mid]){
	    return rbsearch(n,mid,Hi,L);
	} else {
	    return mid;
	}
    }

    public int ibsearch(int n, int[] L){
	int lower = 0;
	int upper = L.length - 1;
	int midd = (lower+upper/2);

	while (midd != lower && lower != upper){
	    if (n == L[midd]){
		return midd;
	    } else if (n > L[mid]){

		lower = midd;
	    } else {

		upper = midd;
	    }
	    midd = lower + upper/2;
	}
	if (n == L[lower]){
	    return lower;
	}
	if (n== L[upper]){
	    return upper;
	}
	return -1;
    }

}