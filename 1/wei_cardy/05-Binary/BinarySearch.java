public class BinarySearch{

    /*my iterative version is working perfectly, but my recursive still has a eally strange problem. I already ran it through an online program 
    called Java Tutor which gives a step by step on how it runs, and for some reason at the end, I get the correct return position which is 
    suppoed to be 3, but then for some reason, after it gets to the line to return, the code goes backwards, and begins the recursive all over again,
    which results in a negative one, because after that recursive, it hits the base case and position=-1;. I do not understand why it does this.*/

    public static int rbSearch( int[] a, int target, int low, int high ) {
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
            rbSearch(a,target,low,high);
        }
        else if ( a[m] < target ){ 
            low=m+1;
            rbSearch(a,target, low, high);
        }
        return position;
    }

    public static int ibSearch( int[] a, int target) {
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

    public static void main(String[] args){
    	int[] a={1,2,3,4,5,6,7,8,9,10,11};
    	System.out.println(ibSearch(a, 4));
        System.out.println(rbSearch(a, 4, 0, a.length-1));
    }
}