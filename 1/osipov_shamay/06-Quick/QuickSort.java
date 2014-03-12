public class QuickSort{

    public int QuickSelect(int[] a, int L,  int H, int k){
	if(L >= H){
	    return H;
	}else{
	//  pivot is leftmost element
	    int count = 1;
	    int pivot = a[L];
	//  2. partition array about pivot
	    for(int x = L; x <= H; x++){
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
	//  3. check to see if we're done
	    if(count - 1 == k){
		return pivot;
	    }else if (count - 1 > k){
	//  4. quickslect(the side that does the answer)
		QuickSelect(a,L,count-1,k);
	    }else{
		QuickSelect(a,count-1,H,k);
	    }
	    return -1; //failed
	}
    }

}
