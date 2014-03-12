public class QuickSelect{
    public int quickselect(int[] a, int k, int low, int high) {
		if (low >= high) return a[low];
		int pivot = low + (int)(Math.random()*(high - low));
		System.out.print("Pivot: " + pivot);
		System.out.print("  L: " + low);
		System.out.print("  H: " + high);
		int[] b = new int[a.length];
		int x = low;
		int y = high;
		for (int i = low; i <= high; i++){
		    if (i != pivot){
				if (a[i] > a[pivot]){
				    b[y] = a[i];
				    y--;
				    System.out.print("  y: " + i);
				} else {
				    b[x] = a[i];
				    x++;
				}
	    	}
		}
		System.out.println("  x: " + x);
		for(int z = 0; z < 10; z++){
			System.out.print(b[z] + ", ");
		}
		System.out.print("\n");
		
		if (k == b[pivot]){
		    return x;
		} else if (k > b[pivot]){
		    return quickselect(b,k,pivot+1,high); 
		} else {
			return quickselect(b,k,low,pivot);
    	}
    }
    
    public static void main(String[] args){
		int[] a = {5,6,1,2,8,7,4,9,3,10};
		for(int x = 0; x < 10; x++ ){
			System.out.print(a[x] + ", ");
		}
		System.out.print("\n");
		QuickSelect q = new QuickSelect();
		
		System.out.println("5 is at " +  q.quickselect(a, 5, 0, a.length - 1));
    }
}