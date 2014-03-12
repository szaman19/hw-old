import java.util.*;

public class Merge {

    private ArrayList<String> A;

    public ArrayList<String> mergeList(ArrayList<String> a, ArrayList<String> b) {

	int ai = 0;
	int bi = 0;
	int l = a.size() + b.size();
	A = new ArrayList<String>();

	for (int i=0;i<l;i++) {
	    if (ai == a.size()) {
		A.add(b.get(bi));
		bi++;
	    }
	    else if (bi == b.size()) {
		A.add(a.get(ai));
		ai++;
	    }
	    else if (a.get(ai).compareTo(b.get(bi)) < 0) {
		A.add(a.get(ai));
		ai++;
	    }
	    else {
		A.add(b.get(bi));
		bi++;
	    }
	}

	return A;
    }

    public ArrayList<String> mergeSort(ArrayList<String> A) {

	if (A.size() <= 1)
	    return A;
	else {
	    ArrayList<String> r1 = new ArrayList<String>();
	    ArrayList<String> r2 = new ArrayList<String>();

	    int i;
	    for (i=0;i<A.size()/2;i++) {
		r1.add(A.get(i));
	    }

	    for ( ;i<A.size();i++) {
		r2.add(A.get(i));
	    }

	    r1 = mergeSort(r1);
	    r2 = mergeSort(r2);

	    A = mergeList(r1, r2);
	}

	return A;

    }


    public static void main(String[] args) {

	Merge m = new Merge();
	ArrayList<String> l = new ArrayList<String>();
	l.add("e");
	l.add("r");
	l.add("f");
	l.add("s");
	l.add("b");
	l.add("i");
	l.add("g");
	l.add("l");
	l.add("q");
	l.add("z");
	System.out.println(l);
	ArrayList<String> r = m.mergeSort(l);
	System.out.println(r);

    }

}
