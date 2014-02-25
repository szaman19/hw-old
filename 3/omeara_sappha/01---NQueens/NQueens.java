import java.io.*;
import java.util.*;

public class NQueens {
    //for board[n], n is the column
    //board[n] is what row it is in
    private int[] board;
    private int n;
    private Boolean solved;
    
    public NQueens(int n) {
	this.n = n;
	board = new int[n];
	solved = false;
    }
    
    public int[] getBoard() {
	return board;
    }
    
    public String toString() {
	String s = "";
	for (int i = 0; i < n; i++){
	    for (int j = 0; j < n; j++) {
		if (board[i] == j) 
		    s = s + "q";
		else 
		    s = s + ".";
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void solve(int[] Board, int col) {
	//tries to place a queen in every available spot in current column
	//and when one is placed, they go on to the next.
	for (int row = 0; row < n; row++) {
	    if (col >= n) 
		solved = true;
	    if (!solved) {
		board[col] = row;
		//System.out.println(this);
		if (ableToPlace(Board, row, col)) {
		    solve(Board, col + 1);
		}
	    }				
	}
    }

  public Boolean ableToPlace(int[] currBoard, int row, int col) {
	//goes through each column backwards, to see if a queen in
	//the column is in the same row OR on diagonals of the spot
	  for (int i = 1; i <= col; i++) {
	    int qCol = currBoard[col - i];
	    if (qCol == row ||
	    qCol == row - i ||
		  qCol == row + i) {
		  return false;
	    }
	  }
	  return true;
  }

    public static void main(String[] args){
	NQueens q = new NQueens(10);
	q.solve(q.getBoard(), 0);
	System.out.println(q);
    }

}
