import java.util.*;

public class mergeStringSort{
    
    
    public ArrayList<String> mSort1(ArrayList<String> L){
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
	
        a = new ArrayList<String>( mSort1(a));
	b = new ArrayList<String>( mSort1(b));
        L = new ArrayList<String>(merge(a,b));
        return L;
    }
     public ArrayList<String> merge(ArrayList<String>d,ArrayList<String>p){
        int size = 0;
        int size1 = 0;

        ArrayList<String> sorted = new ArrayList<String>(d.size() +p.size());
        for (int z =0;z < d.size()+p.size();z++){
            if (size == d.size()){
                
		sorted.add(z,p.get(size1));
                size1++;
            }
            else if (size1 == p.size() ){
                
		sorted.add(z,d.get(size));
                size++;
            }
            
	    else if(d.get(size).compareTo(p.get(size1)) <= 0){
                sorted.add(z,d.get(size));
		size++;
            }
            else{
                sorted.add(z,p.get(size1));
                size1++;
            }
        }
        return sorted;
    }
    public static void main(String[] args){
	mergeStringSort sortp = new mSortS();
	ArrayList<String> dd = new ArrayList<String>(2);
	dd.add(0,"Joker");
	dd.add(1,"Joker");
	dd.add("Quinn");
	dd.add("Alfred");
	dd.add("Penguin");
	dd.add("Riddler");
	dd = new ArrayList<String>(sortp.mSort1(dd));
	System.out.println(dd);
    }
}


