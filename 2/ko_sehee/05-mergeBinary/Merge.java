import java.util.*;

public class Merge{
    public ArrayList<Comparable>  merge(ArrayList<Comparable> a, ArrayList<Comparable> b){
	int s1 = 0;
	int s2= 0;
	ArrayList<Comparable> sorted = new ArrayList <Comparable>();
	for (int i=0; i < a.size() + b.size(); i++){
	    if(s1 >= a.size() ){
		sorted.add(b.get(s2));
		s2++;
	    }
	    else if (s2 >= b.size()){
		sorted.add(a.get(s1));
		s1++;
	    }
	    else if (a.get(s1).compareTo(b.get(s2))<=0){
		sorted.add(a.get(s1));
		s1++;
	    }
	    else{
		sorted.add(b.get(s2));
		s2++;
	    }
	}
	return sorted;
    }
    public ArrayList<Comparable>  mSort(ArrayList<Comparable> L ){
	int nlen1 = 0;
	int nlen2 = 0;
	if (L.size() <= 1){
	    return L;
	}
	else{
	    nlen1 = (int)L.size()/2;
	    ArrayList <Comparable> p1 = new ArrayList<Comparable>(L.subList(0, nlen1));
	    ArrayList<Comparable> p2 = new ArrayList<Comparable>(L.subList(nlen1, L.size()));
	    p1 = this.mSort(p1);
	    p2 = this.mSort(p2);
	    L = merge(p1, p2);
	    return L;
	}
    }


    
    public static void main (String[] args){
	/*	Merge me= new Merge();
	Random r = new Random();
	ArrayList <Comparable> ex = new ArrayList<Comparable>();
	for (int i = 0; i < 20; i ++){
	 ex.add("" + String.format("%2d", r.nextInt(100)));
	    ex.add(r.nextInt(100));
	}
	System.out.println(ex);
	System.out.println(me.mSort(ex));
	}*/
	Person p = new Person();
	Person u = new Person(17, "Jane Doe");
	System.out.print(p.getAge().compareTo(u.getAge()));
    }
}