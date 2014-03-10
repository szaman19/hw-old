import java.util.ArrayList;

public class Merge {

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
            x = merge(y,z);
            
            return x;
        }
        else
            return x;
    }
}
