import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[]args){
	
	QuickSort quick = new QuickSort();

	Integer[] test = {3,41,25,12,3,1,51,12,3,12};
	test = quick.QuickSort(test);

	for(int i = 0; i < test.length; i++){
	    System.out.println(test[i]);
	}
	
    }
}