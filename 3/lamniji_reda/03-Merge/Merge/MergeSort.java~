import java.util.*;
public class MergeSort{

    public int[] merge(int[]a, int[]b){
	int[] ans = new int[a.length + b.length];
	int ia = 0;
	int ib = 0;
	for(int i = 0; i < (ans.length - 1); i++){
	    if (a[ia] <= b[ib]){
		ans[i] = a[ia];
		ia++;
	    }else{
		ans[i] = b[ib];
		ib++;}
	}
	if(a[a.length-1] > b[b.length -1]){
	    ans[ans.length -1] = a[a.length -1];
	}else{
	    ans[ans.length -1] = b[b.length -1];}
	return ans;
    }

    public static void main(String[] arrrgs){
	MergeSort a = new MergeSort();
	int[]one = {1,2,4,7,8,11,15};
	int[]two = {2,2,2,8,8,11,19};
	int[]three = a.merge(one, two);
	System.out.println(Arrays.toString(three));
}

}
