import java.io.*;
import java.util.*;


public class Driver{

    public static void main(String[] args){
	Sort S = new Sort();
	ArrayList<Integer> test1 = S.randArrayList(20,1000,0);
	ArrayList<String> test2 = S.randArrayList(20,5,"");
	System.out.println(test1);
	System.out.println(test2);
	S.mergeSort(test1);
	S.mergeSort(test2);
	System.out.println(test1);
	System.out.println(test2);
    }
}