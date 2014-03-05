public class Merge{
    
    public static int[] merge(int[]a, int[]b){
	int topA=0;//keep track of where I am in each array
	int topB=0;
	int tret=0;
	int[]ret=new int[a.length+b.length];//new sorted array
	while(topA<a.length && topB<b.length){//Keep going until I've reached the end of one of the arrays
	    if (a[topA]<b[topB]){//which array's top element is smaller?
		ret[tret]=a[topA];
		topA++;
	    }
	    else{
		ret[tret]=b[topB];
		topB++;
	    }
	    tret++;
	}

	if (topA==a.length){//if we got to the end of a first, add the rest of b
	    for(int x=topB;x<b.length;x++){
		ret[tret]=b[x];
		tret++;
	    }
	}
	else if(topB==b.length){//if we got to the end of b first, add the rest of a
	    for(int x=topA;x<a.length;x++){
		ret[tret]=a[x];
		tret++;
	    }
	}
	return ret;

    }


    public static void main(String[] args){
	int[]a={1,3,4,5,8,17};
	int[]b={1,2,2,3,4,9,12,13,15};
	int[]ret=merge(a,b);
	for(int x:ret)
	    System.out.print(x+",");
    }
}
	    