import java.util.*;

public class Qsort{

	public static int[] merge(int[] a, int[] b){
		int[] c=new int[a.length+b.length];
		for (int x=0; x<a.length;x++){
			c[x]=a[x];
		}
		for (int y=a.length; y<c.length;y++){
			c[y]=b[y-a.length];
		}
		return c;
	}
	public static int[] sorter(int[] a){
		if (a.length<=1){
			return a;
		}
		else{
			Random x=new Random();
			int pivot=a[x.nextInt(a.length)];
			ArrayList<Integer> lower=new ArrayList();
			ArrayList<Integer> higher=new ArrayList();
			for (int y=0; y<a.length;y++){
				if (a[y]<=pivot){
					lower.add(a[y]);
				}
				else{
					higher.add(a[y]);
				}
			}
			int[] b=new int[lower.size()];
			for (int i=0;i<lower.size();i++){
				b[i]=lower.get(i);
			}
			int[] c=new int[higher.size()];
			for (int j=0;j<higher.size();j++){
				c[j]=higher.get(j);
			}
			return merge(sorter(b),sorter(c));
		}
	}

	public static void main(String[] args){
		int[] b={2,3,45,53,4,5,34,5,4,3,45,3,45,36,74,1,25,23345,232,2};
		System.out.println(Arrays.toString(sorter(b)));
	}
}