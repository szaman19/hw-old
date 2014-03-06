/* Only tests Strings and ints */

import java.util.*;
public class SortDriver {
    public static void main(String[] args) {
	    SortDriver.mergeStringTest();
	    SortDriver.mergeDoubleTest();
    }
    public static ArrayList<String> genStrings(int arraySize, int stringSize) {
    	//randomly generated strings. enough of these and you get shakespeare
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
	public static ArrayList<Integer> genInt(int size) {
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	for (int i = 0; i < size; i++) {
	    	int isNegative = (int)(Math.round(Math.random()) * -10);
	    	array.add((int) ((2 * isNegative + 1) * Math.random() * 1000));
		}
		return array;
    }    

	
	public static void mergeStringTest() {
		ArrayList<String> array = new ArrayList<String>();
		System.out.println("Merge Test (String):");
		array = genStrings(100,100);
		System.out.println(array);
		double time = System.currentTimeMillis();
		array = Sort.merge(array);
		double elapsedTime = (System.currentTimeMillis() - time) / 1000.0;
		System.out.println("Sorted:");
		System.out.println(array);
		System.out.println(String.format("That took %f seconds",elapsedTime));	
	}

	public static void mergeDoubleTest() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.println("Merge Test:");
		array = genInt(3000);
		System.out.println(array);
		double time = System.currentTimeMillis();
		array = Sort.merge(array);
		double elapsedTime = (System.currentTimeMillis() - time) / 1000.0;
		System.out.println("Sorted:");
		System.out.println(array);
		System.out.println(String.format("That took %f seconds",elapsedTime));	

	}
}