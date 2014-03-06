import java.util.Arrays;
public class BinSearch{
	public static int rbsearch(int n,int[] l){
		int h = l.length / 2;
		if(l.length == 1 && n != l[h]){
			return -1;
		}
		else if(n == l[h]){
			return h;
		}
		else if(n > l[h]){
			return h + 1 + rbsearch(n,Arrays.copyOfRange(l,h + 1,l.length));
		}
		else{
			return rbsearch(n,Arrays.copyOfRange(l,0,h));
		}
	}
	public static int ibsearch(int n,int[] l){
		int ub = l.length;
		int lb = 0;
		int h = lb + (lb + ub) / 2;
		while(n != l[h]){
			if(ub - lb == 1)
				return -1;
			else{
				if(n > l[h])
					lb = h + 1;
				else
					ub = h;
			}
			h = lb + (lb + ub) / 2;
		}
		return h;
	}
	public static void main(String[] args){
		// Input one int to search, then a sorted list of ints to search from.
		// For example: java BinSearch 1 1 2 3 4 5 would search for 1 in {1,2,3,4,5}
		int[] args2 = new int[args.length - 1];
		int f = Integer.parseInt(args[0]);
		for(int i = 1;i < args.length;i++){
			args2[i - 1] = Integer.parseInt(args[i]);
		}
		System.out.println(rbsearch(f,args2));
		System.out.print(ibsearch(f,args2));
	}
}