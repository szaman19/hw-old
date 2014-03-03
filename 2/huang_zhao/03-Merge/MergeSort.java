import java.util.*;
public class MergeSort{
    public int[] mSort(int[] L){
	if (L.length <= 1){
	    return L;
	}
	else {
	    int[] listA =new int[L.length/2];
	    int[] listB =new int[L.length/2];
	    for(int counter = 0;counter<L.length/2;counter++){
		listA[counter]= L[counter];
		listB[counter]= L[counter + (L.length/2)];
	    }
	    listA = mSort(listA);
	    listB = mSort(listB);
	    L = merge(listA,listB);
	    System.out.println(L.length);
	    return L;
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
	for (int d =0;d<10;d++){
	    // System.out.println(test1[d]);
	}
	//System.out.println("End");
	int[]dd = p.mSort(test1);
	for (int d =0;d<10;d++){
	    //System.out.println(dd[d]);
	}
    }
}
	    