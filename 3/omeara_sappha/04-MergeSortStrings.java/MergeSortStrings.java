import java.util.*;

public class MergeSortStrings {

    public static ArrayList<String> mergesort(ArrayList<String> L) {
        if (L.size() <= 1)
            return L;

        int half1 = L.size() / 2;

        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i < half1; i++) {
            a.add(L.get(i));
        }

        int half2 = L.size() - half1;
        ArrayList<String> b = new ArrayList<String>();
        for (int i = 0; i < half2; i++) {
            b.add(L.get(half1 + i));
        }

        return merge(mergesort(a), mergesort(b));
    }

    private static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b) {
        ArrayList<String> L = new ArrayList<String>();
        int i, j, x;
        i = j = x = 0;

        // Until one array is finsihed, take the smaller one
        while (i < a.size() && j < b.size()) {
            if (a.get(i).compareTo(b.get(j)) < 0) {
                L.add(a.get(i));
                i++;
            } else {
                L.add(b.get(j));
                j++;
            }
            i++;
        }

        //one array is finished --> finish the other one

        while (i < a.size()) {
            L.add(a.get(i));
            x++;
            i++;
        }

        while (j < b.size()) {
            L.add(b.get(j));
            j++;
            x++;
        }
        
        return L;
    }
        
    public static void main(String args){
        
    }
    
}
