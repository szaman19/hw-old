import java.util.*;

public class Merge{
    ArrayList<String> start;
    
    public Merge(ArrayList<String> a){
	start = a;
    }

    
    public ArrayList<String> mergesort(ArrayList<String> a){
	if(a.size() == 1){
	    return a;
	}else{
	    
	    ArrayList<String> x = new ArrayList<String>();
	    ArrayList<String> y = new ArrayList<String>();
	    
	    int count = 0;
	    
	    for (int i = 0; i < a.size()/2; i++){
		x.add(a.get(count));
		count++;
	    }
	    for (int i = 0; i < (a.size()-x.size()); i++){
		y.add(a.get(count));
		count++;
	    }
	    
	    //	    System.out.println(pt(a) + "-> " + pt(x) + "+ " + pt(y));
	
	    ArrayList<String> x1 = mergesort(x);
	    ArrayList<String> y1 = mergesort(y);
    
	    return merge(x1,y1);
	}
    }
    
    public ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){
	ArrayList<String> ans = new ArrayList<String>();
	System.out.print(pt(a) + "+ " + pt(b) + "= ");
	while (a.size() > 0 && b.size() > 0){
	    if (a.get(0).compareToIgnoreCase(b.get(0))<0){
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
	
     	//      	System.out.println(pt(ans));
	return ans;
    }
   
    public String pt(ArrayList<String> a){
	String ans = "";
	for (int i = 0; i < a.size(); i++){
	    ans += (a.get(i) + " ");
	}
	return ans;
    }
    
    public static void main(String[] args){
	ArrayList<String> arr = new ArrayList<String>();
	arr.add("adga");
	arr.add("wefa");
	arr.add("njdsfd");
	arr.add("elkjdsg");
	arr.add("ehksa");
	Merge n = new Merge(arr);
	System.out.println(n.pt(n.mergesort(n.start)));
	//System.out.println(n.pt(arr));

 }

}