import java.util.*;
import java.io.*;

public class Knight{
    private boolean solved = false;
    private int[][] grid;
    private int h,w,moves= 1,size;
    public Knight(int d){
	size =d;
	grid = new int[d][d];
	h =0;
	w= 0;
	for (int z = 0;z<d;z++){
	    for (int zz =0;zz<d;zz++){
		grid[z][zz]=0;
		
	    }
	}
	
    }
    
	
    public String toString(){
	String s = "";
	
	int i,j;
	for (i=0;i<size;i++)
	    {
		for (j=0;j<size;j++)
		    {
			s = s + grid[j][i]+" ";
		    }
		
		s = s + "\n";
	    }
	return s;
    }
    public void Solve(int hx,int wx){
	if (moves == size * size){
	    solved = true;
	    System.out.println(this);
	}
	else if ((hx < size && wx < size)&&(hx>=0 && wx >=0)&& grid[wx][hx]== 0){
	    grid[wx][hx]= moves;
	    moves ++;
	    if (moves ==6){
		System.out.println(hx + " " + wx);
	    }
	    System.out.println(this);
	    if (!solved)
		Solve(hx+2,wx+1);
	    
	    if (!solved)
		Solve(hx+2,wx-1);
	
	    if (!solved)
		Solve(hx-2,wx+1);
	    
	    if (!solved)
		Solve(hx-2,wx-1);
	    if (!solved)
		Solve(hx+1,wx+2);
	    if (!solved)
		Solve(hx+1,wx-2);
	    if (!solved)
		Solve(hx-1,wx+2);
	    if (!solved)
		Solve(hx-1,wx-2);
	}
    }
    public static void main(String[]args){
	Knight nite = new Knight(5);
	nite.Solve(1,0);
	
    }
}