  import java.io.*;
  import java.util.*;
  
  public class bSearch{
      public int rbsearch(int n, int[] L, int min, int max){
  	int mid = (min + max) / 2;
  	if (min > max){
  	    return -1;
  	}
  	if (mid < L[0] || mid > L[L.length - 1]){
  	    return -1;
  	}
  	if (L[mid] == n){
  	    return mid;
  	}
  	else if(L[mid] > n){
  	    return rbsearch(n, L, min, mid - 1);
  	}
  	else if(L[mid] < n){
  	    return rbsearch(n, L, mid + 1, max);
  	}
  	return -1;
      }
  	
      
  
      public int ibsearch(int n, int[]L){
  	int max = L.length - 1;
  	int min = 0;
  	while(min <= max){
  	    int mid = (max + min)/2;
  	    if (L[mid] == n){
  		return mid;
  	    }
  	    if (L[mid] > n){
  		max = mid - 1;
  	    }
  	    if (L[mid] < n){
  		min = mid + 1;
  	    }
  	}
  	return -1;
      }
      
      public static void main(String[]args){
  	bSearch n = new bSearch();
  	int [] list = {1,3,6,10,15,21,22,23,24,25,26,27,28,29,30};
  	System.out.println(n.rbsearch(3, list, 0, list.length-1));
  	System.out.println(n.rbsearch(27, list, 0, list.length-1));
  	System.out.println(n.rbsearch(13, list, 0, list.length-1));
  	System.out.println(n.ibsearch(3, list));
  	System.out.println(n.ibsearch(27, list));
  	System.out.println(n.ibsearch(13, list));
      }
  }
  
