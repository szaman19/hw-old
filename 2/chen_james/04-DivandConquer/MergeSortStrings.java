import java.io.*;
import java.util.*;
public class MergeSortStrings {

    //rewrote for arraylists

    public static void main(String[] args) {
	MergeSortStrings m = new MergeSortStrings();
	ArrayList<String> list = new ArrayList<String>();
	list.add("James");
	list.add("George");
	list.add("Jello");
	list.add("Michael");
	list.add("Johnny");
	list.add("Sap");
	list.add("Brad");
	list.add("Kelvin");

	System.out.println(list);
	
	System.out.println(m.msort(list));
    }
    public ArrayList<String> msort(ArrayList<String> L){
        if ( L.size()<=1){
            return L;
        }
        ArrayList<String> a = new ArrayList<String>(L.size()/2);
        
        int i;
        for (i = 0;i<L.size()/2;i++){
            a.add(i,L.get(i));
        }
	ArrayList<String> b =  new ArrayList<String>(L.size() - L.size()/2);
        for ( ;i<L.size();i++){
            b.add(i-a.size(),L.get(i));
	}
	
        a = new ArrayList<String>(msort(a));
	b = new ArrayList<String>(msort(b));
        L = new ArrayList<String>(merge(a,b));
        return L;
    }
    public ArrayList<String> merge(ArrayList<String>a,ArrayList<String>b){
        int size = 0;
        int size1 = 0;
	
        ArrayList<String> sorted = new ArrayList<String>(a.size() +b.size());
        for (int z =0;z < a.size()+b.size();z++){
            if (size == a.size()){
		
		sorted.add(z,b.get(size1));
                size1++;
            }
            else if (size1 == b.size() ){
		
		sorted.add(z,a.get(size));
                size++;
            }
            
	    else if(a.get(size).compareTo(b.get(size1)) <= 0){
                sorted.add(z,a.get(size));
		size++;
            }
            else{
                sorted.add(z,b.get(size1));
                size1++;
            }
        }
        return sorted;
    }
    
}
