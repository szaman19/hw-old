public class MergeTest{

    public static void main(String[]args){
	MergeSort merge = new MergeSort();
	
	int[] test = new int[100000];
	
	for(int i = 0; i < test.length; i++){
	    test[i] = (int)(Math.random() * 10000);
	}
	
	test = merge.mergeSort(test);
    }
}