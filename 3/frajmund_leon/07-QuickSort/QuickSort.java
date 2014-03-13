import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class QuickSort{
    private Random rand = new Random();

    public QuickSort(){};

    public int[] sort(int[] array){
	//base
	if (array.length < 2)
	    return array;
	
                  	//the hard stuff//
	//pivoting
	int index = rand.nextInt(array.length);
	int pivot = array[index];
	index = partition(array, pivot);

	//new Arrays
	int[] lower = Arrays.copyOfRange(array, 0, index);
	int[] upper = Arrays.copyOfRange(array, index + 1, array.length);

	//recursion
	lower = sort(lower);
	upper = sort(upper);

	
	//the merge
	return merge(lower, pivot, upper);

    }

    //Helpers//

    public int partition(int[] array, int pivot){

	//turn array into Integer ArrayList
	ArrayList<Integer> source = new ArrayList<Integer>();
	for(int c : array)
	    source.add(new Integer(c));
	//create empty ArrayList to be partitioned
	ArrayList<Integer> parted = new ArrayList<Integer>();

	//do the parting
	int pivotIndex = 0; boolean passedPivot = false;
	parted.add(pivot);
	for(Integer c : source){

	    //	System.out.println(Arrays.toString(parted.toArray()));

	    if(c.compareTo(pivot) < 0){
		parted.add(0, c);
		pivotIndex ++;
	    }
	    else if(c.compareTo(pivot) > 0)
		parted.add(c);
	    else{
		if(passedPivot)
		    parted.add(c);
		else
		    passedPivot = true;
	    }
	}


	//change the original array
	int arrayIndex = 0;
	for(Integer c : parted){    
	    array[arrayIndex] = c.intValue();
	    arrayIndex ++;
	}
	return pivotIndex;
    }



    public int[] merge(int[] lower, int pivot, int[] upper){
	int[] array = new int[lower.length + upper.length + 1];
	int count = 0;
	for (int low : lower){
	    array[count] = low;
	    count ++;
	}
	array[count] = pivot;
	count ++;
	for (int high : upper){
	    array[count] = high;
	    count ++;
	}
	return array;
    }

}
