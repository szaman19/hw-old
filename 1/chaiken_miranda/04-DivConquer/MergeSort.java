import java.util.ArrayList;

public class MergeSort{
    
    public static ArrayList<String> merge( ArrayList<String> a,  ArrayList<String> b){
	int topA=0;
	int topB=0;
	//int tret=0;
	ArrayList<String> ret=new ArrayList();
	while(topA<a.size() &&topB<b.size()){
	    if (a.get(topA).compareTo(b.get(topB))< 0){
		ret.add(a.get(topA));
		topA++;
	    }
	    else{
		ret.add(b.get(topB));
		topB++;
	    }
	    //tret++;
	}
	if (topA==a.size()){
	    for(int x=topB;x<b.size();x++){
		ret.add(b.get(x));
		//tret++;
	    }
	}
	else if(topB==b.size()){
	    for(int x=topA;x<a.size();x++){
		ret.add(a.get(x));
		//tret++;
	    }
	}
	return ret;
    }

    public static ArrayList<String> mergeSort(ArrayList<String> l){
	if (l.size()<=1)
	    return l;
	else{
	    ArrayList<String> a=new ArrayList<String>();
	    ArrayList<String> b=new ArrayList<String>();
	    for(int i=0;i<l.size()/2;i++)
		a.add(l.get(i));
	    for(int i=0;i<l.size()-a.size();i++)
		b.add(l.get(i+a.size()));
	    return  merge(mergeSort(a),mergeSort(b));
	   
	}
    }
    public static void main(String[]args){
	ArrayList<String> a=new ArrayList<String>();
	for(int i:new int[20])
	    a.add(""+(int)(Math.random()*100);
	System.out.println(a);
	a=mergeSort(a);
	System.out.println(a);
    }
}
	
	    