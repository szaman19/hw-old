public class Driver{

    public static void main(String[]args){

	Merge merge = new Merge();

	int[] a = {1,4,5,6,8,10,100};
	int[] b = {7,10,12,13,14,15};

	int[] ans = merge.merge(a,b);
	
	for(int i = 0; i<ans.length; i++){
	    System.out.println(ans[i]);
	}
    }
}