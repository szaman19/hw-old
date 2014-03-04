public class Merge{
    private int[]merged,a,b,ans;

    public int[] merge(int[]p,int[]q){
	int count,countp,countq;
	merged = new int[p.length + q.length];
	while (count < a.length + b.length){
	    if (count >= a.length && count >= b.length){
		
	    }
	}
    }

    public int[] sort(int[] L){
	a = new int[L.length / 2];
	b = new int[L.length / 2 + 1];
	if (L.length <= 1){
	    return L;
	} else {
	    for (int i = 0; i < L.length / 2; i++){
		a[i] = L[i]; 
	    }
	    for (int i = L.length / 2; i < L.length; i++){
		b[i] = L[i];
	    }
	    a = sort(a);
	    b = sort(b);
	    L = merge(a,b);
	    return L;
	}
    }
}