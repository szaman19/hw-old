import java.io.*;
import java.util.*;

class KnightTour {

    private int[][] board;
    private int ctr;
    private int side;
    private boolean solved;

    public KnightTour(int d) {
	side = d;
	board = new int[side][side];
	ctr = 0;
	solved = false;
    }

    public String toString() {
	String s = "";
	int i;
	int j;
	for ( i = 0; i < board.length; i++ ) {
	    for ( j = 0; j < board[0].length; j++ ) {
		s = s + board[i][j] + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }

    private void delay (int n) {
	try {
	    Thread.sleep(n);
	}
	catch (InterruptedException e) {
	    System.exit(0);
	}
    }

    public void solve(int x, int y) {
	delay(25);
	if (ctr == side * side) {
	    solved = true;
	    System.out.println(this);
	    return;
	}
	else if ( x < side && y < side && x >= 0 && y >= 0 && board[x][y] == 0 ) {
	    ctr++;
	    board[x][y] = ctr;
      	    System.out.println(this);
	    solve(x+1, y+2);
	    if (!solved)
		solve(x-1, y+2);
	    if (!solved)
		solve(x+1, y-2);
	    if (!solved)
		solve(x-1, y-2);
	    if (!solved)
		solve(x-2, y+1);
	    if (!solved) 
		solve(x+2, y+1);
	    if (!solved)
		solve(x-2, y-1);
	    if (!solved)
		solve(x+2, y-1);
	}
    }

    public static void main(String[] args) {
	KnightTour k = new KnightTour(5);
	System.out.println();
	k.solve(2,3);
    }

}
