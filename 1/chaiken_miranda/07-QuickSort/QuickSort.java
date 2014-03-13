import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class QuickSort{


    public Integer[] qsort( Integer[] L){
	if (L.length < =  1){
	    return L;
	}
	else{
	    int pivot  =  (int)(Math.random()*L.length);
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();
	    for( int i = 0; i < L.length; i++ ){
		if (i==pivot){
		}
		else if (L[i] <= L[pivot] ){
		    lower.add(L[i]);
		}
		else if(L[i] > L[pivot]){
		    upper.add(L[i]);
		}
	    }
	    Integer[]up = qsort( upper.toArray(new Integer[]{}) );
	    Integer[]lo = qsort( lower.toArray(new Integer[]{}) );
	    ArrayList<Integer> ret = new ArrayList<Integer>();
	    for(int x:lo){
		ret.add(x);
	    }
	    ret.add( L[pivot] );
	    for(int x:up){
		ret.add(x);
	    }
	    return ret.toArray(new Integer[]{});
	}
    }


    public static void main(String[]args){
	Random r = new Random();
	Integer[] test = new Integer[10];
	for(int i = 0;i<test.length;i++){
	    test[i] = r.nextInt(100);
	}
	QuickSort me = new QuickSort();
	System.out.println(Arrays.toString(me.qsort(test)));
    }
}