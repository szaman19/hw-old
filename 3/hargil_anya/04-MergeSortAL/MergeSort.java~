import java.util.Arrays;

public class MergeSort{

    private static int[] merge(int[]a, int[]b) {
	int[] merged = new int[a.length + b.length];
	int x = 0;
	int i = 0;
	int j = 0;
	while(i < a.length && j < b.length) {
	    if(a[i] < b[j]){
		merged[x] = a[i];
		i++;
	    }
	    else{
		merged[x] = b[j];
		j++;
	    }
	    x++;
	}
	while(i < a.length) {
	    merged[x] = a[i];
	    i++;
	    x++;
	}
	while(j < b.length) {
	    merged[x] = b[j];
	    j++;
	    x++;
	}
	return merged;
    }

    private static int[] mergeSort(int[] a) {
	if(a.length > 1){
	    int[] new1 = new int[a.length/2];
	    int[] new2 = new int[a.length - (a.length/2)];
	    int i = 0;
	    for(; i < new1.length; i++) {
		new1[i] = a[i];
	    }
	    for(; i < a.length; i++) {
		new2[i-new1.length] = a[i];
	    }
	    return merge(mergeSort(new1), mergeSort(new2));
	}
	else {
	    return a;
	}
    }
    
    public static void main(String[] args) {
	int[] a = {2, 5, 3, 4, 7, 11, 8, 3, 5};
	int[] b = mergeSort(a);
	for(int x: b){
	    System.out.print(x + " ");
	}
    }

}
	    
