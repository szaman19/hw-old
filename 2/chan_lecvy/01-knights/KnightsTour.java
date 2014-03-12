import java.io.*;
import java.util.*;

class KnightsTour
{
    private int[][] board;
    private int count = 0;
    private int boardsize;
    private int maxMoves;
    private boolean solved = false;
    private int[] xmoves = {1,1,2,2,-1,-1,-2,-2};
    private int[] ymoves = {-2,2,-1,1,-2,2,-1,1};
   
    

    public KnightsTour(int n){
	boardsize = n;
	maxMoves = n*n;
	board = new int[n][n];
	for (int i=0;i<board.length;i++) {
	    for (int j=0;j<board[i].length;j++) {
		board[i][j]=-1;
	    }
	}
    }

    public String toString() {
	String s="";
	for (int a=0;a<board.length;a++) {
	    for (int b=0;b<board[a].length;b++) {
		s=s+board[a][b]+"\t";
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

    public boolean solve(int x, int y, int currentMove) {
	
	boolean returned = true;
	board[x][y] = currentMove;
	if(currentMove == (maxMoves - 1)) {
	    System.out.println(this);
	    System.out.println ("# of Moves: " + count);
	    
	}
	else {
	    for (int move = 0; move < 8; move ++) {
		//checks bounds
		if((x + xmoves[move]) >= 0 && (x + xmoves[move]) < boardsize && (y + ymoves[move]) >= 0 && (y + ymoves[move]) < boardsize) {
		    if(board [x + xmoves[move]][y + ymoves[move]] == -1) {
			count++;
			if (solve((x + xmoves[move]), (y + ymoves[move]), currentMove + 1))
			    break;
		    }
		}
	    }
	
	    board[x][y] = -1;
	    returned = false;
	}
	return returned;
    }

    
    public static void main(String[] args){
	KnightsTour m = new KnightsTour(5);
	System.out.println(m);
	m.solve(0,0,0);

	
    }

   
}
