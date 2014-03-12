import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Quickselect q = new Quickselect();
	int[] L = {2,6,4,1,8,9};
	System.out.println(q.quickselect(L,4,0,L.length));
    }
}
