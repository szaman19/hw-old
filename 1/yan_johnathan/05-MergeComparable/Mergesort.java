//Johnathan Yan
//Period 1
//nlogn

import java.util.ArrayList;

public class Mergesort{
	
	public static ArrayList<Comparable> merge( ArrayList<Comparable> a, ArrayList<Comparable> b ) {
	
		ArrayList<Comparable> ret = new ArrayList<Comparable>(a.size() + b.size());
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
	
	public static ArrayList<Comparable> mergeSort( ArrayList<Comparable> x ){
		if (x.size() <= 1)
			return x;
		else{
			ArrayList<Comparable> left = new ArrayList<Comparable>(x.size()/2); // left half
			ArrayList<Comparable> right = new ArrayList<Comparable>(x.size() - x.size()/2); // right half
		
			for (int y = 0; y < (x.size()/2); y++) // fills in left half from left to right until full
				left.add(y,x.get(y));
		
			for (int y = x.size()/2; y < x.size(); y++) // does the same for right hlaf
				right.add(y - (x.size()/2), x.get(y));

			ArrayList<Comparable> retLeft = mergeSort(left); // continuously splits left in half until 
											 // only 1 element per array, merges these arrays
											 // therefore they are in order
		
			ArrayList<Comparable> retRight = mergeSort(right); // continuously splits right in half until 
											 // only 1 element per array, merges these arrays
											 // therefore they are in order
											 
			x = merge(retLeft,retRight); // merges the pre-sorted arrays retLeft and retRight
		}
			return x;
	}
	
	public static void main(String[] args){
		System.out.println(); // aesthetic purpose
		ArrayList<Comparable> a = new ArrayList<Comparable>();
		ArrayList<Comparable> b = new ArrayList<Comparable>();
		ArrayList<Comparable> c = new ArrayList<Comparable>();
		ArrayList<Comparable> d = new ArrayList<Comparable>();
		ArrayList<Comparable> e = new ArrayList<Comparable>();
		a.add("Hi");
		a.add("Hello");
		a.add("Hola");
		b.add("Interesting");
		b.add("INTERESTING");
		b.add("iNteresting");
		c.add(1);
		c.add(44);
		c.add(105);
		d.add(45);
		d.add(76);
		d.add(6);
		e.add(new Person(6,"test1"));
		e.add(new Person(5,"test2"));
		e.add(new Person(4,"test3"));
		e.add(new Person(4,"argument"));
		System.out.println("Original A: " + a);
		System.out.println("Original B: " + b);
		System.out.println("Original C: " + c);
		System.out.println("Original D: " + d);
		System.out.println("Original E(Person): " + e);
		System.out.println("Merge: " + merge(a,b)); // use toString method
		System.out.println("Mergesort A: " + mergeSort(a)); // use toString method
		System.out.println("Mergesort B: " + mergeSort(b)); // use toString method
		System.out.println("Mergesort C: " + mergeSort(c)); // use toString method
		System.out.println("Mergesort D: " + mergeSort(d)); // use toString method
		System.out.println("Mergesort E: " + mergeSort(e)); // use toString method
	}
}
