import java.util.Arrays;
public class BinSearch{
    int lo;
    int hi;
    public BinSearch(int[] L){
	lo=0;
	hi= L.length;
    }
    public int rbsearch(int n, int[] L){
	int m= (lo+hi)/2;
	if (hi<lo || m >= L.length || m < 0)
	    return -1;
	int ret=-1;

	if(L[m]== n)
	    ret= m;
	
	else if(L[m] > n){
	    hi=m-1;
	    ret= rbsearch(n, L);
	}
	else if(L[m] < n){
	    lo=m+1;
	    ret= rbsearch(n,L);
	    
	}
	return ret;
    }
    public int ibsearch(int n, int[] L){
	int ret=-1;
	int m;

	while (hi>=lo && (lo+hi)/2 < L.length && (lo+hi)/2 >= 0){
	    m= (lo+hi)/2;
	    if(L[m]== n){
		ret= m;
		break;
		    }  
	    else if(L[m] > n){
		hi=m-1;
	    }
	    else if(L[m] < n){
		lo=m+1;
	    }	    
	}
	return ret;
    }
    public static void main(String[]args){
	int[] a={1,2,3,4,5,6,7,8,9,11,12,13,14};
	BinSearch b=new BinSearch(a);
	System.out.println(b.ibsearch(15,a));
	for (int x:a)
	    System.out.print(x+",");
    }
}
			   
	    