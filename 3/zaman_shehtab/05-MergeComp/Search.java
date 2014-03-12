import java.util.*;
import java.io.*;

public class search{
	public static int rbsearch(int n, int[] l){
		int middle = (l.length / 2) - 1; 
		int counter = 0; 
		int[] a = new int[middle + 1];
		int [] b = new int[middle + 1];

		for (int i = 0; i < a.length; i++) {
			counter ++;	
			a[i] = l[i];
			}

		for (int k = 0; k < b.length ; k++) {
			b[k] = l[ k + counter];
			}
		
		if (l[middle] == n) {
			return middle;
		}
		else if (l.length < 1) {
			return -1;
		}
		else if (l[middle] > n) {
			rbsearch(n,b);
		}
		else if (l[middle] < n) {
			rbsearch(n,a);
		}
	}

	public static void main(String[] args) {

		int [] data = new int [100]; //test Array 
		for (int x = 0; x < data.length; x++) {
			data[x] = (int) (Math.random() * 100000 + 1); 
	}
	
}