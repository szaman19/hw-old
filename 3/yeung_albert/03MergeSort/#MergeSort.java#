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

    public static int[] Selection(int[]a){
	int temp,min,place;
	for (int i = 0;i<a.length;i++){
	    place=i;
	    for (int j = i;j<a.length;j++){
		if (a[j]<a[place]){
		    place = j;
		}
	    }
	    temp = a[i];
	    min = a[place];
	    a[place]=temp;
	    a[i]=min;
	}
	return a;
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
	int[]a= new int[1000000];
	for (int i = 0;i<a.length;i++){
	    a[i]=(int)Math.random()*1000;
	}
	int[]b;
	if (args.length==0){
	    System.out.println(" ");
	}else{
	    long startTime=0,endTime=0;
	    if (args[0]=="0"){
		startTime = System.currentTimeMillis();
		b = Sorter(a);
		endTime = System.currentTimeMillis();
	    }
	    if (args[0]=="1"){
		startTime = System.currentTimeMillis();
		b = Selection(a);
		endTime = System.currentTimeMillis();
	    }
	    System.out.println(endTime-startTime);
	}
	/*
	for (int i = 0;i < c.length;i++){
	    System.out.println(" "+c[i]+"\t"+b[i]);
	}
	*/
    }
}