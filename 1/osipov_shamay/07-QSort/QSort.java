public class QSort{

	public void QuickSort(int[] a, int L,  int H){
	if(H-L < 2){
	    return;
	}else{
	//  pivot is leftmost element
	    int count = 1;
	    int pivot = a[L];
	//  2. partition array about pivot
	    for(int x = L + 1; x <= H; x++){
		if(a[x] <= pivot){
		    int temp = a[count];
		    a[count] = a[x];
		    a[x] = temp;
		    count++;	    
		}
	    }
	    // switches pivot with the last switched element
	    a[L] = a[count - 1];
	    a[count - 1] = pivot;

	//  4. quickselect
	    QuickSort(a,L,count-1);
            QuickSort(a,count,H);
	}
    }

}
