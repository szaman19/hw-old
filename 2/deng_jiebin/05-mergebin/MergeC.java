import java.util.*;

public class MergeC{
    
    public ArrayList<Comparable> mergeC(ArrayList<Comparable> a, ArrayList<Comparable> b){
        ArrayList<Comparable> ans = new ArrayList<Comparable>();
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

    public ArrayList<Comparable> mergesortC(ArrayList<Comparable> a){
	if(a.size() <= 1){
	    return a;
	}
	else{
	    ArrayList<Comparable> a1 = new ArrayList<Comparable>();
	    ArrayList<Comparable> a2 = new ArrayList<Comparable>();
	    for(int i = 0; i<a.size()/2; i++){
		a1.add(a.get(i));
	    }
	    for(int j = a.size()/2; j<a.size(); j++){
		a2.add(a.get(j));
	    }
	    a1 = mergesortC(a1);
	    a2 = mergesortC(a2);
	    a = mergeC(a1,a2);
	    return a;
	}
    }

    public static void main(String[]args){
	MergeC m = new MergeC();	
	System.out.println("\nArrayList<Comparable> mergesort\n");
	ArrayList<Comparable> s = new ArrayList<Comparable>();
	s.add("abcd");
	s.add("hello");
	s.add("flummoxed");
	s.add("cow");
	s.add("potato");
	s.add("acbd");
	s.add("potahto");
	System.out.println(s);
	System.out.println("Result: "+m.mergesortC(s)+"\n");

	ArrayList<Comparable> i = new ArrayList<Comparable>();
	i.add(4);
	i.add(7);
	i.add(2);
	i.add(1);
	i.add(9);
	i.add(5);
	i.add(8);
	i.add(0);
	i.add(3);
	i.add(6);
	System.out.println(i);
	System.out.println("Result: "+m.mergesortC(i)+"\n");

	ArrayList<Comparable> p = new ArrayList<Comparable>();
	p.add(new Person("Bob",23));
	p.add(new Person("Jill",4));
	p.add(new Person("Harry",78));
	p.add(new Person("Jamaica",15));
	p.add(new Person("ANewHope",10));
	System.out.println(p);
	System.out.println("Result: "+m.mergesortC(p)+"\n");
    }
}
