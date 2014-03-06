import java.util.*;
public class Sort {    
    public static void main(String[] args) {   
        SortDriver.main(args);
    }

    public static <T extends Comparable<? super T>> ArrayList<T> merge(ArrayList<T> array) {
    	//break it! 
    	if (array.size() == 1) 
    		return array;
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
        while (left.size() > 0 || right.size() > 0) {
            if (left.size() > 0 && right.size() > 0) {
                if (left.get(0).compareTo(right.get(0)) <= 0) {
                    answer.add(left.get(0));
                    left.remove(0); 
                    index++;
                }
                else {
                    answer.add(right.get(0));
                    right.remove(0);
                    index++;
                } 
            }
            else if (left.size() > 0) {
                answer.add(left.get(0));
                index++;
                left.remove(0);
            }
            else if (right.size() > 0) {
                answer.add(right.get(0));
                index++;
                right.remove(0);
            }
        }
        return answer; 
    }   
}