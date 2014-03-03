public class MergeSort{
    public static  int[] merge(int[] a, int[] b){
	int alen = a.length;
	int blen = b.length;
	int[] ans = new int[alen + blen];
	int spota = 0;
	int spotb = 0;
	for(int i=0;i<a.length+blen;i++){
	    System.out.println(spota + " " + spotb);
	    if(spota == alen){
		ans[i] = b[spotb];
		spotb++;
	    }
	    else if(spotb == blen){
		ans[i] = a[spota];
		spota++;
	    }
	    else{
		if(a[spota] > b[spotb]){
		    ans[i] = b[spotb];
		    spotb++;
		}
		else{
		    ans[i] = a[spota];
		    spota++;
		}
	    }

	}
	return ans;
    }
    public static void main(String[] args){
	int[] a = new int[]{2,4,8,16,32,64,128,256,512};
	int[] b = new int[]{3,9,27,81,243,729,2187,2188,2189,2190};
	int[] s = merge(a,b);
	}