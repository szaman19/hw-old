import java.util.*;

//used same algorithm as for String merge sort
//but changed <String> to any comparable, that was kind
//of confusing

//<? super T> don't really understand this

public class MergeSort{

    public static void main(String[]args){
	ArrayList<Integer> test = new ArrayList<Integer>();
	test.add(5);
	test.add(4);
	test.add(1);
	test.add(3);
	System.out.println(split(test));

	ArrayList<String> test2 = new ArrayList<String>();
	test2.add("0pythonH@@2ggssss");
	test2.add("a000kek");
	test2.add("hhhhadostringworksaswell?");
	test2.add("z__works?");
	System.out.println(split(test2));
    }

    public static <T extends Comparable<? super T>> ArrayList<T> split(ArrayList<T> array){
	ArrayList<T> merged = new ArrayList<T>();
	int half = array.size()/2;
	int size = array.size();
	ArrayList<T> left = new ArrayList<T>();
	ArrayList<T> right = new ArrayList<T>();
	if (array.size() == 1){
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
	merged = merge(left, right);
	return merged;
    }

    public static <T extends Comparable<? super T>> ArrayList<T> merge(ArrayList<T> left,
								       ArrayList<T> right){
	ArrayList<T> sorted = new ArrayList<T>();
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
		    




		    


