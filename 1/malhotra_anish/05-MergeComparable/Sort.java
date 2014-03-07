import java.util.*;

public class Sort {    
    public static void main(String[] args) {   
        SortDriver.main(args);
    }

    public static <T extends Comparable<? super T>> ArrayList<T> merge(ArrayList<T> array) { 
        /*break the array in merge(), and put it back, sorted, in putItBack()*/
    	if (array.size() == 1) 
    		return array; //cant split no more
        ArrayList<T> left = new ArrayList<T>();
        ArrayList<T> right = new ArrayList<T>();
    	int middle = array.size()/ 2;
    	for (int i = 0; i < middle; i++)
    		left.add(array.get(i));
    	for (int k = middle; k < array.size(); k++)
    		right.add(array.get(k));
    	left = merge(left); 
    	right = merge(right); 
        array = putItBack(left,right);
        return array;
    }
   
    private static <T extends Comparable<? super T>> ArrayList<T> putItBack(ArrayList<T> left, ArrayList<T> right) {
        ArrayList<T> answer = new ArrayList<T>();
        int index = 0;
        while (left.size() > 0 || right.size() > 0) { //while we haven't "moved" everything from the left/right arrays to sorted arrays
            if (left.size() > 0 && right.size() > 0) { //if we still have items in both arrays to move
                if (left.get(0).compareTo(right.get(0)) <= 0) { 
			//took this part from omar in next pd
                    answer.add(left.get(0));
                    left.remove(0); 
                    index++;
                }
                else {
                    //same logic as before, just replace "left" with "right"
                    answer.add(right.get(0));
                    right.remove(0);
                    index++;
                } 
            }
            else if (left.size() > 0) {
                //if we got rid of rights, nothin but left to add
                answer.add(left.get(0));
                index++;
                left.remove(0);
            }
            else if (right.size() > 0) {
                //if we got right of lefts, nothing but right to add
                answer.add(right.get(0));
                index++;
                right.remove(0);
            }
        }
        return answer; 
    }   
}