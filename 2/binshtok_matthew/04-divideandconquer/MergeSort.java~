import java.util.ArrayList;

public class MergeSort{

    public ArrayList<Comparable> merge( ArrayList<Comparable> r1, ArrayList<Comparable> r2 ){
	ArrayList<Comparable> merged = new ArrayList<Comparable>();
	while (r2.size() > 0 && r1.size() > 0){

		
	    if (r1.get(0).compareTo(r2.get(0)) > 0){
		merged.add(r1.get(0));
		r1.remove(0);
	    }
	    else if (r1.get(0).compareTo(r2.get(0)) <= 0){
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
    	if (unsorted.size() == 1){
    	    return unsorted;
    	}
    	int s = unsorted.size()/2;
    	ArrayList<Comparable> r1 = new ArrayList<Comparable>();
	for (int i = 0; i < s; i++){
	    r1.add(unsorted.get(i));
	}
	ArrayList<Comparable> r2 = new ArrayList<Comparable>();
	for (int i = 0; i < unsorted.size() - s; i++){
	    r2.add(unsorted.get(s+i));
	}
    	return merge(msort(r1),msort(r2));
    }

    public static void main( String[] args ){
	MergeSort m = new MergeSort();
	ArrayList<Comparable> a = new ArrayList<Comparable>();
	for (int i = 0; i < 100; i++){
	    int x = (int)(Math.random() * 100 + 1);
	    a.add(x);
	}
	ArrayList<Comparable> b = new ArrayList<Comparable>();
	for (int i = 0; i < 100; i++){
	    int x = (int)(Math.random() * 100 + 1);
	    b.add(x);
	}
	System.out.println(m.merge(a,b));
	System.out.println("Done");
	// for (int i = 0; i < b.length; i++){
	//     if (i < b.length - 1 ){
	// 	System.out.print(b[i] + ",");
	//     }
	//     else {
	// 	System.out.println(b[i]);
	//     }
	// }
    }

}
