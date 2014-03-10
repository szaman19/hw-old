import java.util.*;
public class DivideConquer{
    public static ArrayList<String> mergeSort(ArrayList<String> A){
	if (A.size() == 1) return A;
	else {
	    ArrayList<String> B = new ArrayList<String>();
	    ArrayList<String> C = new ArrayList<String>();
	    
	    for (int x = 0; x < A.size() / 2; x++){
		B.add(A.get(x));
	    }
	    for (int x = B.size(); x < A.size(); x++){
		C.add(A.get(x));
	    }
	
	    A = merge(mergeSort(B),mergeSort(C));
	    return A;
	}
    }

    public static ArrayList<String> merge(ArrayList<String> A, ArrayList<String> B){
	ArrayList<String> C = new ArrayList<String>();
	
	int apos = 0;
	int bpos = 0;
	for (int x = 0; x < A.size() + B.size(); x++){
	    if (apos >= A.size()){
			C.add(B.get(bpos));
			bpos++;
	    } else if (bpos >= B.size()){
			C.add(A.get(apos));
			apos++;
	    } else {
			if (B.get(bpos).compareTo(A.get(apos)) <= 0) {
			    C.add(B.get(bpos));
			    bpos++;
			} else {
			    C.add(A.get(apos));
			    apos++;				
			}
	    }
	}
	return C;
    }
	
    public static void printArray (ArrayList<String> a){
	for (String x : a){
	    System.out.print(x + ", ");
	}
	System.out.println();
    }

    public static void main(String[] args){
	
	ArrayList<String> c = new ArrayList<String>();
	c.add("abcba");
	c.add("efgfe");
	c.add("aceca");
	c.add("ecaca");
	c.add("nifty");
	c.add("cat");
	c.add("hello");
	c.add("inconceivable");
	printArray(c);
	c = mergeSort(c);
	printArray(c);
    }
}