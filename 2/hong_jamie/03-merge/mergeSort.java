public class mergeSort{

    public int[] split(int[]array){
	if (array.length > 1){
	    int[] a = new int[array.length/2];
	    for (int i = 0; i < array.length/2; i++){
		a[i] = array[i];
	    }
	    if (array.length% 2 = 1){
		int []b = new int[array.length/2 +1];
		int count = 0;
		for (int i = array.length/2; i < array.length; i++){
		    b[count] = array[i];
		    count ++;
		}
	    }
	    }else{
	    	for (int i = 0; i < array.length/2; i++){
		    array[i] =  array[array.length/2+i];
		}
		a = split (a);
		b = split (b);
	int[]L = new int[array.length];
	L = sort(a,b);
    }

    public int[] merge(int[]a, int[]b){
	int []L = new int[a.length + b.length];
	int aIndex = 0;
	int bIndex = 0;
	for (int i = 0; i < a.length + b.length; i++){
	    if (a[aIndex] > b[bIndex]){
		L[i] = a[aIndex];
		aIndex++;
	    }else{
		L[i] = b[bIndex];
		bIndex++;
	    }

	}
    }