public class Merge {
    
    public static String print(int[] x) {
	String ans = "";
	for (int y : x) {
	    ans += y + ",";
	}
	ans = ans.substring(0,ans.length()-1);
	return ans;
    }
    // parameters are assumed to be sorted
    public static String Merger(int[] a, int[] b) {
	int m = 0;
	int n = 0;
	int[] c = new int[a.length + b.length];
	for (int i = 0; i < c.length; i++) {
	    if (m == a.length || n == b.length) {
		if (m == a.length) {
		    c[i] = b[n];
		    n += 1;
		}
		else {
		    c[i] = a[m];
		    m += 1;
		}
	    }
	    else if (a[m] < b[n]) {
		c[i] = a[m];
		m += 1;
	    }
	    else {
		c[i] = b[n];
		n += 1;
	    }
	}
	String ans = print(c);
	return ans;
    }
    public static void main(String[] args) {
	int[] bob = new int[3];
	bob[0] = 0;
	bob[1] = 3;
	bob[2] = 4;
	int[] sally = new int[5];
	sally[0] = 2;
	sally[1] = 2;
	sally[2] = 5;
	sally[3] = 6;
	sally[4] = 6;
	System.out.println(print(bob));
	System.out.println(print(sally));
	System.out.println(Merger(bob, sally));
    }
}
		