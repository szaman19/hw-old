import java.util.ArrayList;

public class mergesort3 {
    
   

    public static ArrayList<Comparable> merge(ArrayList<Comparable> a, ArrayList <Comparable> b) {
	
        ArrayList<Comparable> ans = new ArrayList<Comparable>();
	
	while ((a.size() > 0) && (b.size() > 0)) {
	    if ((a.get(0).compareTo(b.get(0))) <= 0) {
		    ans.add(a.get(0));
		    a.remove(0);
		}
		else {
		    ans.add(b.get(0));
		    b.remove(0);
		}
	}
        
        while (a.size() > 0) {
	    ans.add(a.get(0));
	    a.remove(0);
	}
        while (b.size() > 0) {
	    ans.add( b.get(0));
	    b.remove(0);
	}
        
        return ans;
	
    }
    
    public static ArrayList<Comparable> sort(ArrayList<Comparable> x) {
	if (x.size() > 1) {
	    ArrayList<Comparable> y = new ArrayList<Comparable>();
	    ArrayList<Comparable> z = new ArrayList<Comparable>();
	    int divide = x.size()/2;
	    for (int i = 0; i < divide; i++) {
                y.add(x.get(i));
	    }
            for (int j = divide; j < x.size(); j++) {
                z.add(x.get(j));
	    }
            y = sort(y);
            z = sort(z);
            x = merge(y,z); //now that lists are in half, merge them (accounting for values and putting them in order).
            
            return x;
        }
        else
            return x;
    }
    
    public static void main(String[]args) {
	ArrayList<Comparable> whynot = new ArrayList<Comparable>();
	whynot.add("Ooh");
	whynot.add("Allday");
	whynot.add("Ballsohard");
	whynot.add("Stuycs");
	whynot.add("dustymodem");
	whynot.add("Kobe");
	whynot.add("github");
	for (int i = 0;i<1;i++) {
	    System.out.println("The ArrayList 'Whynot': " + whynot + "\n");
	    System.out.println("Sorted: " + sort(whynot) + "\n");
	}

	ArrayList<Comparable> again = new ArrayList<Comparable>();
	again.add(45);
	again.add(23);
	again.add(24);
	again.add(5);
	again.add(98);
	for (int j = 0;j<1;j++) {
	    System.out.println("The ArrayList 'again': " + again + "\n");
	    System.out.println("Sorted: " + sort(again) + "\n");
	}
    }
}

