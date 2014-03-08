import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	MergeSort m = new MergeSort();
	ArrayList<String> L = new ArrayList<String>();
	L.add("q");
	L.add("w");
	L.add("e");
	L.add("r");
	System.out.println(m.msort(L));
    }
}