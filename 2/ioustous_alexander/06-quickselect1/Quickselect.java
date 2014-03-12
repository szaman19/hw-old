public class Quickselect {

    public static int quickselect(int[] a, int k, int low, int high){
	if ((high > a.length-1) || (low < 0)){
	    return -1;
	}
	if ((high - low)<=1){
	    return a[low];
	}
	
	int p = a[(high-low)/2 + low];
	int [] templow = new int[high-low];
	int lowcount = 0;
	int highcount =0;
	int []temphigh = new int [high-low];
	for (int i= low; i < high; i++){
	    if (a[i] < p){
		templow[lowcount] = a[i];
		lowcount +=1;
	    }
	    if (a[i] >= p){
		temphigh[highcount] = a[i];
		highcount+=1;
	    }
	}
	for (int i = 0; i<lowcount;i++){
	    a[low +i] = templow[i];
	}
	a[low+lowcount] = p;
	for (int i = 0; i < highcount; i++){
	    a[low+lowcount+i+1]= temphigh[i];
	}
	if ((low + lowcount) == k){
	    return p;
	}
	if ((low + lowcount) < k){
	    return (quickselect(a,k,low+lowcount+1, high));
	}
	if ((low + lowcount) > k){
	    return (quickselect (a,k,low,low+lowcount-1));
	}
	return -1;
    }


    public static void main (String [] args){
	
	int [] stuff = {7,2,6,8,4,9};
	
	System.out.println (quickselect (stuff, 4, 0, 5));
    }
}
	   
       
	
