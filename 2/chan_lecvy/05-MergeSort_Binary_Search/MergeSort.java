import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class MergeSort {

    public ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList<Comparable> b) {
	ArrayList <Comparable> c = new ArrayList <Comparable>();
;
	while ((0 <a.size()) && (0 < b.size())) {
	    if (a.get(0).compareTo(b.get(0)) <= 0) {
		c.add(a.get(0));
		a.remove(0);
	    }
	    
	    else {
		    c.add(b.get(0));
		    b.remove(0);
		}
	}
	while (a.size() > 0) 
	    {
		c.add(a.get(0));
		a.remove(0);
	    }
	while (b.size() > 0) 
	    {
		c.add(b.get(0));
		b.remove(0);
	    }

	return c;
    }


    public ArrayList<Comparable> msort(ArrayList <Comparable> array){
	if (array.size()<=1) {
	    return array;
	}
	if (array.size() > 1) {
	    ArrayList<Comparable> a = new ArrayList<Comparable>(array.subList(0,array.size()/2));
	    ArrayList<Comparable> b = new ArrayList<Comparable>(array.subList (array.size()/2, array.size()));

	

	a = msort (a);
	b = msort (b);
	array = merge(a,b);
	return array;
	}
	else
	    return array;

    }
    


 public static void main(String[] args) {

     //TESTING FOR STRINGS
       MergeSort m = new MergeSort();
       String []  list = {"John", "Cena", "Chicken", "Tiger", "A", "Lebronjames"};
       
       ArrayList <Comparable> foo = new ArrayList<Comparable> ();
       for (String i : list) 
	   foo.add(i);
       System.out.println (foo);
       foo = new ArrayList <Comparable> (m.msort(foo));
       System.out.println (foo);
 

       //TESTING FOR INT
       MergeSort n = new MergeSort();
       ArrayList <Comparable> boo = new ArrayList<Comparable> ();
       for (int i = 0; i < 15; i++) {
	   int j = (int) (Math.random () * 40);
	   boo.add (j);
       }
       System.out.println (boo);
        boo = new ArrayList <Comparable> (m.msort(boo));
	System.out.println (boo);




	//TESTING FOR PERSON
	MergeSort yoo = new MergeSort();
	Person a = new Person ("John", 10);
	Person b = new Person ("Tony", 10);
	Person c = new Person ("Lebron", 27);
	Person d = new Person ("Timothy", 5);
	Person e = new Person ("Ay", 3);

	ArrayList <Comparable> peeps = new ArrayList <Comparable> ();
	peeps.add(a);
	peeps.add(b);
	peeps.add(c);
	peeps.add(d);
	peeps.add(e);
	peeps = new ArrayList <Comparable> (yoo.msort(peeps));
		System.out.println ("Sorting by age " + peeps);

   }
}