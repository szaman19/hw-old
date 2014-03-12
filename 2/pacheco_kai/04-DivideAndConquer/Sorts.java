public class Sorts{
    public static ArrayList<String> mergeSort(ArrayList<String> a){
    if(a.size<=1){
      return a;
    }else{
	System.out.println(toString(a));
	ArrayList<String>h1=new ArrayList<String>;

	for(int x=0;x<a.size/2;x++){
	    h1.set(x,a.get(x));
	}
	System.out.println(toString(h1));
	ArrayList<String>h2=new ArrayList<String>;
	for(int x=0;x<(a.size-a.size/2);x++){
	    h2.set(x,a.get(h1.size+x));
	}
	System.out.println(toString(h2));
	return merge(mergeSort(h1),mergeSort(h2));
    	}
    }
    public static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){
	int n;
	ArrayList<String> ans=new int[a.size+b.size];
	String asmallest=0;
	String bsmallest=0;
	if(b.size>a.size){
	    n=a.size*2;
	}else{
	    n=b.size*2;
	}
	for(int x=0;x<n;x++){
	    if(a[asmallest]<=b[bsmallest]){
		ans[x]=a[asmallest];
		if(asmallest<a.size-1){
		    asmallest++;}
	    }else{
		ans[x]=b[bsmallest];
		if(bsmallest<b.size-1){
		    bsmallest++;}
	    }

	}
	while(n<ans.size){
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
	for(int x=0;x<a.size;x++){
	    ans+=a[x];
	}
	return ans;
    }
    
    public static void main(String[]args){
	ArrayList<String> hi = new ArrayList<String>();
	hi.add("w");
	hi.add("y");
	hi.add("c");
	hi.add("zx");
	hi.add("za");
	hi.add("h");
	hi.add("x");
	System.out.println(toString(mergeSort(hi)));
	
    }
}