import java.io.*;
import java.util.*;

public class MergeSort {

    public static ArrayList<String> mergeSort(ArrayList<String> list){
	if (list.size() <= 1)
	    return list;
	else{
	    ArrayList<String> x = new ArrayList<String>();
	    ArrayList<String> y = new ArrayList<String>();
	    for (int i = 0; i < list.size()/2; i++)
		x.add(list.get(i));
	    for (int i = list.size()/2; i < list.size(); i++)
		y.add(list.get(i));
	    ArrayList<String> array1 = mergeSort(x);
	    ArrayList<String> array2 = mergeSort(y);

	    ArrayList<String> result = new ArrayList<String>();
	    int index1 = 0, index2 = 0;
	    for (int i = 0; i < list1.size() + list2.size(); i++){
		if (index1 < list1.size() && index2 < list2.size()){
		    if (list1.get(index1).compareTo(list2.get(index2)) < 0){
			result.add(list1.get(index1));
			index1++;
		    }else{
			result.add(list2.get(index2));
			index2++;
		    }
		}else if (index1 < list1.size()){
		    result.add(list1.get(index1));
		    index1++;
		}else{
		    result.add(list2.get(index2));
		    index2++;
		}
	    }
	    return result;
	}
    }

    public static String toString(ArrayList<String> list){
	String string = "";
	for (int i = 0; i < list.size(); i++){
	    string += list.get(i) + " ";
	}
	return string;
    }

    public static void main(String[] args){
	ArrayList<String> a = new ArrayList();
	a.add("ab");
	a.add("apple");
	a.add("ab");
	a.add("test");
	a.add("random");
	a.add("letterz");
	System.out.println(toString(mergeSort(a)));
    }
}
