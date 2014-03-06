import java.util.*;
import java.io.*;

public class Binary{
	public int[] binarySearch(int n, int[] L){
		if (L[(L.length/2)] == n)
			return L.length/2;
		else{
			if (n < L.length/2)
				return binarySearch(n, Arrays.copyOfRange(L, 0, (L.length/2)-1));
			else
				return binarySearch(n, Arrays.copyOfRange(L, (L.length/2), L.length-1));
		}
	}
}