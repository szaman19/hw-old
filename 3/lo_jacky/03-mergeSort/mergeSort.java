public class mergeSort{
    
    public static int[] mergeSort(int[] arr){
	if (arr.length <= 1)
	    return arr;
	else{
	    int[] h1 = new int[arr.length/2], h2 = new int[1];
	    for (int i = 0; i < arr.length/2; i++)
		    h1[i] = arr[i];
	    if (arr.length % 2 == 1)
		h2 = new int[arr.length/2 + 1];
	    else if (arr.length % 2 == 0)
		h2 = new int[arr.length/2];
	    for (int i = arr.length/2; i < arr.length; i++)
		h2[i - arr.length/2] = arr[i];
	    int[] r1 = mergeSort(h1);
	    int[] r2 = mergeSort(h2);
	    return merge(r1, r2);
	}
    }

    public static int[] merge(int[] arr1, int[] arr2){
	int[] res = new int[arr1.length + arr2.length];
	int a = 0, b = 0;
	for (int i = 0; i < res.length; i++){
	    if (a < arr1.length && b < arr2.length){
		if (arr1[a] < arr2[b]){
		    res[i] = arr1[a];
		    a++;
		}else if (arr2[b] <= arr1[a]){
		    res[i] = arr2[b];
		    b++;
		}
	    }else if (a < arr1.length){
		res[i] = arr1[a];
		a++;
	    }else if (b < arr2.length){
		res[i] = arr2[b];
		b++;
	    }
	}
	return res;
    }

    public static String toString(int[] arr){
	String str = "";
	for (int i = 0; i < arr.length; i++){
	    str += arr[i] + " ";
	}
	return str;
    }

    public static void main(String[] args){
	int[] a = new int[15];
	for (int i = 0; i < a.length; i++){
	    a[i] = (int)(Math.random() * 1000);
	}
	System.out.println(toString(mergeSort(a)));
    }
}
