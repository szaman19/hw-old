import java.io.*;
import java.util.*;

public class Merge{
	public int[] msort(int[] a){
		if (a.length <= 1)
			return a;	

		int[] left = split(a,1);
		int[] right = split(a,2);
		left = msort(left);
		right = msort(right);
		return merge(left, right);
		
	}

	public int[] merge(int[] l, int[] r) {
		int[] a = new int[l.length + r.length];
		int i = 0;
		int j = 0;  
		int k = 0;
		while (j<l.length && k<r.length) {
			if (l[j]<r[k]){
				a[i] = l[j];
				j++;
				i++;
			}
			else{
				a[i] = r[k];
				k++;
				i++;
			}
		}

		if(k>=r.length){
			while(i<a.length){
				a[i] = l[j];
				j++;
				i++;
			}
		}
		else{
			while(i<a.length){
				a[i] = r[k];
				k++;
				i++;
			}
		}
		return a;
	}

	public int[] split(int[] a, int n){
		int size1 = a.length / 2;
		int size2 = a.length - size1;
		if (n==1){
			int[] res = new int[size1];
			for(int i = 0; i < size1; i++){
				res[i] = a[i];
			}
			return res;
		}
		else {
			int[] res = new int[size2];
			for(int i = size1; i<a.length;i++){
				res[i-size1] = a[i];
			}
			return res;
		}
	}

	public ArrayList<String> msort2(ArrayList<String> a){
		if (a.size() <= 1)
			return a;	

		ArrayList<String> left = split2(a,1);
		ArrayList<String> right = split2(a,2);
		left = msort2(left);
		right = msort2(right);
		return merge2(left, right);
		
	}

	public ArrayList<String> merge2(ArrayList<String> l, ArrayList<String> r) {
		ArrayList<String> a = new ArrayList<String>();
		int i = 0;
		int j = 0;  
		int k = 0;
		int sizes = l.size()+r.size();
		while (j<l.size() && k<r.size()) {
			if (l.get(j).compareTo(r.get(k)) < 0){
				a.add(l.get(j));
				j++;
				i++;
			}
			else{
				a.add(r.get(k));
				k++;
				i++;
			}

		}

		if(k>=r.size()){
			while(i<sizes){
				a.add(l.get(j));
				j++;
				i++;
			}
		}
		else{
			while(i<sizes){
				a.add(r.get(k));
				k++;
				i++;
			}
		}
		return a;
	}

	public ArrayList<String> split2(ArrayList<String> a, int n){
		int size1 = a.size() / 2;
		int size2 = a.size()- size1;
		if (n==1){
			ArrayList<String> res = new ArrayList<String>();
			for(int i = 0; i < size1; i++){
				res.add(a.get(i));
			}

			return res;
		}
		else {
			ArrayList<String> res = new ArrayList<String>();
			for(int i = size1; i<a.size();i++){
				res.add(a.get(i));
			}
			return res;
		}
	}

	public static void main(String[] args){
		Merge m = new Merge();
		int[] s = {4,7,2,6,9,1,3,2,8,34,16,35,77,86,94,154,214,315,435,574,654,73657,85478678,99999};
		System.out.println("" + Arrays.toString(m.msort(s)));
		ArrayList<String> a = new ArrayList<String>();
		a.add("zi");
		a.add("weird");
		a.add("try");
		a.add("sort");
		a.add("to");
		a.add("these");
		a.add("stuff");
		a.add("lol");
		for (int i = 0;i<a.size();i++){
			System.out.println(m.msort2(a).get(i));
		}

	}
}