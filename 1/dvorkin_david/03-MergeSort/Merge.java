import java.util.*;
import java.io.*;

public class Merge {

    private ArrayList a = new ArrayList();
    private ArrayList b = new ArrayList();

    public ArrayList sort (a, b){
	ArrayList c = new ArrayList();
	while (a.length > 0 || b.length > 0){
	    if (a[0] <= b[0]){
		c.add(a[0]);
		a.remove(0);
	    }
	    else if (b[0] < a[0]){
		c.add(b[0]);
		b.remove(0);
	    }
	}
        return c;
    }
}
