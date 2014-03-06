/* Only tests Strings and ints */

import java.util.*;
public class SortDriver {
    public static void main(String[] args) {
	    SortDriver.mergeStringTest();
	    SortDriver.mergeDoubleTest();
    }
    public static ArrayList<String> genStrings(int arraySize, int stringSize) {
    	ArrayList<String> array = new ArrayList<String>();
    	for (int i = 0; i < arraySize; i++) {
    		String newString = new String();
    		for (int k = 0; k < stringSize; k++) {
    			newString += String.valueOf((char) (32 + (int)(Math.random() * 95)));
    		}
    		array.add(newString);
		}
		return array;
    }
	public static ArrayList<Double> genDouble(int size) {
    	ArrayList<Double> array = new ArrayList<Double>();
    	for (int i = 0; i < size; i++) {
	    	double isNegative = (Math.round(Math.random()) * -1.0);
	    	array.add((2 * isNegative + 1) * Math.random() * 100.0);
		}
		return array;
    }    

	
	public static void mergeStringTest() {
		ArrayList<String> array = new ArrayList<String>();
		System.out.println("Merge Test (String):");
		array = genStrings(10,10);
		System.out.println(array);
		array = Sort.merge(array);
		System.out.println("Sorted:");
		System.out.println(array);
	}

	public static void mergeDoubleTest() {
		ArrayList<Double> array = new ArrayList<Double>();
		System.out.println("Merge Test:");
		array = genDouble(30);
		System.out.println(array);
		array = Sort.merge(array);
		System.out.println("Sorted:");
		System.out.println(array);
	}
}