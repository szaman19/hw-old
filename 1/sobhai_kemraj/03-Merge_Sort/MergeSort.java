import java.io.*;
import java.util.*;

public class MergeSort{

    public int[] merge(int[] a, int[] b){
		int[] answer = new int[a.length + b.length];
		int aPlace = 0;
		int bPlace = 0;
		//perhaps not the best way to do this!
		while (aPlace < a.length && bPlace < b.length){
			if (a[aPlace] > b[bPlace]){
				answer[aPlace + bPlace] = a[aPlace];
				aPlace++;
			}
			else{
				answer[aPlace + bPlace] = b[bPlace];
				bPlace++;
			}
		}
		return answer[];
    }

}