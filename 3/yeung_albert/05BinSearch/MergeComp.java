import java.util.*;
public class MergeComp{
    
    public static ArrayList<Comparable> Sorter(ArrayList<Comparable>a){
	if (a.size()==1){
	    return a;
	}else{
	    ArrayList<Comparable> b = new ArrayList<Comparable>();
	    ArrayList<Comparable> c = new ArrayList<Comparable>();
	    //int[]b=new int[a.length/2];
	    //int[]c=new int[a.length-b.length];
	    for (int i = 0;i<b.size();i++){
		b.add(a.get(i));
	    }
	    for (int i = 0;i<c.size();i++){
		c.add(a.get(b.size()+i));
	    }
	    //return merge(Sorter(b),Sorter(c));
	    return merge(Sorter(b),Sorter(c));
	}
    }

    private static ArrayList<Comparable> merge(ArrayList<Comparable>a,ArrayList<Comparable>b){
	ArrayList<Comparable> c = new ArrayList<Comparable>();
	int i = 0;
	int j = 0;
	for (int n = 0;n<c.size();n++){
	    if (j<=b.size()){
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
	ArrayList<Person> a = new ArrayList<Person>();
	ArrayList<String> b;
	for (int i = 0;i<50;i++){
	    a.add(new Person(

}