import java.io.*;
import java.util.*;

public class Quicksort{
    private Random r = new Random();

    public Integer[] qsort(Integer[] L){
	if (L.length <= 1){
	    return L;
	}
	else {
	    Integer pos = r.nextInt(L.length);
	    Integer pivot = L[pos];
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();
	    for (int i = 0;i<L.length;i++){
		if (L[i] < pivot){
		    lower.add(L[i]);
		}
		else if (L[i] > pivot){
		    upper.add(L[i]);
		}
	    }
	    Integer[] l = lower.toArray(new Integer[lower.size()]);
	    Integer[] u = upper.toArray(new Integer[upper.size()]);
	    Integer[] r1 = qsort(l);
	    Integer[] r2 = qsort(u);
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    for (int i = 0;i<r1.length;i++){
		res.add(r1[i]);
	    }
	    res.add(pivot);
	    for (int i = 0;i<r2.length;i++){
		res.add(r2[i]);
	    }
	    L = res.toArray(new Integer[res.size()]);
	}
	return L;
    }
}
