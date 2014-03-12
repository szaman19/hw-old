import java.util.*;
import java.io.*;

public class MergeSort{

    public ArrayList<Comparable> MergeSort(ArrayList<Comparable> a) {
        ArrayList<Comparable> one = new ArrayList<Comparable>();
        ArrayList<Comparable> two = new ArrayList<Comparable>();
        if(a.size() <= 1){
            return a;
        }else{
            for(int i = 0; i < a.size(); i++){
                if(i < a.size()/2){
                    one.add(a.get(i));
                }
                else{
                    two.add(a.get(i));
                }
            }
	}
        one = MergeSort(one);
        two = MergeSort(two);
        a = merge(one, two);
        return a;
    }

    public ArrayList<Comparable> merge(ArrayList<Comparable> one, ArrayList<Comparable> two) {
        ArrayList<Comparable> resp = new ArrayList<Comparable>();
        int oc = 0;
        int tc = 0;
        while(oc < one.size() && tc < two.size()){
            if((one.get(oc)).compareTo(two.get(tc)) <= 0){
                resp.add(one.get(oc));
	        oc++;
            }else{
                resp.add(two.get(tc));
		tc++;
	    }
	}
        while(oc < one.size()){
	    resp.add(one.get(oc));
	    oc++;
	}
	while(tc < two.size()){
	    resp.add(two.get(tc));
	    tc++;
	}
        return resp;
    }

    public static void main(String args[]){
	MergeSort m = new MergeSort();
	ArrayList<Comparable> a = new ArrayList<Comparable>();
	a.add("bathroom");
	a.add("oops");
	a.add("woof");
	a.add("ouch");
	a.add("hi mom");
	a.add("woof");
	a.add("potato");
	System.out.println(a);
	System.out.println(m.MergeSort(a));
	ArrayList<Comparable> b = new ArrayList<Comparable>();
	b.add(21);
	b.add(16);
	b.add(3);
	b.add(-2);
	b.add(12);
	b.add(99);
	b.add(32);
	System.out.println(b);
	System.out.println(m.MergeSort(b));
	ArrayList<Comparable> c = new ArrayList<Comparable>();
        c.add(new Person(1, "Harry"));
	c.add(new Person(81, "Carmen"));
	c.add(new Person(12, "Mary"));
	c.add(new Person(77, "John"));
	c.add(new Person(15, "Hilary"));
	c.add(new Person(34, "Andy"));
	c.add(new Person(21, "Karen"));
	c.add(new Person(17, "Timmy"));
	c.add(new Person(27, "Tom"));
	c.add(new Person(83, "Cindy"));
	System.out.println(c);
	System.out.println(m.MergeSort(c));
    }
}
