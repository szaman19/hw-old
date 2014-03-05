import java.util.*;

public class Search{

    public static int search(int x, int[]array){
	int end = array.length - 1;
	return search (x, array, 0, end);
    }
    private static int search(int x, int[]array, int start, int end){
	if (array.length > 1){
	    if (array[array.length/2] < x){
		int[]half = new int[array.length/2 + 1];
		half = Arrays.copyOfRange(array, array.length/2 + 1, end);
		return search(x, half, array.length/2 +1, end);
	    }else{
		int []half = new int[array.length/2 -1];
		half = Arrays.copyOfRange(array, 0, array.length/2);
		return search(x, half, 0, array.length/2 -1);
	    }
	}else{
	    if (array[0] == x){
		return start;
	    }
	    else return -1;
	}
    }

    public static void main(String []args){
	int test = [3,4,5,7,10,24]
	System.out.println(search (5, test);
    }

}