import java.io.*;
import java.util.*;

public class MergeSortComparable {
	public ArrayList<Comparable> merge(ArrayList<Comparable> A, ArrayList<Comparable> B) {
		int ia = 0, ib = 0;
		int len = A.size() + B.size();
		ArrayList<Comparable> C = new ArrayList<Comparable>(len);
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

	public ArrayList<Comparable> sort(ArrayList<Comparable> L) {
		if (L.size() <= 1) 
			return L;
		else {
			int l = L.size();
			int a = l / 2, ia = 0;
			int b = l - a, ib = 0;
			ArrayList<Comparable> A = new ArrayList<Comparable>(a), B = new ArrayList<Comparable>(b);
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
		MergeSortComparable m = new MergeSortComparable();
		/*
		ArrayList<Comparable> a = new ArrayList<Comparable>();
		a.add("hi"); a.add("my"); a.add("name"); a.add("is"); a.add("fawn");
		a = m.sort(a);
		String print = "";
		for (int i = 0; i < a.size(); i++) {
			print = print + " " + a.get(i);
		}
		System.out.println(print);

		ArrayList<Comparable> b = new ArrayList<Comparable>();
		b.add(62); b.add(96); b.add(12); b.add(65); b.add(18);
		b = m.sort(b);
		print = "";
		for (int i = 0; i < b.size(); i++) {
			print = print + " " + b.get(i);
		}
		System.out.println(print);
		*/

		ArrayList<Comparable> a = new ArrayList<Comparable>();
		a.add(new Person("Anna", 15)); a.add(new Person("Carol", 13)); a.add(new Person("Bob", 20));
		a = m.sort(a);
		for (int i = 0; i < a.size(); i++) {
		    System.out.println(a.get(i));
		}
	}
}      
