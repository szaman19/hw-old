  import java.util.ArrayList;
  import java.io.*;
  import java.util.*;
    
  public class Mergesort{
      private static int a,b,i;
        
      public static ArrayList<Comparable> mergesort(ArrayList<Comparable> x, ArrayList<Comparable> y){
    	int total = x.size() + y.size();
    	ArrayList<Comparable> list = new ArrayList<Comparable>();
    	a = 0;
    	b = 0;
    	i = 0;
  
  	while(a < x.size() && b < y.size()){
  	    if (x.get(a).compare(y.get(b)) > 0){
  		list.add(y.get(b));
  		a++;
  		b++;
  	    }
  	    else{
  		list.add(x.get(a));
  		a++;
  		b++;
  	    }
  	}
  	if (b >= y.size()){
  	    while (i < total){
  		list.add(x.get(a));
  		a++;
  		b++;
  	    }
  	}
  	if (a >= x.size()){
  	    while (i < total){
  		list.add(y.get(b));
  		a++;
  		b++;
  	    }
  	}
  	return list;
      }
  
  
  
      /*
  	for (int i = 0; i < total; i++){
  	    if (a >= x.size()){
  		list.add(y.get(b));
  	    }
  	    else if (b >= y.size()){
  		list.add(x.get(a));
  	    }
  	    else if (x.get(a).() <= y.get(b).length() && a < x.size()){
  		list.add(x.get(a));
  		a++;
  	    }
  	    else if (x.get(a).length() > y.get(b).length() && b < y.size()){
  		list.add(y.get(b));
  		b++;
  	    }
  	}
    
    	return list;
      }
      */
    
      public static ArrayList<Comparable> split(ArrayList<Comparable> n){
    	if (n.size() >= 2){ 
  	    ArrayList<Comparable> a = new ArrayList<Comparable>();
    	    ArrayList<Comparable> b = new ArrayList<Comparable>();
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
  	Mergesort team = new Mergesort();
  	Person a = new Person("Austin",30);
  	Person b = new Person("Brian",18);
  	Person c = new Person("Caillou",10);
  	Person d = new Person("Dyrus",24);
  
    	ArrayList<Comparable> x = new ArrayList<Comparable>();
    	x.add("preparing"); x.add("for"); x.add("AP"); x.add("calculus"); x.add("examination");
    	x = split(x);
    	for (int i = 0; i < x.size(); i++){
    	    System.out.print(x.get(i) + " ");
    	}
  
  	ArrayList<Comparable> y = new ArrayList<Comparable>();
  	for (int i = 0; i < 10; i++){
  	    y.add(Math.random()*100);
  	}
  	y = split(y);
  	for (int i = 0; i < 10; i++){
  	    System.out.print(y.get(i) + " ");
  	}
  
  	ArrayList<Comparable> z = new ArrayList<Comparable>();
  	z.add(a);
  	z.add(b);
  	z.add(c);
  	z.add(d);
  	z = new ArrayList<Comparable>(team.split(z));
  	for (int i = 0; i < z.size(); i++){
  	    System.out.print(z.get(i));
  	}
      }
  }
