public class QuickSearch{
    public int quickselect (int[]a, int k, int low, int high){
        if (low>=high){
            return low+high/2;
        }
        int pivot = a[Math.random()*a.length];
        int[]copy = new int[a.length];
        int pat;
        //not sure how to put the p in the middle
        if (pat == k){
            return copy[k];
        }else{
            int[]copy2 = new int[a-pat];
            return quickselect(copy2,k-pat,pivot,high);
        }
    }
}
