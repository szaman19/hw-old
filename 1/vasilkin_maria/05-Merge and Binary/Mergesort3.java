import java.util.ArrayList;
public class Mergesort3 {

    public static ArrayList<Comparable> mergesort(ArrayList<Comparable> c) {
	if (c.size() <= 1) {
	    return c;
	}

	ArrayList <Comparable> a = new ArrayList <Comparable> (c.size()/2);
        ArrayList <Comparable> b = new ArrayList <Comparable> (c.size() - a.size());
	int i;
	for (i = 0; i < a.size(); i++) {
	    a.set(i, c.get(i));
	}
	for (; i < b.size(); i++) {
	    b.set(c.size()-i-1, c.get(i));
	    //(b.get(c.size()-i-1)).set(c.get(i));//b[c.size()-i-1] = c[i];//why?
	}
	    
	a = mergesort(a);
	b = mergesort(b);
	
        ArrayList<Comparable>  merged = merge(a,b);
	return merged;
	
    }
    public static  ArrayList <Comparable>  merge(ArrayList <Comparable> a, 
						 ArrayList <Comparable> b) {
	ArrayList <Comparable> merged = new ArrayList <Comparable> (a.size()+ b.size());
	//System.out.println(merge);
	int indexa = 0;
	int indexb = 0;
	int indexm = 0;
	while (indexa < a.size() && indexb < b.size())  {
	    if ((a.get(indexa).compareTo(b.get(indexb))) < 0) {
		merged.set(indexm, a.get(indexa));
		indexa++;
	    } 
	    else {
		merged.set(indexm, b.get(indexb));
		indexb++;
	    }
	    indexm++;
	}

	if (indexa <= a.size()) {
	    while (indexm < merged.size()){
		merged.set(indexm, b.get(indexb));
		indexm++;
		indexb++;
	    }
	} else {
	    while (indexm < merged.size()){
		(merged).set(indexm,(a.get(indexa)));
		indexm++;
		indexa++;
	    }
	}
	return merged;
    }


    /* public static String linsearch(String s, ArrayList <Comparable> a) {
       for (int i = 0; i < a.size(); i++) {
       if (((a.get(i)).compareTo(s)) == 0) {
       return i;
       }
       }
	    
       }*/
    public static void main (String[] args) {
	ArrayList <Comparable> a = new ArrayList<Comparable>();
	int[] array  = new int[100];
	for (int i : array) {
	    a.add((int)(Math.random()*100));
	    
	}
	System.out.println(mergesort(a));
	
	ArrayList <Comparable> b = new ArrayList<Comparable>();
	Person x = new Person("sam", 16);
	Person y = new Person("ham", 50);
	Person z = new Person("pam", 1);
	b.add(x);
	b.add(y);
	b.add(z);
	System.out.println(mergesort(b));
	
    }
}	
