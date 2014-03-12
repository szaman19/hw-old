import java.util.Arrays;
public class QuickSelect{
	
    public int quickselect(int[] a, int k, int lo, int hi){

	if ( hi <= lo ){
	    return a[hi];
	}

	else {

	    int part = (int)(Math.random()*(hi-lo))+lo;
	    int[] temp=new int[a.length];
	    int loInd=0; int hiInd=a.length-1;

	    for( int i = 0; i < a.length; i++ ){
		if (i==part){
		    i++;
		    }
		if (a[i] <= a[part] ){
		    temp[loInd]=a[i];
		    loInd++;
		}
		else if(a[i] > a[part]){
		    temp[hiInd]=a[i];
		    hiInd--;
		}
	    }
	    temp[loInd]=a[part];
	    part= loInd;


	    if (part == k ){
		return temp[part];
	    }
	    else{
		int c=0;
		for(int x:temp){
		    a[c] = x;
		    c++;
		}
		if (k < part ){
		    return quickselect(a,k,lo,part-1);
		}
		else{
		    return quickselect(a,k,part+1,hi); 
		    
		}
	    }
	}
    }



    public static void main(String[]args){
	QuickSelect me = new QuickSelect();
	int[] a= new int [10];
	for (int i=0; i< 10; i++){
	    a[i]=(int)(Math.random()*20);
	}
	System.out.println(Arrays.toString(a));
	System.out.println(me.quickselect(a, 3,0,9));
    }
	    
}