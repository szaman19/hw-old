import java.util.*;
public class MergeSort{

    public static int[] merge (int[] nums1, int[] nums2){
	if (nums1.length == 0)
 	    return nums2;
	else if (nums2.length == 0)
	    return nums1;
	int[] ans = new int[nums1.length + nums2.length];
	int a = 0, b = 0;
	for (int i = 0; i < ans.length; i++){
	    if (a >= nums1.length){
		for (;i < ans.length; i++){
		    ans[i] = nums2[b];
		    b++;
		}
		return ans;
	    }
	    else if (b >= nums2.length){
		for (;i < ans.length; i++){
		    ans[i] = nums1[a];
		    a++;
		}
		return ans;
	    }
	    else{
		if (nums1[a] < nums2[b]){
		    ans[i] = nums1[a];
		    a++;
		}
		else{
		    ans[i] = nums2[b];
		    b++;
		}
	    }
	}
	return ans;
    }
    public static void main(String[]args){
        int[] a = new int[100000000];
	int[] b = new int[100000000];
	for (int i = 0; i < a.length; i++){
	    a[i] = (int)(Math.random() * 100);
	    b[i] = (int)(Math.random() * 100);
	}
	Arrays.sort(a);
	Arrays.sort(b);
	long start = System.currentTimeMillis();
	int[] c = merge(a,b);
	long end = System.currentTimeMillis();
	System.out.println("Run Time: " + (end - start) / 1000.0 + "s");
    }
}
