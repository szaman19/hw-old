import java.util.*;
public class Quick{
    private static int pivot;
    public static int quickSelect(int[] a, int k, int low, int high){
	if(low >= high){
	    return a[high];
	}else{
	    ArrayList<Integer> left = new ArrayList();
	    ArrayList<Integer> right = new ArrayList();
	    Random rand = new Random();
	    pivot = a[rand.nextInt(high - low)];
	    for(int i = 0;i < a.length; i++){
		if (a[i]<Arrays.asList(a).indexOf(pivot)){
		    left.add(a[i]);
		}		
	    }
	    for(int i = 0;i < a.length; i++){
		if (a[i]>Arrays.asList(a).indexOf(pivot)){
		    right.add(a[i]);
		}		
	    }
	    int ai = 0;
	    for(int i = 0;i < left.size(); i++){
		a[ai] = left.get(i);
		ai++;
	    }
	    a[ai] = pivot;
	    for(int i = 0; i < right.size(); i++){
		a[ai] = right.get(i);
		ai++;
	    }       
	    if(Arrays.asList(a).indexOf(pivot)==k){
		return pivot;
	    }else{
		if(Arrays.asList(a).indexOf(pivot)>k){
		    quickSelect(a,k,0,left.get(left.size() - 1));
		}else if(Arrays.asList(a).indexOf(pivot)<k){
		    quickSelect(a,k,pivot,a.length-1);
		}
	    }
	}
       
    }

    public static void main(String[] arrgs){
	Quick x = new Quick();
	int[] a = {4,87,5,1,4,75,12,13,45,17};
	System.out.println(x.quickSelect(a, 5, 0, a.length-1));
    }

}
