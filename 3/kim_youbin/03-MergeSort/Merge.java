public class Merge{
    public int[] merge(int[] a, int[] b){
	int x = 0;
	int y = 0;

	int[] ans = new int[a.length + b.length];

	if (a[x] < b[y]){
	    ans[x+y] = a[x];
	    x++;
	    if (x = a.length){
		x--;
	    }
	}else{
	    ans[x+y] = b[y];
	    y++;
	    if (y = b.length){
		y--;
	    }
	}
    }
 
}