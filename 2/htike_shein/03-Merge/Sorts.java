import java.util.Arrays;
public class MergeSort{
	private static int[] merge(int[] a,int[] b){
		int[] c = new int[a.length + b.length];
		int ai = 0;
		int bi = 0;
		int ci = 0;
		while(ci != c.length){
			if(ai >= a.length){
				c[ci] = b[bi];
				bi++;
			}
			else if(bi >= b.length){
				c[ci] = a[ai];
				ai++;
			}
			else{
				if(a[ai] <= b[bi]){
					c[ci] = a[ai];
					ai++;
				}
				else if(b[bi] < a[ai]){
					c[ci] = b[bi];
					bi++;
				}
			}
			ci++;
		}
		return c;
	}
	public static int[] mergeSort(int[] x){
		if(x.length == 1){
			return x;
		}
		else{
			return merge(mergeSort(Arrays.copyOfRange(x,0,x.length/2)),mergeSort(Arrays.copyOfRange(x,x.length/2,x.length)));
		}
	}
	public static void main(String[] args){
		int[] a = new int[20];
		for(int ai = 0;ai < a.length;ai++){
			a[ai] = (int)(Math.random() * 100);
		}
		System.out.println("Unsorted: " + Arrays.toString(a));
		System.out.println("Sorted: " + Arrays.toString(mergeSort(a)));
	}
}