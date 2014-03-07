import java.util.ArrayList;

public class MergeSort{

    public ArrayList<String> merge( ArrayList<String> r1, ArrayList<String> r2 ){
	ArrayList<String> merged = new ArrayList<String>();
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

    public ArrayList<String> msort( ArrayList<String> unsorted ){
    	if (unsorted.size() <= 1){
    	    return unsorted;
    	}
    	int s = unsorted.size()/2;
    	ArrayList<String> r1 = new ArrayList<String>();
	for (int i = 0; i < s; i++){
	    r1.add(unsorted.get(i));
	}
	ArrayList<String> r2 = new ArrayList<String>();
	for (int i = s; i < unsorted.size(); i++){
	    r2.add(unsorted.get(i));
	}
    	ArrayList<String> n1 = msort(r1);
	ArrayList<String> n2 = msort(r2);
	return merge(n1,n2);
    }

    public static void main( String[] args ){
	MergeSort m = new MergeSort();
	ArrayList<String> a = new ArrayList<String>();
	for (int i = 0; i < 100; i++){
	    int x = (int)(Math.random() * 100 + 1);
	    a.add(x+"");
	}
	// ArrayList<String> b = new ArrayList<String>();
	// for (int i = 0; i < 100; i++){
	//     int x = (int)(Math.random() * 100 + 1);
	//     b.add(x+"");
	// }
	System.out.println("\nPrinting raw, unsorted ArrayList.\n");
	System.out.println(a);
	System.out.println("\nPrinting MergeSorted ArrayList of STRINGIFIED numbers.\n");
	System.out.println(m.msort(a));
	System.out.println("Done");
    }

}
