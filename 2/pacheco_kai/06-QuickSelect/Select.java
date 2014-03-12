public class Select{
	public static int quickSelect(int[] a,int k, int l, int h){
		if(l>=h){
			return a[l];
		}else{
			System.out.println(toString(a));
			int mid = a[(h-l)/2];
			int[]copy=new int[a.length];
			System.out.println("high "+h+"  low "+l);
			for(int x=l;x<=h;x++){
				if(a[x]<=mid){
					copy[l]=a[x];
					l++;
				}else if(a[x]>mid){
					copy[h]=a[x];
					h--;
				}
			}
			//for(int x=mid;x<h;x++){
			//	if(a[x]>a[mid]){
			//		copy[h]=a[x];
			//		h--;
			//	}else{
			//		copy[l]=a[x];
			//		l++;
			//	}
			//}
			System.out.println(toString(copy));
			if(k==l){
				return copy[l];
			}else{
				if(k<l){
					return quickSelect(copy,k,0,l-1);
				}else{
					return quickSelect(copy,k,l,copy.length-1);
				}
			}
		}
		
	}
	public static String toString(int[] a){
	String ans="";
	for(int x=0;x<a.length;x++){
	    ans+=a[x];
	}
	return ans;
    }
	public static void main(String[]args){
		int[]a1=new int[]{10,3,5,3,7,3,8,5,9,4};
		System.out.println(quickSelect(a1,4,0,9));
	}

}