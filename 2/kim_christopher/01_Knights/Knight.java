import java.io.*;
import java.util.*;

public class Knight
{
    public int[][] board;
    final public int h = 8;
    public boolean solved = false;
    public int knight;
    public int path = 0;
    public Knight() {
	board = new int[h][h];
	knight = 1;
    }
    public String toString() {
	String s = "";
	int i,j;
	for (i = 0; i < h; i++) {
	    for (j = 0; j < h; j++) {
		if (board[j][i] > 9) {
		    s = s + " " +  board[j][i];
		}
		else {
		    s = s + "  " + board[j][i];
		} 
	    }
	    s = s + "\n";
	}
	return s;
    }
    private void delay(int n)
    {
	try{
	    Thread.sleep(n);
	}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }
    public void solve(int x, int y) {
	if (knight == h * h + 1) {
	    solved = true;
	}
	else if (x >= h || y >= h || x < 0 || y < 0) {
	    solved = false;
	}
	
	else if (board[x][y] == 0) {
	    //delay(1300);
	    board[x][y] = knight;
	    System.out.println(this);
	    knight += 1;
	    solve(x+2, y+1);
	    if (!solved){
		
		solve(x+2, y-1);
	    }
	    if (!solved){
		
		solve(x-2, y+1);
	    }		
	    if (!solved){
		
		solve(x-2, y-1);
	    }
	    if (!solved){
		
		solve(x+1, y+2);
	    }
	    if (!solved){
		
		solve(x+1, y-2);
	    }
	    if (!solved){
		
		solve(x-1, y+2);
	    }
	    if (!solved){
		
		solve(x-1, y-2);
	    }
	    knight -= 1;
	    board[x][y] = 0;
	}
    }
    public static void main(String[] args) {
	Knight m = new Knight();
	System.out.println(m);
	m.solve(0,0);
    }
}
