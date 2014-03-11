import java.util.*;

public class Merge{
    
    public int[] merge(int[] a, int[] b){
	int[] ans = new int[a.length + b.length];
	int stepA = 0;
	int stepB = 0;
	for(int i = 0; i<ans.length; i++){
	    if(stepA < a.length && stepB < b.length){
		if(a[stepA] >= b[stepB]){
		    ans[i] = b[stepB];
		    stepB++;
		}
		else{
		    ans[i] = a[stepA];
		    stepA++;
		}
	    }
	    else if(stepA >= a.length){
		ans[i] = b[stepB];
		stepB++;
	    }
	    else{
		ans[i] = a[stepA];
		stepA++;
	    }
	}
	return ans;
    }

    public int[] mergesort(int[] a){
	if(a.length <= 1){
	    return a;
	}
	else{
	    int[] a1 = new int[a.length/2];
	    int[] a2 = new int[a.length-a1.length];
	    for(int i = 0; i<a1.length; i++){
		a1[i] = a[i];
	    }
	    for(int j = a1.length; j<a.length; j++){
		a2[j-a1.length] = a[j];
	    }
	    a1 = mergesort(a1);
	    a2 = mergesort(a2);
	    a = merge(a1,a2);
	    return a;
	}
    }
    
    public ArrayList<String> mergeS(ArrayList<String> a, ArrayList<String> b){
        ArrayList<String> ans = new ArrayList<String>();
	int stepA = 0;
	int stepB = 0;
	for(int i = 0; i<a.size()+b.size(); i++){
	    if(stepA < a.size() && stepB < b.size()){
		if(a.get(stepA).compareTo(b.get(stepB)) >= 0){
		    ans.add(b.get(stepB));
		    stepB++;
		}
		else{
		    ans.add(a.get(stepA));
		    stepA++;
		}
	    }
	    else if(stepA >= a.size()){
		ans.add(b.get(stepB));
		stepB++;
	    }
	    else{
		ans.add(a.get(stepA));
		stepA++;
	    }
	}
	return ans;
    }

    public ArrayList<String> mergesortS(ArrayList<String> a){
	if(a.size() <= 1){
	    return a;
	}
	else{
	    ArrayList<String> a1 = new ArrayList<String>();
	    ArrayList<String> a2 = new ArrayList<String>();
	    for(int i = 0; i<a.size()/2; i++){
		a1.add(a.get(i));
	    }
	    for(int j = a.size()/2; j<a.size(); j++){
		a2.add(a.get(j));
	    }
	    a1 = mergesortS(a1);
	    a2 = mergesortS(a2);
	    a = mergeS(a1,a2);
	    return a;
	}
    }

    public static void main(String[]args){
	int[] a = {1,2,3,4,5,6,7,8};
	int[] b = {0,5,5,6,9,10};
	Merge m = new Merge();
	System.out.println("merge");
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	System.out.println("Result: "+Arrays.toString(m.merge(a,b))+"\n");
	
	System.out.println("mergesort");
	int[] c = {5,6,2,3,7,9,0,1,8,4,10};
	System.out.println(Arrays.toString(c));
	System.out.println("Result: "+Arrays.toString(m.mergesort(c))+"\n");

	int[] d = new int[100];
	Random r = new Random();
	for(int i = 0; i<d.length; i++){
	    d[i] = r.nextInt(10000);
	}
	//System.out.println(Arrays.toString(d));
	System.out.println("Lengthy array\nResult: "+Arrays.toString(m.mergesort(d))+"\n");

	System.out.println("ArrayList<String> mergesort");
	ArrayList<String> s = new ArrayList<String>();
	s.add("abcd");
	s.add("hello");
	s.add("flummoxed");
	s.add("cow");
	s.add("potato");
	s.add("acbd");
	s.add("potahto");
	System.out.println(s);
	System.out.println("Result: "+m.mergesortS(s)+"\n");
    }
}
