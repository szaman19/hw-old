import java.io.*;
import java.util.*;

public class merge{

    public ArrayList<Integer> merge (ArrayList<Integer> A, ArrayList<Integer> B){

	int L = A.size() + B.size ();
	ArrayList<Integer> ans = new ArrayList<Integer>();
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
	    }else if (A.get(a)<B.get(b)){
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

    public ArrayList<Integer> mergeSort(ArrayList<Integer> a){
	int size = a.size();
	if (size<=1)
	    return a;
	else{
	    ArrayList<Integer> a1 = new ArrayList<Integer>();
	    ArrayList<Integer> a2 = new ArrayList<Integer>();
	    for (int i=0; i<size/2; i++)
		a1.add(a.get(i));
	    
	    for (int i=0; i<size-size/2; i++)
		a2.add(a.get(i+a1.size()));

	    return merge(mergeSort(a1),mergeSort(a2));
	}	    
    }
    
	    

    public static void main (String[] args){
	merge m = new merge(); //testing out merge

	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	ArrayList<Integer> list3 = new ArrayList<Integer>();

	for (int i=0; i<20;i++){
	    list1.add((int)(Math.random()*100));
	    list2.add((int)(Math.random()*100));
	    list3.add((int)(Math.random()*100));
	}

	System.out.println(list1);
	System.out.println(list2);
	System.out.println(m.merge(list1, list2));

	System.out.println(list3);
	System.out.println(m.mergeSort(list3));
	
    }
}
		
		    
