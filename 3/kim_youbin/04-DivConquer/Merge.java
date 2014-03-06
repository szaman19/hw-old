public class Merge{
    int[] start;
    
    public Merge(int[] a){
	start = a;
    }

    
    public int[] mergesort(int[] a){
	if(a.length == 1){
	    return a;
	}else{
	    
	    int[] x = new int[(int)Math.ceil(a.length/2.0)];
	    int[] y = new int[(int)Math.floor(a.length/2.0)];
	    

	    int count = 0;

	    for (int i = 0; i < x.length; i++){
		x[i] = a[count];
		count++;
	    }
	    for (int i = 0; i < y.length; i++){
		y[i] = a[count];
		count++;
	    }

	    //	    System.out.println(pt(a) + "-> " + pt(x) + "+ " + pt(y));

	    int[] x1 = mergesort(x);
	    int[] y1 = mergesort(y);

	    return merge(x1,y1);
	}
    }
    
    public int[] merge(int[] a, int[] b){
	int x = 0;
	int y = 0;
	int [] ans = new int[a.length + b.length];
	
	for (int i = 0; i< ans.length; i++){
	    if (x == a.length){
		ans[i] = b[y];
		y++;
	    } else if (y == b.length){
		ans[i] = a[x];
		x++;
	    } else if (a[x] < b[y]){
		ans[i] = a[x];
		x++;
	    } else {
		ans[i] = b[y];
		y++;
	    }
	    
	}
	//	System.out.println(pt(a) + "+ " + pt(b) + "= " + pt(ans));
	return ans;
    }

    public String pt(int[] a){
	String ans = "";
	for (int i = 0; i < a.length; i++){
	    ans += (a[i] + " ");
	}
	return ans;
    }
    
    public static void main(String[] args){
	int num = Integer.parseInt(args[0]);
	int r = Integer.parseInt(args[1]);
	
	int[] arr = new int[num];
	
	for (int i = 0; i < num; i++){
	    arr[i] = (int)(r * Math.random());
	}
	
	Merge n = new Merge(arr);
	System.out.println(n.pt(n.mergesort(n.start)));
    }

}