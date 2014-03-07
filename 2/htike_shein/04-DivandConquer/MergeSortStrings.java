import java.util.Arrays;
import java.util.ArrayList;
public class MergeSortStrings{
	private static ArrayList<String> merge(ArrayList<String> a,ArrayList<String> b){
		return merge(a,b,new ArrayList<String>());
	}
	private static ArrayList<String> merge(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
		if(a.size() == 0){
			c.addAll(b);
			return c;
		}
		else if(b.size() == 0){
			c.addAll(a);
			return c;
		}
		else{
			if(a.get(0).compareTo(b.get(0)) <= 0){
				c.add(a.remove(0));
				return merge(a,b,c);
			}
			else{
				c.add(b.remove(0));
				return merge(a,b,c);
			}
		}
	}
	public static ArrayList<String> mergeSort(ArrayList<String> x){
		if(x.size() <= 1){
			return x;
		}
		return merge(mergeSort(new ArrayList<String>(x.subList(0,x.size() / 2))),mergeSort(new ArrayList<String>(x.subList(x.size() / 2,x.size()))));
	}
	public static void main(String[] args){
		// Sorts your args and prints it.
		ArrayList<String> argsc = new ArrayList<String>(Arrays.asList(args));
		System.out.println(mergeSort(argsc));
	}
}