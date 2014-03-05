//Johnathan Yan
//Period 1
//nlogn

import java.util.ArrayList;

public class Mergesort{
	
	public static ArrayList<String> merge( ArrayList<String> a, ArrayList<String> b ) {
	
		ArrayList<String> ret = new ArrayList<String>(a.size() + b.size());
		// System.out.println(ret.size()); debugging purposes
		int countA = 0;
		int countB = 0;
		int count = 0;

		while (count < (a.size() + b.size())){

			if (countA == a.size()){
				ret.add(count, b.get(countB));
				countB++;
			}
			
			else if (countB == b.size()){
				ret.add(count, a.get(countA));
				countA++;
			}
			
			else if (a.get(countA).compareTo(b.get(countB)) < 0){	
				ret.add(count, a.get(countA));
				countA++;
			}
			
			else {
				ret.add(count, b.get(countB));
				countB++;
			}
			count++;
		}
		
		return ret;
	
	}
	
	public static ArrayList<String> mergeSort( ArrayList<String> x ){
		if (x.size() <= 1)
			return x;
		else{
			ArrayList<String> left = new ArrayList<String>(x.size()/2); // left half
			ArrayList<String> right = new ArrayList<String>(x.size() - x.size()/2); // right half
		
			for (int y = 0; y < (x.size()/2); y++) // fills in left half from left to right until full
				left.add(y,x.get(y));
		
			for (int y = x.size()/2; y < x.size(); y++) // does the same for right hlaf
				right.add(y - (x.size()/2), x.get(y));

			ArrayList<String> retLeft = mergeSort(left); // continuously splits left in half until 
											 // only 1 element per array, merges these arrays
											 // therefore they are in order
		
			ArrayList<String> retRight = mergeSort(right); // continuously splits right in half until 
											 // only 1 element per array, merges these arrays
											 // therefore they are in order
											 
			x = merge(retLeft,retRight); // merges the pre-sorted arrays retLeft and retRight
		}
			return x;
	}
	
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		a.add("Hi");
		a.add("Hello");
		a.add("Hola");
		b.add("Interesting");
		b.add("interesting");
		b.add("iNteresting");
		System.out.println("Original A: " + a);
		System.out.println("Original B: " + b);
		System.out.println("Merge: " + merge(a,b)); // use toString method
		System.out.println("Mergesort: " + mergeSort(a)); // use toString method
	}
}
