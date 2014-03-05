public class Sorts{
    public static int[] mergeSort(int[] a){
    if(a.length<=1){
      return a;
    }else{
	int[]h1=new int[a.length/2];
	int[]h2=new int[a.length-a.length/2];
	System.out.println(toString(a));
	return merge(mergeSort(h1),mergeSort(h2));
    	}
    }
    public static int[] merge(int[] a, int[] b){
	int n;
	int[] ans=new int[a.length+b.length];
	int asmallest=0;
	int bsmallest=0;
	if(b.length>a.length){
	    n=a.length*2;
	}else{
	    n=b.length*2;
	}
	for(int x=0;x<n;x++){
	    if(a[asmallest]<=b[bsmallest]){
		ans[x]=a[asmallest];
		if(asmallest<a.length-1){
		    asmallest++;}
	    }else{
		ans[x]=b[bsmallest];
		if(bsmallest<b.length-1){
		    bsmallest++;}
	    }

	}
	while(n<ans.length){
	    if(b[bsmallest]>a[asmallest]){
		ans[n]=b[bsmallest];
		n++;
		bsmallest++;
	    }else{
		ans[n]=a[asmallest];
		n++;
		asmallest++;

	    }
	}
	return ans;
    }
    
    public static String toString(int[] a){
	String ans="";
	for(int x=0;x<a.length;x++){
	    ans+=a[x];
	}
	return ans;
    }
    
    public static void main(String[]args){
	int[] hi = new int[7];
	hi[0]=1;
	hi[1]=2;
	hi[2]=4;
	hi[3]=6;
	hi[4]=2;
	hi[5]=3;
	hi[6]=7;
	System.out.println(toString(mergeSort(hi)));
	
    }
}