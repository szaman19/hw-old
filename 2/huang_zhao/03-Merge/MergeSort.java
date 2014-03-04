import java.util.*;
public class MergeSort{
    public void toString(int[] L){
	String dx= "";
	for (int d =0;d < L.length;d++){
	    dx +=String.valueOf(L[d])+",";
	}
	System.out.println(dx);
    }
    public int[] mSort(int[] L){
	if (L.length <= 1){
	    toString(L);
	    return L;
	}
	else {
	    if (L.length%2 ==0){
	    int[] listA =new int[L.length/2];
	    int[] listB =new int[L.length/2];
	    for(int counter = 0;counter<L.length/2;counter++){
		listA[counter]= L[counter];
		listB[counter]= L[counter + (L.length/2)];
	    }
	    listA = mSort(listA);
	    listB = mSort(listB);
	    L = merge(listA,listB);
	    toString(L);
	   
	    return L;
	    }
	    
	    else {
		
		int[] listA =new int[(L.length/2) + 1];
		int[] listB =new int[L.length/2];
		listA[0]= L[0];
		for(int counter = 0;counter<L.length/2;counter++){
		    listA[counter+1]= L[counter+1];
		    listB[counter]= L[counter + (L.length/2)+1];
		    }
		listA = mSort(listA);
		listB = mSort(listB);
		L = merge(listA,listB);
		toString(L);
		return L;
	    }
	   
	    
	    
	}
    }

	
	    
    public int[] merge(int[]d,int[]p){
	int size = 0;
	int size1 = 0;
	
	int[] sorted = new int[d.length+p.length];
	for (int z =0;z < d.length+p.length;z++){
	    if (size == d.length){
		sorted[z]= p[size1];
		size1++;
	    }
	    else if (size1 == p.length ){
		sorted[z]= d[size];
		size++;
	    }
	    else if (d[size]<=p[size1]){
		sorted[z]=d[size];
		size++;
	    }
	    else{
		sorted[z]= p[size1];
		size1++;
	    }
	}
	return sorted;
    }
    public static void main (String[] args){
	int[]test1= new int[10];
	Random rand = new Random();
	int[]test2 = new int[5];
	MergeSort p = new MergeSort();
	for (int d =0;d<10;d++){
	    test1[d]= rand.nextInt(20);
	}
	
	p.toString(test1);
	int[]dd = p.mSort(test1);
	
    }
}
	    