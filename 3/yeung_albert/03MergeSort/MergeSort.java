public class MergeSort{
    
    public static int[] Sorter(int[]a){
	if (a.length==1){
	    return a;
	}else{
	    int[]b=new int[a.length/2];
	    int[]c=new int[a.length-b.length];
	    for (int i = 0;i<b.length;i++){
		b[i]=a[i];
	    }
	    for (int i = 0;i<c.length;i++){
		c[i]=a[b.length+i];
	    }
	    return merge(Sorter(b),Sorter(c));
	}
    }
    
    private static int[] merge(int[]a,int[]b){
	int[]c = new int[a.length+b.length];
	int i = 0;
	int j = 0;
	for (int n = 0;n<c.length;n++){
	    if (j>=b.length){
		c[i+j]=a[i];
		i++;
	    }else if(i>=a.length){
		c[i+j]=b[j];
		j++;
	    }else if (b[j]<=a[i]){
		c[i+j]=b[j];
		j++;
	    }else{
		c[i+j]=a[i];
		i++;
	    }
	}
	return c;
    }

    public static void main(String[]args){
	int[]a={190,435,234,1,2,6,10,5,1235,27,109,10000,5,4,2,7,3,4,7,12,2,5,23};
	int[]b = Sorter(a);
	for (int i = 0;i<b.length;i++){
	    System.out.println(b[i]);
	}
    }
}