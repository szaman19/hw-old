import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	merge m = new merge();
	Random r = new Random();
	ArrayList<String> test = new ArrayList<String>();
	for (int i = 0; i<10; i++){
	    test.add("" + r.nextInt(50));
	}
	System.out.println(ArrayLists.toString(m.msort(test)));
    }
}
