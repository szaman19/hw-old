import java.util.ArrayList;

public abstract class MergeSort{

    private static ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList<Comparable> b) {
	ArrayList<Comparable> merged = new ArrayList<Comparable>();
	int x = 0;
	int i = 0;
	int j = 0;
	while(i < a.size() && j < b.size()) {
	    if((a.get(i)).compareTo(b.get(j)) < 0){
		merged.add(a.get(i));
		i++;
	    }
	    else{
		merged.add(b.get(j));
		j++;
	    }
	    x++;
	}
	while(i < a.size()) {
	    merged.add(a.get(i));
	    i++;
	    x++;
	}
	while(j < b.size()) {
	    merged.add(b.get(j));
	    j++;
	    x++;
	}
	return merged;
    }

    private static ArrayList<Comparable> mergeSort(ArrayList<Comparable> a) {
	if(a.size() <= 1) {
	    return a;
	}
        else {
	    ArrayList<Comparable> new1 = new ArrayList<Comparable>();
	    ArrayList<Comparable> new2 = new ArrayList<Comparable>();
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
        ArrayList<Comparable> a = new ArrayList<Comparable>();
	a.add("fish");
	a.add("dog");
	a.add("cat");
	a.add("apple");
	a.add("cheese");
	a.add("zebra");
	a.add("aardwolf");
	System.out.println(mergeSort(a));

	ArrayList<Comparable> b = new ArrayList<Comparable>();
	for(int x = 0; x < 15; x++){
	    b.add((int)(Math.random()*10));
	}

	System.out.println(b);
	System.out.println(mergeSort(b));
    }

}
	    
