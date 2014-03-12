public class BinarySearch{


    private int a = L.length/2;
    private int temp = 1;
    private int counter = 2;

    public int rbsearch (int n, int[] L){ //Not fully working; won't return -1 if its out of list or the first/lastelements of the list (works otherwise).
	if (L[a]==n){
	    return a;
	}
	else if (L[a] < n){
	    counter = counter * 2;
	    temp = L.length() / counter;
	    a = a + temp;
	    rbsearch(n, L);
	}
	else if (L[a] > n){
	    counter = counter * 2;
	    temp = L.length() / counter;
	    a = a - temp;
	    rbsearch (n, L);
	}
    }

    int c, first, last, middle, n, search;


    public int rbsearch2 (int search, int[] array){
	first  = 0;
	int n = array.length;
	last   = n - 1;
	middle = (first + last)/2;

	while( first <= last )
            {
                if ( array[middle] < search )
                    first = middle + 1;
                else if ( array[middle] == search )
		    {

			break;
		    }
                else
                    last = middle - 1;

                middle = (first + last)/2;
            }
	if ( first > last )
	    return -1;
	return middle;
    }


    public static void main(String[] args) {

        int[] array=new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=100+i;
        }
	BinarySearch b = new BinarySearch();

	int d = b.rbsearch2(101, array);
	System.out.println(d) ;
    }
}
}
