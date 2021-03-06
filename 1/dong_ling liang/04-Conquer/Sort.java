import java.io.*;
import java.util.*;

public class Sort {

    public ArrayList<String> mergeSort(ArrayList<String> alist){
	if (alist.size() <= 1){
	    return alist;
	}
	else {
	    int temp = alist.size();
	    ArrayList<String> x = new ArrayList<String>();
	    for (int i = 0; i< temp/2; i++){
		x.add(alist.get(i));
	    }
	    ArrayList<String> y = new ArrayList<String>();
	    for (int i = temp/2; i<alist.size(); i++){
		y.add(alist.get(i));
	    }
	    x = mergeSort(x);
	    y = mergeSort(y);
	    alist = merge(x, y);
	    return alist;
	}
    }

    public String toString(ArrayList<String> alist){
	String ret = "";
	for (int i = 0; i<alist.size(); i++){
	    ret += alist.get(i) + " ";
	}
	return ret;
    }
    
    public ArrayList<String> merge(ArrayList<String> A, ArrayList<String> B){
	ArrayList<String> C = new ArrayList<String>();
	int a = 0;
	int b = 0;
	for (int i = 0 ; i < A.size() + B.size() ; i++){
	    if (a<A.size() && b<B.size()){
		if (A.get(a).length() < B.get(b).length()){
		    C.add(A.get(a));
		    a++;
		}
		else {
		    C.add(B.get(b));
		    b++;
		}
	    }
	    else if (a==A.size()){
		C.add(B.get(b));
		b++;
	    }
	    else if (b==B.size()){
		C.add(A.get(a));
		a++;
	    }
	}
	return C;
    }
    public static void main(String[] args){
	Random rand = new Random();
	Sort an = new Sort();
	ArrayList<String> a  = new ArrayList<String>();
	int temp = rand.nextInt(10);
	for (int i = 0; i<temp + 5; i++){
	    int t = (int)Math.pow(10, rand.nextInt(4));
	    a.add("" + rand.nextInt(100000)/t);
	}
	
	System.out.println(an.toString(a));
	System.out.println(an.toString(an.mergeSort(a)));
    }


}