import java.io.*;
import java.util.*;

public class QuickSort{

	public void quickSort(int a[],int low, int high)  {  
		if(low>=high) return;  
		int l=low;
		int h=high;
		int piv=a[(l+h)/2]; 
		while(l<h){
            while(l<h && a[l]<piv)   
                l++;   
            while(l<h && a[h]>piv)  
                h--;   
            if(l<h){  
                int tem = a[l];  
                a[l]=a[h];  
                a[h]=tem; 
			}             
        }
		if(h<l){  
			int t = l;
			l=h;
			h=t;   
		}  	
        quickSort(a,low,l);  
        quickSort(a,l+1,high); 
    }  
	
	public static void main (String[] args){
		QuickSort q = new QuickSort();
		int[] a = new int[10];
		a[0] = 47;
		a[1] = 25;
		a[2] = 83;
		a[3] = 37;
		a[4] = 93;
		a[5] = 73;
		a[6] = 45;
		a[7] = 19;
		a[8] = 66;
		a[9] = 84;
		q.quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		
	}
}