public class Binary {

    public static int recSearch( int[] a, int target, int low, int high ) {
        int position = -1; 
        int m = (low + high) / 2; 
        if (low > high) {
            return -1;
        }
        if ( a[m] == target ){
            position=m; 
        }
        else if ( a[m] > target ){ 
            high=m-1;
            recSearch(a,target,low,high);
        }
        else if ( a[m] < target ){ 
            low=m+1;
            recSearch(a,target, low, high);
        }
        return position;
    }

    public static int iterSearch( int[] a, int target) {
        int low = 0;
        int high = a.length-1;
        int position = -1; 
        int m = (low + high) / 2; 
        while( low <= high ) { 
            m = (low+high)/2; 
            if ( a[m] == target ){
                position=m;
                break;
            }
            else if ( a[m]<target) {
                low=m+1;
            }
            else if ( a[m]>target ){
                high=m-1;
            }      
        }
        return position;
    }
}
