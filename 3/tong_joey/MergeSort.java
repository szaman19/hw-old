
public class MergeSort{	     

    private boolean up = false;

    public int[] Merge(int[]a, int[]b){
	int[]result = new int[a.length+b.length];
	System.out.println(java.util.Arrays.toString(a) + "," + java.util.Arrays.toString(b));
	if (a.length == 1 && b.length == 0){
	    return a;
	}else if(a.length == 0 && b.length == 1){
	    return b;
	}else if (a.length < 2 && b.length < 2){
		    up = true;
       	}else if (a.length > 1 && !up){
	    if (a.length % 2 == 0){
		int[]x = new int[a.length/2];
		System.arraycopy(a, 0, x,0, a.length/2);
		int[]y = new int[b.length/2];
		System.arraycopy(b, b.length/2-1, y,0, b.length/2);
		Merge(x,y);
	    }/*else{
		int[]x = new int[a.length/2];
		System.arraycopy(a, 0, x,0, a.length/2);
		int[]y = new int[b.length/2+1];
		System.arraycopy(b, b.length/2-1, y,0, b.length/2 + 1);
		Merge(x,y);
		    }*/
	}else if (b.length > 1 && !up){
	    if (b.length % 2 == 0){
		int[]x = new int[a.length/2];
		System.arraycopy(b, 0, x,0, b.length/2);
		int[]y = new int[b.length/2];
		System.arraycopy(b, b.length/2-1, y,0, b.length/2);
		Merge(x,y);
	    }/*else{
		int[]x = new int[a.length/2];
		System.arraycopy(b, 0, x,0, b.length/2);
		int[]y = new int[b.length/2+1];
		System.arraycopy(b, b.length/2-1, y,01, b.length/2 + 1);
		Merge(x,y);
		}	*/
	}else if(up){
	    System.out.println(java.util.Arrays.toString(a) + "," + java.util.Arrays.toString(b));
	    int i = 0, j = 0, k = 0;
	    while(i < result.length && j < a.length && k < b.length){
		if(a.length - j == 1 && b.length - k == 0){
		    result[i] = a[k];
		    i++;
		    j++;
		}else if(b.length - k == 1 && a.length - j == 0){
		    result[i] = b[j];
		    i++;
		    k++;
		}else{
		    if(a[j] > b[k]){
			result[i] = a[k];
			i++;
			j++;
		    }else if(a[j] < b[k]){
			result[i] = b[j];
			i++;
			k++;
		    }
		}
	    }
	}
	return result;
    }
    public static void main(String[]args){
	int[]a = new int[]{2,4};
	int[]b = new int[]{1,3};
	MergeSort m = new MergeSort();
	System.out.println(java.util.Arrays.toString(m.Merge(a,b)));
    }
}
