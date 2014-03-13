import java.util.*;

public class Merge2{
    ArrayList<Comparable> start;
    
    public Merge2(ArrayList<Comparable> a){
	start = a;
    }

    
    public ArrayList<Comparable> mergesort(ArrayList<Comparable> a){
	if(a.size() == 1){
	    return a;
	}else{
	        
	    ArrayList<Comparable> x = new ArrayList<Comparable>();
	    ArrayList<Comparable> y = new ArrayList<Comparable>();
	        
	    int count = 0;
	        
	    for (int i = 0; i < a.size()/2; i++){
		x.add(a.get(count));
		count++;
	    }
	    for (int i = 0; i < (a.size()-x.size()); i++){
		y.add(a.get(count));
		count++;
	    }
	        
	    //    System.out.println(pt(a) + "-> " + pt(x) + "+ " + pt(y));
	    
	    ArrayList<Comparable> x1 = mergesort(x);
	    ArrayList<Comparable> y1 = mergesort(y);
    
	    return merge(x1,y1);
	}
    }
    
    public ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList<Comparable> b){
	ArrayList<Comparable> ans = new ArrayList<Comparable>();
	//System.out.print(pt(a) + "+ " + pt(b) + "= ");
	while (a.size() > 0 && b.size() > 0){
	    if (a.get(0).compareTo(b.get(0))<0){
		ans.add(a.get(0));
		a.remove(0);
	    }else {
		ans.add(b.get(0));
		b.remove(0);
	    }
	}
	if (a.size() == 0){
	    ans.addAll(b);
	}else{
	    ans.addAll(a);
	}
	
	//      System.out.println(pt(ans));
	return ans;
    }
   
    public String pt(ArrayList<Comparable> a){
	String ans = "";
	for (int i = 0; i < a.size(); i++){
	    ans += (a.get(i) + " ");
	}
	return ans;
    }
    
    public static void main(String[] args){
	ArrayList<Comparable> arr = new ArrayList<Comparable>();
	arr.add(new Person("John", 15));
	arr.add(new Person("Beth", 15));
	arr.add(new Person("Jack", 15));
	arr.add(new Person("Lucy", 15));
	arr.add(new Person("Theo", 15));
	Merge2 n = new Merge2(arr);
	System.out.println(n.pt(n.mergesort(n.start)));
	//System.out.println(n.pt(arr));

    }

}