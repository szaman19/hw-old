public class DivConquer {

    public static String [] mergeSort (String [] input){
	String [] returnarray = new String[input.length];
	if (input.length <= 1){
	    return input;
	}else {
	    if ((input.length % 2) ==1 ){
		String[]b = new String[(input.length -1)/2 +1];
		String[]a = new String[(input.length-1)/2];
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
		String[]b = new String[(input.length)/2];
		String[]a = new String[(input.length)/2];
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
	    
	    
    public static String [] merge (String [] a, String [] b){
	int tempa = 0;
	int tempb = 0;
	String[] returnarray = new String[a.length + b.length];
	for (int i =0; i < returnarray.length; i++){
	    int tempa2 = tempa;
	    int tempb2 = tempb;
	    if (tempa  < a.length){
		if (tempb >= b.length){
		    returnarray[i] = a[tempa];
		    tempa2 = tempa +1;
		} else if (isABeforeB(a[tempa],b[tempb])){
		    returnarray [i] = a[tempa];
		    tempa2 = tempa +1;
		}
	    }
	    if ((tempb  < b.length) && (tempa == tempa2)){
		if (tempa >= a.length){
		    returnarray[i] = b[tempb];
		    tempb2 = tempb +1;
		}else if (isABeforeB(b[tempb],a[tempa])){
		    returnarray [i] = b[tempb];
		    tempb2 = tempb + 1;
		}
	    }
	    
	    tempa = tempa2;
	    tempb = tempb2;
	}
	return returnarray;
    }

    public static boolean isABeforeB (String a, String b){
	if (a.length() > b.length()){
	    for (int i =0; i <b.length(); i++){
		if (a.charAt(i) > b.charAt(i)){
		    return false;
		}
	    }
	}else {
	    for (int i =0; i < a.length(); i++){
		if (a.charAt(i) > b.charAt(i)){
		    return false;
		}
	    }
	}
	return true;
    }
    

	
    public static String toString (String[] array){
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
	String[] c = {"g","f","e","d", "c", "b", "a"};
	String[]d = {"hi","stufg", "more", "stuff"};
	System.out.println (toString (mergeSort(c)));
	System.out.println (toString (mergeSort(d)));

    }
}
