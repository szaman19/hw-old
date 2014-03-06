import java.util.*;
import java.lang.*;
public class MergeDrive{

    public static void main(String[]args){
	MergeWords a = new MergeWords();
	ArrayList<String> b = new ArrayList<String>();
	b.add("nope");
	b.add("yelling");
	b.add("zebra");
	b.add("xylphone");
	b.add("hellfire");
	b.add("texas");
	b.add("aardvark");
	b.add("mine");
	b.add("never");


	a.print(a.MergeSort(b));

    }

}
