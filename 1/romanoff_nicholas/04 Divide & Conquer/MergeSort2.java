// Nicholas Romanoff
// Period One
// Homework #04 Merge Sort2
// 2014-03-04

import java.util.*;

class MergeSort2 {

	// mergeSort function of nlogn runtime - now works with ArrayLists of Strings
	public static ArrayList<String> mergeSort(ArrayList<String> a) {
		// basecase
		if (a.size() <= 1) {
			return a;
		}
		else {
			// splits a into halves
			// half 1
			ArrayList<String> h1 = new ArrayList<String>();
			for (int x = 0; x < (a.size() / 2); x++) {
				h1.add(a.get(x));
			}
			// half 2
			ArrayList<String> h2 = new ArrayList<String>();
			for (int x = (a.size() / 2); x < a.size(); x++) {
				h2.add(a.get(x));
			}
			// runs mergesort on both halves
			ArrayList<String> r1 = mergeSort(h1);
			ArrayList<String> r2 = mergeSort(h2);
			// merges components and returns
			return merge(r1, r2);
		}
	}

	// helper function for merging ordered arrays
	public static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b) {
		ArrayList<String> merged = new ArrayList<String>();
		int x = 0; // placeholder for a
		int y = 0; // placeholder for b
		int t = a.size() + b.size();
		while (merged.size() < t) {	
			// chooses smallest # from next two choices
			// adds to merged and updates placeholders
			// next element is in a
			if ((x < a.size()) && ((y >= b.size()) || 
				(a.get(x).length() <= b.get(y).length()))) {
				merged.add(a.get(x));
				x++;
			}
			// next element is in b
			else {
				merged.add(b.get(y));
				y++;
			}
			String printStr = "[";
			for (String n : merged) {
				printStr += " " + n;
			}
			System.out.println(printStr += " ]");
		}
		return merged;
	}


	// helper function for print arrays
	public void printArray(ArrayList<String> a) { 
		String printStr = "[";
        	for (String n : a) {
			printStr += " " + n;
		}
		System.out.println(printStr += " ]");
	}

	// driver for testing
	public static void main(String[] args) {

		MergeSort2 merger = new MergeSort2();

		String[] array = {"cat", "horse", "dolphin","penguin",
				  "dog", "ostrich", "dinosaur", "iguana",
				  "bee", "lizard", "whale", "zebra","hippopatamus",
				  "bumblebee", "koala", "tiger", "gnat"};

		ArrayList<String> arraylist = new ArrayList<String>();

		for (String s : array) {
			arraylist.add(s);
		}

		merger.printArray(mergeSort(arraylist));

		
	}
}
