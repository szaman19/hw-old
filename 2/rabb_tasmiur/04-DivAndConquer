
import java.util.ArrayList;
import java.util.Scanner;
 
 
public class MergeSort {
 
    private ArrayList<String> StringList;
 
 
    public MergeSort(ArrayList<String> input)
    {
        StringList = new ArrayList<String>();
        for(int i=0; i<input.size(); i++)
        {
            StringList.add(input.get(i));
        }
    }
 
    public void sort()
    {
 
        StringList = mergeSort(StringList);
 
    }
 
    public ArrayList<String> mergeSort(ArrayList<String> W)
    {
        ArrayList<String> left = new ArrayList<String>();
        ArrayList<String> right = new ArrayList<String>();
        int mid;
 
        if(W.size()==1)   
            return W;
        else
        {
            mid = W.size()/2;
            // copy the left half
            for(int i=0; i < mid; i++)
            {
		left.add(W.get(i));
            }
 
            //copy the right half 
            for(int i = mid; i < W.size(); i++)
            {
                    right.add(W.get(i));
            }
 
            // Sort the left and right 
            left  = mergeSort(left);
            right = mergeSort(right);
 
 
            // Merge the results back together.
            merge(left,right,W);
 
        }
        return W;
    }
 
    // Merging sorted ArrayLists together
    private void merge(ArrayList<String> left, ArrayList<String> right,
            ArrayList<String> W) {
 
        int leftIndex = 0;
        int rightIndex = 0;
        int WIndex = 0;
 
        while (leftIndex < left.size() && rightIndex < right.size())
        {
            if ((left.get(leftIndex).compareTo(right.get(rightIndex)))<0)
            {
                W.set(WIndex,left.get(leftIndex));
                leftIndex++;
            }
            else
            {
                W.set(WIndex, right.get(rightIndex));
                rightIndex++;
            }
            WIndex++;
        }
	// When either array is done being iterated
        ArrayList<String>rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            rest = right;
            restIndex = rightIndex;
        }
        else {
            rest = left;
            restIndex = leftIndex;
        }
        for (int i=restIndex; i<rest.size(); i++) {
            W.set(WIndex, rest.get(i));
            WIndex++;
        }
    }
 
    public void show()
    {
        System.out.println("Sorted:");
        for(int i=0; i< StringList.size();i++)
        {
            System.out.println(StringList.get(i));
        }
 
    }
 
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter Strings, type x for exit:");
        String str = sc.nextLine();
 
        while(!str.equals("x"))
        {
            input.add(str);
            str = sc.nextLine();
        }
        System.out.println("_____________________");
        MergeSort srt = new MergeSort(input);
        srt.sort();
        srt.show();
    }
 
}
