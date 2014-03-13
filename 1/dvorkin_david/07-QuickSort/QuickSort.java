public class QuickSort{

	public void quickSort(int[] a, int low, int high){//not sure how to do it, will hopefully fix when we go over it! Don't understand .toArray

	int x = 0; int y = 0; int z = 0; int p = 0;
	
	int[] b = new int[a.length/2];
	
	int [c] = new int [a.length/2]
	
	Random generator = new Random();

	if (low >= high){

		return low;

	    }

	else{

	    p = a[high - generator.nextInt(low)];
	    
	    for (int i = 0; i < a.length; i++){

		if (a[i] < p){

		    b[y] = a[i];

			y++;

			}

		if (a[i] > p){

		    c[z] = a[i];
		    
		    z++;
	
		}

		else {

		    b[a.indexOf(p)] = p;

		}
	    
	    }

	    for (int j = 0; j < b.length; j++){
		
		a[j] = b[j];

	    }

	    if (p == k){

		return a.indexOf(p);

	    }

	    else if (p < k){

		low = p;

		quicksort(a, low, high);

	    }

	    else if (p > k){

		high = p;

		quicksort (a, low, high);

	    }
	
	}

	return a.indexOf(k);

    }

}
