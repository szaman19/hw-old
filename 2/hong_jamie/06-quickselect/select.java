public class select{

    //this just finds the index of k
    private static int find(int[]a, int k){
	while (int i = 0; i < a.length; i++){
	    if (a[i] = k){
		reutn i;
	    }
	}return -1;
    }
    //my quick sort doesnt work if theres a zero in the original array. but it could possible work if I made all the ints in int[]b -1 before i start to move the ints from a to b
    public static int quickSelect(int[]a, int k, int low, int high){
	int half = (high - low) /2 + low);
	int rand = a[half];
	if (low > = high){
	    return low;
	}else{
	    int[]b = new int[a.length];
	    int l = 0;
	    int h = a.length -1;
	    while (int i = 0; i <a.length; a++){
		if (a[i] > rand){
		    b[h] = rand;
		    h = h -1;
		}if(a[i] < rand){
		    b[l] = a[i];
		    l = l +1;
		}
	    }
	    int count = 0;
	    while (find(b, 0) != -1){
		b[find(b, 0)] = rand;
		count++;
	    }
	    if (abs(find(b, rand) - k) < count){
		return find(b, rand);
	    }else{
		if (find(b, rand) > k){
		    return quickSelect (b, k, low, high - find(b, rand));
		}else{
		    return quickSelect(b, k, low + find(b, rand), high);
		} 
	    }
	}
    }
}