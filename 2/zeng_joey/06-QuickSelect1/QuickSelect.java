
public class QuickSelect{
    
    public static int quickselect(int[] a, int k, int low, int high){
	if (low >=high)
	    return a[low];
	else{
	    int p = (int)((high - low + 1)*Math.random());
	    int pivot = a[p];
	    int[] b = new int[a.length];
	    int left = low;
	    int right = high;
	    for(int i = low; i <= high; i++){
		if (i == p){}
		else if(a[i] >= pivot)
		    b[right--] = a[i]; 
		else
		    b[left++] = a[i];
	    }
	    b[right] = pivot;
	    
	    for( int i : b){
		System.out.print(i + " ");
	    }
	    System.out.println("\n" + right + " " + left + "\n");
	    
	    if (right == k)
		return b[right];
	    else if (right > k){
	        return quickselect(b, k, low, right-1);
	    }	
	    
	    else{
		return quickselect(b, k, right, high);
	    }
	    
	    
	}
    }
    
    public static void main(String[] args){
	int[] a = {2,1,6,4,16,12,24,13,15};
	System.out.println(quickselect(a, 6, 0, 8));
    }
}
