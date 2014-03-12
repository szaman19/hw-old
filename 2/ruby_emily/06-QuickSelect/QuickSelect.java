import java.io.*;
import java.util.*;

public class QuickSelect{

    public int quickselect(int[] a, int k, int l, int h){
	int p=0;
	System.out.println(toString(a));
       	if (l >= h)
       	    a[l]=p;
	else{
	    int[] tmp = new int[h-l+1];
	    int pivot = a[l+((h-l)/2)];
	    System.out.println(pivot);
	    int upcount=0;
	    int downcount=1;
	    for (int i = l; i<h;i++){
		if (a[i]<pivot){
		    tmp[upcount] = a[i];
		    upcount++;
		}
		else{
		    tmp[tmp.length-downcount] = a[i];
		    downcount++;
		}
	    }

	    for (int i=0; i<tmp.length;i++){
		if(tmp[i] == 0 && tmp[i-1]<pivot && tmp[i+1]>pivot){
		    tmp[i]=pivot;
		    p=i;
		}
		a[i+l]= tmp[i];
	    }
	    p=p+l;
	     if (p<k)
		quickselect(a,k,p,h);
	    else if (p>k)
		quickselect(a,k,l,p);
	    else
	    return a[p];
	}
	return a[p];
    }
    //got the pivot part itself to work but not after that

    public String toString(int[] a){
	return Arrays.toString(a);
    }

    public static void main(String[] args){
	QuickSelect q = new QuickSelect();

	int[] b = new int[52];
	Random r = new Random();
	for (int i=0;i<b.length;i++){
	    b[i] = r.nextInt(25);
	}

        System.out.println(q.quickselect(b, 5, 0, b.length-1));

    }
}
//[1,2,6,5,60,43,9]
