public class Mergesort {

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
	int[]c = {2, 3, 5, 9};
	int []d = {1, 2, 6, 8};
	
	System.out.println  (toString(merge (c,d)));
    }
}
