import java.io.*;
import java.util.*;

public class StringMerge{
    public static int[] merge(int[] a,int[] b){
	int[] longer, shorter;
	if (a.length > b.length){
	    longer = a;
	    shorter = b;
	}else {
	    longer = b;
	    shorter = a;
	}
	int[] result = new int[longer.length + shorter.length];
	int longCounter = 0;
	int shortCounter = 0;
	while (shortCounter < shorter.length || longCounter < longer.length){
	    if (shortCounter > shorter.length){
		if (shorter[shortCounter] > longer[longCounter]){
		    result[longCounter + shortCounter] = longer[longCounter];
		    longCounter++;
		}
		else {
		    result[longCounter + shortCounter] = shorter[shortCounter];
		    shortCounter++;
		}
	    }
	}
	return result;
    }
    
    public static int[] mergeSort(int[] a){
	if (a.length <= 1)
	    return a;
	int longLength = 0;
	if (a.length % 2 == 1)
	    longLength = (a.length / 2) + 1;
	else
	    longLength = a.length / 2;
	int shortLength = a.length / 2;
	
	int[] longer = new int[longLength];
	int[] shorter = new int[shortLength];
	int aCounter = 0;
	for (int i = 0; i < longLength + shortLength;i++){
	    if (i < longLength){
		longer[i] = a[aCounter];
		aCounter ++;
	    }else {
		shorter[i - longLength] = a[aCounter];
		aCounter ++;
	    }
	}
	return merge(mergeSort(shorter), mergeSort(longer));    
    }
    
    public static void main(String[] args){
	Random r = new Random();
	int[] a = new int[10];
	int[] b = new int[11];
	
	for (int i = 0;i < a.length + b.length;i++){
	    if (i < a.length)
		a[i] = r.nextInt(20);
	    else
		b[i-a.length] = r.nextInt(20);
	}
	
	
	for (int i = 0;i < a.length - 1;i++){
	    System.out.print(a[i]+",");
	   
	}
	System.out.println("\n");
	for (int i = 0;i < b.length - 1;i++){
	    System.out.print(b[i]+",");
	   
	}
	System.out.println("\n");
	
	mergeSort(a);
	mergeSort(b);
	
	for (int i = 0;i < a.length - 1;i++){
	    System.out.print(a[i]+",");
	   
	}
	System.out.println("\n");
	for (int i = 0;i < b.length - 1;i++){
	    System.out.print(b[i]+",");
	   
	}
	System.out.println("\n");
    }


}
    

