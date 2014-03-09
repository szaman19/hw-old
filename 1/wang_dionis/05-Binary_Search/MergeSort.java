import java.util.*;
abstract public class MergeSort implements Comparable{
    //I don't understand how to make a comparable arraylist for all objects
    public static ArrayList<E> merge(ArrayList<E> a, ArrayList<E> b){
	int ca=0;
	int cb=0;
	ArrayList<E> c=new ArrayList<E>();
	for(int i=0;i<a.size()+b.size();i++){
	    if(ca==a.size()){
		c.add(b.get(cb));
		cb++;
	    }else if(cb==b.size()){
		c.add(a.get(ca));
		ca++;
	    }else if(b.get(cb).compareTo(a.get(ca))<0){
		c.add(b.get(cb));
		cb++;
	    }else{
		c.add(a.get(ca));
		ca++;
	    }
	}
	return c;
    }
    public static ArrayList<E> mergesort(ArrayList<E> a){
	if(a.size()==1){
	    return a;
	}else{
	    ArrayList<E> b=new ArrayList<E>();
	    ArrayList<E> c=new ArrayList<E>();
	    for(int i=0;i<a.size()/2;i++){
		b.add(a.get(i));
	    }
	    for(int i=a.size()/2;i<a.size();i++){
		c.add(a.get(i));
	    }
	    return merge(mergesort(b),mergesort(c));
	}
    }
    public static void main(String[]args){
	ArrayList<String> a1= new ArrayList<String>();
	a1.add("hello");
	a1.add("does this work?");
	a1.add("zero!");
	a1.add("apple");
	a1.add("vex");
	a1.add("bees");
	a1.add("haha");
	a1.add("you work?");
	ArrayList<String> c1= mergesort(a1);
	System.out.println(Arrays.toString(c));
	for(int i=0;i<c1.size();i++){
	    System.out.println(c1.get(i));
	}
    }
}
