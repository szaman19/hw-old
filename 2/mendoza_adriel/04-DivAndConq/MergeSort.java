import java.util.*;
import java.io.*;

public class MergeSort{

    public ArrayList<String> MergeSort(ArrayList<String> a) {
        ArrayList<String> one = new ArrayList<String>();
        ArrayList<String> two = new ArrayList<String>();
        if(a.size() <= 1){
            return a;
        }else{
            for(int i = 0; i < a.size(); i++){
                if(i < a.size()/2){
                    one.add(a.get(i));
                }
                else{
                    two.add(a.get(i));
                }
            }
	}
        one = MergeSort(one);
        two = MergeSort(two);
        a = merge(one, two);
        return a;
    }

    public ArrayList<String> merge(ArrayList<String> one, ArrayList<String> two) {
        ArrayList<String> resp = new ArrayList<String>();
        int oc = 0;
        int tc = 0;
        while(oc < one.size() && tc < two.size()){
            if((one.get(oc)).compareTo(two.get(tc)) <= 0){
                resp.add(one.get(oc));
	        oc++;
            }else{
                resp.add(two.get(tc));
		tc++;
	    }
	}
        while(oc < one.size()){
	    resp.add(one.get(oc));
	    oc++;
	}
	while(tc < two.size()){
	    resp.add(two.get(tc));
	    tc++;
	}
        return resp;
    }

    public static void main(String args[]){
	MergeSort m = new MergeSort();
	ArrayList<String> a = new ArrayList<String>();
	a.add("bathroom");
	a.add("oops");
	a.add("woof");
	a.add("ouch");
	a.add("hi mom");
	a.add("woof");
	a.add("potato");
	System.out.println(m.MergeSort(a));
    }
}
