import java.util.Random;
import java.util.Arrays;
public class Driver{

    public static void main(String[]args){
	Random rand = new Random();
	int[] a = new int[100];
	for(int x = 0; x < 100; x ++)
	    a[x] = rand.nextInt(1000);
	QuickSort b = new QuickSort();
	System.out.println(Arrays.toString(a));
	a = b.sort(a);
	System.out.println(Arrays.toString(a));
    }


}
