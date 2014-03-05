import java.util.ArrayList;

public class MergeSort {

    public static ArrayList<String> mergesort(ArrayList<String> ary) {
        if (ary.size() <= 1)
            return ary;

        int half = ary.size() / 2;

        ArrayList<String> ary1 = new ArrayList<String>();
        for (int i = 0; i < half; i++) {
            ary1.add(ary.get(i));
        }

        int otherHalf = ary.size() - half;
        ArrayList<String> ary2 = new ArrayList<String>();
        for (int i = 0; i < otherHalf; i++) {
            ary2.add(ary.get(half + i));
        }

        return merge(mergesort(ary1), mergesort(ary2));
    }

    private static ArrayList<String> merge(ArrayList<String> ary1, ArrayList<String> ary2) {
        ArrayList<String> ary = new ArrayList<String>();
        int index1, index2, i;
        index1 = index2 = i = 0;

        // Until one array is exhausted, take the lesser of each half
        while (index1 < ary1.size() && index2 < ary2.size()) {
            if (ary1.get(index1).compareTo(ary2.get(index2)) < 0) {
                ary.add(ary1.get(index1));
                index1++;
            } else {
                ary.add(ary2.get(index2));
                index2++;
            }
            i++;
        }

        // Fill the rest of the return array

        while (index1 < ary1.size()) {
            ary.add(ary1.get(index1));
            i++;
            index1++;
        }

        while (index2 < ary2.size()) {
            ary.add(ary2.get(index2));
            i++;
            index2++;
        }
        
        return ary;
    }

    public static void main(String[] args) {
    }
}