public class QuickSort{
    public int[] quickSort(int[] a, int hi, int lo){
	if (a.length <= 1)
	    return a;
	//select pivot p
	//partition arround p
	b = quickSort(a, low, p-1);
	c = quickSort(b, p+1, hi);
	return c;
    }
}