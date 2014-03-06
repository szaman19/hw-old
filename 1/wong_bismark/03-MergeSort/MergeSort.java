import java.util.*;
public class MergeSort{
    
    public static int[] merge(int[] a, int[] b){
	int[] butt = new int[a.length+b.length];
	int Acount = 0;
	int Bcount = 0;

	for(int i = 0; i< butt.length; i++){
		   
	    if(a[Acount] < b[Bcount]){
		butt[i] = a[Acount];
		Acount++;
		if(Acount >= a.length){
			
			for(int j = Bcount; j < b.length; j++){
				i++;
				butt[i] = b[j];
				
			}
		    break;
		}
	    }
	    else{
		butt[i] = b[Bcount];
		Bcount++;
		if(Bcount>= b.length){
		    	for(int k = Acount; k < a.length; k++){
				i++;
				butt[i] = a[k];
				
			}
		    break;
		}
	    }
	}
	System.out.println("We are merging: ");
	
	for(int i=0; i< a.length; i++){
	    System.out.print(a[i] + " - ");
	}

	System.out.println();
	for(int i=0; i< b.length; i++){
	    System.out.print(b[i] + " - ");
	}
	System.out.println();

	for(int i=0; i< butt.length; i++){
	    System.out.print(butt[i] + " - ");
	}
	System.out.println();


	return butt;
    }

		
 
    public static int[] msort(int[] L){
	if(L.length <= 1 ){
	    return L;
	}
	else{
	    int[] a = new int[L.length/2];
	    int[] b = new int[L.length- a.length];

	    int i;
	    for(i = 0; i<L.length/2; i++){
		a[i] = L[i];
	    }

	    for(i = i; i<L.length; i++){
		b[L.length -i -1] = L[i];
	    }
	    a = msort(a);
	    b = msort(b);

	    int[] result = merge(a, b);
	    
	    System.out.println("The result for this branch is:");

	    for(i = 0; i< result.length; i++){
	   
		System.out.println(result[i]);
	    }
	    return result;
	}
    }


    public static void main(String[] args){

	    int[] a = {1, 2,78,234,879};
	    int[] b = {3, 4,5,7,8,10,15,19,21,45, 132, 145, 768};
	    /*   int[] bitt = { 123, 523, 4643, 1234, 234, 656456 ,234, 25, 56,54234 12,5 , 1,3 1234, 345,3, 5,43, 7,4 6,2, 52, 3,3 46 7, 68,8 ,2, 5,23 , 253, 5654  3, 5  ,3 , 53, 46, 7};
	     */

	    int[] c  = {515, 12, 44, 2, 3,5, 1,2, 63, 2,89 ,912, 363, 13, 9};
	    msort(c);
	    //	    	    merge(a, c);
		    //	    merge(b,c);
		    // merge(a, b);
    }
		
}		