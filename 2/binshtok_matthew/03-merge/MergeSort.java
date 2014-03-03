public class MergeSort{

    public int[] merge( int[] r1, int[] r2 ){
	int total = r1.length + r2.length;
	int[] merged = new int[total];
	int r1index = 0;
	int r2index = 0;
	int i = 0;
	while (i < total){
	    
	    while (r1[r1index] < r2[r2index]){
		merged[i] = r1[r1index];
		r1index++;
		i++;
	    }
	    while (r1[r1index] > r2[r2index]){
		merged[i] = r2[r2index];
		r2index++;
		i++;
	    }
	    boolean brk = false;
	    while (r1[r1index] == r2[r2index] || !brk){
		merged[i] = r1[r1index];
		merged[i] = r2[r2index];
		i+=2;
		r1index++;
		r2index++;
		brk = true;
	    }
		
		
	    
	}
	return merged;
    }

    public static void main( String[] args ){
	MergeSort m = new MergeSort();
	int[] a = {1,2,3,4,5};
	int[] b = {3,4,5,6,7};
	int[] c = m.merge(a,b);
	System.out.println(c);
    }

}
