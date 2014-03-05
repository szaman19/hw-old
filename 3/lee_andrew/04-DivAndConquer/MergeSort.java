import java.io.*;
import java.util.*;

public class MergeSort{
    public String[] merge(String[] a, String[] b){
	String[] res = new String[a.length+b.length];
	int counta = 0;
	int countb = 0;
	for (int i = 0;i<res.length;i++){
	    if (a.length <= counta){
		res[i] = b[countb];
		countb = countb + 1;
	    }
	    else if (b.length <= countb){
		res[i] = a[counta];
		counta = counta + 1;
	    }
	    else {
		String temp = a[counta];
		if (temp.compareTo(b[countb]) < 0){
		    res[i] = a[counta];
		    counta = counta + 1;
		}
		else {
		    res[i] = b[countb];
		    countb = countb + 1;
		}
	    }
	}
	return res;
    }

    public String[] msort(String[] L){
	if (L.length <= 1){
	    return L;
	}
	else {
	    int half = L.length/2;
	    int other = L.length - half;
	    String[] a = new String[half];
	    String[] b = new String[other];
	    for (int i = 0;i<L.length;i++){
		if (i < half){
		    a[i] = L[i];
		}
		else {
		    b[i-half] = L[i];
		}
	    }
	    a = msort(a);
	    b = msort(b);
	    L = merge(a,b);
	}
	return L;
    }
}
