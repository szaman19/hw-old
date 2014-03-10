import java.util.ArrayList;

public class MergeSortC{
    

    public static ArrayList<Comparable> merge(ArrayList<Comparable> A, ArrayList<Comparable> B){
	ArrayList<Comparable> ret = new ArrayList<Comparable>();
	int asd = A.size() + B.size();
	for(int i= 0; i < asd; i++){
	    if (A.size() == 0)
		ret.add(B.remove(0));
	    else if (B.size() == 0 || A.get(0).compareTo(B.get(0)) <=0)
		ret.add( A.remove(0));
	    else
		ret.add( B.remove(0));
	}
	return ret;
    }
    
    public static ArrayList<Comparable> msort(ArrayList<Comparable> L){
	int lll = L.size();
	if(lll <= 1){	}
	else{
	    ArrayList<Comparable> A = new ArrayList<Comparable>();
	    ArrayList<Comparable> B = new ArrayList<Comparable>(L);

	    while(A.size() < B.size()){
		A.add(B.remove(0));
	    }

	    A = msort(A);
	    B = msort(B);
	    L = merge(A,B);

	}
	return L;
    }
	    
	    

    public static void main(String[] args){
	
	
	ArrayList<Comparable> L = new ArrayList<Comparable>();
	L.add("asd");
	L.add("1asd");
	L.add("2asd");
	L.add("a3sd");
	L.add("gfsd");
	L.add("fagdfd");
	L.add("fa");
	L.add("ahtt");
	L.add("ssd");
	System.out.println(msort(L));
	
	
    }

}
