import java.io.*;
import java.util.*;
public class MergeSortComparable {

    //rewrote for arraylists

    public static void main(String[] args) {
	MergeSortComparable m = new MergeSortComparable();
	
	//Strings
	ArrayList<Comparable> list = new ArrayList<Comparable>();
	list.add("James");
	list.add("George");
	list.add("Jello");
	list.add("Michael");
	list.add("Johnny");
	list.add("Sap");
	list.add("Brad");
	list.add("Kelvin");

	System.out.println(list);
	
	System.out.println(m.msort(list));

	//Integers
	MergeSortComparable n = new MergeSortComparable();
	ArrayList<Comparable> list2 = new ArrayList<Comparable>();
	for (int i = 0; i < 15; i++) {
	   int j = (int) (Math.random () * 50);
	   list2.add (j);

       }
	System.out.println(list2);
	
	System.out.println(m.msort(list2));
	
	//Persons
	MergeSortComparable peepo = new MergeSortComparable();
	ArrayList<Comparable> list3 = new ArrayList<Comparable>();
	Person one = new Person ("James", 98);
	list3.add(one);
	Person two = new Person ("Alex", 18);
	list3.add(two);
	Person three = new Person ("David", 28);
	list3.add(three);
	Person fo = new Person ("Bobby", 58);
	list3.add(fo);
	Person five = new Person ("Michael", 15);
	list3.add(five);
	Person six = new Person ("Jun", 4);
	list3.add(six);
	System.out.println(list3);
	
	System.out.println(peepo.msort(list3));

	
	
    }
    public ArrayList<Comparable> msort(ArrayList<Comparable> L){
        if ( L.size()<=1){
            return L;
        }
        ArrayList<Comparable> a = new ArrayList<Comparable>(L.size()/2);
        
        int i;
        for (i = 0;i<L.size()/2;i++){
            a.add(i,L.get(i));
        }
	ArrayList<Comparable> b =  new ArrayList<Comparable>(L.size() - L.size()/2);
        for ( ;i<L.size();i++){
            b.add(i-a.size(),L.get(i));
	}
	
        a = new ArrayList<Comparable>(msort(a));
	b = new ArrayList<Comparable>(msort(b));
        L = new ArrayList<Comparable>(merge(a,b));
        return L;
    }
    public ArrayList<Comparable> merge(ArrayList<Comparable>a,ArrayList<Comparable>b){
        int size = 0;
        int size1 = 0;
	
        ArrayList<Comparable> sorted = new ArrayList<Comparable>(a.size() +b.size());
        for (int z =0;z < a.size()+b.size();z++){
            if (size == a.size()){
		
		sorted.add(z,b.get(size1));
                size1++;
            }
            else if (size1 == b.size() ){
		
		sorted.add(z,a.get(size));
                size++;
            }
            
	    else if(a.get(size).compareTo(b.get(size1)) <= 0){
                sorted.add(z,a.get(size));
		size++;
            }
            else{
                sorted.add(z,b.get(size1));
                size1++;
            }
        }
        return sorted;
    }
    
}
