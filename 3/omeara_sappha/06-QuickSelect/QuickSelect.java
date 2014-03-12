public class QuickSelect{
  
  public int quickselect(int[] a, int k, int low, int high){
    //first call: low = 0 high = the last index in the array
    /*1. if low >= high return where they meet - that will be the answer.
    2.Select a random pivot value p
    3. Reorder the array within indices low to high such that within that range,
       all the values less than p are to the left of p and all values greater than p
       are to the right. You might find this easier if you copy the elements into a
       new array then copy them back.
    4. Check to see the index of pivot. If it’s our answer, return it.
    5. If not, adjust low and high and recursively call quickselect. */
  }
  
}
