import java.util.ArrayList;

public class MergeSort{

    public ArrayList<Comparable> merge( ArrayList<Comparable> r1, ArrayList<Comparable> r2 ){
	ArrayList<Comparable> merged = new ArrayList<Comparable>();
	while (r2.size() > 0 && r1.size() > 0){

		
	    if (r1.get(0).compareTo(r2.get(0)) <= 0){
		merged.add(r1.get(0));
		r1.remove(0);
	    }
	    else if (r1.get(0).compareTo(r2.get(0)) > 0){
		merged.add(r2.get(0));
		r2.remove(0);
	    }

	}
	while (r1.size() > 0){
	    merged.add(r1.get(0));
	    r1.remove(0);
	}
	while (r2.size() > 0){
	    merged.add(r2.get(0));
	    r2.remove(0);
	}
	return merged;
    }

    public ArrayList<Comparable> msort( ArrayList<Comparable> unsorted ){
    	if (unsorted.size() <= 1){
    	    return unsorted;
    	}
    	int s = unsorted.size()/2;
    	ArrayList<Comparable> r1 = new ArrayList<Comparable>();
	for (int i = 0; i < s; i++){
	    r1.add(unsorted.get(i));
	}
	ArrayList<Comparable> r2 = new ArrayList<Comparable>();
	for (int i = s; i < unsorted.size(); i++){
	    r2.add(unsorted.get(i));
	}
    	ArrayList<Comparable> n1 = msort(r1);
	ArrayList<Comparable> n2 = msort(r2);
	return merge(n1,n2);
    }

    public static void main( String[] args ){
	MergeSort m = new MergeSort();
	ArrayList<Comparable> a = new ArrayList<Comparable>();
	for (int i = 0; i < 100; i++){
	    PersonAge john = new PersonAge();
	    a.add(john);
	}
        ArrayList<Comparable> b = new ArrayList<Comparable>();
	for (int i = 0; i < 100; i++){
	    PersonName john = new PersonName();
	    b.add(john);
	}
	System.out.println("\nPrinting raw, unsorted ArrayList of Persons.\n");
	System.out.println(a);
	System.out.println("\nPrinting MergeSorted ArrayList of Persons by age.\n");
	System.out.println(m.msort(a));
	System.out.println("\nPrinting raw, unsorted ArrayList of new Persons.\n");
	System.out.println(b);
	System.out.println("\nPrinting MergeSorted ArrayList of Persons by name.\n");
	System.out.println(m.msort(b));
	System.out.println("Done");
    }

}
