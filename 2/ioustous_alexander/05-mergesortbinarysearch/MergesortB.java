import java.util.*;
import java.io.*;

public class MergesortB {

    public static ArrayList<Comparable> mergeSort (ArrayList<Comparable> input){
	ArrayList<Comparable> returnarray = new ArrayList<Comparable>(input.size());
	if (input.size() <= 1){
	    return input;
	}else {
	    if ((input.size() % 2) ==1 ){
		ArrayList<Comparable> b = new ArrayList<Comparable>((input.size() -1)/2 +1);
		ArrayList<Comparable> a = new ArrayList<Comparable>((input.size()-1)/2);
		for (int i = 0; i < (input.size()-1)/2 +1; i++){
		    b.add(input.get(i));
		}
		for (int i = (input.size()-1)/2 +1; i < input.size(); i++){
		    a.add(input.get(i));
		}
		a =mergeSort (a);
		b =mergeSort (b);
		returnarray = merge(a,b);
	    }else {
		ArrayList<Comparable> b = new ArrayList<Comparable>((input.size())/2);
		ArrayList<Comparable> a = new ArrayList<Comparable>((input.size())/2);
		for (int i = 0; i < (input.size())/2; i++){
		    b.add(input.get(i));
		}
		for (int i = (input.size())/2; i < input.size(); i++){
		    a.add( input.get(i));
		}
		a =mergeSort (a);
		b =mergeSort (b);
		returnarray = merge(a,b);
		
	    }
	}
	return returnarray;
    }
	    
	    
    public static ArrayList<Comparable> merge (ArrayList<Comparable> a, ArrayList<Comparable> b){
	int tempa = 0;
	int tempb = 0;
	ArrayList<Comparable> returnarray = new ArrayList<Comparable>(a.size() + b.size());
	for (int i =0; i < (a.size()+b.size()); i++){
	    int tempa2 = tempa;
	    int tempb2 = tempb;
	    if (tempa  < a.size()){
		if (tempb >= b.size()){
		    returnarray.add(a.get(tempa));
		    tempa2 = tempa +1;
		} else if ((a.get(tempa).compareTo(b.get(tempb))) <= 0){
		    returnarray.add(a.get(tempa));
		    tempa2 = tempa +1;
		}
	    }
	    if ((tempb  < b.size()) && (tempa == tempa2)){
		if (tempa >= a.size()){
		    returnarray.add( b.get(tempb));
		    tempb2 = tempb +1;
		}else if ((b.get(tempb).compareTo(a.get(tempa))) <=0){
		    returnarray.add(b.get(tempb));
		    tempb2 = tempb + 1;
		}
	    }
	    
	    tempa = tempa2;
	    tempb = tempb2;
	}
	return returnarray;
    }

 	
    public static String toString (ArrayList<Comparable> array){
	String returnstring = "";
	for (int i = 0; i < array.size(); i++){
	    returnstring = returnstring + array.get(i) + ", ";
	}
	return returnstring;
	
    }
    public static String toStringPerson (ArrayList<Comparable> array){
	String returnstring = "";
	for (int i = 0; i < array.size(); i++){
	    returnstring = returnstring + array.get(i) + ", ";
	}
	return returnstring;
	
    }


    public static void main (String [] args){
	/*int[]c = {2, 3, 5, 7};
	  int []d = {2, 4, 6, 8};
	
	  System.out.println  (toString(merge (c,d)));
	*/
	/*	ArrayList<Comparable> c = new ArrayList<Comparable> ();
	c.add(8);
	c.add(7);
	c.add(6);
	c.add(4);
	c.add(4);
	c.add(3);
	c.add(2);
	ArrayList<Comparable> d = new ArrayList<Comparable> ();
	d.add("hi");
	d.add("stuff");
	d.add("more");
	d.add("sort");
	d.add("stufg");
	   
	System.out.println (toString (mergeSort(c)));
	System.out.println (toString (mergeSort(d)));*/

	ArrayList<Comparable> e = new ArrayList<Comparable> ();
	Person p1 = new Person ("Steve", 5);
	Person p2 = new Person ("Jim", 24);
	Person p3 = new Person ("Freddy", 20);
	Person p4 = new Person ("Butch", 53);
	e.add(p1);
	e.add(p2);
	e.add(p3);
	e.add(p4);
	System.out.println (toStringPerson (mergeSort(e)));

    }
}
