public class Sorts{
    public static ArrayList<String> mergeSort(ArrayList<String> a){
    if(a.length<=1){
      return a;
    }else{
	System.out.println(toString(a));
	ArrayList<String>h1=new ArrayList<String>;

	for(int x=0;x<a.length/2;x++){
	    h1[x]=a[x];
	}
	System.out.println(toString(h1));
	ArrayList<String>h2=new ArrayList<String>;
	for(int x=0;x<(a.length-a.length/2);x++){
	    h2[x]=a[h1.length+x];
	}
	System.out.println(toString(h2));
	return merge(mergeSort(h1),mergeSort(h2));
    	}
    }
    public static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){
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