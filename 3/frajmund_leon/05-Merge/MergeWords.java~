import java.util.*;
import java.lang.*;
public class MergeWords{
    public final char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public MergeWords(){}

    public void print(ArrayList<String> a){
	for(int x = 0; x<a.size();x++){
	    System.out.println(a.get(x));
	}
    }

    public ArrayList<String> sub(int a, int b, ArrayList<String> array){
	ArrayList<String> c = new ArrayList<String>();
	for(; a < b; a ++)
	    c.add(array.get(a));
	return c;
    }

    public ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){
	if(a.size() == 0) return a;
	if(b.size() == 0) return b;
	ArrayList c = new ArrayList(a.size()+b.size());
	int la = 0; int lb = 0; int letter = 0; char letterA; char letterB;;
	do{
	    letterA = a.get(la).charAt(letter);
	    letterB = b.get(lb).charAt(letter);
	    if(Arrays.binarySearch(alpha, letterA) <
	       Arrays.binarySearch(alpha, letterB)){
		c.add(a.get(la));
		letter = 0;
		la ++;
	    }
	    else if(Arrays.binarySearch(alpha, letterA) >
		    Arrays.binarySearch(alpha, letterB)){
		c.add(b.get(lb));
		letter = 0;
		lb ++;
	    }
	    else if(letter == a.get(la).length() - 1){
		letter = 0;
		c.add(a.get(la));
		la ++;
	    }
	    else if(letter == b.get(lb).length() - 1){
		letter = 0;
		c.add(a.get(lb));
		lb ++;
	    }
	    else{
		letter++;
	    }
	}while(la < a.size() &&lb < b.size());
    
	if(la < a.size()){
	    for(int x = la; x < a.size(); x++){
		c.add(a.get(x));
	    }
	}
	if(lb < b.size()){
	    for(int x = lb; x < b.size(); x ++){
		c.add(b.get(x));
	    }
	}
	return c;
    }

    public ArrayList<String> MergeSort(ArrayList<String> a){
	if(a.size() < 2) return a;
	ArrayList<String> c = new ArrayList<String>(a.size() / 2);
	ArrayList<String> d = new ArrayList<String>(a.size() - c.size());

	c = MergeSort(sub(0, a.size() / 2, a));
	d = MergeSort(sub(a.size() / 2, a.size(), a));
	
	a = merge(c,d);
	return a;
    }
}

