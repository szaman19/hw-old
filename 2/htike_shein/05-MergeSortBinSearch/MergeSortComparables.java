import java.util.Arrays;
import java.util.ArrayList;
public class MergeSortComparables{
	private static ArrayList<Comparable> merge(ArrayList<Comparable> a,ArrayList<Comparable> b){
		return merge(a,b,new ArrayList<Comparable>());
	}
	private static ArrayList<Comparable> merge(ArrayList<Comparable> a,ArrayList<Comparable> b,ArrayList<Comparable> c){
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
	public static ArrayList<Comparable> mergeSort(ArrayList<Comparable> x){
		if(x.size() <= 1){
			return x;
		}
		return merge(mergeSort(new ArrayList<Comparable>(x.subList(0,x.size() / 2))),mergeSort(new ArrayList<Comparable>(x.subList(x.size() / 2,x.size()))));
	}
	public static void main(String[] args){
		ArrayList<Comparable> argsc = new ArrayList<Comparable>(Arrays.asList(args));
		System.out.println(mergeSort(argsc));
	}
}