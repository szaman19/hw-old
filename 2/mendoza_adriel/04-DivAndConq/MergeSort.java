import java.util.*;
import java.io.*;

public class MergeSort{

    /* public ArrayList<String> MergeSort(ArrayList<String> a){
        int[] one;
        int[] two;
        if(a.length <= 1){
            return a;
        }else{
            int i = a.length/2;
            one = new int[i];
            two = new int[a.length - i];
            for(int j = 0; j < a.length; j++){
                if(j < i){
                    one[j] = a[j];
                }
                else{
                    two[j - i] = a[i];
                }
            }
	}
        one = MergeSort(one);
        two = MergeSort(two);
        a = merge(one, two);
        return a;
    }
    */
    // to be edited

    public ArrayList<String> merge(ArrayList<String> one, ArrayList<String> two) {
	ArrayList<String> resp = new ArrayList<String>();
        int oc = 0;
        int tc = 0;
        while(oc < one.size() && tc < two.size()){
            if(one.get(oc).compareTo(two.get(tc)) < 0){
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
	    resp.add(two.get(tc);
	    tc++;
	}
        return resp;
    }

    /*
    public static void main(String args[]){
	MergeSort m = new MergeSort();
	int[] i = {1, 5, 32, 42, 24, 12, 98, 3, 21, 4, 16, 3};
	System.out.println(Arrays.toString(m.MergeSort(i)));
    }
    */
    //to be edited
}
