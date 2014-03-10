
public class MergeSort{
	public static int[] data; 
	

	public static int[] mergeSort(int [] data){
		int x = data.length;
		int[]a,b;
		if (data.length % 2 == 0) {
			a = new int [data.length / 2];
			b = new int [data.length / 2]; 
		}
		else{
			a = new int [(data.length / 2) + 1];
			b = new int [data.length / 2]; 
		}

		if (x <= 1) {
			return data;
		}
		else{
			int counter = 0;
			for (int i = 0; i < a.length; i++) {
				a[i] = data[i];
				counter++;
			}
			for (int q = 0; q < b.length; q++) {
				b[q] = data[counter + q];
			}return merge(mergeSort(a), mergeSort(b));

		}
	}

	public static int[] merge(int [] a, int [] b){
		int [] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

    while (i < a.length && j < b.length)
    {
        if (a[i] < b[j])       
            answer[k++] = a[i++];

        else        
            answer[k++] = b[j++];               
    }

    while (i < a.length)  
        answer[k++] = a[i++];


    while (j < b.length)    
        answer[k++] = b[j++];

    return answer;
    
}
	

	public static void main(String[] args) {

		int [] data = new int [10000]; //test Array 
		for (int x = 0; x < data.length; x++) {
			data[x] = (int) (Math.random() * 100000 + 1); 
		}
		int [] ans = mergeSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.println(ans[i]);
		}
	}
}