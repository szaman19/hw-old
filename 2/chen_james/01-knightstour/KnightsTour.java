import java.io.*;
import java.util.*;

//worked with Lecvy

class KnightsTour
{
    private int[][] board;
    private int count = 0;
    private int boardsize;
    private int maxmoves;
    private boolean solved = false;
    private int[] xmoves = {1,1,2,2,-1,-1,-2,-2};
    private int[] ymoves = {-2,2,-1,1,-2,2,-1,1};
   
    

    public KnightsTour(int n){
	boardsize = n;
	maxmoves = n*n;
	board = new int[n][n];
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		board[i][j]=-1;
	    }
	}
    }

    public String toString() {
	String s="";
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		s=s+board[i][j]+"\t";
	    }
	    s=s+"\n";
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

    public boolean solve(int i, int j, int currentmove) {
	
	boolean returned = true;
	board[i][j] = currentmove;
	if(currentmove == (maxmoves - 1)) {
	    System.out.println(this);
	    System.out.println ("# of Moves: " + count);
	    
	}
	else {
	    for (int move = 0; move < 8; move ++) {
		//checks bounds
		if((i + xmoves[move]) >= 0 && (i + xmoves[move]) < boardsize && (j + ymoves[move]) >= 0 && (j + ymoves[move]) < boardsize) {
		    if(board [i + xmoves[move]][j + ymoves[move]] == -1) {
			count++;
			if (solve((i + xmoves[move]), (j + ymoves[move]), currentmove + 1))
			    break;
		    }
		}
	    }
	
	    board[i][j] = -1;
	    returned = false;
	}
	return returned;
    }

    //Not sure if doing it iteratively works. It seems to only work for one spot.
    
    public static void main(String[] args){
	KnightsTour m = new KnightsTour(5);
	System.out.println(m);
	m.solve(0,0,0);

	
    }

   
}
