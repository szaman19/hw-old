import java.util.ArrayList;

public class MergeSort
{
    // Merge Method
    public ArrayList<Integer> merge(ArrayList<Integer> a1, ArrayList<Integer> a2)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        while ( (a1.size() != 0) &&
                (a2.size() != 0) );
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
}