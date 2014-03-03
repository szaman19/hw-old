import java.util.*;

public class MergeSort{

    public int[] merge(int[] a, int[] b){
		int[] bigger=new int[a.length+b.length];
		int c=0;
		int d=0;
		for (int x=0;x<bigger.length;x++){
		    if (c==a.length){
				bigger[x]=b[d++];//if the entire array, a, has been added to bigger, start adding values in b.
		    }
		    else if (d==b.length){
				bigger[x]=a[c++];//if the entire array, b, has been added to bigger, start adding values in a.
		    }
		    else if (a[c]<b[d]){
				bigger[x]=a[c++];
		    }
		    else {
				bigger[x]=b[d++];
		    }
		}
		return bigger;
    }
    
    public int[] mergesort(int[] a){
		if (a.length==1){
		    return a;
		}
		else{
		    int[] b=new int[a.length/2];
		    int[] c=new int[a.length-(a.length/2)];
		    for (int x=0;x<b.length;x++){
				b[x]=a[x];
		    }
		    for (int y=b.length;y<a.length;y++){
				c[y-b.length]=a[y];
		    }
		    return merge(mergesort(b), mergesort(c));
		}
    }

    public static void main(String[] args){
		MergeSort merger=new MergeSort();
		int[] i={1,6,3,5,7,345,45,345,45,76,2,5,3,8,3,6,0,2,6,-45,5,87};
		System.out.println(Arrays.toString(merger.mergesort(i)));
    }
}		    