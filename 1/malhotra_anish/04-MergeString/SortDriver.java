import java.util.*;
import java.io.*;

public class SortDriver {
    public static void main(String[] args) {
	    SortDriver.mergeTest();
    }
   public static String[] genStrings(int arraySize, int stringSize) {
    	//randomly generated strings. enough of these and you get shakespeare
   		String[] array = new String[arraySize];
    	for (int i = 0; i < arraySize; i++) {
    		String newString = new String();
    		for (int k = 0; k < stringSize; k++) {
    			newString += String.valueOf((char) (32 + (int)(Math.random() * 95)));
    		}
    		array[i] = newString;
		}
		return array;
    }
	
	public static void mergeTest() {
		System.out.println("Merge Test:");
		//input strings here
		System.out.println(toString(array));
		array = Sort.merge(array);
		System.out.println("Sorted:");
		System.out.println(toString(array));
	}
	public static String toString(String[] array) {
		String answer = "[";
		for (int i = 0; i < array.length; i++) {
			answer += array[i];
			if (i != array.length - 1)
				answer += ",";
		}
		answer += "]";
		return answer; 
	}
}