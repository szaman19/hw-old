import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class quicksort {

  

    public Integer[] qsort (Integer []  L){
	if (L.length <= 1)
	    return L;

	  Integer pivot = (int) (Math.random() * L.length);
	    ArrayList <Integer> lower = new ArrayList <Integer> ();
	    ArrayList <Integer> upper = new ArrayList <Integer> ();
	    for (Integer x : L){
		if (x < L[pivot]) 
		    lower.add(x);
		if (x > L[pivot]) 
		    upper.add(x);
	    }
	    System.out.println ("Pivot: " +L[pivot]);
	    System.out.println ("Upper: " +upper);
	    System.out.println ("Lower: " +lower);
	    Integer [] ua = upper.toArray (new Integer [] {});
	    Integer [] la = lower.toArray (new Integer [] {});
	    //System.out.println (Arrays.toString(ua));
	    qsort (la);
	    qsort (ua);
	    return merge (la, L[pivot], ua);
	    // System.out.println (Arrays.toString(ua));


	    /*
    ArrayList <Integer> complete = new ArrayList <Integer> ();
    for (Integer i = 0; i < la.length; i++) 
		complete.add(la[i]);
	    System.out.println ("Lower final : " + complete);
	    complete.add (L[pivot]);
	    System.out.println ("Lower + pivot : " + complete);
	    for (Integer i = 0; i < ua.length; i++)
		complete.add(ua[i]);
	    System.out.println ("Lower final : +pivot + upper" + complete);
	    Integer [] c = complete.toArray (new Integer [] {} );

	    return c;
	    */
	
       
      
    }
    public Integer [] merge (Integer [] la, Integer pivot, Integer [] ua) {
   ArrayList <Integer> complete = new ArrayList <Integer> ();
    for (Integer i = 0; i < la.length; i++) 
		complete.add(la[i]);
	    System.out.println ("Lower final : " + complete);
	    complete.add (pivot);
	    System.out.println ("Lower + pivot : " + complete);
	    for (Integer i = 0; i < ua.length; i++)
		complete.add(ua[i]);
	    System.out.println ("Lower final : +pivot + upper" + complete);
	    Integer [] c = complete.toArray (new Integer [] {} );

	    return c;
    }

    public static void main (String [] args) {
 
	Integer n = 6;
	Random rnd = new Random();
	Integer[] a = new Integer[n];
	for (int i=0;i<n;i++)
	    a[i]=new Integer(rnd.nextInt(100));
	System.out.println (Arrays.toString(a));

	quicksort foo = new quicksort();
	System.out.println(Arrays.toString(foo.qsort (a)));

    }

    }