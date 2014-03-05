import java.util.*;
public class MergeSort{
   
    public static ArrayList<String> merge(ArrayList<String> A, ArrayList<String> B){
        int a = 0;// index of ArrayList<String> A
	int b = 0;// index of ArrayList<String> B

	int c = 0; // index of completed array
	ArrayList<String> C = new ArrayList<String>(A.size() + B.size());
	int i = 0;
	while (a <A.size() && b <B.size()){
	    if (A.get(a).charAt(i) < B.get(b).charAt(i)){
		C.set(c,A.get(a));
		a++;
		i=0;
	    }
	    else if(A.get(a).charAt(i) == B.get(b).charAt(i) && i<A.size() && i<B.size() ){
		i++;	
	    }
	    else{
		C.set(c,B.get(b));
		b++;
		i=0;
	    }
	    c++;
	    
	}
	while (a<A.size()){
	    C.set(c,A.get(a));
	    c++;
	    a++;
	}
	while (b<B.size()){
	    C.set(c,B.get(b));
	    b++;
	    a++;
	}
	return C;
    }

    public static ArrayList<String> msort(ArrayList<String> L){
	if (L.size()<=1){
	    return L;
	}
	else{
	    ArrayList<String> a = new ArrayList<String>(L.subList(0, L.size()/2));
	    ArrayList<String> b = new ArrayList(L.subList(L.size()/2, L.size()));
	    System.out.println("*");	    
	    ArrayList<String> A = msort(a);
	    ArrayList<String> B = msort(b);
	    L= merge(A,B);
	    return L;
	}

    }
     
    public static void main (String[]args){
	MergeSort X = new MergeSort();
	ArrayList<String> Y = new ArrayList<String>(5);
	Y.add("Apples");
	Y.add("Asdf");
	Y.add("Zsdf");
	Y.add("Bsdf");
	Y.add("bsdf");
	
	System.out.println(Y.toString());
	X.msort(Y);
	System.out.println(Y.toString());
    }
}