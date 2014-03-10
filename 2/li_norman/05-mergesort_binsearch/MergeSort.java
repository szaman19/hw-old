import java.util.ArrayList;

public class MergeSort
{
    // Sort Method
    // Returns Sorted Version of ArrayList
    // Leaves Original Intact
    public static ArrayList<Comparable> sort(ArrayList<Comparable> input)
    {    
        if (input.size() > 1)
        {
            ArrayList<Comparable> left = new ArrayList<Comparable>();
            ArrayList<Comparable> right = new ArrayList<Comparable>();
            int divider = input.size() / 2;
            
            for (int i = 0; i < divider; i++)
                left.add( input.get(i) );
            for (int j = divider; j < input.size(); j++)
                right.add( input.get(j) );
            
            left = sort(left);
            right = sort(right);
            
            input = merge( left, right );
            
            return input;
        }
        else
            return input;
    }
    
    // Merge Method
    private static ArrayList<Comparable> merge(ArrayList<Comparable> a1, ArrayList<Comparable> a2)
    {
        ArrayList<Comparable> result = new ArrayList<Comparable>();
        
        while ( (a1.size() > 0) &&
                (a2.size() > 0) )
        {
            if ( a1.get(0).compareTo( a2.get(0) ) <= 0 )
                result.add( a1.remove(0) );
            else
                result.add( a2.remove(0) );
        }
        
        while (a1.size() > 0)
            result.add( a1.remove(0) );
        while (a2.size() > 0)
            result.add( a2.remove(0) );
        
        return result;
    }
}