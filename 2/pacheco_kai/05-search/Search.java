//I cant figure out how to complete this without adding some extra parameters for high and low, because the id have to keep track of whether im above or below the middle when returning the position.

public class Search{
	public static int rbsearch(int n, int[] L){
		int range = (L.length)/2;
		System.out.println(range);
		int[]G;
		if(L[range-1]==n){
			return range-1;
		}else if(L[range-1]<n){
			if(range==0){
				return -1;
			}
			G=new int[range];
			for(int x=0;x<range;x++){
				G[x]=L[x];
			}
			System.out.println(toString(G));
			return rbsearch(n,G);
		}else if(L[range-1]>n){
			if(L.length-range-1==0){
				return -1;
			}
			G=new int[L.length-range-1];
			for(int x=0;x<range;x++){
				G[x]=L[range+1+x];
			}
			System.out.println(toString(G));
			return rbsearch(n,G);
		}
		return -1;
	}
	public static String toString(int[] a){
	String ans="";
	for(int x=0;x<a.length;x++){
	    ans+=a[x]+",";
	}
	return ans;
    }

	public static void main(String[]args){
		int[]hi=new int[5];
		hi[0]=1;
		hi[1]=3;
		hi[2]=5;
		hi[3]=6;
		hi[4]=8;
		System.out.println(rbsearch(6,hi));
	}

}