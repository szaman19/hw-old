import java.io.*;
import java.util.*;

public class Selector{


    public int QuickSelect(int[] a, int L, int H, int k){
	int[] alt = int[H-L+1];
	if (L >= H){
	    return k;
	}
	Random r = new Random();
	int ind = r.nextInt(alt.length)+L; // index of pivot
	int altind = 0;
	int altind2 = 0;
	for (int i = 0; i<a.length; i++){
	    if (a[i] <= a[ind]){
		alt[altind] = a[i];
		altind++;
	    }
	    else{
		alt[a.length-1-altind2];
		altind2++;
	    }
	}
	if (altind == k){
	    return alt[altind];
	}
	else{
	    if (altind < k){
		return QuickSelect(a,altind+1,H,k)+altind;
	    }
	    else{
		return QuickSelect(a,0,altind-1,k);
	    }
	}
    }

    public int QuickSelect(int[] a, int k){
	int[] alt = int[a.length];
	Random r = new Random();
	int ind = r.nextInt(a.length); // index of pivot
	int altind = 0;
	int altind2 = 0;
	for (int i = 0; i<a.length; i++){
	    if (a[i] <= a[ind]){
		alt[altind] = a[i];
		altind++;
	    }
	    else{
		alt[a.length-1-altind2];
		altind2++;
	    }
	}
	if (altind == k){
	    return alt[altind];
	}
	else{
	    if (altind < k){
		return QuickSelect(a,altind+1,a.length-1,k)+altind;
	    }
	    else{
		return QuickSelect(a,0,altind-1,k);
	    }
	}
    }

}

    