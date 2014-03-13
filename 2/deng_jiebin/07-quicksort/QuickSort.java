import java.util.*;

public class QuickSort{

    public Integer[] quicksort(Integer[] a){
	if(a.length <= 1){
	    return a;
	}
	else{
	    Random r = new Random();
	    int p = r.nextInt(a.length);
	    Integer piv = a[p];
	    ArrayList<Integer> L1 = new ArrayList<Integer>();
	    ArrayList<Integer> L2 = new ArrayList<Integer>();
	    for(int i = 0; i<a.length; i++){
		if(a[i] < piv){
		    L1.add(a[i]);
		}
		if(a[i] > piv){
		    L2.add(a[i]);
		}
	    }
	    Integer[] a1 = new Integer[L1.size()];
	    Integer[] a2 = new Integer[L2.size()];
	    a1 = L1.toArray(a1);
	    a2 = L2.toArray(a2);
	    //having problems with the recursion
	    a1 = quicksort(a1);
	    a2 = quicksort(a2);
	    int c2 = 0;
	    for(int c = 0; c<a.length; c++){
		if(c < p){
		    a[c] = a1[c];
		}
		if(c == p){
		    a[c] = piv;
		}
		if(c > p){
		    a[c] = a2[c2];
		    c2++;
		}
	    }
	    return a;
	}
    }

    public static void main(String[]args){
	Integer[] a = {3,9,0,1,7,2,4,6,5,8};
	QuickSort qs = new QuickSort();
	System.out.println(Arrays.toString(a));
	System.out.println("Result: "+Arrays.toString(qs.quicksort(a)));
    }
}
