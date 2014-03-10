 import java.io.*;
import java.util.*;
  
public class Mergesort{
    private static int a,b,i;
      
    public static ArrayList<String> mergesort(ArrayList<String> x, ArrayList<String> y){
  	int total = x.size() + y.size();
  	ArrayList<String> list = new ArrayList<String>();
  	a = 0;
  	b = 0;
  	i = 0;

	for (int i = 0; i < total; i++){
	    if (a >= x.size()){
		list.add(y.get(b));
	    }
	    else if (b >= y.size()){
		list.add(x.get(a));
	    }
	    else if (x.get(a).length() <= y.get(b).length() && a < x.size()){
		list.add(x.get(a));
		a++;
	    }
	    else if (x.get(a).length() > y.get(b).length() && b < y.size()){
		list.add(y.get(b));
		b++;
	    }
	}
  
	/*	while (a+b <= total){
		if (x.get(a).length() <= y.get(b).length()){
  		list.add(x.get(a));
  		a = a + 1;
  		if (a == x.size())
		a = a - 1;
		}
		else {
  		list.add(y.get(b));
  		b = b + 1;
  		if (b == y.size())
		b = b - 1;
		}
  	    
		}
	*/
  	return list;
    }
  
    public static ArrayList<String> split(ArrayList<String> n){
  	if (n.size() >= 2){ 
	    ArrayList<String> a = new ArrayList<String>();
  	    ArrayList<String> b = new ArrayList<String>();
  	    for (int i = 0; i < n.size()/2; i++){
		a.add(n.get(i));
	    }
	    for (int i = n.size()/2; i < n.size(); i++){
		b.add(n.get(i));
  	    }
  	    a = split(a);
  	    b = split(b);
  	    n = mergesort(a, b);
  	}
	return n;
    }
  
    public static void main(String[] args){
  	ArrayList<String> n = new ArrayList<String>();
  	n.add("preparing"); n.add("for"); n.add("AP"); n.add("calculus"); n.add("examination");
  	n = split(n);
  	for (int i = 0; i < n.size(); i++){
  	    System.out.print(n.get(i) + " ");
  	}
    }
}
