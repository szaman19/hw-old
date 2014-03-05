public class Search{
    public void  Search(int[]d,int r){
	for (int z = 0;z<d.length;z++){
	    if(d[z]==r){
		System.out.println(z);
	    }
	    else if(d[z]>r){
		System.out.println("None");
	    }
	}
	System.out.println("None");
    }
}