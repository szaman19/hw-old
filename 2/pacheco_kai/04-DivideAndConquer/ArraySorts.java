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
	int[] ans=new int[a.size()+b.size()];
	int asmallest=0;
	int bsmallest=0;
	if(b.size()>a.size()){
	    n=a.length*2;
	}else{
	    n=b.length*2;
	}
	for(int x=0;x<n;x++){
	    if(a.get(asmallest).compareTo(b.get(bsmallest))>0){
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
	for(int x=0;x<a.size();x++){
	    ans+=a.get(x);
	}
	return ans;
    }
    
    public static void main(String[]args){
	ArrayList<String> hi = new ArrayList<String>();
	hi.add("xyz");
	hi.add("abe");
	hi.add("abc");
	hi.add("lmn");
	hi.add("aaa");
	System.out.println(toString(mergeSort(hi)));
	
    }
}