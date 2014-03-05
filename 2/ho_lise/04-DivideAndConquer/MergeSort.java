import java.util.*;
public class MergeSort{
   
    public static ArrayList<String> merge(ArrayList<String> A, ArrayList<String> B){
        int a = 0;// index of ArrayList<String> A
	int b = 0;// index of ArrayList<String> B

	int c = 0; // index of completed array
	ArrayList<String> C = new ArrayList<String>();

	while (a <A.size() && b <B.size()){
	    if (A.get(a).compareTo(B.get(b))<0){
		C.add(A.get(a));
		a++;
	    }
	    else{
		C.add(B.get(b));
		b++;
	    }
	    c++; 
	}
	while (a<A.size()){
	    C.add(A.get(a));
	    c++;
	    a++;
	}
	while (b<B.size()){
	    C.add(B.get(b));
	    b++;
	    a++;
	}
	return C;
    }

    public static ArrayList<String> msort(ArrayList<String> L){
	if (L.size() <= 1){
	    return L;
	}
	else{
	    ArrayList<String> a = new ArrayList<String>(L.subList(0, L.size()/2));
	    ArrayList<String> b = new ArrayList<String>(L.subList(L.size()/2, L.size()));
	    ArrayList<String> A = msort(a);
	    ArrayList<String> B = msort(b);
	    L= merge(A,B);
	    return L;
	}

    }
     
    public static void main (String[]args){
	MergeSort X = new MergeSort();
	ArrayList<String> Y = new ArrayList<String>();
	Y.add("Apples");
	Y.add("Asdf");
	Y.add("Zsdf");
	Y.add("Bsdf");
	Y.add("bsdf");

	System.out.println(Y.toString());
	ArrayList<String> ans = X.msort(Y);
	System.out.println(ans.toString());
    }
}