import java.util.*;
import java.io.*;

public class Tester{

    public static void main(String[]args){
	int[] a = new int[10];
	Random randInt = new Random();
	for(int x = 0; x < 10; x++){
	    a[x] = randInt.nextInt();
	}
	MergeSort sorter = new MergeSort();
	System.out.println(sorter.split(a));
    }

}