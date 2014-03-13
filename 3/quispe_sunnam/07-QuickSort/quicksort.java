import java.util.*;
public class quicksort{
    public static Integer[] quicksort(Integer[] a){
	if (a.length<=1){
	    return a;
	}
	int p =a[(int)(Math.random()*a.length-1)];
	ArrayList<Integer> F = new ArrayList<Integer>();
	ArrayList<Integer> E = new ArrayList<Integer>();
	int count = 0;
	int f=0;
	int e=0;

	for (int i =0; i <a.length; i++){
	    if (a[i]<p){
		F.add(a[i]);
	    }
	    else if (a[i] > p){
		E.add(a[i]);
	    }
	    else{
		count++;
	    }
	}
	Integer[] G= F.toArray(new Integer[F.size()]);
	Integer[] H= E.toArray(new Integer[E.size()]);

	 G= quicksort(G);
	 H= quicksort(H);

	 for (int i=0,x = 0; i<a.length; i++){
	     if (i<G.length){
		 a[i] = G[i];
	     }
	     else  if (i>=G.length && count >0){
		 a[i] = p;
		 count--;
	     }
	     else{
		 a[i] = H[x];
		 x++;
	     }
	 }
	 return a;
     }
}
