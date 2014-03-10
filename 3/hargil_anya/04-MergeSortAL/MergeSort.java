import java.util.ArrayList;

public abstract class MergeSort implements Comparable{

    private static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b) {
	ArrayList<String> merged = new ArrayList<String>();
	int x = 0;
	int i = 0;
	int j = 0;
	while(i < a.size() && j < b.size()) {
	    if(a.get(i).compareTo(b.get(j)) == -1){
		merged.set(x, a.get(i));
		i++;
	    }
	    else{
		merged.set(x, b.get(j));
		j++;
	    }
	    x++;
	}
	while(i < a.size()) {
	    merged.set(x, a.get(i));
	    i++;
	    x++;
	}
	while(j < b.size()) {
	    merged.set(x, b.get(j));
	    j++;
	    x++;
	}
	return merged;
    }

    private static ArrayList<String> mergeSort(ArrayList<String> a) {
	if(a.size() <= 1) {
	    return a;
	}
        else {
	    ArrayList<String> new1 = new ArrayList<String>();
	    ArrayList<String> new2 = new ArrayList<String>();
	    int x;
	    for(x = 0; x < a.size()/2; x++) {
		new1.add(a.get(x));
	    }
	    for(; x < a.size(); x++) {
		new2.add(a.get(x));
	    } 
	    return merge(mergeSort(new1), mergeSort(new2));
	}
    }
    
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
	a.add("fish");
	a.add("dog");
	a.add("cat");
	a.add("apple");
	System.out.println(mergeSort(a));
    }

}
	    
