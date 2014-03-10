import java.util.*;

public class mergeSortList{

    public static ArrayList<String> mergeSort(ArrayList<String> arr){
	if (arr.size() <= 1)
	    return arr;
	else{
	    ArrayList<String> h1 = new ArrayList<String>();
	    ArrayList<String> h2 = new ArrayList<String>();
	    for (int i = 0; i < arr.size()/2; i++)
		h1.add(arr.get(i));
	    for (int i = arr.size()/2; i < arr.size(); i++)
		h2.add(arr.get(i));
	    ArrayList<String> r1 = mergeSort(h1);
	    ArrayList<String> r2 = mergeSort(h2);
	    return merge(r1,r2);
	}
    }

    public static ArrayList<String> merge(ArrayList<String> arr1, ArrayList<String> arr2){
	ArrayList<String> result = new ArrayList<String>();
	int index1 = 0, index2 = 0;
	for (int i = 0; i < arr1.size() + arr2.size(); i++){
	    if (index1 < arr1.size() && index2 < arr2.size()){
		if (arr1.get(index1).compareTo(arr2.get(index2)) < 0){
		    result.add(arr1.get(index1));
		    index1++;
		}else{
		    result.add(arr2.get(index2));
		    index2++;
		}
	    }else if (index1 < arr1.size()){
		result.add(arr1.get(index1));
		index1++;
	    }else{
		result.add(arr2.get(index2));
		index2++;
	    }
	}
	return result;
    }

    public static String toString(ArrayList<String> arr){
	String str = "";
	for (int i = 0; i < arr.size(); i++){
	    str += arr.get(i) + " ";
	}
	return str;
    }

    public static void main(String[] args){
	ArrayList<String> a = new ArrayList();
	a.add("fsdf");
	a.add("dsfs");
	a.add("dfgh");
	a.add("zxcv");
	a.add("qwer");
	a.add("tyew");
	a.add("avxc");
	a.add("rqer");
	a.add("lkfj");
	a.add("qowi");
	a.add("cxnb");
	System.out.println(toString(mergeSort(a)));
    }
}
