import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Merge m = new Merge();
	int[] l = {3,6,34,24,8,9,56,3};
	int[] l2 = {6,4,2,4,7,8,7,35,57};
	System.out.println(Arrays.toString(m.msort(l)));
	System.out.println(Arrays.toString(m.msort(l2)));
    }
}