public class Search{
    //couldn't get the recursive to work all the time
    public static int rbsearch(int n, int[]L){
	if(L.length==0){
	    return -1;
	}else if(L[L.length/2]==n){
	    return L.length/2;
	}else if(L[L.length/2]>n){
	    int[] a= new int[L.length/2-1];
	    for(int i=0;i<a.length;i++){
		a[i]=L[i];
	    }
	    return rbsearch(n,a);
	}else{
	    int[] a = new int[L.length-(L.length/2+1)];
	    for(int i=L.length/2+1;i<L.length;i++){
		a[i-(L.length/2+1)]=L[i];
	    }
	    int b= rbsearch(n,a);
	    if(b<0){
		return b;
	    }else{
		return b+L.length/2+1;
	    }
	}
    }
    public static int ibsearch(int n,int[]L){
	int counter =L.length/2;
	int c2=0;
	for(int a=0;a<(L.length+1)/2;a++){
	    if(L[counter]==n){
		return counter;
	    }else if(L[counter]>n){
		counter-=counter/2;
	    }else{
		counter+=counter/2;
	    }		
	}
	return -1;
    }
    public static void main(String[]args){
	int[]L={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	for(int i=0;i<L.length;i++){
	    System.out.println(ibsearch(i,L));
	}
	System.out.println(ibsearch(166,L)+"\n\n");
	for(int i=0;i<L.length;i++){
	    System.out.println(rbsearch(i,L));
	}
	System.out.println(rbsearch(166,L));
    }
}
