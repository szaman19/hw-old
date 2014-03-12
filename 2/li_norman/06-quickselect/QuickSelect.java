public class QuickSelect
{
    // QuickSelect Method (Helper)
    public static int quickselect(int[] a, int k, int low, int high)
    {
        if (low == high)
            return a[high];
        
        // Selection of Pivot Point
        int pIndex = (int) ( low + 1 + Math.random() * (high - low - 1) );
        
        // Setting Pivot to Final Position
        pIndex = partition(a, pIndex, low, high);
        
        if ( k == pIndex )
            return a[k];
        else if ( k < pIndex )
            return quickselect(a, k, low, high - 1);
        else if ( k > pIndex )
            return quickselect(a, k, low + 1, high);
        else
            return -1;
    }
    
    // QuickSelect Method
    public static int quickselect(int[] a, int k)
    {
        return quickselect(a, k - 1, 0, a.length - 1);
    }
    
    // Partition Method
    private static int partition(int[] a, int pIndex, int low, int high)
    {
        int pValue = a[pIndex];
        int index = low;
        
        swap(a, high, pIndex);
        
        for (int i = low; i < high; i++)
        {
            if (a[i] < pValue)
            {
                swap(a, index, i);
                index++;
            }
        }
        
        swap(a, high, index);
        
        return index;
    }
    
    // Swap Method
    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    // Main Method
    public static void main(String[] arg)
    {
        int[] test = new int[] {10, 3, 9, 7, 14, 2, 5, 6, 13, 121, 8, 11};
        int n = 1;
        
        String s = "Array: [";
        
        for (int i : test)
            s += ("" + i + " ");
        
        s = s.substring(0, s.length() - 1);
        
        s += ("]\n" + n + " st/nd/rd/th number: " + quickselect(test, n));
        
        System.out.println(s);
    }
}