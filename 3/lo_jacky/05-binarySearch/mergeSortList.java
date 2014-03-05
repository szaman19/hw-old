import java.util.*;

public class mergeSortList{

    public static ArrayList<Comparable> mergeSort(ArrayList<Comparable> arr){
	if (arr.size() <= 1)
	    return arr;
	else{
	    ArrayList<Comparable> h1 = new ArrayList<Comparable>();
	    ArrayList<Comparable> h2 = new ArrayList<Comparable>();
	    for (int i = 0; i < arr.size()/2; i++)
		h1.add(arr.get(i));
	    for (int i = arr.size()/2; i < arr.size(); i++)
		h2.add(arr.get(i));
	    ArrayList<Comparable> r1 = mergeSort(h1);
	    ArrayList<Comparable> r2 = mergeSort(h2);
	    return merge(r1,r2);
	}
    }

    public static ArrayList<Comparable> merge(ArrayList<Comparable> arr1, ArrayList<Comparable> arr2){
	ArrayList<Comparable> result = new ArrayList<Comparable>();
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

    public static String toString(ArrayList<Comparable> arr){
	String str = "";
	for (int i = 0; i < arr.size(); i++){
	    str += arr.get(i) + " ";
	}
	return str;
    }

    public static void main(String[] args){
    }
}
