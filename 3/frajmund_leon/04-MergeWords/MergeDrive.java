import java.util.*;
import java.lang.*;
public class MergeDrive{

    public static void main(String[]args){
	MergeWords a = new MergeWords();
	Random rand = new Random();
	ArrayList<String> b = new ArrayList<String>();
	int[] array = new int[100];
	int[] array2 = new int[4];
	String word = "";
	for(int c : array){
	    for(int d : array2){
		word += a.alpha[rand.nextInt(26)];
	    }
	    b.add(word);
	    word = "";
	}


	a.print(a.MergeSort(b));

    }

}
