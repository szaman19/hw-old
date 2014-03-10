public class binarySearch{
    //only for sorted lists


    public static int rbsearch(int n, int[] L){
	int avr = L.length/2;
	if (L.length <= 1)
	    return -1;
	if (n == L[avr])
	    return avr;
	int[] h1 = new int[avr];
	for (int i = 0; i < h1.length; i++)
	    h1[i] = L[i];
	int[] h2 = new int[L.length - h1.length];
	for (int i = 0; i < h2.length; i++)
	    h2[i] = L[i+avr];
	int a = rbsearch(n, h1);
	if (a == -1)
	    a = rbsearch(n, h2);
	return a;
    }

    public static int ibsearch(int n, int[] L){
        return -1;
    }

    public static void main(String[] args){
	int[] a = new int[10];
	for (int i = 0; i < 10; i++)
	    a[i] = i;
	mergeSort b = new mergeSort();
	a = b.mergeSort(a);
	for (int i = 0; i < 10; i++)
	    System.out.print(a[i] + ", ");
	System.out.println();
	System.out.println(rbsearch(6,a));
    }
}
