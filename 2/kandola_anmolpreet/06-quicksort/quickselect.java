

public class quickselect {
    
    //once again, I can't print unless I use this print function from Chris
    
    
    public static void print(int[] a) {
	for (int x:a) {
	    System.out.print(x + ", ");
	}
	System.out.println();
    }

    public static int quickselect(int[] a, int k, int low, int high) {
	if (low >= high) {
	    return low;
	}
	else {
	    int spot = ((low + high)/2);
	    int[] x = new int[a.length];
	    int y;
	    int z = low;
	    int z1 = high;
	    // these values are to use for indexes and comparison below
	    for (y=low;y<spot;y++) {
		if (a[y] < a[spot]) { //finally get this part! This is comparing each element of the array with the pivot and then putting it in a place beofre or after the pivot in the array
		    x[z] = a[y];
		    z++;
		}
		else {
		    x[z1] = a[spot];
		    z1--;
		}
	    }
	    for (y=spot+1;y<=high;y++) {
		if (a[y] > a[spot]) {
		    x[z1] = a[y];
		    z1--;
		}
		else {
		    x[z] = a[y];
		}
	    }
	    x[z1] = a[spot];
	    print(x);
	    if (z == k) {
		return x[z];
	    }
	    else if (x[z] > k) {
		high = z;
	    }
	    else {
		low = z;
	    }
	    return quickselect(x,k,low,high);
	}
    }

    public static void main(String[] args) {
	int[] gsm = new int[7];
	gsm[0] = 3;
	gsm[1] = 2;
	gsm[2] = 12;
	gsm[3] = 15;
	gsm[4] = 6;
	gsm[5] = 7;
	gsm[6] = 1;
	print(gsm);
	System.out.println(quickselect(gsm,7,0,6));
    }
}
//I think there's a problem with the print function I'm using. I don't know why it keeps repeating when it prints.
