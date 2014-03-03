import java.io.*;
import java.util.*;

public class Queens {
	//for board[n], n is the column and board[n] is what row it is in
	//easier to work with than an array of arrays
	private int[] board;
	private int n;
	private Boolean done;

	public Queens(int n) {
		this.n = n;
		board = new int[n];
		done = false;
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

	public void solve(int[] currBoard, int col) {
		//tries to place a queen in every available spot in current column
		//and when one is placed, they go on to the next.
		for (int row = 0; row < n; row++) {
			if (col >= n) 
				done = true;
			if (!done) {
				board[col] = row;
				//System.out.println(this);
				if (canPlace(currBoard, row, col)) {
					solve(currBoard, col + 1);
				}
			}				
		}
	}

	public Boolean canPlace(int[] currBoard, int row, int col) {
		//goes through each column 0 - col backwards, testing to see if the queen in
		//that column is on the same row OR the diagonals of the position we are testing
		for (int i = 1; i <= col; i++) {
			int qInCol = currBoard[col - i];
			if (qInCol == row ||
				qInCol == row - i ||
				qInCol == row + i) {
				return false;
			}
		}
		return true;
	}

    public static void main(String[] args){
		Queens q = new Queens(13);
		q.solve(q.getBoard(), 0);
		System.out.println(q);
	}

}