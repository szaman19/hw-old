import java.io.*;
import java.util.*;

public class MergeSortString {
	public ArrayList<String> merge(ArrayList<String> A, ArrayList<String> B) {
		int ia = 0, ib = 0;
		int len = A.size() + B.size();
		ArrayList<String> C = new ArrayList<String>(len);
		for (int i = 0; i < len; i++) {
			if (ia == A.size()) {
				C.add(B.get(ib));
				ib = ib + 1;
			}
			else if (ib == B.size()) {
				C.add(A.get(ia));
				ia = ia + 1;
			}
			else if (A.get(ia).compareTo(B.get(ib)) < 0) {
				C.add(A.get(ia));
				ia = ia + 1;
			}
			else {
				C.add(B.get(ib));
				ib = ib + 1;
			}
		}
		return C;
	}

	public ArrayList<String> sort(ArrayList<String> L) {
		//System.out.println(L.size());
		if (L.size() <= 1) 
			return L;
		else {
			int l = L.size();
			int a = l / 2, ia = 0;
			int b = l - a, ib = 0;
			ArrayList<String> A = new ArrayList<String>(a), B = new ArrayList<String>(b);
			for (int i = 0; i < l; i++) {
				if (i < a) {
					A.add(L.get(i));
					ia = ia + 1;
				}
				else {
					B.add(L.get(i));
					ib = ib + 1;
				}
			}
			A = sort(A);
			B = sort(B);
			L = merge(A,B);
			return L;
		}
	}

	public static void main(String[] args) {
		MergeSortString m = new MergeSortString();
		ArrayList<String> a = new ArrayList<String>();
		a.add("hi");
		a.add("my");
		a.add("name");
		a.add("is");
		a.add("fawn");
		System.out.println(a.size());
		a = m.sort(a);
		String print = "";
		for (int i = 0; i < a.size(); i ++) {
			print = print + " " + a.get(i);
		}
		System.out.println(print);
		
	}
}      