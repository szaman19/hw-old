import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Quicksort q = new Quicksort();
	Integer[] L = {5,3,6,8,1,9,2};
	System.out.println(Arrays.toString(q.qsort(L)));
    }
}
