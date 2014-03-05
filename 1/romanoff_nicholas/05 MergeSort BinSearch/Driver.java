// Nicholas Romanoff
// Period One
// Homework #05 Driver
// 2014-03-05

import java.util.*;

public class Driver {

	// helper function for printing int arrays
	public void printIntArray(int[] a) { 
		String printStr = "[ ";
        	for (int n : a) {
			printStr += ((Integer) n) + ", ";
		}
		printStr = printStr.substring(0, printStr.length() - 2) + " ]";
		System.out.println(printStr);
	}

	// helper function for printing arraylists
	public void printArrayList(ArrayList<Comparable> a) { 
		String printStr = "[ ";
        	for (Comparable n : a) {
			printStr += n + ", ";
		}
		printStr = printStr.substring(0, printStr.length() - 2) + " ]";
		System.out.println(printStr);
	}

    	// helper method for creating a random arraylist of Integers
    	public static ArrayList populateInt(int size, int low, int hi) {
       		ArrayList<Integer> a = new ArrayList<Integer>();
        	while (size > 0) {
            		a.add((Integer)(low + (int)((hi - low + 1) * Math.random())));
            		size--;
        	}
       		return a;
    	}

    	// helper method for creating a random arraylist of Strings
    	public static ArrayList populateString(int size, int wordlength) {
       		ArrayList<String> a = new ArrayList<String>();
		String letters = "abcdefghijklmnopqrstuvwxyz";
        	while (size > 0) {
			String s = "";
			for (int x = 0; x < wordlength; x++) {
				int letter = (int) (Math.random() * 26);
				s += letters.substring(letter, letter + 1);
			}
			a.add(s);
            		size--;
        	}
       		return a;
    	}

    	// helper method for creating a random arraylist of PersonsA
    	public static ArrayList populatePersonA(int size, int maxAge) {
       		ArrayList<PersonA> a = new ArrayList<PersonA>();
		ArrayList<String> namelist = new ArrayList<String>();
		// size must be less than 20
		String[] names = {"Jacob", "Mason", "Ethan", "Noah", "William",
				  "Liam", "Jayden", "Michael", "Alexander", "Aiden",
				  "Sophia", "Emma", "Isabella", "Olivia", "Ava", 
			          "Emily", "Abigail", "Mia", "Madison", "Elizabeth"};
		for (String name : names) {
			namelist.add(name);
		}
        	while (size > 0) {
			int age = (int) (1 + (Math.random() * maxAge));
			int nameIndex = (int) (Math.random() * (namelist.size() - 1));
			String name = namelist.get(nameIndex);
			namelist.remove(nameIndex);
			PersonA person = new PersonA(name, age);
			a.add(person);
            		size--;
        	}
       		return a;
    	}

    	// helper method for creating a random arraylist of PersonsB
    	public static ArrayList populatePersonB(int size, int maxAge) {
       		ArrayList<PersonB> b = new ArrayList<PersonB>();
		ArrayList<String> namelist = new ArrayList<String>();
		// size must be less than 20
		String[] names = {"Jacob", "Mason", "Ethan", "Noah", "William",
				  "Liam", "Jayden", "Michael", "Alexander", "Aiden",
				  "Sophia", "Emma", "Isabella", "Olivia", "Ava", 
			          "Emily", "Abigail", "Mia", "Madison", "Elizabeth"};
		for (String name : names) {
			namelist.add(name);
		}
        	while (size > 0) {
			int age = (int) (1 + (Math.random() * maxAge));
			int nameIndex = (int) (Math.random() * (namelist.size() - 1));
			String name = namelist.get(nameIndex);
			namelist.remove(nameIndex);
			PersonB person = new PersonB(name, age);
			b.add(person);
            		size--;
        	}
       		return b;
    	}

    	// randomly rearranges the elements of an ArrayList
    	public static void shuffle(ArrayList a) {
        	int randomIndex;
        	for (int i = a.size() - 1; i > 0; i--) {
            		randomIndex = (int)((i+1) * Math.random());
            		a.set(i, a.set(randomIndex, a.get(i)));
        	}
    	}

    	// helper method for creating a random array of ints
    	public static int[]randomIntArray(int size, int low, int high) {
		int[] a = new int[size];
        	for (int x = 0; x < size; x++) {
			a[x] = low + (int)((high - low + 1) * Math.random());
        	}
		Arrays.sort(a);
       		return a;
    	}

	// helper method for testing the iterative binary search method
	public void testIterative(BinarySearch b, int[] a, int numValid, int numInvalid) {
		// tries searching for numbers in the array
		for (int v = 0; v < numValid; v++) {
			int random = (int) (Math.random() * a.length);
			int target = a[random];
			int index = b.iterativeBinarySearch(target, a);
			System.out.println("Target: " + target + " - Index: " + index);
		}
		// tries searching for numbers not in the array
		for (int i = 0; i < numInvalid; i++) {
			int target = a.length + a[(int) (Math.random() * a.length)];
			int index = b.iterativeBinarySearch(target, a);
			System.out.println("Target: " + target + " - Index: " + index);
		}
	}

	// helper method for testing the recursive binary search method
	public void testRecursive(BinarySearch b, int[] a, int numValid, int numInvalid) {
		// tries searching for numbers in the array
		for (int v = 0; v < numValid; v++) {
			int random = (int) (Math.random() * a.length);
			int target = a[random];
			int index = b.recursiveBinarySearch(target, a);
			System.out.println("Target: " + target + " - Index: " + index);
		}
		// tries searching for numbers not in the array
		for (int i = 0; i < numInvalid; i++) {
			int target = a.length + a[(int) (Math.random() * a.length)];
			int index = b.recursiveBinarySearch(target, a);
			System.out.println("Target: " + target + " - Index: " + index);
		}
	}
		
		

	// driver for testing
	public static void main(String[] args) {

		Driver driver = new Driver();

		// Testing MergeSort:
		MergeSort3 merger = new MergeSort3();

		// Integers
		System.out.println("\nTesting MergeSort on Integers\n");
		ArrayList<Comparable> testInt = populateInt(12, 1, 1000);
		System.out.println("ArrayList of Integers before sorting:");
		driver.printArrayList(testInt);
		System.out.println("ArrayList of Integers after sorting:");
		driver.printArrayList(merger.mergeSort(testInt));

		// Strings
		System.out.println("\nTesting MergeSort on Strings\n");
		ArrayList<Comparable> testString = populateString(12, 3);
		System.out.println("ArrayList of Strings before sorting:");
		driver.printArrayList(testString);
		System.out.println("ArrayList of Strings after sorting:");
		driver.printArrayList(merger.mergeSort(testString));

		// Persons by Name
		System.out.println("\nTesting MergeSort on Persons by Name\n");
		ArrayList<Comparable> testPersonA = populatePersonA(6, 100);
		System.out.println("ArrayList of Persons before sorting:");
		driver.printArrayList(testPersonA);
		System.out.println("ArrayList of Persons after sorting:");
		driver.printArrayList(merger.mergeSort(testPersonA));

		// Persons by Age
		System.out.println("\nTesting MergeSort on Persons by Age\n");
		ArrayList<Comparable> testPersonB = populatePersonB(6, 100);
		System.out.println("ArrayList of Persons before sorting:");
		driver.printArrayList(testPersonB);		
		System.out.println("ArrayList of Persons after sorting:");
		driver.printArrayList(merger.mergeSort(testPersonB));

		// Testing BinarySearch:
		BinarySearch binSearch = new BinarySearch();

		// Iteratively
		System.out.println("\nTesting Iterative Binary Search");
		int[] testIterative = randomIntArray(10, 1, 30);
		Arrays.sort(testIterative);
		driver.printIntArray(testIterative);
		driver.testIterative(binSearch, testIterative, 4, 2);

		// Recursively
		System.out.println("\nTesting Recursive Binary Search");
		int[] testRecursive = randomIntArray(10, 1, 30);
		Arrays.sort(testRecursive);
		driver.printIntArray(testRecursive);
		driver.testRecursive(binSearch, testRecursive, 4, 2);

		System.out.println();
	}
}
