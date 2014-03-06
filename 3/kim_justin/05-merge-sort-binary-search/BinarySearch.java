import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    /**
     * Returns the index of value n in array L.
     */
    public static int rbsearch(int n, int[] L) {
        if (L.length == 1) {
            return L[0] == n ? 0 : -1;
        }

        // Base case: n exists at half-point
        int half = L.length / 2;
        int halfVal = L[half];
        if (halfVal == n) {
            return half;
        } else if (halfVal > n) {
            return rbsearch(n, Arrays.copyOfRange(L, 0, half));
        } else {
            return half + rbsearch(n, Arrays.copyOfRange(L, half, L.length));
        }
    }

    /**
     * Returns the index of value n in array L
     */
    public static int ibsearch(int n, int[] L) {
        boolean found = false;
        int index = L.length / 2;

        while (!found) {
            if (L[index] == n) {
                found = true;
            } else if (L[index] > n) {
                index /= 2;
            } else {
                index += (L.length - index) / 2;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Random r = new Random();
        int length = 1000000;
        int maxVal = 2147000000;
        int[] ary = new int[length];

        for (int i = 0; i < length; i++) {
            ary[i] = r.nextInt(maxVal);
        }

        ary = MergeSortInt.mergesort(ary);

        int index = 50000;
        if (ary[index] == ary[ibsearch(ary[index], ary)]) {
            System.out.println("Success");
        } else {
            System.out.println("You dun goofed");
            System.out.println(ibsearch(ary[index], ary));
            System.out.println(Arrays.toString(ary));
        }
    }
}