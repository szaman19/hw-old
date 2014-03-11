public class binarySearch{

    private int high;
    private int low;

    public boolean same(int[]L){
	for (int i = 0; i < L.length-1; i++){
	    if (L[i] != L[i+1]){
		return false;
	    }
	}
    }

    public int rbsearch(int n, int[]L){

	high = L.length;

	int middle = L.length/2;

	if (L.length < 1 || same(L)){
	    return -1;
	}
	if (L[middle]==n){
	    return middle;
	} 
	else {
	    if(n > L[middle]){
		int[]temp = new int[L.length-middle];
		for (int i = 0; i < middle; i++){
		    temp[i] = L[i+middle];
		}
		rbsearch(n, temp);
	    }
	    else{
		int temp[] = new int [middle];
		for (int i = 0; i < middle; i++){
		    temp[i] = L[i];
		}
		rbsearch(n, temp);
	    }
	}
    }
    //don't know how to return the index

    public int ibsearch(int n, int[]L){;

	if (L.length < 1 || same(L)){
	    return -1;
	}
	if (L[middle]==n){
	    return middle;
	} 

	while (L.length > 1){

	int middle = L.length/2;
	    if(n > L[middle]){
		int[]temp = new int[L.length-middle];
		for (int i = 0; i < middle; i++){
		    temp[i] = L[i+middle];
		}
		L = temp;
	    }
	    else{
		int temp[] = new int [middle];
		for (int i = 0; i < middle; i++){
		    temp[i] = L[i];
		}
		L = temp;
	    }
	}
    }

}
