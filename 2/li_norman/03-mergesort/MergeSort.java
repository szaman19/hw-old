import java.util.ArrayList;

public class MergeSort
{
    // Sort Method
    // Returns Sorted Version of ArrayList
    // Leaves Original Intact
    public static ArrayList<Integer> sort(ArrayList<Integer> input)
    {    
        if (input.size() > 1)
        {
            ArrayList<Integer> left = new ArrayList<Integer>();
            ArrayList<Integer> right = new ArrayList<Integer>();
            ArrayList<Integer> L = new ArrayList<Integer>();
            ArrayList<Integer> R = new ArrayList<Integer>();
            int divider = input.size() / 2;
            
            for (int i = 0; i < divider; i++)
                left.add( input.get(i) );
            for (int j = divider; j < input.size(); j++)
                right.add( input.get(j) );
                
            L = sort( left );
            R = sort( right);
            
            input = merge( L, R );
            
            return input;
        }
        else
            return input;
    }
    
    // Merge Method
    private static ArrayList<Integer> merge(ArrayList<Integer> a1, ArrayList<Integer> a2)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        while ( (a1.size() != 0) &&
                (a2.size() != 0) )
        {
            if ( a1.get(0) >= a2.get(0) )
                result.add( a1.get(0) );
            else
                result.add( a2.get(0) );
        }
        
        if ( a1.size() == 0 )
        {
            for (Integer i : a2)
                result.add(i);
        }
        else
        {
            for (Integer i : a1)
                result.add(i);
        }
        
        return result;
    }
    
    // Main Method
    public static void main( String[] args )
    {
        ArrayList<Integer> test = new ArrayList<Integer>();
        
        for (int i = 0; i < 25; i++)
            test.add( (int) (10 + Math.random() * 10) );
        
        System.out.println("Original:\n" + test + "\n");
        System.out.println("Sorted:\n" + sort(test) + "\n");
        System.out.println("After (Unchanged):\n" + test + "\n");
    }
}