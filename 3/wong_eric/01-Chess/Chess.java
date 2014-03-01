import java.io.*;
import java.util.*;

public class Chess {

    private int[][] board;
    private int n;
    final private char untravelled = '0';
    private boolean solved = false;
    private int knightStep = 0;

    public void knightTour(int n) {
	this.n = n;
	board = new int[n][n];
	for (int i=0;i<n;i++) {
	    for (int j=0;j<n;j++) {
		board[j][i] = untravelled;
	    }
	}
	knightSolve(0,0,1);
    }

    public void knightSolve(int x, int y, int count) {
	delay(25);
	if (count > this.n*this.n) {
	    solved = true;
	    System.out.println(this);
	    return;
	}
	else if (x < 0 || x >= n ||
		 y < 0 || y >= n) {
	    System.out.println(this);
	    return;
	}
	else if (board[x][y] == untravelled) {
	    board[x][y] = knightStep;
	    System.out.println(this);
	    knightSolve(x+1,y+2,n+1);
	    knightSolve(x-1,y+2,n+1);
	    knightSolve(x+1,y-2,n+1);
	    knightSolve(x-1,y-2,n+1);
	    knightSolve(x+2,y+1,n+1);
	    knightSolve(x-2,y+1,n+1);
	    knightSolve(x+2,y-1,n+1);
	    knightSolve(x-2,y-1,n+1);
	    board[x][y] = untravelled;
	}
    }

    public String toString()
    {
	String s = "[0;0H";

	int i,j;
	for (i=0;i<n;i++)
	    {
		for (j=0;j<n;j++)
		    {
			s = s + board[j][i];
		    }

		s = s + "\n";
	    }
	return s;
    }

    private void delay(int n) {
	try{
	    Thread.sleep(n);
	}catch (InterruptedException e) {
	    System.exit(0);
	}
    }

    public static void main(String[] args) {
	Chess c = new Chess();
	c.knightTour(5);
    }

}
