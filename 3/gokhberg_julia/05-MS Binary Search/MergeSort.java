import java.util.*;
import java.io.*;

public class MergeSort{
      
 /*   public int[] merge(int[] A, int[] B){
	int a = 0;
	int b = 0;
	int[] C = new int[A.length + B.length];
	for (int c = 0; c < C.length; c++){
	    if (a >= A.length){
		C[c] = B[b];
	    }else if (b >= B.length){
		C[c] = A[a];
	    }else if (A[a] <= B[b]){
		C[c] = A[a];
	    }else {
		C[c] = B[b];
	    }
	}
	return C;
    }

    public static void main(String args[]){
	MergeSort m = new MergeSort();
	//int[] A = {1, 2, 3, 5, 7, 11};
	//int[] B = {1, 2, 4, 6, 8};
	//System.out.println(m.toString.merge(A, B));
	ArrayList<String> L = new ArrayList();
	String [] l = {"Cantaloupe", "Banana", "Strawberry", "Lemon", "Melon", "Dyslexia"}
	for ( int x = 0; x < l.length; x++){
	    L.add(l[x]);
	}
	L = m.sSort(L);
	for (int x = 0; x < L.size(); x++){
	    System.out.println(L.get(x));
    }

    public String toString(int[] A){
	String res = "{"
	for (int a = 0; a < A.length; a++){
	    if ( a == A.length - 1){
		res += A[a] + "}";
	    }else{
		res += A[a] + ", ";
	    }
	}
	return res;
    }

   public int[] msort(int[] L){
	if (L.length <= 1){
	    return L;
	}
	int[] a = new int[L.length/2];
	int[] b = new int[L.length - a.length/2];

	int i = 0;
	for (; i<a.length; i++){
	    a[i] = L[i];
	}
	for ( ; i < b.length; i++){
	    b[i-a.length] = L[i];
	}
	return merge (msort(a), msort(b));
   }

    





    // This next part with the strings is SLIGHTLY more confusing for me.
    // I had to look through a few codes form other students to get a feel for the syntax.

    public ArrayList<String> sSort(ArrayList<String> L){
	if (L.size() <= 1){
	    return L;
	}else{
	    ArrayList<String> a = new ArrayList();
	    ArrayList<String> b = new ArrayList();
	    int i = 0;
	    // I've never done this where you instantiate the int before you go into the for loop.
	    // How does that work exactly? Is it that the int remains documented even after the
	    // for loop is over? That's what it seems like from the code.
	    for (; i < L.size()/2; i++){
		a.add(L.get(i));
	    }
	    for (; i < L.size(); i++){
		b.add(L.get(i));
	    }
	    return sMerge(sSort(a), sSort(b));
	}
    }

    public ArrayList<String> sMerge(ArrayList<String> A, ArrayList<String> B){
	int a = 0;
	int b = 0;
	ArrayList<String> C = new ArrayList();
	for (int c = 0; c < A.size() + B.size(); c++){
	    if (a >= A.size()){
		C.add(B.get(b));
		b ++;
	    }else if (b >= B.size()){
		C.add(A.get(a));
		a ++;
	    }else{
		//The part below confused me AHH!
		int pos = 0;
		while (A.get(a).charAt(pos) == B.get(b).charAt(pos)){
		    pos ++;
		}
		if (A.get(a).charAt(pos) < B.get(b).charAt(pos)){
		    C.add(A.get(a));
		    a++;
		}else{
		    C.add(B.get(b));
		    b++;
		}
		//On second thought, I get it. This is if the first letters of the word
		//are the same. In that case, this part of the code is checking the second
		//letter and so on until it finds a difference. Coolio.
	    }
	}
	return C;
    }
*/



    //I'm confused with Comparable and how it works.

    public ArrayList<Comparable> cSort(ArrayList<Comparable> A){
	if (A.size() <= 1){
	    return A;
	}else{
	    ArrayList<Comparable> a = new ArrayList();
	    ArrayList<Comparable> b = new ArrayList();
	    int x = 0;
	    for (; x < A.size()/2; x++){
		a.add(A.get(x));
	    }
	    for (; x<A.size(); x++){
		b.add(A.get(x));
	    }
	    return cMerge(cSort(a), cSort(b));
	}
    }

    public ArrayList<Comparable> cMerge(ArrayList<Comparable> A, ArrayList<Comparable> B){
	int a = 0;
	int b = 0;
	ArrayList<Comparable> C = new ArrayList();
	for (int c = 0; c < A.size() + B.size(); c++){
	    if (a >= A.size()){
		C.add(B.get(b));
		b ++;
	    }else if (b >= B.size()){
		C.add(A.get(a));
		a ++;
	    }else if (A.get(a).compareTo(B.get(b)) == -1){
		C.add(A.get(a));
		a++;
	    }else{
		C.add(B.get(b));
		b++;
	    
	    }
	}
	return C;
    }

		 	    
}
		
