import java.util.*;

public class Merge {

    private ArrayList<Comparable> A;

    public ArrayList<Comparable> mergeList(ArrayList<Comparable> a, ArrayList<Comparable> b) {

	int ai = 0;
	int bi = 0;
	int l = a.size() + b.size();
	A = new ArrayList<Comparable>();

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

    public ArrayList<Comparable> mergeSort(ArrayList<Comparable> A) {

	if (A.size() <= 1)
	    return A;
	else {
	    ArrayList<Comparable> r1 = new ArrayList<Comparable>();
	    ArrayList<Comparable> r2 = new ArrayList<Comparable>();

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
	ArrayList<Comparable> l1 = new ArrayList<Comparable>();
	l1.add("ef");
	l1.add("ea");
	l1.add("f");
	l1.add("s");
	l1.add("b");
	l1.add("i");
	l1.add("g");
	l1.add("l");
	l1.add("q");
	l1.add("z");
	System.out.println(l1);
	ArrayList<Comparable> r1 = m.mergeSort(l1);
	System.out.println(r1);

	ArrayList<Comparable> l2 = new ArrayList<Comparable>();
	l2.add(1);
	l2.add(5);
	l2.add(124);
	l2.add(53);
	l2.add(97);
	l2.add(55);
	l2.add(0);
	l2.add(25);
	l2.add(99);
	l2.add(69);
	l2.add(44);
	System.out.println(l2);
	ArrayList<Comparable> r2 = m.mergeSort(l2);
	System.out.println(r2);

    }

}
