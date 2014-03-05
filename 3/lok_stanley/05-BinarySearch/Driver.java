import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[]args){
	MergeSort mergeSort = new MergeSort();
	
	ArrayList test = new ArrayList<String>();
	
	test.add("fun");
	test.add("apple");
	test.add("wow");
	test.add("google");
	test.add("tech");
	test.add("java");
	test.add("coffee");
	test.add("yes");
	test.add("no");
	
	test = mergeSort.mergeSort(test);
	
	for(int i = 0; i < test.size(); i++){
	    System.out.println(test.get(i));
	}

    }
}