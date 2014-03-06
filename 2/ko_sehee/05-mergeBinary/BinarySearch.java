public class BinarySearch{
    public int rbsearch(int n, int[] L){
	if (L.length <1){
	    return -1;
	}
	else if (L.length =1){
	    if (L[0]== n){
		return 0;
	    }
	    else{
		return -1;
	    }
	}
	else if (L[L.length/2] > n){
	    int [] tmp =  new int[L.length -L.length/2];
	    for (int i = 0; i < tmp.length; i++){{
		    tmp[i] = L[i];
		}
	    }
	}
    }
} 
//I've confused myself, will get back to it later
