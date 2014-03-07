import java.util.Arrays;
import java.util.Random;
import static java.lang.System.out;

public class BinarySearch {
	private static int binarySearchRecursive(int e, int[] a, int n) {
		if (a.length < 1) {return -1;}
		if (e < a[a.length / 2]) {return binarySearchRecursive(e, Arrays.copyOfRange(a, 0, a.length / 2), n);}
		if (e > a[a.length / 2]) {return binarySearchRecursive(e, Arrays.copyOfRange(a, (a.length / 2) + 1, a.length), n + (a.length / 2) + 1);}
		return n + a.length / 2;
	}
	
	public static int binarySearchRecursive(int e, int[] a) {return binarySearchRecursive(e, a, 0);}
	
	public static void main(String[] args) {
		int[] a = new int[11];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {a[i] = random.nextInt(100);}
		a = MergeSort.mergeSort(a);
		int e = a[random.nextInt(a.length)];
		out.println("binarySearchRecursive(" + e + ", " + Arrays.toString(a));
		out.println(binarySearchRecursive(e, a));
		out.println("binarySearchRecursive(-1, " + Arrays.toString(a));
		out.println(binarySearchRecursive(-1, a));
	}
}
