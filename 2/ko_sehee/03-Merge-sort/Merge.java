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
    public int[] mSort(int[] L){
	int nlen1 = 0;
	int nlen2 = 0;
	if (L.length <= 1){
	    return L;
	}
	else{
	    int []p1 = new int[(int)(L.length/2)];
	    int[] p2 = new int[L.length - p1.length];      
	    for (int i = 0; i < p1.length; i ++){
		p1[i] = L[i];
	    }
	    for (int j = 0; j<p2.length; j ++){
		p2[j] = L[j + p1.length];
	     
	    }
	    p1 = this.mSort(p1);
	    p2 = this.mSort(p2);
	    L = merge(p1, p2);
	    return L;
	}
    }


		
    public static void main (String[] args){
	/*	int[]ex1= new int[10];
	int[]ex2= new int[10];
	Merge m = new Merge();
	for(int i = 0;i < 10; i ++){
	    ex1[i]= i * 123;
	    ex2[i]= i + 102;
	}
	System.out.println("ex1: " + Arrays.toString(ex1));
	System.out.println("ex2: " + Arrays.toString(ex2));
	System.out.println("Merged: " + Arrays.toString(m.merge(ex1, ex2)));
	*/
	Merge me= new Merge();
	int [] ex = {100,23,241,235,1247,34,124523,151,23};
	System.out.println(Arrays.toString(me.mSort(ex)));
	}
}
