import java.util.*;

public class BinarySearch {

    public ArrayList<Comparable> makeList(int n) {
	ArrayList<Comparable> res = new ArrayList<Comparable>();
	for (int i=0;i<n;i++) {
	    res.add((int)(Math.random() * 100000));
	}
	return res;
    }

    public int rbsearch(Comparable n, ArrayList<Comparable> L) {
	int middle = L.size()/2;
	if (L.size() == 1 && !L.get(0).equals(n))
	    return -1;

	if (n.equals(L.get(middle))) {
	    return middle;
	}
	else {
	    if (n.compareTo(L.get(middle)) == -1) {
		ArrayList<Comparable> fhalf = new ArrayList<Comparable>();
		for (int i=0;i<middle;i++) {
		    fhalf.add(L.get(i));
		}
		return rbsearch(n,fhalf);
	    }
	    else {
		ArrayList<Comparable> shalf = new ArrayList<Comparable>();
		for (int i=0;i<middle;i++) {
		    shalf.add(L.get(middle + i));
		}
		return middle + rbsearch(n,shalf);
	    }
	}
    }

    public int ibsearch(Comparable n, ArrayList<Comparable> L) {
	int middle = L.size()/2;

	while (!L.get(middle).equals(n)){
	    if (n.compareTo(L.get(middle)) == -1){
		middle = middle/2;
		System.out.println(middle);
	    }
    	    else {
		middle = middle + middle/2 + 1;
		System.out.println(middle);
	    }
	}
	
	if (middle > -1)
	    return middle;
	else
	    return -1;
    }
}
