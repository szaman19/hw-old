public class Mergesort {

    public static int [] mergeSort (int [] input){
	int [] returnarray = new int[input.length];
	if (input.length <= 1){
	    return input;
	}else {
	    if ((input.length % 2) ==1 ){
		int[]b = new int[(input.length -1)/2 +1];
		int[]a = new int[(input.length-1)/2];
		for (int i = 0; i < (input.length -1)/2 +1; i++){
		    b[i] = input[i];
		}
		for (int i = (input.length-1)/2 +1; i < input.length; i++){
		    a[i-((input.length-1)/2 +1)] = input[i];
		}
		a =mergeSort (a);
		b =mergeSort (b);
		returnarray = merge(a,b);
	    }else {
		int[]b = new int[(input.length)/2];
		int[]a = new int[(input.length)/2];
		for (int i = 0; i < (input.length)/2; i++){
		    b[i] = input[i];
		}
		for (int i = (input.length)/2; i < input.length; i++){
		    a[i-(input.length)/2 ] = input[i];
		}
		a =mergeSort (a);
		b =mergeSort (b);
		returnarray = merge(a,b);
		
	    }
	}



	return returnarray;
    }
	    
	    

    public static int [] merge (int [] a, int [] b){
	int tempa = 0;
	int tempb = 0;
	int[] returnarray = new int[a.length + b.length];
	for (int i =0; i < returnarray.length; i++){
	    int tempa2 = tempa;
	    int tempb2 = tempb;
	    if (tempa  < a.length){
		if (tempb == b.length){
		    returnarray[i] = a[tempa];
		    tempa2 = tempa +1;
		} else if (a[tempa] <= b[tempb]){
		    returnarray [i] = a[tempa];
		    tempa2 = tempa +1;
		}
	    }
	    if ((tempb  < b.length) && (tempa == tempa2)){
		if (tempa == a.length){
		    returnarray[i] = b[tempb];
		    tempb2 = tempb +1;
		}else if (b[tempb] <= a[tempa]){
		    returnarray [i] = b[tempb];
		    tempb2 = tempb + 1;
		}
	    }
	    
	    tempa = tempa2;
	    tempb = tempb2;
	}
	return returnarray;
    }

    public static String toString (int[] array){
	String returnstring = "";
	for (int i = 0; i < array.length; i++){
	    returnstring = returnstring + array[i] + ", ";
	}
	return returnstring;
    }

    public static void main (String [] args){
	/*int[]c = {2, 3, 5, 7};
	  int []d = {2, 4, 6, 8};
	
	  System.out.println  (toString(merge (c,d)));
	*/
	int[] c = {1, 2, 4, 9, 4, 7, 6};
	int[]d = {9,8,7,6,5,4,3,2,1};
	System.out.println (toString (mergeSort(c)));
	System.out.println (toString (mergeSort(d)));

    }
}