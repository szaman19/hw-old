public class MergeSort{
    
    public static ArrayList<String> Sorter(ArrayList<String>a){
	if (a.length==1){
	    return a;
	}else{
	    ArrayList<String>b=new ArrayList<String>();
	    ArrayList<String>c=new ArrayList<String>();
	    for (int i = 0;i<a.size()/2;i++){
		b.add(a.get(i));
	    }
	    for (int i = 0;i<a.size()-b.size();i++){
		c.add(a.get(b.size()+i));
	    }
	    return merge(Sorter(b),Sorter(c));
	}
    }

    private static ArrayList<String> merge(ArrayList<String>a,ArrayList<String>b){
	int[]c = new ArrayList<String>;
	int i = 0;
	int j = 0;
	for (int n = 0;n<c.length;n++){
	    if (j>=b.size()){
		c.add(a.get(i));
		i++;
	    }else if(i>=a.size()){
		c.add(b.get(j));
		j++;
	    }else if (b.get(j).compareTo(a.get(i))<=0){
		c.add(b.get(j));
		j++;
	    }else{
		c.add(a.get(i));
		i++;
	    }
	}
	return c;
    }

    public static void main(String[]args){
	/*
	for (int i = 0;i < c.length;i++){
	    System.out.println(" "+c[i]+"\t"+b[i]);
	}
	*/
    }
}
