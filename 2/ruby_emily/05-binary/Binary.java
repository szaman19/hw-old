<<<<<<< HEAD
import java.io.*;
import java.util.*;

public class Binary{
    public int rbsearch(int[] l, int n){
	int[] h1;
	int[] h2;
	int half = l.length/2;
	if (l[half] == n)
	    return half;
	else {

	    h1 = new int[half];
	    h2 = new int[l.length-half];
	    for (int i = 0; i < l.length; i++) {
                if (i < half) {
                    h1[i] = l[i];
                }
                else {
                    h2[i - half] = l[i];
                }
	    }
            
	    System.out.println(toString(h1));
	    System.out.println(toString(h2));
	    
	    if (l[half] < n)
		rbsearch(h1,n);
	    else
		rbsearch(h2,n);
	
	}
	return -1;

    }
    
    public String toString(int[] a){
	return Arrays.toString(a);
    }
    
   

    public static void main(String[] args){
	Binary b = new Binary();

	int[] l = new int[5];
	for (int i=0; i<l.length;i++){
	    l[i] = i+2;
	}
	System.out.println(Arrays.toString(l));
        b.rbsearch(l,2);
	System.out.println(b);
    }
}
=======
/* So I was actually working on finishing my other hws from last night and the previous night, because I had not been able to finish them and thus could not really complete this assignment without first finishing them. So I promise that after tomorrow, I will finish all of my work from this week, and be on point for next weeks class.
>>>>>>> parent of f249657... hw5
