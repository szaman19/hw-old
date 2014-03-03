public class Driver{

    public static void main(String[]args){

	MergeSort merge = new MergeSort();

	int[] a = {1,4,5,6,8,10,100};
	int[] b = {7,10,12,13,14,15};

	int[] ans = merge.merge(a,b);
	
	for(int i = 0; i<ans.length; i++){
	    System.out.println(ans[i]);
	}
	
	int[] test = new int[100];
	
	for(int i = 0; i < 100; i++){
	    test[i] = (int)(Math.random() * 1000);
	}

	test = merge.mergeSort(test);
	System.out.println();
	
	for(int i = 0;i<test.length;i++){
	    System.out.print(test[i] + ", ");
	}
	
    }
}