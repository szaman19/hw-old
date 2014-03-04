import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	
	Merge m = new Merge();
	int[] A = {2, 3, 4, 5};
	int[] B = {0, 1, 6, 7};
	int[] C = m.merge(A, B);
	
	for (int i = 0; i < C.length; i ++){
	    System.out.print(C[i] + ", ");
	}
    }
}
