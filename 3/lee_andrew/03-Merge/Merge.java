import java.io.*;
import java.util.*;

public class Merge{
    public int[] merge(int[]a,int[]b){
	int total = a.length+b.length;
	int[] ans = new int[total];
	int counta = 0;
	int countb = 0;
	for (int i=0;i<total;i++){
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

    public static void main(String[] args){
	Merge m = new Merge();
	int[] a = {1,3,5,7};
	int[] b = {2,3,4,8};
	System.out.println(Arrays.toString(m.merge(a,b)));
    }
}
