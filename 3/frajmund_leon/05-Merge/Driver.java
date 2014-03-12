import java.util.*;
public class Driver{

    public static void main(String[]args){
	MergeSort thing = new MergeSort();
	ArrayList<Comparable> a = new ArrayList<Comparable>();
	a.add(new Person());
	a.add(new Person(10, "Sandy"));
	a.add(new Person(11,"NotSandy"));
	a.add(new Person(56, "Trevor"));
	a.add(new Person(1, "Candy"));
	a.add(new Person(100, "Kevin"));
	a.add(new Person(17, "Lee"));
	a = thing.MergeSort(a);
	for(Object c : a)
	    System.out.println(((Person)c).getName() + " " + ((Person)c).getAge());

	Binary b = new Binary();
	int[] c = {1,2,3,4,5,6,7,15,17,18,19,23,32,36,38,49, 54};
	System.out.println(b.rbsearch(5, c));
    }

}
