public class Merge{

	public static int[] merge(int[] A, int[] B){
		int[] C = new int[A.length + B.length];
		int apos = 0;
		int bpos = 0;
		for (int x = 0; x < C.length; x++){
			if (apos >= A.length){
				C[x] = B[bpos];
				bpos++;
			}
			if (bpos >= B.length){
				C[x] = A[apos];
				apos++;
			}
			if (apos < A.length && bpos < B.length){
				if (B[bpos] < A[apos]) {
					C[x] = B[bpos];
					bpos++;
				} else {
					C[x] = A[bpos];
					apos++;				
				}
			}
		}
		return C;
	}
	
	public static void printArray (int[] a){
		for (int x : a){
			System.out.print(x + ", ");
		}
	}

	public static void main(String[]args){
		int[] a = {1,2,6,9,19};
		int[] b = {3,5,7,10};
		int[] c = merge(a,b);
		printArray(c);
	}
}