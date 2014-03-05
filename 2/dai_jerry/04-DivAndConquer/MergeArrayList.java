import java.util.Random;
import java.util.ArrayList;
public class MergeArrayList{
    
    public static ArrayList merge(ArrayList<String> a, ArrayList<String> b){
	int acount = 0;
	int bcount = 0;
	ArrayList answer = new ArrayList<String>();
	for(int count = 0 ; count < a.size()+b.size();){
	    if(acount>=a.size()){
		answer.add(b.get(bcount));
		bcount++;
		count++;
	    }else if(bcount>=b.size()){
		answer.add(a.get(acount));
		acount++;
		count++;
	    }else{
		String first = a.get(acount);
		String second = b.get(bcount);
		if(first.compareTo(second)>0){
		    answer.add(second);
		    answer.add(first);
		    acount++;
		    bcount++;
		    count += 2;
		}else if(first.compareTo(second)<0){
		    answer.add(first);
		    answer.add(second);
		    acount++;
		    bcount++;
		    count += 2;
		}else{
		    answer.add(first);
		    answer.add(first);
		    acount++;
		    bcount++;
		    count += 2;
		}
	    }
	}
	return answer;

    }

    public static String toString(ArrayList<String> a){
	String answer = "[";
	for(int x = 0 ; x < a.size()-1; x++){
	    answer += a.get(x) + ", ";
	}
	answer+= a.get(a.size()-1) + "]\n";
	return answer;
    }

    public static ArrayList mergesort(ArrayList<String> L){
	int split = 0;
	if (L.size() <= 1){
	    return L;
	}else{
	    split = L.size() / 2 ;
	}
	ArrayList a = new ArrayList<String>();
	ArrayList b = new ArrayList<String>();
	for(int x = 0; x < split  ; x++){
	    a.add(L.get(x)) ;
	}
	for(int y = 0; y < L.size()-split; y++){
	    b.add(L.get(y+split));
	}
	a = mergesort(a);
	b = mergesort(b);
	L = merge(a,b);
	return L;
    }

    public static void main(String[]args){
	ArrayList a = new ArrayList<String>();
	ArrayList b = new ArrayList<String>();
	ArrayList c = new ArrayList<String>();
	a.add("apple");
	a.add("orange");
	a.add("pineapple");
	b.add("banana");
	b.add("kiwi");
	b.add("watermelon");	
	c.add("calculus");
	c.add("history");
	c.add("comsci");
	c.add("english");
	c.add("physics");
	c.add("drafting");
	c.add("precalculus");
	c.add("spanish");
	System.out.println("ArrayList A:\n");
	System.out.println(toString(a));
	System.out.println("ArrayList B:\n");
	System.out.println(toString(b));
	System.out.println("Merge method:\n");
	System.out.println(toString(merge(a,b)));
	System.out.println("*----------------------------------*\n");
	System.out.println("ArrayList C:\n");
	System.out.println(toString(c));
	System.out.println("Mergesort:\n");
	System.out.println(toString(mergesort(c)));

    }
}
