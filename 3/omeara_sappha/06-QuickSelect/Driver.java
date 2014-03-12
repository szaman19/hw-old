import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	int[] a = new int[100];
	for (int i = 0; i < a.length; i ++){
	    a[i] = i;
	}
	QuickSelect q = new QuickSelect();
	int b = q.quickselect(a, 50, 0, 99);
	System.out.println(b); //returns 50
    }
}
