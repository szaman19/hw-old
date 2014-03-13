// Nicholas Romanoff
// Period One
// Homework #06 QuickSelect 1
// 2014-03-11

public class QuickSelect {

	public int quickSelect(int[] a, int k, int low, int high) {
		
		if (low >= high) {
			System.out.println("basecase");
			return high;
		}

		else {
			int pivot = low + 1 + (int) (Math.random() * (high - low - 1));
			int[] t = a;
			int x = low;
			while (a[x] < a[pivot]) {
				t[x] = a[x];
				x++;
			}
			t[x] = a[pivot];
			while (x < pivot) {
				t[x + 1] = a[x];
				x++;
			}
			x++;
			while (x < t.length) {
				t[x] = a[x];
			}
			a = t;
			System.out.println(t);
			if (pivot == k) {
				return pivot;
			}
			else {
				return quickSelect(a, k, pivot + 1, high);
			}
		}

	}

	public static void main(String[] args) {
		QuickSelect qs = new QuickSelect();
		int[] a = {5, 3, 7, 1, 5, 7, 8, 3, 5};
		System.out.println(qs.quickSelect(a, 2, 0, 9));
	}
}
