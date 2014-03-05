import java.util.*;

//can't the same code also be used for other comparable types 
//if I just changed <String> to a comparable?

public class MergeSort{
    
    public static void main(String[]args){
	ArrayList<String> test = new ArrayList<String>();
	test.add("hello");
	test.add("aaaaaa");
	test.add("ztest");
	test.add("bbb");
	System.out.println(split(test));
	ArrayList<String> test2 = new ArrayList<String>();
	test2.add("a");
	test2.add("aa");
	test2.add("123");
	test2.add("0123");
	test2.add("euofy76gkbc");
	System.out.println(split(test2));
    }


    public static ArrayList<String> split(ArrayList<String> array){
	ArrayList<String> result = new ArrayList<String>();
	int half = array.size()/2;
	int size = array.size();
	ArrayList<String> left = new ArrayList<String>();
	ArrayList<String> right = new ArrayList<String>();
	if(size == 1){
	    return array;
	}
	for(int i = 0; i < half; i++){
	    left.add(array.get(i));
	}
	for(int j = half; j < size; j++){
	    right.add(array.get(j));
	}
	
	left = split(left);
	right = split(right);
	result = merge(left, right);
	return result;
    }

    public static ArrayList<String> merge(ArrayList<String> left,
					  ArrayList<String> right){
	ArrayList<String> sorted = new ArrayList<String>();
	int place = 0;
	while(left.size() > 0 || right.size() > 0){
	    if(left.size() > 0 && right.size() > 0){
		if(left.get(0).compareTo(right.get(0)) <= 0){
		    sorted.add(left.remove(0));
		    place++;
		}else{
		    sorted.add(right.remove(0));
		    place++;
		}
	    }
	    else if(left.size() > 0){
		sorted.add(left.remove(0));
		place++;
	    }
	    else if(right.size() > 0){
		sorted.add(right.remove(0));
		place++;
	    }
	}
	return sorted;
    }
}
