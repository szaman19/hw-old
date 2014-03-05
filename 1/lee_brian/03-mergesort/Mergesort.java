  import java.io.*;
  import java.util.*;
  
  public class Mergesort{
      private int a,b,i;
  
      public int[] Mergesort(int[]x, int[]y){
  	int total = x.length + y.length;
  	int[]list = new int[total];
  	a = 0;
  	b = 0;
  	i = 0;
  	while (a+b < total){
  	    if (x[a] <= y[b]){
  		list[a+b] = x[a];
  		a = a + 1;
  		if (a == x.length)
  		    a = a - 1;
  	    }
  	    else {
  		list[a+b] = y[b];
  		b = b + 1;
  		if (b == y.length)
  		    b = b - 1;
  	    }
  
  	}
  	return list;
      }
  
      public static void main(String[] args){
  	Mergesort n = new Mergesort();
  	int[]e = {0,2,4,6,8,10,12,14,16};
  	int[]f = {1,4,7,10,13,16};
  	int[]answer = n.Mergesort(e,f);
  	
  	for (int i = 0; i < answer.length; i++){
  	    System.out.print(answer[i] + " ");
  	}   
      } 
  }
