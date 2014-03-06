import java.util.*;
public class MergeSort{
    public static ArrayList<String> mergeSort(ArrayList<String> A){
        if(A.size() > 1){
            ArrayList<String> x = new ArrayList<String>();
            ArrayList<String> y = new ArrayList<String>();
            for(int z = 0;z<A.size();z++){
                if(z<A.size()/2){
                    x.add(A.get(z));
                } else {
		    y.add(A.get(z));
                }
            }
            x = mergeSort(x);
            y = mergeSort(y);
            A = merge(x,y);
        }
        return A;
    }
    private static ArrayList<String> merge(ArrayList<String> A,
					   ArrayList<String> B){
        ArrayList<String> ans = new ArrayList<String>();
	while (A.size() > 0 && B.size() > 0){
	    if(firstCheck(A,B)){
		ans.add(A.get(0));
		A.remove(0);
	    } else {
		ans.add(B.get(0));
		B.remove(0);
	    }
	}
	ans.addAll(A);
	ans.addAll(B);
        return ans;
    }
    private static boolean firstCheck(ArrayList<String> A,
				      ArrayList<String> B){
	String shorter = "";
	if(A.get(0).length()<B.get(0).length()){
	    shorter = A.get(0);
	} else {
	    shorter = B.get(0);
	}
	for(int x = 0;x<shorter.length();x++){
	    if(A.get(0).charAt(x) < B.get(0).charAt(x)){
		return true;
	    } else if(A.get(0).charAt(x)>B.get(0).charAt(x)){
		return false;
	    }
	}
	if(shorter.equals(A.get(0))){
	    return true;
	}
	return false;
    }
    public static void main(String[] args){
        ArrayList A = new ArrayList();
	A.add("hi");
	A.add("bye");
	A.add("byo");
	A.add("c");
	A.add("Z");
        A = mergeSort(A);
        for(Object x : A){
            System.out.print(x+" ");
        }
    }
}
