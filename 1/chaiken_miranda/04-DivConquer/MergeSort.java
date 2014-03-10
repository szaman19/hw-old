import java.util.ArrayList;
public class MergeSort{
    
    public static ArrayList<Comparable> merge( ArrayList<Comparable> a,  ArrayList<Comparable> b){
	int topA=0;
	int topB=0;
	ArrayList<Comparable> ret=new ArrayList();
	while(topA<a.size() &&topB<b.size()){
	    if (a.get(topA).compareTo(b.get(topB))< 0){
		ret.add(a.get(topA));
		topA++;
	    }
	    else{
		ret.add(b.get(topB));
		topB++;
	    }
	}
	if (topA==a.size()){
	    for(int x=topB;x<b.size();x++){
		ret.add(b.get(x));
	    }
	}
	else if(topB==b.size()){
	    for(int x=topA;x<a.size();x++){
		ret.add(a.get(x));
	    }
	}
	return ret;
    }

    public static ArrayList<Comparable> mergeSort(ArrayList<Comparable> l){
	if (l.size()<=1)
	    return l;
	else{
	    ArrayList<Comparable> a=new ArrayList<Comparable>();
	    ArrayList<Comparable> b=new ArrayList<Comparable>();
	    for(int i=0;i<l.size()/2;i++)
		a.add(l.get(i));
	    for(int i=0;i<l.size()-a.size();i++)
		b.add(l.get(i+a.size()));
	    return  merge(mergeSort(a),mergeSort(b));
	   
	}
    }
    public static void main (String []args){
	ArrayList<Comparable> a=new ArrayList<Comparable>();
	for(int i:new int[20])
	    a.add(""+(int)(Math.random()*100));
	System.out.println(a);
	a=mergeSort(a);
	System.out.println(a);

	a=new ArrayList<Comparable>();
	for(int i:new int[20])
	    a.add((int)(Math.random()*100));
	System.out.println(a);
	a=mergeSort(a);
	System.out.println(a);

    }
}
	
	    