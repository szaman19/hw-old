import java.util.*;

public class MergeSortString{

    public ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){
		ArrayList<String> bigger=new ArrayList<String>();
		int c=0;
		int d=0;
		for (int x=0; x<a.size()+b.size();x++){
			if (c==a.size()){
				bigger.add(b.get(d++));
			}
			else if (d==b.size()){
				bigger.add(a.get(c++));
			}
			else if (a.get(c).compareTo(b.get(d))<0){
				bigger.add(a.get(c++));
			}
			else {
				bigger.add(b.get(d++));
			}
		}	
		return bigger;
    }
    
    public ArrayList<String> mergesort(ArrayList<String> a){
		if (a.size()==1){
		    return a;
		}
		else{
		    ArrayList<String> b=new ArrayList<String>();
		    ArrayList<String> c=new ArrayList<String>();
		    for (int x=0;x<a.size()/2;x++){
				b.add(a.get(x));
		    }
		    for (int y=(a.size()-(a.size()/2));y<a.size();y++){
				c.add(a.get(y));
		    }
		    return merge(mergesort(b), mergesort(c));
		}
    }

    public static void main(String[] args){
		MergeSortString merger=new MergeSortString();
		ArrayList<String> i=new ArrayList<String>(Arrays.asList("z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i", "h", "g", "f", "e", "d", "c", "b", "a"));
		System.out.println(merger.mergesort(i));
    }
}		    
