public class Merge{

    public int[] merge(int[]a, int[]b){

	int[] ans = new int[a.length + b.length];
	int anspos = 0;
	int apos = 0;
	int bpos = 0;

	while(anspos < ans.length){
	    if(a[apos] < b[bpos]){
		ans[anspos] = a[apos];
		if(apos + 1 < a.length){
		    apos++;
		    anspos++;
		}
		else{
		    a[apos] = 999999999;
		    anspos++;
		}
	    }
	    else{
		ans[anspos] = b[bpos];
		if(bpos + 1 < b.length){
		    bpos++;
		    anspos++;
		}
		else{
		    anspos++;
		    b[bpos] = 100;
		}
	    }
	}
	return ans;
    }
}