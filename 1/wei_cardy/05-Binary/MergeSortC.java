import java.util.*;

public class MergeSortC{

    public ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList<Comparable> b){
		ArrayList<Comparable> bigger=new ArrayList<Comparable>();
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
    
    public ArrayList<Comparable> mergesort(ArrayList<Comparable> a){
		if (a.size()==1){
		    return a;
		}
		else{
		    ArrayList<Comparable> b=new ArrayList<Comparable>();
		    ArrayList<Comparable> c=new ArrayList<Comparable>();
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
		MergeSortC merger=new MergeSortC();
		Person a=new Person(10, "Bob");
		Person b=new Person(5, "John");
		Person c=new Person(3, "Ron");
		Person d=new Person(8, "Zamansky");
		Person e=new Person(123, "Brian");
		Person f=new Person(0, "James");
		Person g=new Person(-345, "Eric");
		Person h=new Person(123342342, "Kevin");
		ArrayList<Comparable> i=new ArrayList<Comparable>();
		i.add(a.name());
		i.add(b.name());
		i.add(c.name());
		i.add(d.name());
		i.add(e.name());
		i.add(f.name());
		i.add(g.name());
		i.add(h.name());
		System.out.println("Sorted based on name: "+merger.mergesort(i));
		ArrayList<Comparable> j=new ArrayList<Comparable>();
		j.add(a.age());
		j.add(b.age());
		j.add(c.age());
		j.add(d.age());
		j.add(e.age());
		j.add(f.age());
		j.add(g.age());
		j.add(h.age());
		System.out.println("Sorted based on age: "+merger.mergesort(j));
    }
}		    
