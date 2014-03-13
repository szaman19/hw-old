import java.util.Random;
import java.util.Arrays;

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
        int n = 10;
        int k = 1;
    
        try
        {
            n = Integer.parseInt( arg[0] );
            k = Integer.parseInt( arg[1] );
        }
        catch (NumberFormatException e) {}
        catch (ArrayIndexOutOfBoundsException e) {}
    
        Random rnd = new Random();
        int[] test = new int[n];
        
        for (int i = 0; i < n ; i++)
            test[i] = rnd.nextInt(100);
        
        String s = "Array: " + Arrays.toString(test);

        s += ( "\n#" + k + ": " + quickselect(test, k) ); 
        
        System.out.println(s);
    }
}