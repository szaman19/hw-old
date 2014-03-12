import java.util.*;
import java.io.*;

public class BinarySearch{


    //I'm not sure how you get the correct index with this algorithm
    public int rbsearch(int n, int[] L){

	int middle = L.length / 2;
	if(L[middle] == n){
	    return middle;
	}
	else if(middle == 0){
	    return -1;
	}
	else if(L[middle] < n){
	    int[] temp = new int[L.length - middle];
	    for(int i = 0; i < temp.length; i++){
		temp[i] = L[middle + i];
	    }
	    return  middle + rbsearch(n,temp);
	}
	else{
	    int[] temp = new int[middle];
	    for (int i = 0; i<temp.length; i++){
		temp[i] = L[i];
	    }
	    return middle - rbsearch(n,temp);
	}
    }

    public int lbsearch(int n, int [] L){
	int middle = L.length / 2;
	//int old = 0;
	
	while (middle > 0){
	    if(L[middle] == n){
		return middle;
	    }

	    if(L[middle] > n){
		//old = middle;
		middle = (L.length - middle)/2;
	    }
	    else{
		//old = middle
		middle = middle / 2;
	    }
	}
	return -1;
    }
	    
}