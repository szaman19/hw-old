import java.util.ArrayList;
import java.util.Random;

public class MergeSort {

    public static ArrayList<Comparable> mergesort(ArrayList<Comparable> ary) {
        if (ary.size() <= 1)
            return ary;

        int half = ary.size() / 2;

        ArrayList<Comparable> ary1 = new ArrayList<Comparable>();
        for (int i = 0; i < half; i++) {
            ary1.add(ary.get(i));
        }

        int otherHalf = ary.size() - half;
        ArrayList<Comparable> ary2 = new ArrayList<Comparable>();
        for (int i = 0; i < otherHalf; i++) {
            ary2.add(ary.get(half + i));
        }

        return merge(mergesort(ary1), mergesort(ary2));
    }

    private static ArrayList<Comparable> merge(ArrayList<Comparable> ary1, ArrayList<Comparable> ary2) {
        ArrayList<Comparable> ary = new ArrayList<Comparable>();
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

    private static boolean verifySortedness(ArrayList<Comparable> ary) {
        for (int i = 1; i < ary.size(); i++) {
            if (ary.get(i).compareTo(ary.get(i-1)) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int length = 10;
        int maxVal = 21;
        ArrayList<Comparable> ary = new ArrayList<Comparable>();

        for (int i = 0; i < length; i++) {
            Integer n = r.nextInt(maxVal);
            String s = Long.toHexString(Double.doubleToLongBits(Math.random()));
            ary.add(new Person(n, s));
        }

        ary = mergesort(ary);

        if (verifySortedness(ary)) {
            System.out.println("Success");
        } else {
            System.out.println("You dun goofed");
        }
    }
}