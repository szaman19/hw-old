// Nicholas Romanoff
// Period One
// Homework #05 Searches
// 2014-03-05

public class Searches {


    /*==================================================
      int linSearch(Comparable[],Comparable) -- searches an array of 
      Comparables for target
      post: returns index of first occurrence of target, or
            returns -1 if target not found
      ==================================================*/
    public static int linSearch ( Comparable[] a, Comparable target ) {

	int tPos = -1;
	int i = 0;

	while ( i < a.length ) {
	    if ( a[i].equals(target) ) {
		tPos = i;
		break;
	    }
	    i++;
	}
	return tPos;
    }


    public static int binSearchRec( int[] a, int target, int lo, int hi ) {
	int guess = 0;
	guess = ((lo + hi) / 2);
	System.out.print("Guess a number between " + a[lo] + " & " + a[hi] + ": " + a[guess]);
	if ((hi < lo) || (lo > hi)) {
		System.out.println("  Error: target is not in the list of numbers!");
		guess = -1;
	}
	else {
		if( a[guess] == target ) {
			System.out.println("  Success!");
			System.out.println();
		}
		else {
			if (a[guess] > target) {
				System.out.println("  Too high");
				binSearchRec(a, target, lo, (guess - 1));
			}
			else {
				System.out.println("  Too low");
				binSearchRec(a, target, (guess + 1), hi);
			}
		}
	}
	return guess;
    }

    public static int binSearchIter( int[] a, int target, int lo, int hi ) {
	int guess = 0;
	int guessCtr = 0;
	while( true ) {
	    guess = ((lo + hi) / 2);
	    guessCtr++;
	    System.out.print("Guess a number between " + a[lo] + " & " + a[hi] + ": " + a[guess]);
	    if ((hi < lo) || (lo > hi)) {
		System.out.println("  Error: target is not in the list of numbers!");
		guess = -1;
	        break;
	    }
	    if( a[guess] == target ) {
		System.out.println("  Success! It took " + guessCtr + " guesses");
		System.out.println();
		break;
	    }
	    else if( a[guess] > target ) {
		hi = guess - 1;
		System.out.println("  Too high");
	    }
	    else {
		lo = guess + 1;
		System.out.println("  Too low");
	    }
	}
	return guess;
    }

    //tell whether an array is sorted in ascending order
    private static boolean isSorted( int[] arr ) {
	boolean ret = false;
	int max = arr[0];
	for (int x : arr) {
		if (x < max) {
			ret = false;
			break;
		}
		else {
			ret = true;
			max = x;
		}
	}
			
	return ret;
    }


    // utility/helper fxn to display contents of an array of Objects
    private static void printArray( int[] arr ) {
	String output = "[ "; 

	for( int i : arr )
	    output += i + ", ";

	output = output.substring( 0, output.length()-2 ) + " ]";

	System.out.println( output );
    }


    //main method for testing
    public static void main ( String[] args ) {


	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	System.out.println("\nNow testing linSearch on int array...");

	//Declare an array of Comparables and initialize it using ints 
	//   Each int will be autoboxed to class Integer, 
	//   which implements Comparable.
	Comparable[] iArr = { 2, 4, 6, 8, 6, 42 };
	printArray( iArr );

	//search for 6 in array 
	System.out.println( linSearch(iArr,6) );

	//search for 43 in array 
	System.out.println( linSearch(iArr,43) );
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


	System.out.println("\nNow testing linSearch on Comparable arrays...");


	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	System.out.println("\nNow testing linSearch on String array...");

	//declare and initialize an array of Strings
	String[] sArr = { "kiwi", "watermelon", "orange", "apple", 
		       "peach", "watermelon" };
	printArray( sArr );

	//search for "watermelon" in array
	System.out.println( linSearch(sArr,"watermelon") );

	//search for "lychee" in array
	System.out.println( linSearch(sArr,"lychee") );
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	System.out.println("\nNow testing binSearch on int array...");

	//Declare and initialize array of ints
	int[] iArr = { 2, 4, 6, 8, 6, 42 };
	printArray( iArr );
	System.out.println( "sorted? -- " + isSorted(iArr) );

	int[] iArr2 = { 2, 4, 6, 8, 13, 42 };
	printArray( iArr2 );
	System.out.println( "sorted? -- " + isSorted(iArr2) );

	//search for 6 in array 
	System.out.println( binSearch(iArr,6) );

	//search for 43 in array 
	System.out.println( binSearch(iArr,43) );
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	}
}

