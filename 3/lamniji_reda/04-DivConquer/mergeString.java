//Used the mergesort from the class code as a skeleton because I'm still debugging my own

import java.io.*;
import java.util.*;
public class mergeString {

    public String[] merge(String[] a, String[] b) {
	String[] result = new String[a.length+b.length];
	int ia=0,ib=0;
	int i=0;
	while (ia<a.length&&ib<b.length) {
	    if (a[ia].compareTo(b[ib]) < 0) {
		result[i]=a[ia];ia++;
	    }  else {
		result[i]=b[ib];ib++;
	    }
	    i++;
	}

	if (ia>=a.length) {
	    for (;i<result.length;i++){
		result[i]=b[ib];ib++;
	    }
	} else {
	    for (;i<result.length;i++){
		result[i]=a[ia];ia++;
	    }
	}
	return result;
    }
    
    public String[] stringSort(String[] L) {
	
	if (L.length<=1){
	    return L;
	}
	
	String[] a = new String[L.length/2];
	String[] b = new String[L.length - a.length];

	int i;
	for (i=0;i<a.length;i++){
	    a[i]=L[i];
	}
	for ( ; i<L.length;i++){
	    b[ i-a.length ] = L[i];
	}
	a = stringSort(a);
	b = stringSort(b);
	String[] result = merge(a,b);
	return result;
    }
   
    //Linear Search// 
    public int search(String s, String[] L){
	L = stringSort(L);
	for (int i = 0; i < L.length; i++){
	    if (L[i] == s){
	    return i;
	    }
	}
	return -1;
    }

    public static void main(String[] args){
	mergeString a = new mergeString();
	String[] one = {"Hello","Woah","Rich","Chives","Fork","Barrel"};
	System.out.println(Arrays.toString(a.stringSort(one)));
	System.out.println("Should be: [Barrel, Chives, Fork, Hello, Rich, Woah]");
	System.out.println(a.search("Fork",one));
	System.out.println(a.search("Idk",one));
    }

}
