import java.io.*;
import java.util.*;

public class Merge{

    protected int[] temp1;
    protected int[] temp2;

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

    public void split (int[] A){
	if (A.length % 2 == 0){
	    int i = 0;
	    int newlength = A.length/2;
	    temp1 = new int[newlength];
	    temp2 = new int[newlength];
	    while (i<newlength){
		temp1[i] = A[i];
		i++;
	    }
	    for (int x=0; x<newlength; x++){
		temp2[x] = A[i];
		i++;
	    }
	}
	else{
	    int i = 0;
	    int evenlength = A.length/2;
	    int oddlength = A.length/2 + 1;
	    temp1 = new int[evenlength];
	    temp2 = new int[oddlength];
	    while (i<evenlength){
		temp1[i] = A[i];
		i++;
	    }
	    for (int x=0; x<oddlength; x++){
		temp2[x] = A[i];
		i++;
	    }
	}
    }		
}
		
