import java.util.*;
public class MergeSort<E>{
    public static ArrayList<E> mergeSort(ArrayList<E> A){
        if(A.size() > 1){
            ArrayList<E> x = new ArrayList<E>();
            ArrayList<E> y = new ArrayList<E>();
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
    private static ArrayList<E> merge(ArrayList<E> A,
                                           ArrayList<E> B){
        ArrayList<E> ans = new ArrayList<E>();
        while (A.size() > 0 && B.size() > 0){
            if(A.compareTo(B) < 0){
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
    public static void main(String[] args){
	ArrayList A = new ArrayList();
	A.add("hi");
	A.add("bye");
	A.add("byo");
	A.add("Z");
	A = mergeSort(A);
        for(Object x : A){
	    System.out.println(x+" ");
	}
    }
}
