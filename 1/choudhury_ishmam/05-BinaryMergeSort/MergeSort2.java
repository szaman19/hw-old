import java.io.*;
import java.util.*;

public class MergeSort2 {
       
       public ArrayList<Comparable> merge(ArrayList<Comparable> A, 
       	      			    	  ArrayList<Comparable> B) {
					 
	   int posA = 0;
	   int posB = 0;
	   int count = 0;
	   ArrayList<Comparable> fin = new ArrayList<Comparable>;
	   for (int i = 0; i < A.size() + B.size(); i++) {
	       if (posA == A.size()) {
		   fin.add(B.get(posB));
		   posB++;
	       }
	       else if (posB == B.size()) {
		   fin.add(A.get(posA));
		   posA++;
	       }
	       else if (A.get(posA) > B.get(posB)) {
		   fin.add(A.get(posA));
		   posA++;
	       }
	       else {
		   fin.add(B.get(posB));
		   posB++;
	       }
	       count++;
	   }
	   return fin;
       }