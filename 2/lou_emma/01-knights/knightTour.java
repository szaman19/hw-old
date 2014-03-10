import java.io.*;
import java.util.*;

public class knightTour{
	public int[][] board;
    public int h;
	public int n; 
	public boolean solved = false;
	
	public knightTour(int length) {
		h = length;
		board = new int[h][h];
		n = 0;
	}
	
	public String toString() {
		String s = "";
		int i,j;
		for (i=0;i<h;i++) {
			for (j=0;j<h;j++) {
				s = s + board[j][i] + " ";
			}
			s = s + "\n" + " ";
		}
		return s;
    }
	
	private void delay(int n) {
		try{
			Thread.sleep(n);
		}
		catch (InterruptedException e) {
		    System.exit(0);
		}
    }
	
	public void solve(int x,int y) {
		if (n == h*h + 1) {
		    solved = true;
		} 
		else if (x<h && y<h && x>=0 && y>=0 && board[x][y] == 0){
		    delay(200);
		    System.out.println(this);
			n++;
			board[x][y]=n;
			solve(x+2,y+1);
		    if (!solved)
				solve(x-2,y+1);
		    if (!solved)
				solve(x+2,y-1);
		    if (!solved)
				solve(x-2,y-1);
		    if (!solved)
				solve(x+1,y+2);
		    if (!solved)
				solve(x+1,y-2);
		    if (!solved)
				solve(x-1,y+2);
			if (!solved)
				solve(x-1,y-2);
			
		}
				
    }
	
	public static void main(String[] args) {
	knightTour k = new knightTour(5);

	k.solve(0,0);
    }

}