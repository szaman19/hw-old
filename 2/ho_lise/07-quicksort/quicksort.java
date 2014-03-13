//I can't get toArray to work without errors for some reason :( 
// That's the only problem I had
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
	//Integer[] G = new Integer[F.size()];
	//Integer[] H = new Integer[E.size()];
	Integer[] G= F.toArray(new Integer[F.size()]);
	Integer[] H= E.toArray(new Integer[E.size()]);
	/* The LONG WAY
	 for (int x = 0; x<F.size(); x++){
	     G[x] = F.get(x);
	 }

	 for (int x = 0; x<E.size(); x++){
	     H[x] = E.get(x);
	 }
	*/
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

     public static void main (String[]args){
	 Integer[] X = new Integer[]{7,23,45,21,2,42,13,5,3,7,8,4,3,13,2,1,3};
	 Integer[] Y = new Integer[X.length];
	 for (int i =0; i < X.length;i++ ){
	     Y[i] = X[i];
	 }
	 Arrays.sort(Y);
	 System.out.println(Arrays.toString(Y));
	 System.out.println(Y[4]+ "\n");

	 System.out.println(Arrays.toString(X));

	 System.out.println(Arrays.toString(quicksort(X)));
	 Integer[] D = new Integer[]{23,57,65,84,34,10};
	 System.out.println(Arrays.toString(quicksort(D)));
	

    }
	



}