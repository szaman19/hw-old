import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	MergeSort m = new MergeSort();
	ArrayList<Comparable> L = new ArrayList<Comparable>();
	L.add("q");
	L.add("w");
	L.add("e");
	L.add("r");
	System.out.println(m.msort(L));
	ArrayList<Comparable> l = new ArrayList<Comparable>();
	l.add(1);
	l.add(5);
	l.add(3);
	l.add(2);
	System.out.println(m.msort(l));
    }
}
