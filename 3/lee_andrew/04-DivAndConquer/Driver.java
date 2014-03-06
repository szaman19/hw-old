import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	MergeSort m = new MergeSort();
	String[] L = {"a","g","y","w","k"};
	System.out.println(Arrays.toString(m.msort(L)));
	String[] l = {"e","q","u","k","v","z"};
	System.out.println(Arrays.toString(m.msort(l)));
    }
}
