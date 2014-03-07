import java.util.*;

public class Driver {

    public static void main(String[] args) {

	Merge m = new Merge();

	/*
	ArrayList<Comparable> l = new ArrayList<Comparable>();
	Person p1 = new Person("Bob", 44);
	Person p2 = new Person("Jose", 14);
	Person p3 = new Person("George", 4);
	Person p4 = new Person("PeeWee", 42);
	Person p5 = new Person("Albert", 60);
	Person p6 = new Person("Ross", 55);
	Person p7 = new Person("Quatrdean", 35);
	Person p8 = new Person("Shamonster", 24);
	l.add(p1);
	l.add(p2);
	l.add(p3);
	l.add(p4);
	l.add(p5);
	l.add(p6);
	l.add(p7);
	l.add(p8);

	ArrayList<Comparable> r = m.mergeSort(l);
	System.out.println(r);
	*/

	BinarySearch b = new BinarySearch();
	ArrayList<Comparable> y = b.makeList(10);
	y.add(10233);
	y.add(10245);
	System.out.println(y);
	ArrayList<Comparable> x = m.mergeSort(y);
	System.out.println(x);
	//System.out.println(b.rbsearch(10233, x));
	System.out.println(b.ibsearch(10245, x));


    }

}
