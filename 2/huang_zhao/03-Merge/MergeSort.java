public class MergeSort{
    public int[] merge(int[]d,int[]p){
	int size = 0;
	int size1 = 0;
	
	int[] sorted = new int[d.length+p.length];
	for (int z =0;z < d.length+p.length;z++){
	    if (size == d.length){
		sorted[z]= p[size1];
		size1++;
	    }
	    else if (size1 == p.length ){
		sorted[z]= d[size];
		size++;
	    }
	    else if (d[size]<=p[size1]){
		sorted[z]=d[size];
		size++;
	    }
	    else{
		sorted[z]= p[size1];
		size1++;
	    }
	}
	return sorted;
    }
    public static void main (String[] args){
	int[]test1= new int[5];
	int[]test2 = new int[5];
	MergeSort p = new MergeSort();
	for (int d =0;d<5;d++){
	    test1[d]= d+3;
	    test2[d]= d+6;
	}
	int[]dd = p.merge(test1,test2);
	for (int d =0;d<10;d++){
	    System.out.println(dd[d]);
	}
    }
}
	    