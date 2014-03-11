public class Sorts{
    public static int[] mergeSort(int[] a){
	if(a.length<=1){
	    return a;
	}else{
	    System.out.println(toString(a));
	    int[]h1=new int[a.length/2];
	    for(int x=0;x<h1.length;x++){
		h1[x]=a[x];
	    }
	    System.out.println(toString(h1));
	    int[]h2=new int[a.length-a.length/2];
	    for(int x=0;x<h2.length;x++){
		h2[x]=a[h1.length+x];
	    }
	    System.out.println(toString(h2));
	    return merge(mergeSort(h1),mergeSort(h2));
	}
    }
    public static int[] merge(int[] a, int[] b){
	int n;
	int[] ans=new int[a.length+b.length];
	int asmallest=0;
	int bsmallest=0;
	if(b.length>a.length){
	    n=a.length;
	}else{
	    n=b.length;
	}
	int counter=0;
	while(asmallest<n || bsmallest<n){
	    if(asmallest<n && bsmallest<n){
		if(a[asmallest]<b[bsmallest]){
		    ans[counter]=a[asmallest];
		    asmallest++;
		}else{
		    ans[counter]=b[bsmallest];
		    bsmallest++;
		}
	    }else if(asmallest>=n){
		ans[counter]=b[bsmallest];
		bsmallest++;
	    }else{
		ans[counter]=a[asmallest];
		asmallest++;
	    }
	    counter++;
	}
	System.out.println(toString(ans));
	while(counter<ans.length){
	    if(n==a.length){
		ans[counter]=b[bsmallest];
		counter++;
		bsmallest++;
	    }else{
		ans[counter]=a[asmallest];
		counter++;
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
	int[]hi2=new int[1];
	int[]hi3=new int[2];
	hi2[0]=3;
	hi3[0]=2;
	hi3[1]=4;
	System.out.println(toString(merge(hi2,hi3)));
	System.out.println(toString(mergeSort(hi)));

    }
}