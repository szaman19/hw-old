import java.util.ArrayList;
public class MergeSort{

    public int[] msort(int[] L){
	int[] a = new int[L.length / 2];
	int[] b;
	if ((L.length % 2) == 0){
	    b = new int[L.length / 2];
	}
	else{
	    b = new int[(L.length / 2) + 1];
	}
	if (L.length <= 1){
	    return L;
	}
	
	else{
	    for (int x = 0; x < L.length; x++){
		if (x < a.length){
		    a[x] = L[x];
		}
		else{
		    b[x] = L[x];
		}
	    }
	    int[] c = msort(a);
	    int[] d = msort(b);
	    L = merge(c,d);
	    return L;
	}
    }public int[] merge(int[]a,int[]b){
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
	
}
