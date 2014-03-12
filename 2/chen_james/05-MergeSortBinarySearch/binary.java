public class binary {


    public int rbsearch (int n, int[] L){
	return rbsearchmain(n, L, 0, L.length-1);

    }

    public int rbsearchmain (int n, int[] L, int low, int high){
	if (low > high) return -1; 
	int mid = (low + high)/2;
	if (L[mid] == n) return mid;
	else if (L[mid] < n)
	    return rbsearchmain(n, L, mid+1, high);
	else 
	    return rbsearchmain(n, L, low, mid-1);
    }

    public int ibsearch (int n, int [] L) {
	int low = 0;
	int high = L.length - 1;
      while (low <= high) {
         int mid = (low + high)/2;
         if (L[mid] == n)
	     return mid;
         else if (L[mid] < n) 
	     low = mid + 1;
         else 
	     high = mid - 1;
      }
      return -1;
    }




    public static void main (String [] args) {
	binary hello = new binary();
	int[] list = {1,2,3,4,5,6,7,45,35,54,37,38,37,600,876,543,634,5678,837};

	System.out.println (hello.rbsearch(54,list));
	System.out.println (hello.ibsearch(54,list));
	

    }
}
