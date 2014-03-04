import java.util.ArrayList;
public class TimeTrials{
    public static void ssort(int[]a) {
	int swaps=0; int comparisons=0;
	for (int i=0;i<a.length-1;i++) {
	    int min=i;
	    for (int j=i;j<a.length;j++) {
		comparisons++;
		if (a[j]<a[min]){
		    min=j;
		}
	    }
	    swaps++;
	    int tmp=a[i];
	    a[i]=a[min];
	    a[min]=tmp;
	}
    }

    public static void main(String[]args){
	int[] glen=new int[1000];
	for(int i=0;i<glen.length;i++)
	    glen[i]=(int)(Math.random()*1000);

	long i=System.nanoTime();
	MergeSort.mergeSort(glen);
	System.out.println("MSort Time:"+(System.nanoTime()-i));
	i=System.nanoTime();
	ssort(glen);
	System.out.println("SSort Time:"+(System.nanoTime()-i));
    }
}