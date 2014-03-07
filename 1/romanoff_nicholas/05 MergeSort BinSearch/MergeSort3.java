// Nicholas Romanoff
// Period One
// Homework #05 MergeSort: Comparables
// 2014-03-05

import java.util.*;

class MergeSort3 {

	// mergeSort function of nlogn runtime - now works with ArrayLists of Comparables
	public static ArrayList<Comparable> mergeSort(ArrayList<Comparable> a) {
		// basecase
		if (a.size() <= 1) {
			return a;
		}
		else {
			// splits a into halves
			// half 1
			ArrayList<Comparable> h1 = new ArrayList<Comparable>();
			for (int x = 0; x < (a.size() / 2); x++) {
				h1.add(a.get(x));
			}
			// half 2
			ArrayList<Comparable> h2 = new ArrayList<Comparable>();
			for (int x = (a.size() / 2); x < a.size(); x++) {
				h2.add(a.get(x));
			}
			// runs mergesort on both halves
			ArrayList<Comparable> r1 = mergeSort(h1);
			ArrayList<Comparable> r2 = mergeSort(h2);
			// merges components and returns
			return merge(r1, r2);
		}
	}

	// helper function for merging ordered arrays
	public static ArrayList<Comparable> merge(ArrayList<Comparable> a,
					          ArrayList<Comparable> b) {
		ArrayList<Comparable> merged = new ArrayList<Comparable>();
		int x = 0; // placeholder for a
		int y = 0; // placeholder for b
		int t = a.size() + b.size();
		while (merged.size() < t) {	
			// chooses smallest # from next two choices
			// adds to merged and updates placeholders
			// next element is in a
			if ((x < a.size()) && ((y >= b.size()) || 
				(a.get(x).compareTo(b.get(y)) <= 0))) {
				merged.add(a.get(x));
				x++;
			}
			// next element is in b
			else {
				merged.add(b.get(y));
				y++;
			}
		}
		return merged;
	}
}
