import java.io.*;
import java.util.*;

public class Merge{
    public int[] merge(int[]a,int[]b){
	int[] ans = new int[a.length+b.length];
	int counta = 0;
	int countb = 0;
	for (int i=0;i<ans.length;i++){
	    if (a.length <= counta){
		ans[i] = b[countb];
		countb = countb + 1;
	    }
	    else if (b.length <= countb){
		ans[i] = a[counta];
		counta = counta + 1;
	    }
	    else {
		int temp = a[counta];
		if (temp < b[countb]){
		    counta = counta + 1;
		}
		else{
		    temp = b[countb];
		    countb = countb + 1;
		}
		ans[i] = temp;
	    }
	}
	return ans;
    }

    public int[] msort(int[] l){
	if (l.length <= 1){
	    return l;
	}
	else {
	    int half = l.length/2;
	    int other = l.length-half;
	    int[] a = new int[half];
	    int[] b = new int[other];
	    for (int i=0;i<l.length;i++){
		if (i<half){
		    a[i] = l[i];
		}
		else {
		    b[i-half] = l[i];
		}
	    }
	    a = msort(a);
	    b = msort(b);
	    l = merge(a,b);
	}
	return l;
    }
}
