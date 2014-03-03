import java.util.*;

public class Merge{
    public int[] merge(int[]a,int[]b){
	int s1 = 0;
	int s2= 0;
	int len = a.length + b.length;
	int[] sorted= new int[len];
	for (int i = 0; i < len;i++){
	    if(s1 >= a.length ){
		sorted[i] = b[s2];
		s2++;
	    }
	    else if (s2 >= b.length){
		sorted[i] = a[s1];
		s1++;
	    }
	    else if (a[s1] <= b[s2]){
		sorted[i] = a[s1];
		s1++;
	    }
	    else{
		sorted[i] = b[s2];
		s2++;
	    }
	}
	return sorted;
    }
    public static void main (String[] args){
	int[]ex1= new int[10];
	int[]ex2= new int[10];
	Merge m = new Merge();
	for(int i = 0;i < 10; i ++){
	    ex1[i]= i * 123;
	    ex2[i]= i + 102;
	}
	System.out.println("ex1: " + Arrays.toString(ex1));
	System.out.println("ex2: " + Arrays.toString(ex2));
	System.out.println("Merged: " + Arrays.toString(m.merge(ex1, ex2)));
    }
}
