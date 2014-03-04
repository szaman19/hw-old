public class Merge{

    public int[] merge(int[]a, int[]b){

	int[] ans = new int[a.length + b.length];
	int anspos = 0;
	int apos = 0;
	int bpos = 0;

	while(anspos < ans.length){
	    if(a[apos] < b[bpos]){
		ans[anspos] = a[apos];
		if(apos < a.length){
		    apos++;
		    anspos++;
		}