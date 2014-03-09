import java.util.*;
import java.io.*;

//I don't understand how to use the person interface

public class MergeSortAll{
    public ArrayList<Comparable> mergeSort(ArrayList<Comparable> A){
	if (A.size() <= 1){
	    return A;
	}else{
	    ArrayList<Comparable> h1 = new ArrayList<Comparable>();
	    ArrayList<Comparable> h2 = new ArrayList<Comparable>();
	    int i;
	    for (i = 0; i< A.size()/2; i++){
		h1.add(A.get(i));
	    }
	    for (int j = A.size()/2;j< A.size(); j++){
		h2.add(A.get(j));
	    }
	    h1 = mergeSort(h1);
	    h2 = mergeSort(h2);
	    return merge(h1, h2);
	}
    }
    public ArrayList<Comparable> merge(ArrayList<Comparable> A, ArrayList<Comparable> B){
	ArrayList<Comparable> result = new ArrayList<Comparable>(A.size() + B.size());
	int i = 0, j = 0;
        for (int k =0;k < A.size()+B.size();k++){
            if (i == A.size()){
                result.add(k,B.get(j));
                j++;
            }
            else if (j == B.size() ){
                result.add(k,A.get(i));
                i++;
            }
            
            else if(A.get(i).compareTo(B.get(j)) <= 0){
                result.add(k,A.get(i));
                i++;
            }
            else{
                result.add(k,B.get(j));
                j++;
            }
        }
	return result;
    }

    public static void main(String[] args){
	MergeSortAll m = new MergeSortAll();
	/*===========  String Test  ==============*/
	ArrayList<Comparable> a = new ArrayList<Comparable>();
	a.add("aardvark");
	a.add("cat");
	a.add("elephant");
	a.add("bear");
	a.add("duck");
	a.add("flamingo");
	ArrayList<Comparable> a1 = m.mergeSort(a);
	for (int i = 0; i< a1.size(); i++){
	    System.out.print(a1.get(i) + " ");
	}
	System.out.println();
	/*===========  Integer Test ==============*/
	Random r = new Random();
	ArrayList<Comparable> b = new ArrayList<Comparable>();
	for (int i = 0; i < 10; i++){
	    b.add(r.nextInt(100));
	}
	ArrayList<Comparable> b1 = m.mergeSort(b); 
	for (int i = 0; i < b1.size(); i++){
	    System.out.print(b1.get(i) + " ");
	}
	System.out.println();
	/*===========  Person Test  ==============*/
	ArrayList<Comparable> c = new ArrayList<Comparable>();
	Person p1 = new Person("Kevin", 17);
	Person p2 = new Person("Lydia", 16);
	Person p3 = new Person("Magdy", 55);
	c.add(p1);
	c.add(p2);
	c.add(p3);
	ArrayList<Comparable> c1 = m.mergeSort(c);
	for (int i = 0; i < c1.size(); i++){
	    System.out.print(c1.get(i) + " ");
	}
	System.out.println();
	
    }
   
}
