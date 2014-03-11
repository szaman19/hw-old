import java.util.*;
import java.io.*;

public class Tester{

    public static void main(String[]args){
	int[] a = new int[10];
	Random randInt = new Random();
	for(int x = 0; x < 10; x++){
	    a[x] = randInt.nextInt(100);
	}
	MergeSort sorter = new MergeSort();
	a = sorter.split(a);
	for(int x = 0; x < a.length; x++){
	System.out.print(a[x] + ", ");
	}	
	
    }

}
