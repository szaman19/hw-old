import java.io.*;
import java.util.*;

public class merge{

    public ArrayList<String> merge (ArrayList<String> A, ArrayList<String> B){

	int L = A.size() + B.size ();
	ArrayList<String> ans = new ArrayList<String>();
	int a=0;
	int b=0;
	int i=0;
	while (i<L && (a<=A.size() && b<=B.size())){
	    if (a==A.size() && b!=B.size()){
		ans.add(B.get(b));
		b++;
	    }else if (b==B.size() && a!=A.size ()){
		ans.add(A.get(a));
		a++;
	    }else if (A.get(a).compareTo(B.get(b)) <= 0){
		ans.add(A.get(a));
		a++;
	    }else{
		ans.add(B.get(b));
		b++;
	    }
	    i++;
	}
	return ans;
    }

    public ArrayList<String> mergeSort(ArrayList<String> a){
	int size = a.size();
	if (size<=1)
	    return a;
	else{
	    ArrayList<String> a1 = new ArrayList<String>();
	    ArrayList<String> a2 = new ArrayList<String>();
	    for (int i=0; i<size/2; i++)
		a1.add(a.get(i));
	    
	    for (int i=0; i<size-size/2; i++)
		a2.add(a.get(i+a1.size()));

	    return merge(mergeSort(a1),mergeSort(a2));
	}	    
    }
    
	    

    public static void main (String[] args){
	merge m = new merge(); //testing out merge

	ArrayList<String> list1 = new ArrayList<String>();

	list1.add("hello");
	list1.add("apple");
	list1.add("1357");
	list1.add("Tyler");
	list1.add("lady's man");
	list1.add(":(");

	System.out.println(list1);
	System.out.println(m.mergeSort(list1));
	
    }
}
		
		    
