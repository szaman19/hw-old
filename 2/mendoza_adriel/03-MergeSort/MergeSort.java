import java.util.*;

public class MergeSort{

    public int[] MergeSort(int[] a) {
        int[] one;
        int[] two;
        if(a.length <= 1){
            return a;
        }else{
            int i = a.length/2;
            one = new int[i];
            two = new int[a.length - one.length];
            for(int j = 0; j < a.length; j++){
                if(j < i){
                    one[j] = a[j];
                }
                else{
                    two[j - i] = a[j];
                }
            }
	}
	System.out.println("One: " + Arrays.toString(one));
	System.out.println("Two: " + Arrays.toString(two));

        one = MergeSort(one);
        two = MergeSort(two);
        a = merge(one, two);
        return a;
    }

    public int[] merge(int[] one, int[] two) {
	int[] resp = new int[one.length + two.length];
        int oc = 0;
        int tc = 0;
	int count = 0;
        while(oc < one.length && tc < two.length){
            if(one[oc] < two[tc]){
                resp[count] = one[oc];
	        oc++;
            }else{
                resp[count] = two[tc];
                tc++;
	    }
	    count++;
	}
        while(oc < one.length){
	    resp[count] = one[oc];
	    oc++;
	    count++;
	}
	while(tc < two.length){
	    resp[count] = two[tc];
	    tc++;
	    count++;
	}
        return resp;
    }

    public static void main(String args[]){
	MergeSort m = new MergeSort();
	int[] i = {1, 5, 32, 42, 24, 12, 98, 3, 21, 4, 16, 3};
	System.out.println(Arrays.toString(m.MergeSort(i)));
    }
}
