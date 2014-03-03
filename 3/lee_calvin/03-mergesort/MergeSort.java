
public class MergeSort{
    //first implementation: naive, not optimized.
    public static  int[] merge1(int[] a, int[] b){
	int alength = a.length;
	int blength = b.length;
	int[] answer = new int[alength + blength];
	int progressa = 0;
	int progressb = 0;
	for(int i=0;i<a.length+blength;i++){
	    System.out.println(progressa + " " + progressb);
	    if(progressa == alength){
		answer[i] = b[progressb];
		progressb++;
	    }
	    else if(progressb == blength){
		answer[i] = a[progressa];
		progressa++;
	    }
	    else{
		if(a[progressa] > b[progressb]){
		    answer[i] = b[progressb];
		    progressb++;
		}
		else{
		    answer[i] = a[progressa];
		    progressa++;
		}
	    }

	}
	return answer;
    }
    public static void main(String[] args){
	int[] a = new int[]{2,4,8,16,24,85,234,243,312};
	int[] b = new int[] {0,2,5,44,90,255,256,1024,2048,3014};
	int[] c = merge1(a,b);
	for(int i : c){
	    System.out.println(i);
	}
    }
}