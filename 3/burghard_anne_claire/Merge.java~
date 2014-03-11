import java.io.*;
import java.util.*;

public class Merge{
    
    public int[] merge (int[] A, int[]B){
	int length = A.length + B.length;
	int[] answer = new int[length];
	int a = 0;
	int b = 0;
	for (int i=0; i<length; i++){
	    if (A[a] <= B[b]){
		answer[i] = A[a];
		if (a < A.length-1){
		    a++;
		}
	    }
	    else if (B[b] < A[a]){
		answer[i] = B[b];
		if (b < B.length-1){
		    b++;
		}
	    }
	}
	return answer;
    }
}
		
