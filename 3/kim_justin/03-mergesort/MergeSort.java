import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static int[] mergesort(int[] ary) {
        if (ary.length <= 1)
            return ary;

        int half = ary.length / 2;
        // int[] ary1 = Arrays.copyOfRange(ary, 0, half);
        // int[] ary2 = Arrays.copyOfRange(ary, half, ary.length);

        int[] ary1 = new int[half];
        for (int i = 0; i < half; i++) {
            ary1[i] = ary[i];
        }

        int otherHalf = ary.length - half;
        int[] ary2 = new int[otherHalf];
        for (int i = 0; i < otherHalf; i++) {
            ary2[i] = ary[half + i];
        }

        return merge(mergesort(ary1), mergesort(ary2));
    }

    private static int[] merge(int[] ary1, int[] ary2) {
        int length = ary1.length + ary2.length;

        int[] ary = new int[length];
        int index1, index2, i;
        index1 = index2 = i = 0;

        // Until one array is exhausted, take the lesser of each half
        while (index1 < ary1.length && index2 < ary2.length) {
            if (ary1[index1] < ary2[index2]) {
                ary[i] = ary1[index1];
                index1++;
            } else {
                ary[i] = ary2[index2];
                index2++;
            }
            i++;
        }

        // Fill the rest of the return array

        while (index1 < ary1.length) {
            ary[i] = ary1[index1];
            i++;
            index1++;
        }

        while (index2 < ary2.length) {
            ary[i] = ary2[index2];
            i++;
            index2++;
        }

        // for (int i = 0; i < length; i++) {
        //     if (index1 == ary1.length) {
        //         // copy ary2[index2-ary2.length] to array
        //         continue;
        //     }
        //     if (index2 == ary2.length) {
        //         // copy ary1[index1-ary1.length] to array
        //         continue;
        //     }

        //     if (ary1[index1] <= ary2[index2]) {
        //         ary[i] = ary1[index1];
        //         index1++;
        //     } else {
        //         ary[i] = ary2[index2];
        //         index2++;
        //     }
        // }
        
        return ary;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int length = 1000001;
        int maxVal = 2147000000;
        int[] ary = new int[length];

        for (int i = 0; i < length; i++) {
            ary[i] = r.nextInt(maxVal);
        }

        int[] myary = Arrays.copyOf(ary, length);

        Arrays.sort(ary);
        myary = mergesort(myary);

        if (Arrays.equals(ary, myary)) {
            System.out.println("Success");
        } else {
            System.out.println("You dun goofed");
        }
    }
}