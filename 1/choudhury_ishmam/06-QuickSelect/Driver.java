import java.io.*;
import java.util.*;

public class Driver {
	public static void main( String[] args) { 
		Quickselect qs = new Quickselect();
		int[] test= new int [20];
		for (int i=0; i< test.length; i++){
			test[i]=(int)(Math.random()*30);
		}
		System.out.println(Arrays.toString(test));
		System.out.println(qs.quickSelect(test, 3,0,9));
	}
}