import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	MergeSort m = new MergeSort();
	ArrayList<String> L = new ArrayList<String>();
	L.add("a");
	L.add("g");
	L.add("y");
	L.add("w");
	L.add("k");
	System.out.println(m.msort(L));
	ArrayList<String> l = new ArrayList<String>();
	l.add("e");
	l.add("q");
	l.add("u");
	l.add("k");
	l.add("v");
	l.add("z");
	System.out.println(m.msort(l));
    }
}
