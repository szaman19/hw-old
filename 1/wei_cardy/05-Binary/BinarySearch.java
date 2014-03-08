public class BinarySearch{
	    public static int rbSearch( int[] a, int target, int lo, int hi ) {
        int tPos = -1; 
        int m = (lo + hi) / 2; 
        if (lo > hi) {
            tPos=-1;}
        if ( a[m] == target ){ 
            tPos=m;}
        else if ( a[m] > target ){ 
            hi=m;
            rbSearch(a,target,lo,hi);}
        else if ( a[m] < target ){ 
            lo=m;
            rbSearch(a,target, lo, hi);}
        return tPos;
    }


    public static int ibSearch( int[] a, int target, int lo, int hi ) {
        int tPos = -1; 
        int m = (lo + hi) / 2; 
        while( lo <= hi ) { 
            m = (lo+hi)/2; 
            if ( a[m] == target ){
                tPos=m;}
            else if ( a[m]<target) {
                hi=m;}
            else if ( a[m]>target ){
                lo=m;
            }      
        }
        return tPos;
    }

    public static void main(String[] args){
    	int[] a={1,2,3,4,5,6,7,8,9,10,11};
    	System.out.print(ibSearch(a, 4, 0, a.length-1));
    }
}//Does not work perfectly
