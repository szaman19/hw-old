import java.util.*;
public class mergeSortStrings{

    public ArrayList<String> mergeSort(ArrayList<String> L){
        if (L.size()<=1){
            return L;
        }

        ArrayList<String> one = new ArrayList<String>(L.size()/2);        
        int index;
        for (index = 0;index<L.size()/2;index++){
            one.add(index,L.get(index));
        }
	ArrayList<String> two = new ArrayList<String>(L.size() - L.size()/2);
        for (;index<L.size();index++){
            two.add(index-one.size(),L.get(index));
	}
        one = new ArrayList<String>(mergeSort(one));
	two = new ArrayList<String>(mergeSort(two));
        L = new ArrayList<String>(merge(one,two));
        return L;
    }


     public ArrayList<String> merge(ArrayList<String> one,ArrayList<String> two){
        int size1 = 0;
        int size2 = 0;

        ArrayList<String> res = new ArrayList<String>(one.size() + two.size());
        for (int a = 0; a<one.size()+ two.size();a++){
            if (size1 == one.size()){
		res.add(a,two.get(size2));
                size2++;
            }
            else if (size2 == two.size() ){
		res.add(a,one.get(size1));
                size1++;
            }
            
	    else if(one.get(size1).compareTo(two.get(size2)) <= 0){
                res.add(a,one.get(size1));
		size1++;
            }
            else{
                res.add(a,two.get(size2));
                size2++;
            }
        }
        return res;
    }


    public static void main(String[] args){
	// 
    }
}
