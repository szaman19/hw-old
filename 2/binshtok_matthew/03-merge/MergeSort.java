import static java.util.Arrays.*;

public class MergeSort{

    public int[] merge( int[] r1, int[] r2 ){
	int total = r1.length + r2.length;
	int[] merged = new int[total];
	int r1index = 0;
	int r2index = 0;
	int i = 0;
	while (r1index < r1.length && r2index < r2.length){

		
	    if (r1[r1index] < r2[r2index]){
		merged[i] = r1[r1index];
		r1index++;
		i++;
	    }
	    else if (r1[r1index] > r2[r2index]){
		merged[i] = r2[r2index];
		r2index++;
		i++;
	    }
	    else if (r1[r1index] == r2[r2index]){
		merged[i] = r1[r1index];
		merged[i] = r2[r2index];
		i+=2;
		r1index++;
		r2index++;
	    }

	}
	while (r1index < r1.length){
	    merged[i] = r1[r1index];
	    r1index++;
	    i++;
	}
	while (r2index < r2.length){
	    merged[i] = r2[r2index];
	    r2index++;
	    i++;
	}
	return merged;
    }

    public int[] msort( int[] unsorted ){
	if (unsorted.length == 1){
	    System.out.println(unsorted[0]);
	    return unsorted;
	}
	int s = unsorted.length/2;
	int[] r1 = copyOfRange(unsorted,0,s);
	int[] r2 = copyOfRange(unsorted,s,unsorted.length);
	return merge(msort(r1),msort(r2));
    }

    public static void main( String[] args ){
	MergeSort m = new MergeSort();
	int[] a = {2,6,3,5,1,7,8,3,4,1,2,3,4,1,5,6,1,3,4,6};
	int[] b;
	b = m.msort(a);
	for (int i = 0; i < b.length; i++){
	    if (i < b.length - 1 ){
		System.out.print(b[i] + ",");
	    }
	    else {
		System.out.println(b[i]);
	    }
	}
    }

}
