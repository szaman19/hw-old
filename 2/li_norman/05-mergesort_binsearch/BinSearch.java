public class BinSearch
{
    // BinSearch Static Method
    public static int binSearch ( Comparable[] a, Comparable target )
    {
        //return binSearchIter( a, target, 0, a.length-1 );
        return binSearchRec( a, target, 0, a.length-1 );
    }
    
    // Binary Search Recursive Method
    private static int binSearchRec( Comparable[] a, Comparable target, int lo, int hi )
    {
        int index = ( hi + lo) / 2;
        
        if ( a[index].compareTo( target ) < 0 )
            return binSearchRec( a, target, index + 1, hi );
        else if ( a[index].compareTo( target ) > 0 )
            return binSearchRec( a, target, lo, index - 1);
        else if ( a[index].equals(target) )
            return index;
        else
            return -1;
    }
    
    // Binary Search Iterative Method
    private static int binSearchIter( Comparable[] a, Comparable target, int lo, int hi )
    {
        int index = ( hi + lo ) / 2;
        
        while ( (! a[index].equals(target) ) && ( lo <= hi ) )
        {
            if ( a[index].compareTo( target ) < 0 )
                lo = index + 1;
            else if ( a[index].compareTo( target ) > 0 )
                hi = index - 1;
                
            index = ( hi + lo ) / 2;
        }
        
        if ( lo <= hi )
            return index;
        else
            return -1;
    }
}