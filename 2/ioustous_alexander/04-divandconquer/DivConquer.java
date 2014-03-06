import java.util.*;

public class DivConquer {

    public static ArrayList<String> mergeSort (ArrayList<String> input){
	ArrayList<String> returnarray = new ArrayList<String>(input.size());
	if (input.size() <= 1){
	    return input;
	}else {
	    if ((input.size() % 2) ==1 ){
		ArrayList<String> b = new ArrayList<String>((input.size() -1)/2 +1);
		ArrayList<String> a = new ArrayList<String>((input.size()-1)/2);
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
		ArrayList<String> b = new ArrayList<String>((input.size())/2);
		ArrayList<String> a = new ArrayList<String>((input.size())/2);
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
	    
	    
    public static ArrayList<String> merge (ArrayList<String> a, ArrayList<String> b){
	int tempa = 0;
	int tempb = 0;
	ArrayList<String> returnarray = new ArrayList<String>(a.size() + b.size());
	for (int i =0; i < (a.size()+b.size()); i++){
	    int tempa2 = tempa;
	    int tempb2 = tempb;
	    if (tempa  < a.size()){
		if (tempb >= b.size()){
		    returnarray.add(a.get(tempa));
		    tempa2 = tempa +1;
		} else if ((a.get(tempa).compareToIgnoreCase(b.get(tempb))) <= 0){
		    returnarray.add(a.get(tempa));
		    tempa2 = tempa +1;
		}
	    }
	    if ((tempb  < b.size()) && (tempa == tempa2)){
		if (tempa >= a.size()){
		    returnarray.add( b.get(tempb));
		    tempb2 = tempb +1;
		}else if ((b.get(tempb).compareToIgnoreCase(a.get(tempa))) <=0){
		    returnarray.add(b.get(tempb));
		    tempb2 = tempb + 1;
		}
	    }
	    
	    tempa = tempa2;
	    tempb = tempb2;
	}
	return returnarray;
    }

 	
    public static String toString (ArrayList<String> array){
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

	ArrayList<String> d = new ArrayList<String> ();
	d.add("hi");
	d.add("stuff");
	d.add("more");
	d.add("sort");
	d.add("stufg");
	   
	//	System.out.println (toString (d));
	System.out.println (toString (mergeSort(d)));

    }
}
