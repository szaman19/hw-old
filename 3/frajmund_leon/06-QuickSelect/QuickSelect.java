import java.util.Random;
import java.util.Arrays;
public class QuickSelect{
    private Random rand = new Random();

    public QuickSelect(){};

    public int quickWork(int[] array, int k, int low, int high){
	if(high == low)
	    return array[low];
	int value = array[rand.nextInt(high - low) + low];
	int[] newArray = new int[array.length];
	int left = low; int right = high - 1; int pivot = -1;
	for(int index = 0; index < array.length; index ++){
	    if (index < low || index > high)
		newArray[index] = array[index];
	    else if(array[index] > value){
		newArray[right] = array[index];
		right --;
	    }
	    else if(array[index] < value){
		if (pivot != -1){
		    if(newArray[left - 1] != 0){
			newArray[left] = newArray[left - 1];
			newArray[left - 1] = array[index];
			pivot ++;
		    }
		}else
		    newArray[left] = array[index];
		left ++;
	    }
	    else if(array[index] == value){
		newArray[left] = value;
		pivot = left;
		left ++;
	    }
	}
	if(pivot == k - 1)
	    return value;
	if(pivot > k - 1)
	    return quickWork(newArray, k, low, pivot - 1);
	return quickWork(newArray, k, pivot + 1, high);
    }

    public int quickSelect(int[] array, int k){
	return quickWork(array, k, 0, array.length);
    }

 
}
