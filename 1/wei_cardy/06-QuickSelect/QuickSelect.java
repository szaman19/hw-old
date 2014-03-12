import java.util.*;

public class QuickSelect{
    public static int quickselect(int[] a, int k, int low, int high){
		if(low>=high){
		    return a[low];
		}
		int[] b=new int[a.length];
		Random r=new Random();
		int p=a[r.nextInt(high-low)+low];
		int c=0;
		int d=a.length-1;
		int e=0;
		for(int i=0;i<a.length;i++){
		    if(a[i]<p){
			b[c]=a[i];
			c++;
		    }else if(a[i]>p){
			b[d]=a[i];
			d--;
		    }else{
			e++;
		    }
		}
		for(int i=0;i<e;i++){
		    b[c]=p;
		    if(c==k-1){
			return b[c];
		    }
		    c++;
		}
		c--;
		if(c>k-1){
		    high=c-1;
		}else{
		    low=c+1;
		}
		return quickselect(b,k,low,high);
    }
    public static void main(String[] args){
		int[] a={2, 423,4, 3, 42,43,2,34,23, 423,46,24,24 ,432,24};
		System.out.println(quickselect(a,5,0,a.length-1));
    }
}