import java.util.*;
import java.io.*;
public class NQueens{
    private int n;
    private int[] rlsum, lrsum, cols;
    private char[][] board;
    private boolean solved;
    public NQueens(int n){
	this.n = n;
	solved = false;
	cols = new int[n];
	rlsum = new int[500];
	for(int x : rlsum){
	    x = -1;
	}
	lrsum = new int[500];
	for(int x : lrsum){
	    x = -1;
	}
	board = new char[n][n];
	for(int z = 0;z<n;z++){
	    for(int y = 0;y<n;y++){
		board[z][y] = 'x';
	    }
	}
    }
    public char[][] getBoard(){
	return board;
    }
    private boolean validCheck(int row, int col){
	if(cols[col] != 0){
	    return false;
	}
	if(rlsum[row + (n-col)] == 1){
	    return false;
	}
	if(lrsum[row + col] == 1){
	    return false;
	}
	return true;
    }
    public void solve(){
	for(int x = 0;x<n;x++){
	    if(!solved){
		solveWork(x, 0);
	    }
	}
    }
    public void printBoard(){
	for(char[] y : board){
	    for(char x : y){
		System.out.print(x);
	    }
	    System.out.println();
	}
    }
    public void solveWork(int row, int col){
	if(validCheck(row, col)){
	    board[row][col] = 'q';
	    lrsum[row+col] = 1;
	    rlsum[row+(n-col)] = 1;
	    cols[col] = 1;
	    if(row == n-1){
		solved = true;
	    }
	    if(!solved){
		solveWork(row+1, 0);
	    }
	} else {
	    if(col<n-1){
		solveWork(row, col+1);
	    }
	}
	if(!solved){
	    board[row][col] = 'x';
	}
    }
}