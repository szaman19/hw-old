import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class QuickSort
{
    // QuickSort Method
    public static Integer[] quicksort(Integer[] a)
    {
        if ( a.length <= 1 )
            return a;
        else
        {
            ArrayList<Integer> left = new ArrayList<Integer>();
            ArrayList<Integer> right = new ArrayList<Integer>();
            
            Integer pIndex = (int) ( Math.random() * (a.length - 1) );
            
            for (Integer i = 0; i < a.length; i++)
            {
                if ( i == pIndex )
                    continue;
                else if ( a[i] <= a[pIndex] )
                    left.add( a[i] );
                else if ( a[i] > a[pIndex] )
                    right.add( a[i] );
            }
            
            left = new ArrayList<Integer>( Arrays.asList( quicksort( left.toArray( new Integer[]{} ) ) ) );
            right = new ArrayList<Integer>( Arrays.asList( quicksort( right.toArray( new Integer[]{} ) ) ) );
            
            ArrayList<Integer> result = left;
            result.add( a[pIndex] );
            result.addAll( right );
            
            return result.toArray( new Integer[]{} );
        }
    }
    
    // Main Method
    public static void main(String[] arg)
    {
        int n = 10;
    
        try
        {
            n = Integer.parseInt( arg[0] );
        }
        catch (NumberFormatException e) {}
        catch (ArrayIndexOutOfBoundsException e) {}
    
        Random rnd = new Random();
        Integer[] test = new Integer[n];
        
        for (int i=0; i<n ;i++)
            test[i] = new Integer( rnd.nextInt(100) );
        
        String s = "Array: " + Arrays.toString(test);

        s += ( "\nSorted: " + Arrays.toString( quicksort(test) ) );
        
        System.out.println(s);
    }
}