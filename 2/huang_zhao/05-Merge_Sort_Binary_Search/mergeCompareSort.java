import java.util.*;

public class mergeCompareSort{
    
    
    public ArrayList  mSort1(ArrayList<Comparable> L){
        if ( L.size()<=1){
            return L;
        }
        ArrayList<Comparable> a = new ArrayList<Comparable>(L.size()/2);
        
        int i;
        for (i = 0;i<L.size()/2;i++){
            a.add(i,L.get(i));
        }
	ArrayList<Comparable> b =  new ArrayList<Comparable>(L.size() - L.size()/2);
        for ( ;i<L.size();i++){
            b.add(i-a.size(),L.get(i));
	}
	
        a = new ArrayList<Comparable>( mSort1(a));
	b = new ArrayList<Comparable>( mSort1(b));
        L = new ArrayList<Comparable>(merge(a,b));
        return L;
    }
     public ArrayList<Comparable> merge(ArrayList<Comparable>d,ArrayList<Comparable>p){
        int size = 0;
        int size1 = 0;

        ArrayList<Comparable> sorted = new ArrayList<Comparable>(d.size() +p.size());
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
	mergeCompareSort sortp = new mergeCompareSort();
	ArrayList<Comparable> dd = new ArrayList<Comparable>(2);
	dd.add(new person("abc",5));
	dd.add(new person("hai",7));
	dd.add(new person("david",10));
  
	dd = new ArrayList<Comparable>(sortp.mSort1(dd));
	System.out.println(dd);
    }
}
